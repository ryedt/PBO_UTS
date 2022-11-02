/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif;

import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Tes2 {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai 1 = ");
        int nilai1 = inp.nextInt();
        
        System.out.print("Masukkan Nilai 2 = ");
        int nilai2 = inp.nextInt();
        
        System.out.println("");
        System.out.println("Kesimpulan :");
        
        if(nilai1 < nilai2) {
            System.out.println("Nilai Terbesar = "+nilai2);
        }else {
            System.out.println("Nilai Terbesar = "+nilai1);
        }
    }
}
