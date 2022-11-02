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
public class BobotNilaiHuruf {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai Huruf = ");
        char nilai = inp.next().charAt(0);
        
        System.out.println("==Konversi ke Angka==");
        
    switch (nilai) {
        case 'A':
            System.out.println("A = 4");
            break;
        case 'B':
            System.out.println("B = 3");
            break;
        case 'C':
            System.out.println("C = 2");
            break;
        case 'D':
            System.out.println("D = 1");
            break;
        case 'E':
            System.out.println("E = 0");
            break;
        default:
            System.out.println("Sistem Error");
    }
    }
}
