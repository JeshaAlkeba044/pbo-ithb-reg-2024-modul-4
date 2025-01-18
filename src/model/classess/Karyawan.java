package model.classess;

public class Karyawan {
    private String nama;
    private String alamat;
    private String ttl;
    private String telepon;
    private double salary;

    public Karyawan(String nama, String alamat, String ttl, String telepon, double salary) {
        this.nama = nama;
        this.alamat = alamat;
        this.ttl = ttl;
        this.telepon = telepon;
        this.salary = salary;
    }

    public String getNama() {
        return nama;
    }

    public double getSalary() {
        return salary;
    }

    public String getNik() {
        return telepon;  // NIK di sini diasumsikan adalah nomor telepon
    }
}
