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
public class Latihan3 {
    public static void main(String[] args){
        String jawaban,jawaban1;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Apakah anda mahasiswa? (iya)");
        jawaban = scan.next();
        if("iya".equals(jawaban)||"IYA".equals(jawaban)){
            System.out.print("Apakah anda selalu terlambat masuk kelas? ");
            jawaban1 = scan.next();
            if("tidak".equals(jawaban1)||"TIDAK".equals(jawaban1)){
                System.out.print("Bagus, Pertahankan!!!");
            }
        }
    }
}
