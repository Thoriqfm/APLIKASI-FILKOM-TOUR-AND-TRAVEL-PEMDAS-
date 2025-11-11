package model;

public class Karyawan {

    public String NamaKaryawan;
    public String Alamat;
    public String NoTelp;
    public String JenisKelamin;
    public String KategoriKaryawan;

    // constructor
    public Karyawan(String NamaKaryawan, String Alamat, String NoTelp, String JenisKelamin, String KategoriKaryawan) {
        this.NamaKaryawan = NamaKaryawan;
        this.Alamat = Alamat;
        this.NoTelp = NoTelp;
        this.JenisKelamin = JenisKelamin;
        this.KategoriKaryawan = KategoriKaryawan;
    }

    // behavior (menampilkan tiap karyawan)
    public void absenKerja() {
        System.out.println(NamaKaryawan + " telah bekerja sebagai " + KategoriKaryawan);
    }

    // getter method
    public String getNamaKaryawan() {
        return NamaKaryawan;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getNoTelp() {
        return NoTelp;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public String getKategoriKaryawan() {
        return KategoriKaryawan;
    }

    // method untuk menampilkan daftar isi karyawan
    public void displayKaryawan() {
        System.out.println("===== DAFTAR KARYAWAN =====");
        System.out.println("Nama Karyawan : " + NamaKaryawan);
        System.out.println("Alamat Karyawan : " + Alamat);
        System.out.println("Nomor Telpon : " + NoTelp);
        System.out.println("Jenis Kelamin : " + JenisKelamin);
        System.out.println("Kategori : " + KategoriKaryawan);
        System.out.println("============================");
    }

}
