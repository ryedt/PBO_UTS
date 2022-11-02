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
public class Penjumlahan_inputBR {
    public static void main(String[] args) {
        BufferedReader inp = new BufferedReader(new 
        InputStreamReader(System.in));
        try {
            System.out.print("Masukkan Nilai A = ");
            int nilaiA = Integer.parseInt(inp.readLine());
            System.out.print("Masukkan Nilai B = ");
            int nilaiB = Integer.parseInt(inp.readLine());

            int jumlah = nilaiA+nilaiB;
            System.out.println("Jumlah A+B = "+jumlah);
        } catch (IOException ex) {
            System.out.println("Error pada saat input data");
        }
    }
}
