package pertemuan6;

import java.util.Scanner;

public class Tugas2seleksiasisten01 {
    public static void main(String[] args) {
        Scanner aufaril = new Scanner(System.in);

        System.out.print("Apakah mahasiswa berstatus aktif? (true/false): ");
        boolean statusAktif = aufaril.nextBoolean();

        System.out.print("Apakah mahasiswa sedang terkena sanksi akademik? (true/false): ");
        boolean sedangSanksi = aufaril.nextBoolean();

       System.out.print("Nilai Dasar Pemrograman: ");
        int nilaiDasarPemrograman = aufaril.nextInt();

        System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
        boolean punyaSertifikat = aufaril.nextBoolean();

        System.out.print("Nilai wawancara: ");
        int nilaiWawancara = aufaril.nextInt();

        if (statusAktif && !sedangSanksi) {
            if (nilaiDasarPemrograman >= 76 || punyaSertifikat) {
                if (nilaiWawancara >= 71) {
                    System.out.println(
                        "Diterima sebagai asisten praktikum."
                    );
                } else {
                    System.out.println(
                        "Gagal tahap wawancara, nilai kurang dari 71."
                    );
                }
            } else {
                System.out.println(
                    "Gagal tahap akademik, nilai Dasar Pemrograman kurang dari 76 dan tidak memiliki sertifikat."
                );
            }
        } else {
            System.out.println(
                "Gagal tahap administrasi, mahasiswa tidak aktif atau sedang mendapat sanksi."
            );
        }

        aufaril.close();        
    }    

    }

