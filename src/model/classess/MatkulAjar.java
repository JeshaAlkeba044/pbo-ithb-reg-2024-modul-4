package model.classess;
import java.util.ArrayList;
import java.util.List;

public class MatkulAjar {
    MataKuliah matkul;
    List<PresensiStaff> presensiStaff = new ArrayList<>();

    public MatkulAjar(MataKuliah matkul) {
        this.matkul = matkul;
    }

    public MatkulAjar(MataKuliah matkul, List<PresensiStaff> presensiStaff) {
        this.matkul = matkul;
        this.presensiStaff = presensiStaff;
    }

    public void addPresensiStaff(PresensiStaff presensi) {
        presensiStaff.add(presensi);
    }

    public List<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    public void setPresensiStaff(List<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    public MataKuliah getMatkul() {
        return matkul;
    }

    public void setMatkul(MataKuliah matkul) {
        this.matkul = matkul;
    }

    @Override
    public String toString(){
        return "Matkul : " + matkul.toString() + "\n Presensi Staff : " + presensiStaff.toString();
    }

}