package pertemuan5;

import java.util.Scanner;

public class TUGAS2pemilihan01 {
      public static void main(String[] args) {
        Scanner aufaril = new Scanner(System.in);

        int jumlahSks;

        System.out.print("Masukkan jumlah SKS: ");
        jumlahSks = aufaril.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }

    }
}

