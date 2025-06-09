package com.juaracoding.rrujian1jf.ujian1;

import java.util.Scanner;

public class Soal2 {
	public static void main(String[] args) {
		System.out.println("Soal 2: String Method");
		System.out.println("==============================");

		Scanner scanner = new Scanner(System.in);

		System.out.print("Masukkan nama film: ");
		String namaFilm = scanner.nextLine();

		String namaFilmBesar = namaFilm.toUpperCase();
		System.out.println("Nama film dalam huruf besar: " + namaFilmBesar);

		scanner.close();
	}
}
