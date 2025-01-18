import javax.swing.JOptionPane;

public class PrintNilaiAkhir {
    public void printNilaiAkhir(double nilaiAkhir) {
        if (nilaiAkhir >= 0) {
            JOptionPane.showMessageDialog(null, "Nilai Akhir: " + nilaiAkhir);
        } else {
            JOptionPane.showMessageDialog(null, "Mahasiswa tidak ditemukan atau tidak memiliki nilai");
        }
    }
}
