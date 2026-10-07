package pertemuan2;

public class StidiKasus2 {
    public static void main(String[] args) {
        double panjang =30;
        double lebar = 10;
        double diameterKolam = 5;
        double sisiTaman = 2;
        double phi = 3.14;

        double luasTanah = panjang * lebar;
        double jariJari = diameterKolam / 2;
        double luasKolam = phi * jariJari * jariJari;
        double luasTaman = sisiTaman * sisiTaman;
        double luasTidakDigunakan = luasTanah - luasKolam - luasTaman;

        System.out.println("Luas tanah yang tidak digunakan: "
                + luasTidakDigunakan + " m2");
    }
} 
    
