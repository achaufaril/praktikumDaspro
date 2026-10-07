package pertemuan5;

import java.util.Scanner;

public class pemilihanif01 {
    public static void main(String[] args) {
        Scanner aufaril = new Scanner(System.in);
        
         System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");

        boolean uktLunas = aufaril.nextBoolean();

         if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        }  
    }
}
