/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aritmatika3;

/**
 *
 * @author DILAISA
 */
public class Aritmatika3 {

    public int penjumlahan(int a, int b) {
        return a + b;
    }

    // Method untuk pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Method untuk perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Method untuk pembagian
    public double pembagian(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
        return (double) a / b;
    }

    // Method untuk pangkat
    public double pangka(int a, int b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        Aritmatika3 aritmatika = new Aritmatika3();

        int a = 5;
        int b = 3;

        System.out.println("Penjumlahan: " + aritmatika.penjumlahan(a, b));
        System.out.println("Pengurangan: " + aritmatika.pengurangan(a, b));
        System.out.println("Perkalian: " + aritmatika.perkalian(a, b));
        System.out.println("Pembagian: " + aritmatika.pembagian(a, b));
        System.out.println("Pangkat: " + aritmatika.pangka(a, b));
    }
}

