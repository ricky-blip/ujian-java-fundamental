package com.juaracoding.rrujian1jf.ujian1;

public class Soal5 {
	public static void main(String[] args) {
		System.out.println("Soal 5: Array");
		System.out.println("==============================");

		int[] hargaTiket = {50000, 60000, 70000, 80000, 90000};
		int total = 0;

		for (int i = 0; i < hargaTiket.length; i++) {
			System.out.println("Harga tiket film " + (i + 1) + ": " + hargaTiket[i]);
			total += hargaTiket[i];
		}

		System.out.println("Total harga tiket: " + total);
	}
}
