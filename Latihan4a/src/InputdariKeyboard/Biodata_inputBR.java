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
public class Biodata_inputBR {
    public static void main(String[] args) {
        BufferedReader br1 = new BufferedReader(new 
        InputStreamReader(System.in));
        try {
            System.out.print("Nama = "); 
            String nama = br1.readLine();
            System.out.print("NIM = ");
            int umur = Integer.parseInt(br1.readLine());
            System.out.print("Alamat = "); 
            String alamat = br1.readLine();

            System.out.println("Terimakasih!!");
        } catch (IOException ex) {
            System.out.println("Error pada saat input data");
        }
    }
}
