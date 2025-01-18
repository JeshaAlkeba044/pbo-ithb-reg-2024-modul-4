import javax.swing.JOptionPane;

public class PrintJumlahMhsView {
    public void printJumlahTidakLulus(int tidakLulus, int total, String namaMK) {
        JOptionPane.showMessageDialog(null, tidakLulus + " dari " + total + " mahasiswa tidak lulus mata kuliah " + namaMK);
    }
}
