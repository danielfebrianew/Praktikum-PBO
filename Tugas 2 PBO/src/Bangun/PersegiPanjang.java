package Bangun;

public class PersegiPanjang implements MenghitungBidang{
    protected double panjang, lebar, luas, keliling;
    
    public PersegiPanjang() {
        
    }
    
    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
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
        luas = panjang * lebar;
    }

    @Override
    public void Keliling() {
        keliling = 2 * (panjang + lebar);
    }
}
