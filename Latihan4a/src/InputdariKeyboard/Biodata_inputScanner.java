/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputdariKeyboard;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Biodata_inputScanner {
    public static void main(String[] args) {
        String nama, alamat;
        int nim;
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        nama = inp.next();
        System.out.print("Masukkan NIM : ");
        nim = inp.nextInt();
        System.out.print("Masukkan Alamat : ");
        alamat = inp.next();
        
        System.out.println("--Hasil--");
        System.out.println("Nama\t: "+nama);
        System.out.println("NIM\t: "+nim);
        System.out.println("Alamat\t: "+alamat);
    }
}
