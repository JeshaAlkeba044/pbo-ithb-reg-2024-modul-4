abstract class Mahasiswa extends User{
    int nim;
    String jurusan;

    public Mahasiswa(String nama, String alamat, String tTL, String telepon, int nim, String jurusan) {
        super(nama, alamat, tTL, telepon);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public int getNim() {
        return nim;
    }
    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString(){
        return super.toString() + "\n Mahasiswa dengan NIM " + nim + ", Jurusan " + jurusan;
    }
}