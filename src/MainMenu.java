import javax.swing.*;
import javax.swing.text.View;

// import controller.UserController;
// import controller.MahasiswaController;
// import controller.DosenController;
// import controller.StaffController;

public class MainMenu {
    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            String[] options = {
                "Print UserData",
                "Print Nilai Akhir Mahasiswa",
                "Print Rata-Rata Nilai Akhir",
                "Print Mahasiswa Tidak Lulus",
                "Print Matkul Ambil Mahasiswa",
                "Print Total Jam Mengajar Dosen",
                "Print Gaji Staff",
                "Exit"
            };

            String choice = (String) JOptionPane.showInputDialog(
                null,
                "Pilih opsi:",
                "Main Menu",
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[0]
            );

            if (choice == null || choice.equals("Exit")) {
                isRunning = false;
            } else {
                handleMenuChoice(choice);
            }
        }
    }

    private static void handleMenuChoice(String choice) {
        switch (choice) {
            case "Print UserData":
                new PrintUserData();
                break;
            case "Print Nilai Akhir Mahasiswa":
                new PrintNilaiAkhir();
                break;
            case "Print Rata-Rata Nilai Akhir":
                new PrintNilaiAvgView();
                break;
            case "Print Mahasiswa Tidak Lulus":
                new PrintJumlahMhsView();
                break;
            case "Print Matkul Ambil Mahasiswa":
                new PrintMatkulAmbil();
                break;
            case "Print Total Jam Mengajar Dosen":
                new PrintJamMengajar();
                break;
            case "Print Gaji Staff":
                new PrintGajiStaff();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opsi tidak valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
