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

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setLuasPermukaan(double luasPermukaan) {
        this.luasPermukaan = luasPermukaan;
    }
    
    @Override
    public double volume() {
        return this.panjang * this.lebar * this.tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2 * (this.panjang * this.lebar) + (this.panjang * this.tinggi) + (this.tinggi + this.lebar);
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

    public void display() {
        System.out.println("Keliling Persegi Panjang = " + Keliling());
        System.out.println("Luas Persegi Panjang = " + Luas());
        System.out.println("Volume Balok = " + volume());
        System.out.println("Luas Permukaan Balok = " + luasPermukaan());
    }
}
