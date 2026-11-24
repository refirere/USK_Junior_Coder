import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class soal2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DecimalFormatSymbols simbol = new DecimalFormatSymbols();
        simbol.setGroupingSeparator('.');
        DecimalFormat formatRupiah = new DecimalFormat("#,###", simbol);

        System.out.print("Harga Barang : ");
        double harga = input.nextDouble();

        System.out.print("Diskon : ");
        double diskonPersen = input.nextDouble();

        double diskonRp = harga * diskonPersen / 100;
        double total = harga - diskonRp;

        System.out.println("Harga Barang : Rp. " + formatRupiah.format(harga));
        System.out.println("Diskon       : " + (int) diskonPersen + " %");
        System.out.println("Diskon(Rp.)  : Rp. " + formatRupiah.format(diskonRp));
        System.out.println("Total Harga  : Rp. " + formatRupiah.format(total));

        input.close();
    }
}