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
public class Penjumlahan_inputJOP {
    public static void main(String[] args) { 
        int nA = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai A!"));
        int nB = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai B!"));
        
        int jumlah = nA+nB;
        System.out.println("Jumlah "+nA+" + "+nB+" = "+jumlah);
    }
}
