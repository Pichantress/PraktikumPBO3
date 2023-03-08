/**
 * File      : MPoligon.java		08/03/23
 * Penulis   : Wahyu Arif Maulana
 * NIM       : 24060120120018
 * Deskripsi : driver class untuk poligon, persegi panjang dan segitiga
 * 
*/

package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        Segitiga segitiga = new Segitiga (3, 5, 3);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang: " + persegi.hitungLuas());
        segitiga.printInfo();
        System.out.println("Luas Segitiga: "+segitiga.hitungLuas());
    }
}
