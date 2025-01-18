package model.classess;
public class Staff extends User{
    int nik;

    public Staff(String nama, String alamat, String tTL, String telepon, int nik) {
        super(nama, alamat, tTL, telepon);
        this.nik = nik;
    }

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n NIK :" + nik;
    }
}