package model.classess;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.classess.Mahasiswa;

public class MhsSarjana extends Mahasiswa{
    List<MataKuliah> listMatkul = new ArrayList<>();

    public MhsSarjana(String nama, String alamat, String tTL, String telepon, int nim, String jurusan) {
        super(nama, alamat, tTL, telepon, nim, jurusan);
    }

    public List<MataKuliah> getListMatkul() {
        return listMatkul;
    }

    public void setListMatkul(List<MataKuliah> listMatkul) {
        this.listMatkul = listMatkul;
    }

    @Override
    public String toString(){
        return super.toString() + "\n, Mata kuliah yang diambil : " + listMatkul;
    }
    
}
