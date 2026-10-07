package pertemuan3;

public class ContohOperator1 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x++ = " + x++);
        System.out.println("Setelah evaluasi, x = " + x);
        x = 10;
        System.out.println("++x = " + ++x);
        System.out.println( "Setelah evaluasi, x = " + x);
        int y = 12;
        System.out.println("x > y || y = x &6 y <= x");
        int z = x ^ y;
        System.out.println("Hasil x ^ y adalah " + z);
        z %= 2;
        System.out.println("Hasi] akhir " +z);


    }
    
}
