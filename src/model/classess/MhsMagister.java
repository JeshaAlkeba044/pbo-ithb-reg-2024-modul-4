package model.classess;

import java.util.ArrayList;
import java.util.List;
import model.classess.Mahasiswa;

public class MhsMagister extends Mahasiswa {
    List<MataKuliah> listMatkul = new ArrayList<>();
    String tesis;

    public MhsMagister(String nama, String alamat, String tTL, String telepon, int nim, String jurusan, String tesis) {
        super(nama, alamat, tTL, telepon, nim, jurusan);
        this.tesis = tesis;
    }

    public List<MataKuliah> getListMatkul() {
        return listMatkul;
    }

    public void setListMatkul(List<MataKuliah> listMatkul) {
        this.listMatkul = listMatkul;
    }

    public String getTesis() {
        return tesis;
    }

    public void setTesis(String tesis) {
        this.tesis = tesis;
    }

    @Override
    public String toString(){
        return super.toString() + "\nMata Kuliah yang diambil : " + listMatkul + "\n Judul Tesis : " + tesis;
    }
    
}