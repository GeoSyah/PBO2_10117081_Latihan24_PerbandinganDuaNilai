/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan24_perbandinganduanilai;

import java.util.Scanner;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Membandingkan 2 nilai yang berbeda atau sama
 */
public class PBO2_10117081_Latihan24_PerbandinganDuaNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nilai1;
        int nilai2;
        String ulang;
        
        Scanner nilai = new Scanner(System.in);
        
        System.out.println("====== Program Perbandingan Nilai =====");
        do {
            System.out.print("Masukkan Nilai Pertama\t : ");
            nilai1 = nilai.nextInt();
            System.out.print("Masukkan Nilai Kedua\t : ");
            nilai2 = nilai.nextInt();
            
            System.out.print("Hasil\t : ");
            if (nilai1 > nilai2) {
                System.out.println(nilai1 + " lebih besar dari " + nilai2);
            } else if (nilai1 == nilai2) {
                System.out.println(nilai1 + " sama dengan " + nilai2);
            } else if (nilai1 < nilai2) {
                System.out.println(nilai1 + " lebih kecil dari " + nilai2);
            }
            System.out.println("");
            System.out.print("Ulangi aktivitas diatas? (Ya/Tidak)\t : ");
            ulang = nilai.next();
            
        } while(ulang.equals("Ya"));
        
    }
    
}
