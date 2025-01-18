package model.classess;

import model.classess.Mahasiswa;

public class MhsDoktor extends Mahasiswa{
    String penelitianDisertasi;
    int nSidang1, nSidang2, nSidang3;

    public MhsDoktor(String nama, String alamat, String tTL, String telepon, int nim, String jurusan, String penelitianDisertasi, int nSidang1, int nSidang2, int nSidang3) {
        super(nama, alamat, tTL, telepon, nim, jurusan);
        this.penelitianDisertasi = penelitianDisertasi;
        this.nSidang1 = nSidang1;
        this.nSidang2 = nSidang2;
        this.nSidang3 = nSidang3;
    }

    public String getPenelitianDisertasi() {
        return penelitianDisertasi;
    }

    public void setPenelitianDisertasi(String penelitianDisertasi) {
        this.penelitianDisertasi = penelitianDisertasi;
    }

    public int getnSidang1() {
        return nSidang1;
    }

    public void setnSidang1(int nSidang1) {
        this.nSidang1 = nSidang1;
    }

    public int getnSidang2() {
        return nSidang2;
    }

    public void setnSidang2(int nSidang2) {
        this.nSidang2 = nSidang2;
    }

    public int getnSidang3() {
        return nSidang3;
    }

    public void setnSidang3(int nSidang3) {
        this.nSidang3 = nSidang3;
    }

    @Override
    public String toString(){
        return super.toString() + "\nJudul Penelitian Disertasi :" + penelitianDisertasi + "\nNilai Sidang 1 : " + nSidang1 + "\n Nilai Sidang 2 : " + nSidang2 + "\n Nilai Sidang 3 : " + nSidang3;
    }
    

}
