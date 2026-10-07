package pertemuan3;

import java.util.Scanner;

public class Tugas2_1 {
    public static void main(String[] args) {
        Scanner aufaril = new Scanner(System.in);
        int  banyak_lembar ;
        double biaya_cetak=500,biaya_jilid=5000,total_biaya ;
        System.out.println("berapa banyak lembar");   
         banyak_lembar = aufaril.nextInt();
        
         total_biaya=(banyak_lembar*biaya_cetak)+ biaya_jilid;
         System.out.println("total biaya "+ total_biaya);
         
    }
}