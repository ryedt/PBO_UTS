/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageLatihanPBO;

/**
 *
 * @author LENOVO
 */
public class Operator1 {
    public static void main(String[] args){
        //Variabel
        int n1 = 10;
        int n2 = 15;
        //Hitung
        int h1 =(n1 + n2) * (n2 + n1);
        int h2 =(n1 % 4) * n2;
        //print
        System.out.println("h1 = " + h1);
        System.out.println("h2 = " + h2);
    }
}
