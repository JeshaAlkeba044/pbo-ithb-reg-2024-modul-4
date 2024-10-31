import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        while (true) {
            String menu = JOptionPane.showInputDialog(null,
                    "Main Menu\n" +
                            "1. Print UserData\n" +
                            "2. Print Nilai Akhir (NA) Mahasiswa\n" +
                            "3. Print Rata-Rata Nilai Akhir (NR) Seluruh Mahasiswa\n" +
                            "4. Print Jumlah Mahasiswa Tidak Lulus\n" +
                            "5. Print Matkul Ambil & Total Presensi Mahasiswa\n" +
                            "6. Print Total Jam Mengajar Dosen\n" +
                            "7. Print Gaji Staff\n" +
                            "0. Exit\n\n" +
                            "Pilih menu (1-7):");
            
            int choice = Integer.parseInt(menu);
            switch (choice) {
                // Print UserData
                case 1: 
                    String name = JOptionPane.showInputDialog("Masukkan Nama:");
                    User user = Database.findUserByName(name);
                    if (user != null) {
                        JOptionPane.showMessageDialog(null, user.toString());
                    } else {
                        JOptionPane.showMessageDialog(null, "User tidak ditemukan!");
                    }
                    break;
                
                // Print Nilai Akhir (NA)
                case 2:
                    String nim = JOptionPane.showInputDialog("Masukkan NIM Mahasiswa:");
                    String kodeMK = JOptionPane.showInputDialog("Masukkan Kode Mata Kuliah:");
                    Mahasiswa mahasiswa = Database.findMahasiswaByNIM(nim);
                    if (mahasiswa != null) {
                        Double nilaiAkhir = mahasiswa.getNilaiAkhir(kodeMK);
                        JOptionPane.showMessageDialog(null, "Nilai Akhir (NA): " + nilaiAkhir);
                    } else {
                        JOptionPane.showMessageDialog(null, "Mahasiswa tidak ditemukan!");
                    }
                    break;
                
                 // Print Nilai Rata-Rata (NR)
                case 3:
                    kodeMK = JOptionPane.showInputDialog("Masukkan Kode Mata Kuliah:");
                    Double rataRataNA = Database.getNRMahasiswa(kodeMK);
                    JOptionPane.showMessageDialog(null, "Rata-Rata Nilai Akhir (NR): " + rataRataNA);
                    break;
                
                // Print Jumlah Mahasiswa Tidak Lulus
                case 4 :
                    kodeMK = JOptionPane.showInputDialog("Masukkan Kode Mata Kuliah:");
                    String result = Database.getMahasiswaTidakLulus(kodeMK);
                    JOptionPane.showMessageDialog(null, result);
                    break;
                
                // Print Matkul Ambil & Total Presensi Mahasiswa
                case 5: 
                    nim = JOptionPane.showInputDialog("Masukkan NIM Mahasiswa:");
                    mahasiswa = Database.findMahasiswaByNIM(nim);
                    if (mahasiswa != null) {
                        String matkulAmbil = mahasiswa.getMatkulAmbilInfo();
                        JOptionPane.showMessageDialog(null, matkulAmbil);
                    } else {
                        JOptionPane.showMessageDialog(null, "Mahasiswa tidak ditemukan!");
                    }
                    break;
                
                // Print Total Jam Mengajar Dosen
                case 6: 
                    String nik = JOptionPane.showInputDialog("Masukkan NIK Dosen:");
                    Dosen dosen = Database.findDosenByNIK(nik);
                    if (dosen != null) {
                        int totalJamMengajar = dosen.getTotalJamMengajar();
                        JOptionPane.showMessageDialog(null, "Total Jam Mengajar: " + totalJamMengajar + " jam");
                    } else {
                        JOptionPane.showMessageDialog(null, "Dosen tidak ditemukan!");
                    }
                    break;

                // Print Gaji Staff
                case 7: 
                    String idStaff = JOptionPane.showInputDialog("Masukkan ID Staff:");
                    Staff staff = Database.findStaffById(idStaff);
                    if (staff != null) {
                        Double gaji = staff.hitungGaji();
                        JOptionPane.showMessageDialog(null, "Gaji Staff: Rp " + gaji);
                    } else {
                        JOptionPane.showMessageDialog(null, "Staff tidak ditemukan!");
                    }
                    break;
                
                case 0:  // Exit
                    JOptionPane.showMessageDialog(null, "Terima kasih!");
                    System.exit(0);
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Pilihan tidak valid! Coba lagi.");
                    break;
            }
        }
    }
}

