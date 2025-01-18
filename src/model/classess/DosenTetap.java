package model.classess;
import java.util.List;
import java.util.ArrayList;

public class DosenTetap extends Dosen {
    double salary;
    List<MatkulAjar> matkulAjar = new ArrayList<>();

    public DosenTetap(String nama, String alamat, String tTL, String telepon, int nik, String departemen, double salary) {
        super(nama, alamat, tTL, telepon, nik, departemen);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<MatkulAjar> getMatkulAjar() {
        return matkulAjar;
    }

    public void setMatkulAjar(List<MatkulAjar> matkulAjar) {
        this.matkulAjar = matkulAjar;
    }

    @Override
    public String toString(){
        return super.toString() + "\n Matkul Ajar :" + matkulAjar + "\n Salary : " + salary;
    }
}
