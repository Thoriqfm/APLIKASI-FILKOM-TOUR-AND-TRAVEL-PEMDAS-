package model;

public class Karyawan {

    private String NamaKaryawan;
    private String Alamat;
    private String NoTelp;
    private String JenisKelamin;
    private String KategoriKaryawan;

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

    public String getKategoriKaryawan() {
        return KategoriKaryawan;
    }

    public void setKategoriKaryawan(String KategoriKaryawan) {
        this.KategoriKaryawan = KategoriKaryawan;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public String getNoTelp() {
        return NoTelp;
    }

    public void setNoTelp(String NoTelp) {
        this.NoTelp = NoTelp;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNamaKaryawan() {
        return NamaKaryawan;
    }

    public void setNamaKaryawan(String NamaKaryawan) {
        this.NamaKaryawan = NamaKaryawan;
    }

}
