/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4a;

import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class Latihan3_InputJOP {
    public static void main(String[] args) { 
        // Input Nama
        String nama = JOptionPane.showInputDialog("Masukkan nama anda!");
        int umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan umur anda!"));
        // Print
        System.out.println("Hai " + nama + ", apa kabar? Tidak terasa sekarang anda sudah " + umur + " tahun.");
    }
}