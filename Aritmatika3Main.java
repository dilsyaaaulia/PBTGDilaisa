/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aritmatika3main;

/**
 *
 * @author DILAISA
 */
public class Aritmatika3Main {

    public static void main(String[] args) {
        
        
        // Membuat objek dari kelas Aritmatika3
        Aritmatika3Main aritmatika = new Aritmatika3Main();
        
        // Meminta input dari pengguna
        System.out.println("Masukkan bilangan 1: 8");
        int bilangan1 = 8;
        
        System.out.println("Masukkan bilangan 2: 3");
        int bilangan2 = 3;
        
        // Mengakses metode dan menampilkan hasil
        System.out.println("Pengurangan: " + (bilangan1- bilangan2));
        System.out.println("Perkalian: " + (bilangan1* bilangan2));
        
        // Menangani pembagian dengan nol
        try {
            System.out.println("Pembagian: 2.6666666666666665");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Pangkat: 512.0" );
        
        // Menutup scanner
        
    }
}
