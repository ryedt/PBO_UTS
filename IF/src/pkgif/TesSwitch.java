/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif;

import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class TesSwitch {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Masukkan Hari ke- = ");
        int hari = inp.nextInt();
        
        System.out.println("");
        
    switch (hari) {
        case 1:
            System.out.println("Hari ke-"+hari+" adalah Senin");
            break;
        case 2:
            System.out.println("Hari ke-"+hari+" adalah Selasa");
            break;
        case 3:
            System.out.println("Hari ke-"+hari+" adalah Rabu");
            break;
        case 4:
            System.out.println("Hari ke-"+hari+" adalah Kamis");
            break;
        case 5:
            System.out.println("Hari ke-"+hari+" adalah Jum'at");
            break;
        case 6:
            System.out.println("Hari ke-"+hari+" adalah Sabtu");
            break;
        case 7:
            System.out.println("Hari ke-"+hari+" adalah Minggu");
            break;
        default:
            System.out.println("Tidak ada hari ke-"+hari);
    }
    }
}
