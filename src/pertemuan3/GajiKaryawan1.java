package pertemuan3;

import java.util.Scanner;

public class GajiKaryawan1 {
    public static void main(String[] args) {
    Scanner aufaril = new Scanner(System.in);
    
    int gajipokok;
    double bonus;
    int totgaji;
    double tunjtransp=600000;
    double tunjmkn=400000;
    System.out.println("Masukkan gaji pokok");
    gajipokok=aufaril.nextInt();

     bonus= 0.05*gajipokok;
     
     totgaji=(int) (gajipokok+tunjtransp+tunjmkn+bonus-(0.1*gajipokok));
     System.out.println("Bonus Bulanan anda adalah Rp. "+bonus);
     System.out.println("Gaji yang diterima adalah Rp. "+totgaji);
     aufaril.close();
    }
    
}
