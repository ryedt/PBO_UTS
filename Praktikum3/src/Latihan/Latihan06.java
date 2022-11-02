/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Latihan06 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Pilih Zodiak");
        System.out.print("1. Aries\t");
        System.out.println("7. Libra");
        System.out.print("2. Taurus\t");
        System.out.println("8. Scorpio");
        System.out.print("3. Gemini\t");
        System.out.println("9. Sagitarius");
        System.out.print("4. Cancer\t");
        System.out.println("10. Capricorn");
        System.out.print("5. Leo\t\t");
        System.out.println("11. Aquarius");
        System.out.print("6. Virgo\t");
        System.out.println("12. Pisces");
        System.out.print("Pilihan : ");
        int pilih = scan.nextInt();
        System.out.println("Ramalan asmara Zodiak bulan ini :");
    switch(pilih){
        case 1:
            System.out.println("Aries, Hidup penuh dengan kejutan dan ketidakpastian. Maka dari itu, kamu harus bersiap untuk menghadapi sesuatu yang nggak pasti, nih, di bulan ini. Mulai dari gebetan yang tiba-tiba nembak, pacar melamar, atau bahkan minta putus? Pokoknya brace yourself!");
            break;
        case 2:
            System.out.println("Taurus, Move on, yuk! Sekarang saatnya lupakan kesalahan dan sakit hati di masa lalu dan mulai membuka hati untuk hal-hal yang lebih baik di masa mendatang.");
            break;
        case 3:
            System.out.println("Gemini, Hubungan kamu kayaknya berada di jalur yang tepat bulan ini, di mana kamu bakal lagi bucin-bucinnya. Good for you!");
            break;
        case 4:
            System.out.println("Cance, Saatnya keluar dari toxic circle or relationship, and it’s time to love yourself.");
            break;
        case 5:
            System.out.println("Leo, Kalau nggak ada hal indah yang terjadi, then create it yourself! Mulai tunjukkan perhatian lebih kepada pasangan, rayakan hari-hari baik, atau dengarkan orang tersayang ketika mereka punya masalah. Keep positive vibes for this month!");
            break;
        case 6:
            System.out.println("Virgo, Nggak semua hal berjalan sesuai rencana dan itu nggak apa-apa. Jangan terlalu larut dalam kekecewaan, karena semua yang terjadi pasti yang terbaik buat kamu.");
            break;
        case 7:
            System.out.println("Libra, Saatnya untuk blak-blakan dan menyuarakan isi hati kamu. Jangan lagi memendam perasaan, entah itu rasa kecewa, sakit, sedih, atau amarah, dan berpura-pura semuanya baik-baik saja.");
            break;
        case 8:
            System.out.println("Scorpio, Kamu mungkin harus mengucapkan selamat tinggal kepada orang yang kamu cintai dan memulai kisah baru.");
            break;
        case 9:
            System.out.println("Sagitarius, Bulan ini akan ada banyak perubahan di hidup kamu dan mungkin itu nggak mudah. Namun, kalau kamu mampu terus menjaga pikiran positif, eksplorasi hal-hal baru, dan terus improve diri, maka semua kesulitan hidup bakal terlewati, kok.");
            break;
        case 10:
            System.out.println("Capricorn, Berakhirnya hubungan bukan berarti akhir dunia. Jadikan pengalaman pahit di masa lalu kesempatan kamu untuk menjadi pribadi yang lebih kuat dan bijaksana. Mungkin ini juga saatnya kamu keep in touch sama teman-teman yang sudah lama hilang komunikasi.");
            break;
        case 11:
            System.out.println("Aquarius, Yuk stop meragukan diri sendiri dan mulai asah semua potensi kamu. Tingkatkan rasa percaya diri dan jalin relasi untuk menemukan pasangan sejati.");
            break;
        case 12:
            System.out.println("Pisces, Nggak apa-apa kalau kamu masih belum tahu mau ke mana arah kehidupan asmaramu. Jodoh memang misteri, dan kalau kata orang, sih, the best things are worth waiting for. Terus perbaiki diri kamu jadi the best version of yourself, karena jodoh adalah cerminan diri.");
            break;
        default:
            System.out.println("Sistem Error");
    }
    }
}
