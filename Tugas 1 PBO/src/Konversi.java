public class Konversi {
    double suhuC;
    
    public Konversi(double suhu) {
        suhuC = suhu;
    }
    
    double fahrenheit() {
        return suhuC * 0.8;
    }
    
    double kelvin() {
        return (suhuC * 1.8) + 32;
    }
    
    double reamur() {
        return suhuC + 273.15;
    }
} 
