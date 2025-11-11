# APLIKASI FILKOM TOUR AND TRAVEL

## 📋 Deskripsi Proyek
Aplikasi Filkom Tour and Travel merupakan sistem manajemen untuk unit bisnis travel dan rental mobil yang dimiliki oleh Filkom. Aplikasi ini menyediakan fitur untuk mengelola data karyawan dan mobil menggunakan konsep Pemrograman Berorientasi Objek (OOP) dalam Java.

## 🏗️ Struktur Projek
APLIKASI-FILKOM-TOUR-AND-TRAVEL-PEMDAS/
├── main/
│ └── Main.java # Class utama aplikasi
├── model/
│ ├── Karyawan.java # Class model untuk data karyawan
│ └── Mobil.java # Class model untuk data mobil
├── service/
│ ├── KaryawanService.java # Service untuk mengelola data karyawan
│ └── MobilService.java # Service untuk mengelola data mobil
├── docs/
│ └── APLIKASI FILKOM TOUR AND TRAVEL.drawio.png # Diagram class
└── README.md # Dokumentasi proyek


## 🚀 Fitur Utama

### 🔧 Modul 1: Manajemen Karyawan dan Mobil
- **Input Data Karyawan** - Menginput data karyawan dengan atribut: nama, alamat, no telepon, jenis kelamin, kategori
- **Input Data Mobil** - Menginput data mobil dengan atribut: no plat, merk, warna, tahun keluaran
- **Tampilkan Data** - Menampilkan semua data yang telah diinput
- **Behaviour OOP** - Method khusus untuk setiap objek (absenKerja untuk karyawan)

## 🛠️ Teknologi yang Digunakan
- **Bahasa Pemrograman**: Java
- **Paradigma**: Object-Oriented Programming (OOP)
- **Konsep yang Digunakan**: Class, Object, Constructor, Array, Looping, Package

## 📥 Instalasi dan Menjalankan

### Prerequisites
- Java JDK 8 atau lebih tinggi
- Git (untuk cloning repository)

### 📊 Class Diagram
Karyawan
--------
- NamaKaryawan: String
- Alamat: String
- NoTelp: String
- JenisKelamin: String
- KategoriKaryawan: String
--------
+ Karyawan(nama, alamat, noTelp, jenisKelamin, kategori)
+ absenKerja(): void
+ displayKaryawan(): void
+ getter methods

Mobil
-----
- noPlat: String
- merkMobil: String
- warnaMobil: String
- tahunKeluaran: int
-----
+ Mobil(noPlat, merk, warna, tahun)
+ displayMobil(): void
+ getter methods

### 🔽 Clone Repository
```bash
git clone https://github.com/Thoriqfm/APLIKASI-FILKOM-TOUR-AND-TRAVEL-PEMDAS-.git
cd APLIKASI-FILKOM-TOUR-AND-TRAVEL-PEMDAS-
# Compile semua file
javac -d . main/Main.java model/Karyawan.java model/Mobil.java service/KaryawanService.java service/MobilService.java

# Jalankan aplikasi
java main.Main

# Cara lain
Bisa dengan click tombol play pada file Main.java

