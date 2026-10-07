package pertemuan3;

import java.util.Scanner;

public class Koperasi01 {
    public static void main(String[] args) {
        Scanner aufaril = new Scanner(System.in); 
        
        double pendapatan, laba, bagian_anggota, sisa_kas;

        int paket_alat = 12000; 
        int modal = 1352500;
         
        System.out.print("Masukkan paket_alat (12000): ");
        paket_alat = aufaril.nextInt(); 
        
        System.out.print("Masukkan modal (1352500): ");
        modal = aufaril.nextInt();
        
        System.out.print("Masukkan pendapatan: ");
        pendapatan = aufaril.nextDouble(); 
        
        System.out.print("Masukkan laba: ");
        laba = aufaril.nextDouble();
        
        System.out.print("Masukkan bagian_anggota: ");
        bagian_anggota = aufaril.nextDouble();

        sisa_kas = modal + pendapatan - laba - bagian_anggota;
        
        System.out.println("sisa_kas: " + sisa_kas);
        
        aufaril.close();
    }
}


