package model.classess;

public class User {
    private String nama;
    private String alamat;
    private String ttl;
    private String telepon;

    public User(String nama, String alamat, String ttl, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.ttl = ttl;
        this.telepon = telepon;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTtl() {
        return ttl;
    }

    public String getTelepon() {
        return telepon;
    }
}
