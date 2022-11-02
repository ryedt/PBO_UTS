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
public class Penjumlahan_inputScanner {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan Nilai A = ");
        int nilaiA = inp.nextInt();
        System.out.print("Masukkan Nilai B = ");
        int nilaiB = inp.nextInt();
        
        int jumlah = nilaiA+nilaiB;
        System.out.println("Jumlah A+B = "+jumlah);
    }
}
