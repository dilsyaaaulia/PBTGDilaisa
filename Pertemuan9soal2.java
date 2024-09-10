/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan9soal2;

/**
 *
 * @author DILAISA
 */
public class Pertemuan9soal2 {

      public static void main(String[] args) {
        int awal = 3;
        int akhir = 15;

        // Meminta input dari pengguna
        System.out.println("Masukan Bilangan Awal : 3");
        System.out.println("Masukan Bilangan Akhir : 15");
        System.out.println("Hasil deret bilangan :");

        // Inisialisasi variabel untuk menyimpan bilangan deret
        int step = 5; // Mengatur langkah deret
        
        // Mencetak bilangan deret
        for (int i = awal; i <= akhir; i += step) {
            System.out.print(i);
            if (i + step <= akhir) {
                System.out.print(", ");
            }
        }

        // Menutup scanner
        
    }
}
