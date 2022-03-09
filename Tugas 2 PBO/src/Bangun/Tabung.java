package Bangun;

public class Tabung extends Lingkaran implements MenghitungRuang  {
    private double tinggi, luaspermukaan, volume;
    
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
    
    @Override
    public double volume() {
        return 3.14 * super.getJariJari() * super.getJariJari();
    }

    @Override
    public double luasPermukaan() {
        return Keliling() * tinggi + 2 * Luas(); 
    }
    
    public void setAll(double jariJari, double tinggi){
        this.setjariJari(jariJari);
        this.setTinggi(tinggi);
        
        this.Keliling();
        this.Luas();
        this.luasPermukaan();
        this.volume();
    }
    
    public void display(){
        System.out.println("Luas Lingkaran = " + Luas());
        System.out.println("Keliling Lingkaran = " + Keliling());
        System.out.println("Volume = " + volume());
        System.out.println("Luas Permukaan Tabung = " + luasPermukaan());
    }
}
