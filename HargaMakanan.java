import java.io.InputStream;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author egaji
 */
public class HargaMakanan {
    public static void main(String[] args) {
        System.out.println("Soto Ayam 15000");
        System.out.println("Rawon Daging 17000");
        System.out.println("Mie Goreng 5000");
        System.out.println("Tahu Telor 8000");
        System.out.println("Sate Kambing 20000");
        int Hargasoto=15000;
        int Hargarawon=17000;
        int Hargamie=5000;
        int Hargatahu=8000;
        int Hargasate=20000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Jumlah soto?");
        int soto = sc.nextInt();
        int totalsoto=soto * Hargasoto;
        System.out.println("Jumlah rawon?");
        int rawon = sc.nextInt();
        int totalrawon=rawon * Hargarawon;
        System.out.println("Jumlah mie?");
        int mie = sc.nextInt();
        int totalmie=mie * Hargamie;
        System.out.println("Jumlah tahu?");
        int tahu = sc.nextInt();
        int totaltahu=tahu * Hargatahu;
        System.out.println("Jumlah sate?");
        int sate = sc.nextInt();
        int totalsate=sate * Hargasate;
        int Totalsemua=totalsoto+totalrawon+totalmie+totaltahu+totalsate;
        System.out.println("Jumlah Uang yang di bayar?");
        int uang = sc.nextInt();
        int Kembalian = uang-Totalsemua;
        System.out.println("Total Harga :"+Totalsemua);
        System.out.println("Kembalian :"+Kembalian);
    }
}
