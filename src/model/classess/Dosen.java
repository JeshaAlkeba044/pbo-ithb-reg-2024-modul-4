package model.classess;

import java.util.List;

public class Dosen {
    private String nama;
    private String alamat;
    private String ttl;
    private String telepon;
    private String nik;
    private String departemen;
    private List<Presensi> presensiList;

    public Dosen(String nama, String alamat, String ttl, String telepon, int nik, String departemen, int presensiList) {
        this.nama = nama;
        this.alamat = alamat;
        this.ttl = ttl;
        this.telepon = telepon;
        this.nik = nik;
        this.departemen = departemen;
        this.presensiList = presensiList;
    }

    public Dosen(String string, String string2, String string3, String string4, String string5, String string6) {
        //TODO Auto-generated constructor stub
    }

    public String getNik() {
        return nik;
    }

    public List<Presensi> getPresensiList() {
        return presensiList;
    }

    public int getSalary() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSalary'");
    }

    public int getUnits() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUnits'");
    }
}
