package pertemuan6;

import java.util.Scanner;

public class Tugas1diskonbuku01 {
     public static void main(String[] args) {
        Scanner aufaril = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (kamus/novel): ");
        String jenisBuku = aufaril.nextLine().trim();

        System.out.print("Masukkan jumlah buku yang dibeli: ");
        int jumlahBuku = aufaril.nextInt();

        int diskon = 0;

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 9;
            if (jumlahBuku > 3) {
                diskon += 2;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 6;
            if (jumlahBuku > 4) {
                diskon += 2;
            } else {
                diskon += 1;
            }
        } else {
            if (jumlahBuku > 4) {
                diskon = 4;
            } else {
                diskon = 0;
            }
        }
        
        System.out.println("Total Persentase Diskon: " + diskon + "%");
        
        aufaril.close();
    }
}