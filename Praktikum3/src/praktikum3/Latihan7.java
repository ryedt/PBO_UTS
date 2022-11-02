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
public class Latihan7 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Siapah Presiden pertama indonesia?");
        System.out.println("a. Dr.Ir.H. Soekarno");
        System.out.println("b. B.J. Habibie");
        System.out.println("c. Megawati Soekarno Putri");
        System.out.println("d. Abdurrahman Wahid");
        
        System.out.println("Jawab :");
        char pilih = scan.next().charAt(0);
        
    switch(pilih){
        case 'a':
            System.out.println("Benar");
            break;
        case 'b':
            System.out.println("Salah, jawabannya adalah Dr. Ir. H. Soekarno");
            break;
        case 'c':
            System.out.println("Salah, jawabannya adalah Dr. Ir. H. Soekarno");
            break;
        case 'd':
            System.out.println("Salah, jawabannya adalah Dr. Ir. H. Soekarno");
            break;
        default:
            System.out.println("Sistem Error");
    }
    }
}
