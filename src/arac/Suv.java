package arac;

public class Suv extends Arac {
    private int aracYasi;

    public Suv(String marka, String model, int bagajKapasitesi, double gunlukKiralamaUcreti, double aylikKiralamaUcreti, String renk, int aracYasi) {
        super(marka, model, bagajKapasitesi, gunlukKiralamaUcreti, aylikKiralamaUcreti, renk);
        this.aracYasi = aracYasi;
    }

    public int getAracYasi() {
        return aracYasi;
    }

    public void setAracYasi(int aracYasi) {
        this.aracYasi = aracYasi;
    }
}
