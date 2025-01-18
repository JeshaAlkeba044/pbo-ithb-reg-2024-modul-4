// package controller;

import model.classess.Mahasiswa;
import model.classess.MatkulAmbil;
import model.classess.MataKuliah;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaController {
    
    public static Mahasiswa[] getMahasiswas() {
        MataKuliah matkul1 = new MataKuliah("MTK101", "Matematika Dasar", 3);
        MataKuliah matkul2 = new MataKuliah("PBO101", "Pemrograman Berorientasi Objek", 3);
        MataKuliah matkul3 = new MataKuliah("KOM101", "Komunikasi", 2);

        return new Mahasiswa[]{
            new Mahasiswa("John Doe", "Jl. XYZ", "01 Jan 2000", "08123456789", "2021001", "Teknik", List.of(
                new MatkulAmbil(matkul1, 80, 75, 85), 
                new MatkulAmbil(matkul2, 70, 65, 75)
            )),
            new Mahasiswa("Jane Smith", "Jl. ABC", "15 Feb 1999", "08123456780", "2021002", "Ekonomi", List.of(
                new MatkulAmbil(matkul3, 85, 90, 80)
            )),
            new Mahasiswa("Michael Brown", "Jl. DEF", "5 Mar 2001", "08123456781", "2021003", "Sains", List.of(
                new MatkulAmbil(matkul1, 90, 95, 85),
                new MatkulAmbil(matkul3, 70, 80, 65)
            )),
            new Mahasiswa("Emily Davis", "Jl. GHI", "10 Apr 2000", "08123456782", "2021004", "Teknik", List.of(
                new MatkulAmbil(matkul2, 60, 65, 70)
            )),
            new Mahasiswa("Daniel Green", "Jl. JKL", "12 Mei 1998", "08123456783", "2021005", "Ekonomi", List.of(
                new MatkulAmbil(matkul1, 50, 55, 60)
            ))
        };
    }
    
    public static void PrintNilaiAkhir() {
        String nim = JOptionPane.showInputDialog("Masukkan NIM:");
        String kodeMK = JOptionPane.showInputDialog("Masukkan Kode Mata Kuliah:");

        Mahasiswa[] mahasiswas = getMahasiswas();
        Mahasiswa foundMahasiswa = null;
        
        for (Mahasiswa mahasiswa : mahasiswas) {
            if (mahasiswa.getNim().equals(nim)) {
                foundMahasiswa = mahasiswa;
                break;
            }
        }
        
        if (foundMahasiswa != null) {
            List<MatkulAmbil> matkulAmbilList = foundMahasiswa.getMatkulAmbilList();
            MatkulAmbil matkulAmbil = matkulAmbilList.stream()
                .filter(matkul -> matkul.getMatkul().getKode().equals(kodeMK))
                .findFirst().orElse(null);
            
            if (matkulAmbil != null) {
                double nilaiAkhir = (matkulAmbil.getN1() + matkulAmbil.getN2() + matkulAmbil.getN3()) / 3;
                JOptionPane.showMessageDialog(null, "Nilai Akhir untuk " + foundMahasiswa.getNama() + " : " + nilaiAkhir);
            } else {
                JOptionPane.showMessageDialog(null, "Mata kuliah dengan kode " + kodeMK + " tidak ditemukan.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        PrintNilaiAkhir();
    }
}
