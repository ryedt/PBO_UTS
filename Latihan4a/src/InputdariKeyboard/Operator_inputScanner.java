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
public class Operator_inputScanner {
     public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Nilai 1 = ");
        int n1 = inp.nextInt();
        System.out.print("Masukkan Nilai 2 = ");
        int n2 = inp.nextInt();
         System.out.println("");
        int h1 =(n1 + n2) * (n2 + n1);
        int h2 =(n1 % 4) * n2;
        System.out.println("Hasil ("+n1+" + "+n2+") X ("+n2+" + "+n1+") = "+h1);
        System.out.println("Hasil Sisa bagi dari "+n1+" dengan 4, lalu dikali "+n2+" = "+h2);
    }
}
