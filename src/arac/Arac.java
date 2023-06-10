package arac;

public class Arac {
    private String marka;
    private String model;
    private int bagajKapasitesi;
    private double gunlukKiralamaUcreti;
    private double aylikKiralamaUcreti;
    private String renk;

    public Arac(String marka, String model, int bagajKapasitesi, double gunlukKiralamaUcreti, double aylikKiralamaUcreti, String renk) {
        this.marka = marka;
        this.model = model;
        this.bagajKapasitesi = bagajKapasitesi;
        this.gunlukKiralamaUcreti = gunlukKiralamaUcreti;
        this.aylikKiralamaUcreti = aylikKiralamaUcreti;
        this.renk = renk;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getBagajKapasitesi() {
        return bagajKapasitesi;
    }

    public double getGunlukKiralamaUcreti() {
        return gunlukKiralamaUcreti;
    }

    public double getAylikKiralamaUcreti() {
        return aylikKiralamaUcreti;
    }

    public String getRenk() {
        return renk;
    }
}
