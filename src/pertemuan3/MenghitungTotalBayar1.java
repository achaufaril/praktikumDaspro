package pertemuan3;

import java.util.Scanner;

public class MenghitungTotalBayar1 {
   public static void main(String[] args) {
    Scanner aufaril = new Scanner(System.in);
    int harga; 
    double jumlahBayar;
    double potongan;
    double diskon = 0.15;
    System.out.println("masukan harga");
    harga = aufaril.nextInt();
    potongan=diskon*harga;
    jumlahBayar=harga-potongan;
    System.out.println("Jumlah yang harus anda bayar adalah. "+ jumlahBayar);
   } 
}
