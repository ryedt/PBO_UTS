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
public class Soal2 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Masukkan bulan (angka) : ");
        int bulan = inp.nextInt();
        
        System.out.println("");
        
    switch (bulan) {
        case 1:
            System.out.println("Bulan ke- "+bulan+" adalah Januari");
            break;
        case 2:
            System.out.println("Bulan ke- "+bulan+" adalah Pebruari");
            break;
        case 3:
            System.out.println("Bulan ke- "+bulan+" adalah Maret");
            break;
        case 4:
            System.out.println("Bulan ke- "+bulan+" adalah April");
            break;
        case 5:
            System.out.println("Bulan ke- "+bulan+" adalah Mei");
            break;
        case 6:
            System.out.println("Bulan ke- "+bulan+" adalah Juni");
            break;
        case 7:
            System.out.println("Bulan ke- "+bulan+" adalah Juli");
            break;
        case 8:
            System.out.println("Bulan ke- "+bulan+" adalah Agustus");
            break;
        case 9:
            System.out.println("Bulan ke- "+bulan+" adalah September");
            break;
        case 10:
            System.out.println("Bulan ke- "+bulan+" adalah Oktober");
            break;
        case 11:
            System.out.println("Bulan ke- "+bulan+" adalah November");
            break;
        case 12:
            System.out.println("Bulan ke- "+bulan+" adalah Desember");
            break;
        default:
            System.out.println("Sistem Error");
    }
    }
}
