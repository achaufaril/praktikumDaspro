package pertemuan6;

import java.util.Scanner;

public class nestedakseslab01 {
    public static void main(String[] args) {
        Scanner aufaril = new Scanner(System.in);

        boolean mahasiswaAktif;
        boolean sedangDisanksi;
        boolean punyaIzinDosen;
        boolean asistenLab;

        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        mahasiswaAktif = aufaril.nextBoolean();

        System.out.print("Apakah sedang disanksi? (true/false): ");
        sedangDisanksi = aufaril.nextBoolean();

        System.out.print("Apakah punya izin dosen? (true/false): ");
        punyaIzinDosen = aufaril.nextBoolean();

        System.out.print("Apakah asisten lab? (true/false): ");
        asistenLab = aufaril.nextBoolean();

        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }

        aufaril.close();
    }
}

