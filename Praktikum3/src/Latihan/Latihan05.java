/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Latihan05 {
    public static void main(String[]args){
        float nilai1, nilai2;
        Scanner inp = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Masukkan Nilai 1 = ");
        nilai1 = inp.nextFloat();
        System.out.print("Masukkan Nilai 2 = ");
        nilai2 = inp.nextFloat();
        
        float rata2 = (nilai1+nilai2)/2;   
        System.out.println("Nilai rata-ratanya adalah = "+rata2);
        
        if(rata2 >= 80){
            System.out.println("Grade  A");
        }else if(rata2 >= 65){
            System.out.println("Grade  B");
        }else if(rata2 >= 55){
            System.out.println("Grade  C");
        }else if(rata2 >= 45){
            System.out.println("Grade  D");
        }else{
            System.out.println("Grade  E");
        }
    }
}
