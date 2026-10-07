package pertemuan5;

import java.util.Scanner;

public class TugasParkir01 {
      public static void main(String[] args) {
        Scanner aufaril = new Scanner(System.in);
        int jam, biaya;

        System.out.print("Masukkan lama parkir (jam): ");
        jam = aufaril.nextInt();

        if (jam <= 2) {
            biaya = 2000;
        } else {
            biaya = 2000 + (jam - 2) * 1000;
        }

        System.out.println("Total biaya parkir: Rp " + biaya);
    }
}

