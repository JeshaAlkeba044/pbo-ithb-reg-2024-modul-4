package model.classess;

import java.util.List;

public class Mahasiswa {
    private String nama;
    private String alamat;
    private String ttl;
    private String telepon;
    private String nim;
    private String jurusan;
    private List<MatkulAmbil> matkulAmbilList;

    public Mahasiswa(String nama, String alamat, String ttl, String telepon, String nim, String jurusan, List<MatkulAmbil> matkulAmbilList) {
        this.nama = nama;
        this.alamat = alamat;
        this.ttl = ttl;
        this.telepon = telepon;
        this.nim = nim;
        this.jurusan = jurusan;
        this.matkulAmbilList = matkulAmbilList;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public List<MatkulAmbil> getMatkulAmbilList() {
        return matkulAmbilList;
    }
}
