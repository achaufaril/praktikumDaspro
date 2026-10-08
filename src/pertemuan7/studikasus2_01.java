package pertemuan7;

import java.util.Scanner;

public class studikasus2_01 {
    public static void main(String[] args) {
        Scanner aufaril = new Scanner(System.in);

       System.out.print("Nama mahasiswa  : ");
        String nama = aufaril.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = aufaril.nextLine().trim();

        String status;
        
         if (jenis.equalsIgnoreCase("LAINNYA")) {
            status = "Kegiatan Lainnya tidak memperoleh dana penghargaan.";

        } else if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Jumlah dokumen  : ");
            int dokumen = aufaril.nextInt();
            System.out.print("Peringkat juara : ");
            int juara = aufaril.nextInt();

            if (juara >= 1 && juara <= 3) {
                if (dokumen == 4) {
                    status = "Dokumen lengkap, Juara " + juara + ". Dana penghargaan diberikan.";
                } else {
                    status = "Dokumen tidak lengkap (kurang " + (4 - dokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Bukan Juara 1, 2, atau 3. Dana penghargaan tidak diberikan.";
            }

        } else if (jenis.equalsIgnoreCase("PKM")) {

            System.out.print("Jumlah dokumen  : ");
            int dokumen = aufaril.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int pkm = aufaril.nextInt();

            if (pkm == 1) {
                if (dokumen == 4) {
                    status = "Dokumen lengkap, lolos pendanaan PKM. Dana penghargaan diberikan.";
                } else {
                    status = "Dokumen tidak lengkap (kurang " + (4 - dokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Tidak lolos pendanaan PKM. Dana penghargaan tidak diberikan.";
            }

        } else {
            status = "Jenis kegiatan tidak valid.";
        }

        System.out.println("Status : " + status);
        
        aufaril.close();

    }
}
