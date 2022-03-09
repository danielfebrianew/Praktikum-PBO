package Bangun;

public class Tabung extends Lingkaran implements MenghitungRuang  {
    protected double tinggi, luaspermukaan, volume;
    
    public Tabung() {
        
    }
    
    public Tabung(double jariJari, double tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getLuaspermukaan() {
        return luaspermukaan;
    }

    public double getVolume() {
        return volume;
    }
    
    @Override
    public void volume() {
        this.volume = 3.14 * this.jariJari * this.jariJari;
    }

    @Override
    public void luasPermukaan() {
        this.luaspermukaan = this.keliling * this.tinggi + 2 * (this.getLuas()); 
    }
    
    public void setAll(double jariJari, double tinggi){
        this.setjariJari(jariJari);
        this.setTinggi(tinggi);
        
        this.Keliling();
        this.Luas();
        this.luasPermukaan();
        this.volume();
    }
    
}
