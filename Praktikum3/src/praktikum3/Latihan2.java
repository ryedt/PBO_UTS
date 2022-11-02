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
public class Latihan2 {
    public static void main(String[] args){
        int belanja = 0;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Total Belanjaan : Rp ");
        belanja = scan.nextInt();
        if(belanja > 100000){
            System.out.println("Selamat, anda mendapatkan diskon!");
        }
        System.out.print("Terima kasih...");
    }
}
