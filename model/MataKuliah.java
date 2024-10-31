public class MataKuliah {
    String kode;
    int sks;
    String namaMatkul;

    public MataKuliah(String kode, int sks, String namaMatkul) {
        this.kode = kode;
        this.sks = sks;
        this.namaMatkul = namaMatkul;
    }

    public String getKode() {
        return kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getSKS() {
        return sks;
    }
    public void setSKS(int sks) {
        this.sks = sks;
    }

    public String getnamaMatkul() {
        return namaMatkul;
    }
    public void setnamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    @Override
    public String toString(){
        return "Kode : " + kode + "\n SKS : " + sks + "/n Nama Mata Kuliah: " + namaMatkul;
    }
}
