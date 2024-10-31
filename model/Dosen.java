import java.util.ArrayList;
import java.util.List;

class Dosen extends Staff{
    String departemen;

    public Dosen(String nama, String alamat, String tTL, String telepon, int nik, String departemen) {
    super(nama, alamat, tTL, telepon, nik);
    this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }


    @Override
    public String toString(){
        return super.toString() + "\n Departemen : " + departemen; 
    }
    
}
