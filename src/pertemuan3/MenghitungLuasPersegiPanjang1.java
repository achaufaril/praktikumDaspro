package pertemuan3;
import java.util.Scanner;

public class MenghitungLuasPersegiPanjang1 {
    public static void main(String[] args) {
    Scanner aufaril = new Scanner(System.in);
    int panjang; 
    int lebar; 
    int luas;
    System.out.print("Masukkan Panjang: ");
    panjang=aufaril.nextInt();
    System.out.print("Masukkan Lebar: ");
    lebar=aufaril.nextInt();
    luas=panjang*lebar;
    System.out.println("Luas persegi adalah " + luas);
    }
}
