/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Soal3 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Pilih Metode");
        System.out.println("1. Menghitung Luas Persegi");
        System.out.println("2. Menghitung Keliling Persegi");
        System.out.print("Pilihan : ");
        int pilih = scan.nextInt();
    switch(pilih){
        case 1:
            System.out.print("Masukkan panjang sisi persegi : ");
            int n1 = scan.nextInt();
            System.out.println("Luas Persegi adalah : "+n1*n1+" cm");
            break;
        case 2:
            System.out.print("Mesukkan panjang sisi persegi : ");
            int n2 = scan.nextInt();
            System.out.println("Keliling Persegi adalah : "+n2*4+" cm");
            break;
        default:
            System.out.println("Sistem Error");
    }
    }
}
