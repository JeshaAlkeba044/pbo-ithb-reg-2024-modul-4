package model.classess;

public class Presensi {
    private String tanggal;
    private String status;
    private String jam;

    public Presensi(String tanggal, String status, String jam) {
        this.tanggal = tanggal;
        this.status = status;
        this.jam = jam;
    }

    public String getStatus() {
        return status;
    }
}
