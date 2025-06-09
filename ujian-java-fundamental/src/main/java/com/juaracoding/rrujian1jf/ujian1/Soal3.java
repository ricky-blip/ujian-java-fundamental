package com.juaracoding.rrujian1jf.ujian1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Soal3 {
	public static void main(String[] args) {
		System.out.println("Soal 3: Percabangan");
		System.out.println("==============================");
		Scanner scanner = new Scanner(System.in);

		int hargaWeekday = 35000;
		int hargaWeekend = 45000;

		LocalDate today = LocalDate.now();
		DayOfWeek dayOfWeek = today.getDayOfWeek();

		boolean isWeekend = (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY);

		int hargaTiket = isWeekend ? hargaWeekend : hargaWeekday;
		String jenisHari = isWeekend ? "Weekend" : "Weekday";

		System.out.println("Hari ini: " + dayOfWeek + " (" + jenisHari + ")");
		System.out.println("Harga tiket: " + hargaTiket);
		System.out.println();

		System.out.print("Jumlah tiket: ");
		int jumlahTiket = scanner.nextInt();

		int totalHarga = 0;

		if (jumlahTiket > 5) {
			// Jika lebih dari 5 tiket, beri diskon 10%
			int hargaDasar = jumlahTiket * hargaTiket;
			double diskon = hargaDasar * 0.10;
			totalHarga = (int)(hargaDasar - diskon);
			System.out.println("Mendapatkan Diskon 10%");
		} else {
			totalHarga = jumlahTiket * hargaTiket;
			System.out.println("Tidak ada diskon.");
		}

		System.out.println("Total harga (dengan diskon): " + totalHarga);

		scanner.close();
	}
}
