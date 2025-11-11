package service;

import java.util.Scanner;
import model.Mobil;

public class MobilService {

    public Mobil[] daftarMobil;
    public int jumlahMobil;
    public Scanner scanner;

    public MobilService() {
        this.daftarMobil = new Mobil[10];
        this.jumlahMobil = 0;
        this.scanner = new Scanner(System.in);
    }

    public void inputDataMobil() {
        System.out.println("===== INPUT DATA MOBIL =====");
        System.out.print("Jumlah mobil yang akan diinput (maks 10): ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();

        if (jumlah > 10) {
            System.out.println("Jumlah melebihi kapasistas!");
            return;
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMobil ke-" + (i + 1));
            System.out.print("No. Plat: ");
            String noPlat = scanner.nextLine();

            System.out.print("Merk Mobil: ");
            String merkMobil = scanner.nextLine();

            System.out.print("Warna Mobil: ");
            String warnaMobil = scanner.nextLine();

            System.out.print("Tahun Keluaran: ");
            int tahunKeluaran = scanner.nextInt();

            Mobil mobil = new Mobil(noPlat, merkMobil, warnaMobil, tahunKeluaran);

            daftarMobil[jumlahMobil] = mobil;
            jumlahMobil++;
        }

    }

    public void cetakDataMobil() {
        for (int i = 0; i < jumlahMobil; i++) {
            daftarMobil[i].displayMobil();
        }
    }

    public Mobil[] getDaftarMobil() {
        return daftarMobil;
    }

    public int getJumlahMobil() {
        return jumlahMobil;
    }
}
