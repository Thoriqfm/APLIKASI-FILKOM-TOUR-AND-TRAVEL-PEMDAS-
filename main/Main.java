package main;

import java.util.Scanner;
import service.KaryawanService;
import service.MobilService;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("APLIKASI FILKOM TOUR AND TRAVEL");
        System.out.println("===============================");

        System.out.println("1. Input Data Karyawan");
        System.out.println("2. Input Data Mobil");
        System.out.print("Masukan pilihan: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1: {
                KaryawanService karyawanService = new KaryawanService();
                karyawanService.inputDataKaryawan();
                karyawanService.cetakDataKaryawan();
                break;
            }
            case 2: {
                MobilService mobilService = new MobilService();
                mobilService.inputDataMobil();
                mobilService.cetakDataMobil();
                break;
            }
            default: {
                System.out.println("Pilihan tidak valid!");
                break;
            }
        }

        scanner.close();
    }
}
