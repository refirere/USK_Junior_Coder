import javax.swing.JOptionPane;

public class soal3 {
    public static void main(String[] args) {

        int nilai1 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 1 :"));
        int nilai2 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 2 :"));
        int nilai3 = Integer.parseInt(JOptionPane.showInputDialog("Nilai 3 :"));

        double rata = (nilai1 + nilai2 + nilai3) / 3.0;

        String keterangan;

        if (rata >= 60) {
            keterangan = "LULUS";
        } else {
            keterangan = "GAGAL";
        }

        System.out.println("Nilai 1 : " + nilai1);
        System.out.println("Nilai 2 : " + nilai2);
        System.out.println("Nilai 3 : " + nilai3);
        System.out.println("Rata-rata : " + rata);
        System.out.println("Keterangan : " + keterangan);

        JOptionPane.showMessageDialog(null,
            "Nilai 1 : " + nilai1 +
            "\nNilai 2 : " + nilai2 +
            "\nNilai 3 : " + nilai3 +
            "\nRata-rata : " + rata +
            "\nKeterangan : " + keterangan
        );
    }
}