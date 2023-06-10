import arac.*;

public class AracKiralamaFirmasi {
    private String hesapTuru;
    private Arac[] araclar;

    public AracKiralamaFirmasi(String hesapTuru) {
        this.hesapTuru = hesapTuru;
        araclar = new Arac[4];
        araclar[0] = new Hatchback("Renault", "Clio", 300, 100, "Kırmızı");
        araclar[1] = new Sedan("Toyota", "Corolla", 500, 200, 1500, "Beyaz");
        araclar[2] = new Suv("BMW", "X5", 800, 300, 2500, "Siyah", 3);
        araclar[3] = new Sedan("BMW", "X5", 850, 550, 5500, "Mavi");

    }

    public void araclarıListele() {
        System.out.println("Araçlar:");
        for (int i = 0; i < araclar.length; i++) {
            Arac arac = araclar[i];
            if (hesapTuru.equals("sirket")) {
                System.out.println("Araç " + (i + 1) + ":");
                System.out.println("Marka: " + arac.getMarka());
                System.out.println("Model: " + arac.getModel());
                System.out.println("Tip: " + arac.getClass().getSimpleName());
                System.out.println("Bagaj Kapasitesi: " + arac.getBagajKapasitesi() + " litre");
                System.out.println("Gunluk Kiralama Ucreti: " + arac.getGunlukKiralamaUcreti() + " TL");
                System.out.println("Renk: " + arac.getRenk());
                if (arac instanceof Sedan || arac instanceof Suv) {
                    System.out.println("Aylik Kiralama Ucreti: " + ((Sedan) arac).getAylikKiralamaUcreti() + " TL");
                }
                if (arac instanceof Suv) {
                    System.out.println("Araç Yaşı: " + ((Suv) arac).getAracYasi() + " yıl");
                }
            }
            else if(hesapTuru.equals("vatandas")){
                if (arac instanceof Hatchback){
                    System.out.println("Araç " + (i + 1) + ":");
                    System.out.println("Marka: " + arac.getMarka());
                    System.out.println("Model: " + arac.getModel());
                    System.out.println("Tip: " + arac.getClass().getSimpleName());
                    System.out.println("Bagaj Kapasitesi: " + arac.getBagajKapasitesi() + " litre");
                    System.out.println("Gunluk Kiralama Ucreti: " + arac.getGunlukKiralamaUcreti() + " TL");
                    System.out.println("Renk: " + arac.getRenk());
                }                
            }
            else{
                System.out.println("Böyle bir müşteri tipi bulunmamaktadır.");
            }            
        }
    }

    public void aracKirala(int aracNo, String kiralamaTipi, int aracYasi) {
        Arac arac = araclar[aracNo - 1];
        if (hesapTuru.equals("vatandas")){
            if (arac instanceof Hatchback){
                double gunlukKiralamaUcreti = arac.getGunlukKiralamaUcreti();
                System.out.println("Araba " + aracNo + " günlük olarak kiralandı. Kiralama bedeli: " + gunlukKiralamaUcreti + " TL");
            }
            else{
                System.out.println("Hatalı giriş Yaptınız.");
            }
        }
        else if (hesapTuru.equals("sirket")){
            
        }
        
        
        else {
            System.out.println("Geçersiz kiralama tipi.");
        }
    }
}
if (kiralamaTipi.equals("aylik")) {
            if (!(arac instanceof Sedan)) {
                System.out.println("Bu araç sadece Sedan modeller için aylık olarak kiralanabilir.");
            } else {
                double aylıkKiralamaUcreti = ((Sedan) arac).getAylikKiralamaUcreti();
                System.out.println("Araba " + aracNo + " aylık olarak kiralandı. Kiralama bedeli: " + aylıkKiralamaUcreti + " TL");
            }
        } else if (kiralamaTipi.equals("günlük")) {
            if (!hesapTuru && !(arac instanceof Hatchback)) {
                System.out.println("Bu araç sadece Hatchback modeller için günlük olarak kiralanabilir.");
            } else {
                double gunlukKiralamaUcreti = arac.getGunlukKiralamaUcreti();
                if (arac instanceof Suv) {
                    int aracYasFarki = Math.max(0, aracYasi - ((Suv) arac).getAracYasi());
                    gunlukKiralamaUcreti += aracYasFarki * 50; // Her yıl için 50 TL ek ücret
                }
                System.out.println("Araba " + aracNo + " günlük olarak kiralandı. Kiralama bedeli: " + gunlukKiralamaUcreti + " TL");
            }