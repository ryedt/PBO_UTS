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
public class Latihan4 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Apakah anda mahasiswa Poliban? (Y jika setuju)");
        String jawaban = scan.next();
        if("Y".equals(jawaban)){
            System.out.println("Selamat berjuang di Poliban");
        }else{
            System.out.println("Selamat datang di Poliban");
        }
    }
}
