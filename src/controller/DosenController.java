// package controller;

import model.classess.Dosen;
import model.classess.Presensi;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

public class DosenController {
    public static Dosen[] getDosens() {
        List<Presensi> presensi1 = new ArrayList<>();
        presensi1.add(new Presensi("2025-01-01", "Hadir", "08:00"));
        presensi1.add(new Presensi("2025-01-02", "Alpha", "09:00"));
        presensi1.add(new Presensi("2025-01-03", "Hadir", "10:00"));
        
        List<Presensi> presensi2 = new ArrayList<>();
        presensi2.add(new Presensi("2025-01-01", "Hadir", "08:00"));
        presensi2.add(new Presensi("2025-01-02", "Hadir", "09:00"));
        
        List<Presensi> presensi3 = new ArrayList<>();
        presensi3.add(new Presensi("2025-01-01", "Hadir", "08:00"));
        presensi3.add(new Presensi("2025-01-02", "Hadir", "09:00"));
        presensi3.add(new Presensi("2025-01-03", "Alpha", "10:00"));
        
        List<Presensi> presensi4 = new ArrayList<>();
        presensi4.add(new Presensi("2025-01-01", "Alpha", "08:00"));
        presensi4.add(new Presensi("2025-01-02", "Alpha", "09:00"));
        
        List<Presensi> presensi5 = new ArrayList<>();
        presensi5.add(new Presensi("2025-01-01", "Hadir", "08:00"));
        presensi5.add(new Presensi("2025-01-02", "Hadir", "09:00"));
        presensi5.add(new Presensi("2025-01-03", "Hadir", "10:00"));
        
        return new Dosen[] {
            new Dosen("Dr. Alan", "Jl. ABC", "1 Jan 1980", "08123456789", "NIK123", "Informatika"),
            new Dosen("Dr. Bella", "Jl. DEF", "2 Feb 1982", "08123456780", "NIK124", "Matematika"),
            new Dosen("Dr. Charles", "Jl. GHI", "3 Mar 1985", "08123456781", "NIK125", "Fisika"),
            new Dosen("Dr. Diana", "Jl. JKL", "4 Apr 1986", "08123456782", "NIK126", "Kimia"),
            new Dosen("Dr. Evan", "Jl. MNO", "5 Mei 1987", "08123456783", "NIK127", "Biologi")
        };
    }
    
    public static void PrintJamMengajar() {
        String nik = JOptionPane.showInputDialog("Masukkan NIK Dosen:");

        Dosen[] dosens = getDosens();
        Dosen foundDosen = null;
        
        for (Dosen dosen : dosens) {
            if (dosen.getNik().equals(nik)) {
                foundDosen = dosen;
                break;
            }
        }

        if (foundDosen != null) {
            List<Presensi> presensiList = foundDosen.getPresensiList();
            long jamMengajar = presensiList.stream().filter(presensi -> presensi.getStatus().equals("Hadir")).count();
            JOptionPane.showMessageDialog(null, "Jumlah jam mengajar: " + jamMengajar);
        } else {
            JOptionPane.showMessageDialog(null, "Dosen dengan NIK " + nik + " tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        PrintJamMengajar();
    }
}
