/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program untuk menghitung lingkaran
 */
public class PBOIF210119053Latihan22PerhitunganLingkaran {
    
    public static double hitungJariJari(double diameter){
        double jariJari = diameter/2;
        return jariJari;
    }
    
    public static double hitungLuas(double diameter){
        double jariJari = diameter/2;
        double luas = 3.14 * jariJari * jariJari;
        return luas;
    }
    
    public static double hitungKeliling(double diameter){
        double jariJari = diameter/2;
        double keliling = 2 * 3.14 * jariJari;
        return keliling;
    }

    public static void main(String[] args) {
        
        int diameter=0;
        String konversiAngka;
        boolean kondisi = true;
        
        Scanner input = new Scanner(System.in);
        System.out.println("======Perhitungan Lingkaran======");                        
        do {            
            System.out.print("Masukkan nilai diameter lingkaran : ");
            konversiAngka = input.next();
                if(konversiAngka.matches("[0-9]*")){
                    diameter = Integer.parseInt(konversiAngka);
                    kondisi = true;
                } else {
                    System.err.println("Nilai Diameter Tidak Sesuai!");
                    kondisi = false;
                }
        } while (!kondisi);  
        
        System.out.println("");
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-jari Lingkaran = " + hitungJariJari(diameter) + " cm");
        System.out.println("Luas Lingkaran      = " + hitungLuas(diameter) + " cm");
        System.out.println("Keliling Lingkaran  = " + hitungKeliling(diameter) + " cm");
    }
    
}
