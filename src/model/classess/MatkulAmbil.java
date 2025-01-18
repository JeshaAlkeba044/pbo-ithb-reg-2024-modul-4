package model.classess;

public class MatkulAmbil {
    private MataKuliah matkul;
    private double n1, n2, n3;

    public MatkulAmbil(MataKuliah matkul, double n1, double n2, double n3) {
        this.matkul = matkul;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public MataKuliah getMatkul() {
        return matkul;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }

    public double getN3() {
        return n3;
    }
}
