package controller;

import model.classess.Karyawan;
import model.classess.Dosen;
import javax.swing.JOptionPane;

public class StaffController {
    
    // Data Dummy untuk Karyawan dan Dosen
    public static Karyawan[] getKaryawan() {
        return new Karyawan[]{
            new Karyawan("Alice", "Jl. 123", "10 Feb 1990", "08123456789", 5000000),
            new Karyawan("Bob", "Jl. 456", "15 Mar 1985", "08123456780", 4500000),
            new Karyawan("Charlie", "Jl. 789", "20 Apr 1988", "08123456781", 6000000),
            new Karyawan("Diana", "Jl. 101", "30 May 1992", "08123456782", 5500000),
            new Karyawan("Eve", "Jl. 202", "5 Jun 1987", "08123456783", 5200000)
        };
    }

    public static Dosen[] getDosen() {
        return new Dosen[]{
            new Dosen("Dr. John", "Jl. 303", "12 Jan 1980", "08123456784", 8000000, "Teknik", 50000),
            new Dosen("Dr. Sarah", "Jl. 404", "8 Aug 1982", "08123456785", 9000000, "Ekonomi", 55000),
            new Dosen("Dr. Mark", "Jl. 505", "25 Jul 1978", "08123456786", 10000000, "Matematika", 60000),
            new Dosen("Prof. Anna", "Jl. 606", "17 Nov 1975", "08123456787", 12000000, "Fisika", 65000),
            new Dosen("Prof. Tom", "Jl. 707", "22 Dec 1976", "08123456788", 11000000, "Biologi", 70000)
        };
    }

    public static void PrintGajiStaff() {
        String nik = JOptionPane.showInputDialog("Masukkan NIK Staff:");
        
        Karyawan[] karyawans = getKaryawan();
        Karyawan foundKaryawan = null;
        for (Karyawan karyawan : karyawans) {
            if (karyawan.getNik().equals(nik)) {
                foundKaryawan = karyawan;
                break;
            }
        }

        if (foundKaryawan != null) {
            double gajiKaryawan = (foundKaryawan.getSalary() / 22) * 8;  
            JOptionPane.showMessageDialog(null, "Nama: " + foundKaryawan.getNama() + "\nGaji: " + gajiKaryawan);
        } else {
            JOptionPane.showMessageDialog(null, "Karyawan dengan NIK " + nik + " tidak ditemukan.");
        }
        
        Dosen[] dosens = getDosen();
        Dosen foundDosen = null;
        for (Dosen dosen : dosens) {
            if (dosen.getNik().equals(nik)) {
                foundDosen = dosen;
                break;
            }
        }

        if (foundDosen != null) {
            double gajiDosen = (foundDosen.getSalary() + (foundDosen.getUnits() * 25000)); 
            JOptionPane.showMessageDialog(null, "Nama: " + foundDosen.getNik() + "\nGaji: " + gajiDosen);
        } else {
            JOptionPane.showMessageDialog(null, "Dosen dengan NIK " + nik + " tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        PrintGajiStaff();
    }
}


