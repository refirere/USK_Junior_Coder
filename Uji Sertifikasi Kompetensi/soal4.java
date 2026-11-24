import javax.swing.JOptionPane;

public class soal4 {
    public static void main(String[] args) {

        int nilai1 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 1 :"));
        int nilai2 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 2 :"));

        int hasil = nilai1 * nilai2;

        System.out.println("Nilai 1 : " + nilai1);
        System.out.println("Nilai 2 : " + nilai2);
        System.out.println("Hasil : " + hasil);

        JOptionPane.showMessageDialog(null, "Hasil : " + hasil);
    }
}