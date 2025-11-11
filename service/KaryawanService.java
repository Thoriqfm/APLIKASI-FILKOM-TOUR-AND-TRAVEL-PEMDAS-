package service;

import java.util.Scanner;
import model.Karyawan;

public class KaryawanService {

    public Karyawan[] daftarKaryawan;
    public int jumlahKaryawan;
    public Scanner scanner;

    public KaryawanService() {
        this.daftarKaryawan = new Karyawan[10];
        this.jumlahKaryawan = 0;
        this.scanner = new Scanner(System.in);
    }

    public void inputDataKaryawan() {
        System.out.println("===== INPUT DATA KARYAWAN =====");
        System.out.print("Jumlah karyawan yang akan diinput (maks 10): ");
        int jumlah = scanner.nextInt();
        scanner.nextLine();

        if (jumlah > 10) {
            System.out.println("Jumlah melebihi kapasitas maksimal!");
            return;
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nKaryawan ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();

            System.out.print("No. Telp (berawalan +62): ");
            String noTelp = scanner.nextLine();

            System.out.print("Jenis Kelamin (L/P): ");
            String jenisKelamin = scanner.nextLine();

            System.out.print("Kategori (supir travel/supir rentcar/admin): ");
            String kategori = scanner.nextLine();

            Karyawan karyawan = new Karyawan(nama, alamat, noTelp, jenisKelamin, kategori);

            daftarKaryawan[jumlahKaryawan] = karyawan;
            jumlahKaryawan++;

            // memanggil method
            karyawan.absenKerja();
        }
    }

    public void cetakDataKaryawan() {
        for (int i = 0; i < jumlahKaryawan; i++) {
            daftarKaryawan[i].displayKaryawan();
        }
    }

    public Karyawan[] getDaftarKaryawan() {
        return daftarKaryawan;
    }

    public int getJumlahKaryawan() {
        return jumlahKaryawan;
    }
}
