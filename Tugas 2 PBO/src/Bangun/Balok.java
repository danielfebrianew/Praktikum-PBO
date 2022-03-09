package Bangun;

public class Balok extends PersegiPanjang implements MenghitungRuang {
    protected double tinggi, volume, luasPermukaan;
    
    public Balok() {
        
    }
    
    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    @Override
    public void volume() {
        this.volume = this.panjang * this.lebar * this.tinggi;
    }

    @Override
    public void luasPermukaan() {
        this.luasPermukaan = 2 * (this.panjang * this.lebar) + (this.panjang * this.tinggi) + (this.tinggi + this.lebar);
    }
    
    public void setAll(double panjang, double lebar, double tinggi){
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.setTinggi(tinggi);
        
        this.Keliling();
        this.Luas();
        this.luasPermukaan();
        this.volume();
    }
}
