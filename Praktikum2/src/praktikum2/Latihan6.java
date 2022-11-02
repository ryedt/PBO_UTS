/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Latihan6 {
    public  static void main(String[] args){
        int angka;
        Scanner inputan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Masukkan Angka : ");
        angka = inputan.nextInt();
        System.out.println("Angka yang diinputkan adalah "+angka);
    }
}
