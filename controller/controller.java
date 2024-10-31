import model.classes.*;
import model.enums.Status;
import view.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private UserDataView userDataView = new UserDataView();
    private PrintNAView printNAView = new PrintNAView();
    private PrintNRView printNRView = new PrintNRView();
    private PrintJumlahMhsView printJumlahMhsView = new PrintJumlahMhsView();
    private PrintMatkulAmbilView printMatkulAmbilView = new PrintMatkulAmbilView();
    private PrintJamView printJamView = new PrintJamView();
    private PrintGajiView printGajiView = new PrintGajiView();

    private List<User> users = new ArrayList<>();
    private List<Mahasiswa> mahasiswaList = new ArrayList<>();
    private List<Dosen> dosenList = new ArrayList<>();
    private List<Staff> staffList = new ArrayList<>();
    private List<MataKuliah> mataKuliahList = new ArrayList<>();

    public Controller() {
        Data();
    }

    private void Data() {
        MataKuliah mk1 = new MataKuliah("MK001", 3, "Pemrograman Berorientasi Objek");
        MataKuliah mk2 = new MatkulPilihan("MK002", 3, "Data Mining", 10);
        MataKuliah mk3 = new MataKuliah("MK003", 4, "Sistem Berkas");
        MataKuliah mk4 = new MatkulPilihan("MK004", 3, "Kecerdasan Buatan", 8);
        MataKuliah mk5 = new MataKuliah("MK005", 2, "Prak. Basis Data");

        mataKuliahList.add(mk1);
        mataKuliahList.add(mk2);
        mataKuliahList.add(mk3);
        mataKuliahList.add(mk4);
        mataKuliahList.add(mk5);

        MhsSarjana sarjana1 = new MhsSarjana("Andi", "Jakarta", "Bandung 10 Mei", "08123456789", "12345", "Informatika");
        mahasiswaList.add(sarjana1);

        MatkulAmbil matkulAmbil1 = new MatkulAmbil(mk1, 80, 85, 90);
        sarjana1.getMatkulAmbilList().add(matkulAmbil1);
        Presensi presensi1 = new Presensi("1 Oktober", Status.Hadir);
        matkulAmbil1.getPresensi().add(presensi1);

        System.out.println(sarjana1.toString());

        DosenTetap dosenTetap1 = new DosenTetap("Dr. Fahmi", "Yogyakarta", "Yogyakarta, 15 March 1980", "0812556677", 11111, "Informatika", 15000000);
        dosenList.add(dosenTetap1);
        MatkulAjar matkulAjar1 = new MatkulAjar(mk1);
        dosenTetap1.getMatkulAjar().add(matkulAjar1);

        Karyawan karyawan1 = new Karyawan("Dedi", "Bekasi", "Bekasi, 12 January 1985", "0812341234", 33333, 6000000);
        staffList.add(karyawan1);

        PresensiStaff presensiStaff1 = new PresensiStaff("1 Oktober", Status.Hadir, 9);
        karyawan1.getPresensiStaff().add(presensiStaff1);

        System.out.println(karyawan1.toString());
    }

    public User findUserByName(String nama) {
        for (User user : users) {
            if (user.getNama().equalsIgnoreCase(nama)) {
                return user;
            }
        }
        return null;
    }

    public Mahasiswa findMahasiswaByNIM(String nim) {
        for (Mahasiswa mahasiswa : mahasiswaList) {
            if (mahasiswa.getNIM().equalsIgnoreCase(nim)) {
                return mahasiswa;
            }
        }
        return null;
    }

    public Dosen findDosenByNIK(String nik) {
        for (Dosen dosen : dosenList) {
            if (dosen.getNIK().equalsIgnoreCase(nik)) {
                return dosen;
            }
        }
        return null;
    }

    public Staff findStaffByNIK(String nik) {
        for (Staff staff : staffList) {
            if (staff.getNIK().equalsIgnoreCase(nik)) {
                return staff;
            }
        }
        return null;
    }

    public MataKuliah findMataKuliahByKode(String kodeMK) {
        for (MataKuliah mk : mataKuliahList) {
            if (mk.getKode().equalsIgnoreCase(kodeMK)) {
                return mk;
            }
        }
        return null;
    }

    public double calculateAverageNA(String kodeMK) {
        double totalNilai = 0;
        int count = 0;

        for (Mahasiswa mhs : mahasiswaList) {
            for (MatkulAmbil matkulAmbil : mhs.getMatkulAmbilList()) {
                if (matkulAmbil.getMataKuliah().getKode().equalsIgnoreCase(kodeMK)) {
                    totalNilai += matkulAmbil.hitungNilaiAkhir();
                    count++;
                }
            }
        }

        return count > 0 ? totalNilai / count : 0;
    }
    public int[] calculateNR(String kodeMK) {
        int[] gradeCounts = new int[5]; // Array untuk menghitung grade A, B, C, D, E

        for (Mahasiswa mhs : mahasiswaList) {
            for (MatkulAmbil matkulAmbil : mhs.getMatkulAmbilList()) {
                if (matkulAmbil.getMataKuliah().getKode().equalsIgnoreCase(kodeMK)) {
                    double nilaiAkhir = matkulAmbil.hitungNilaiAkhir();
                    if (nilaiAkhir >= 80) {
                        gradeCounts[0]++; // A
                    } else if (nilaiAkhir >= 70) {
                        gradeCounts[1]++; // B
                    } else if (nilaiAkhir >= 60) {
                        gradeCounts[2]++; // C
                    } else if (nilaiAkhir >= 50) {
                        gradeCounts[3]++; // D
                    } else {
                        gradeCounts[4]++; // E
                    }
                }
            }
        }

        return gradeCounts;
    }

    public int countMhsTakingMatkul(String kodeMK) {
        int count = 0;

        for (Mahasiswa mhs : mahasiswaList) {
            for (MatkulAmbil matkulAmbil : mhs.getMatkulAmbilList()) {
                if (matkulAmbil.getMataKuliah().getKode().equalsIgnoreCase(kodeMK)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    public List<MatkulAmbil> getMhsMatkul(String nim) {
        Mahasiswa mahasiswa = findMahasiswaByNIM(nim);
        if (mahasiswa != null) {
            return mahasiswa.getMatkulAmbilList();
        }
        return new ArrayList<>();
    }

    public int calculateTotalTeachingHours(String nik) {
        Dosen dosen = findDosenByNIK(nik);
        if (dosen != null) {
            int totalHours = 0;
            for (MatkulAjar matkulAjar : dosen.getMatkulAjar()) {
                totalHours += matkulAjar.getMataKuliah().getSks() * 16;
            }
            return totalHours;
        }
        return 0;
    }

    public double calculateStaffSalary(String nik) {
        Staff staff = findStaffByNIK(nik);
        if (staff != null) {
            int totalHours = 0;
            for (PresensiStaff presensi : staff.getPresensiStaff()) {
                totalHours += presensi.getJamKerja();
            }
            return staff.getGaji() + (totalHours * staff.getUpahPerJam());
        }
        return 0;
    }

    public void printAverageNA(String kodeMK) {
        double averageNA = calculateAverageNA(kodeMK);
        printNAView.printNA(kodeMK, averageNA);
    }

    public void printGradeDistribution(String kodeMK) {
        int[] gradeCounts = calculateNR(kodeMK);
        printNRView.printNR(kodeMK, gradeCounts);
    }

    public void printStudentCountForMatkul(String kodeMK) {
        int count = countMhsTakingMatkul(kodeMK);
        printJumlahMhsView.printJumlahMhs(kodeMK, count);
    }

    public void printMhsMatkul(String nim) {
        List<MatkulAmbil> matkulList = getMhsMatkul(nim);
        printMatkulAmbilView.printMatkulAmbil(nim, matkulList);
    }

    public void printTeachingHours(String nik) {
        int totalHours = calculateTotalTeachingHours(nik);
        printJamView.printJamMengajar(nik, totalHours);
    }

    public void printStaffSalary(String nik) {
        double totalSalary = calculateStaffSalary(nik);
        printGajiView.printGaji(nik, totalSalary);
    }
}