package pertemuan6;

import java.util.Scanner;

public class operatorlogikawifi01 {
     public static void main(String[] args) {
        Scanner aufaril = new Scanner(System.in);

        boolean mahasiswa;
        boolean dosen;
        boolean akunDiblokir;

        System.out.print("Apakah pengguna mahasiswa? (true/false): ");
        mahasiswa = aufaril.nextBoolean();

        System.out.print("Apakah pengguna dosen? (true/false): ");
        dosen = aufaril.nextBoolean();

        System.out.print("Apakah akun sedang diblokir? (true/false): ");
        akunDiblokir = aufaril.nextBoolean();

        if ((mahasiswa || dosen) && !akunDiblokir) {
            System.out.println("Akses WiFi diberikan");
        } else {
            System.out.println("Akses WiFi ditolak");
        }

        aufaril.close();
    }
}

