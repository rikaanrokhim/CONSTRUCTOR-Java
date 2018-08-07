/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
import java.io.*;

public class Utama {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
//        instance of class
        Bus bus1 = new Bus();
        Bus bus2 = new Bus("");
        
//        menu
        while(true) {
            System.out.println("=================================");
            System.out.println("SELAMAT DATANG DI PT.BUS");
            System.out.println("=================================");
            
            Bus bus4 = new Bus("Restu Panda", "Hijau", "Bus Umum", 1200, 300);
            System.out.println("Nama : " + bus4.nama);
            System.out.println("Warna : " + bus4.warna);
            System.out.println("Jenis : " + bus4.jenis);
            System.out.println("Berat : " + bus4.berat);
            System.out.println("Tinggi : " + bus4.tinggi);
                    
            System.out.println("1. Tambah Spesifikasi Bus");
            System.out.println("2. Tampilkan spesifikasi bus");
            System.out.println("3. Keluar");
            
//            input
            System.out.print("Masukkan pilihan = ");
            int pilih = Integer.parseInt(br.readLine());
            
//            proses + output
            switch(pilih) {
                case 1 :
                    System.out.print("Masukkan Spesifikasi bus yang baru : ");
                    String cr_spek = br.readLine();
                    
                    bus2 = new Bus(cr_spek);
                    
                    System.out.println();
                    
                    System.out.println("*** Spesifikasi telah berhasil ditambhakan ***");
                    break;
                case 2 :
                    System.out.println("=========================");
                    System.out.println("SPESIFIKASI");
                    
                    System.out.println("Spesifikasi Bus : " + bus2.getSpek());
                    
                    System.out.println();
                    
                    System.out.println ("=========================");
                    break;
                default : 
                    System.exit(0);
            }
        }
    }
}
