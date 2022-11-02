/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4a;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
/**
 *
 * @author LENOVO
 */
public class Latihan2_InputBR {
    public static void main(String[] args) {
        // Buat BufferedReader
        BufferedReader br1 = new BufferedReader(new 
        InputStreamReader(System.in));
        try {
            // Ambil data nama dari keyboard 
            System.out.print("Nama = "); 
            String nama = br1.readLine();
            // Ambil data umur dari keyboard 
            System.out.print("Umur = ");
            int umur = Integer.parseInt(br1.readLine());
            // Print
            System.out.println("Assalammu'alaikum " + nama + ". Apa kabar? Tidak terasa sekarang anda sudah " + umur + " tahun.");
        } catch (IOException ex) {
            System.out.println("Error pada saat input data");
        }
    }
}