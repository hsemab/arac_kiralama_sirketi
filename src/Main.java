import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hesap Türünüzü Seçin (sirket/vatandas): ");
        String hesapTuru = scanner.next();

        boolean sirketHesabi = hesapTuru.equals("sirket");

        AracKiralamaFirmasi firma = new AracKiralamaFirmasi(hesapTuru);

        firma.araclarıListele();

        System.out.print("Kiralamak istediğiniz aracın numarasını girin: ");
        int aracNo = scanner.nextInt();

        System.out.print("Kiralama Tipini Seçin (gunluk/aylik): ");
        String kiralamaTipi = scanner.next();

        int aracYasi = 0;
        if (kiralamaTipi.equals("gunluk") && !(sirketHesabi)) {
            System.out.print("Aracın Yaşını Girin: ");
            aracYasi = scanner.nextInt();
        }

        firma.aracKirala(aracNo, kiralamaTipi, aracYasi);

        scanner.close();
    }
}
