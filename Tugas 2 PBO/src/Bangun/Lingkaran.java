package Bangun;

public class Lingkaran implements MenghitungBidang {
    protected double jariJari, luas, keliling;
    
    public Lingkaran() {
        
    }
    
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public Lingkaran(double jariJari, double tinggi) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setjariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getKeliling() {
        return keliling;
    }

    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }

    @Override
    public void Luas() {
        luas = 3.14 * jariJari * jariJari;
    }

    @Override
    public void Keliling() {
        keliling = 3.14 * (jariJari + jariJari);
    }
}
