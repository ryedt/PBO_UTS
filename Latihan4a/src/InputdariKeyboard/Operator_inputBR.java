/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputdariKeyboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Operator_inputBR {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new 
        InputStreamReader(System.in));
        try {
            System.out.print("Masukkan nilai 1 = "); 
            int n1 = Integer.parseInt(br.readLine());
            System.out.print("Masukkan nilai 2 = ");
            int n2 = Integer.parseInt(br.readLine());

            int h1 =(n1 + n2) * (n2 + n1);
            int h2 =(n1 % 4) * n2;
            System.out.println("=========");
            System.out.println("Hasil ("+n1+" + "+n2+") X ("+n2+" + "+n1+") = "+h1);
            System.out.println("Hasil Sisa bagi dari "+n1+" dengan 4, lalu dikali "+n2+" = "+h2);
        } catch (IOException ex) {
            System.out.println("Error pada saat input data");
        }
    }
}
