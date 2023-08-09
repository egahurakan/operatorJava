/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package harga.makanan;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author egaji
 */
public class HargaMakanan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Menu Makanan");
        System.out.println("1. Soto Ayam (15000)");
        System.out.println("2. Rawon daging (17000)");
        System.out.println("3. Mie goreng (5000)");
        System.out.println("4. Tahu Telor (8000)");
        System.out.println("5. Sate Kambing (20000)");
        
        int soto,rawon,mie,tahu,sate;
        soto=15000;
        rawon=17000;
        mie=5000;
        tahu=8000;
        sate=20000;
        
        int jumlahBeli,total = 0,bayar,kembali;
        
        Scanner sc = new Scanner(System.in);
       System.out.println("Beli Soto Berapa?");
        int Soto = sc.nextInt();
        int totalsoto=Soto * Hargasoto;
        System.out.println("Beli Rawon Berapa?");
        int Rawon = sc.nextInt();
        int totalrawon=Rawon * HargaRawon;
        System.out.println("Beli Mie Goreng Berapa?");
        int Mie = sc.nextInt();
        int totalmie=Mie * HargaMie;
        System.out.println("Beli Tahu Telor Berapa?");
        int Tahu = sc.nextInt();
        int totaltahu= Tahu * Hargatahutelor;
        System.out.println("Beli Sate Berapa?");
        int Sate = sc.nextInt();
        int totalsate=Sate * Hargasate;
        int Totalsemua=totalsoto+totalrawon+totalmie+totaltahu+totalsate;
        System.out.println("Berapa Uang anda?");
        int uang = sc.nextInt();
        int Kembalian = uang-Totalsemua;
        System.out.println("Total Harga :"+Totalsemua);
        System.out.println("Kembalian :"+Kembalian);
    }
    
}
