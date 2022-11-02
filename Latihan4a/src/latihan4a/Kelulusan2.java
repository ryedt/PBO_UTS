/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4a;

import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Kelulusan2 {
    public static void main(String[] args) {
        // Buat Scanner
        Scanner inp = new Scanner(System.in);
        
        // Ambil Nama 
        System.out.print("Masukkan Nama anda = ");
        String Nama = inp.next();
        
        // Ambil NIM 
        System.out.print("Masukkan Jenis Kelamin = ");
        String jk = inp.next();
       
        // Ambil Nilai 
        System.out.print("Masukkan Tinggi Badan = ");
        int tb = inp.nextInt();
        
        //Print
        System.out.println("---Hasil---");
        if("Laki-laki".equals(jk)) {
            if(tb <= 170) {
                System.out.println("Anda Gagal");
            } else {
                System.out.println("Selamat Anda Lulus");
            }
        } else if("Perempuan".equals(jk)) { 
            if(tb <= 160) {
                System.out.println("Anda Gagal");
            } else {
                System.out.println("Selamat Anda Lulus");
            }
        }
    }
}
