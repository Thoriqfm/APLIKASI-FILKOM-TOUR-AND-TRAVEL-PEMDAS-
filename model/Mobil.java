package model;

public class Mobil {

    private String noPlat;
    private String merkMobil;
    private String warnaMobil;
    private int tahunKeluaran;

    // Constructor
    public Mobil(String noPlat, String merkMobil, String warnaMobil, int tahunKeluaran) {
        this.noPlat = noPlat;
        this.merkMobil = merkMobil;
        this.warnaMobil = warnaMobil;
        this.tahunKeluaran = tahunKeluaran;
    }

    // getter method (enkapsulasi)
    public String getNoPlat() {
        return noPlat;
    }

    public String getMerkMobil() {
        return merkMobil;
    }

    public String getWarnaMobil() {
        return warnaMobil;
    }

    public int getTahunKeluaran() {
        return tahunKeluaran;
    }

    // method menampilkan data mobil
    public void displayMobil() {
        System.out.println("===== DATA MOBIL ======");
        System.out.println("No. Plat: " + noPlat);
        System.out.println("Merk: " + merkMobil);
        System.out.println("Warna: " + warnaMobil);
        System.out.println("Tahun keluaran: " + tahunKeluaran);
        System.out.println("======================");
    }
}
