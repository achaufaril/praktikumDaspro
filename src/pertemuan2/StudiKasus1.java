package pertemuan2;

import java.util.Scanner;
public class StudiKasus1 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan gaji pokok: " );
        int gajipokok= input.nextInt();

        System.out.print("Masukkan jumlah anak: ");
        int jumlahanak= input.nextInt();

        System.out.print("Masukkan tunjangan per anak: ");
        int tunjanganperanak= input.nextInt();

        System.out.print("Masukkan persen pensiun: ");
        double persenpensiun= input.nextDouble();

        
        int tunjangananak= jumlahanak * tunjanganperanak;
        int gajikotor= gajipokok + tunjangananak;
        double potongan= gajipokok * persenpensiun / 100;
        double gajibersih= gajikotor - potongan;
        
         System.out.println("Tunjangan anak:Rp" + tunjangananak);
        System.out.println("Gaji kotor:Rp" + gajikotor);
        System.out.println("Potongan pensiun:Rp" + potongan);
        System.out.println("Gaji bersih:Rp" + gajibersih);

        input.close();


    }
}
