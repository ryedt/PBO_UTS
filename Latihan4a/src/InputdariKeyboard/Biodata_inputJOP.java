/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputdariKeyboard;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Biodata_inputJOP {
    public static void main(String[] args) { 
        String nama = JOptionPane.showInputDialog("Masukkan nama anda!");
        int nim = Integer.parseInt(JOptionPane.showInputDialog("Masukkan NIM anda!"));
        String alamat = JOptionPane.showInputDialog("Masukkan Alamat anda!");
        System.out.println("Nama\t: "+nama);
        System.out.println("NIM\t: "+nim);
        System.out.println("Alamat\t: "+alamat);
    }
}
