package Anabul;

// Nama File: Anabul.java
// Pembuat: Diah Maulida Pratiwi-24060124120034
// Tanggal: 22 April 2026
// Deskripsi: program yang merepresentasikan polimorfisme Universal Inclusion (nomor 3)

public abstract class Anabul {
    // Atribut
    private String nama;
    private String panggilan;

    // Membuat konstruktor Anabul tanpa parameter
    public Anabul() {   
    }

    // Membuat konstruktor Anabul
    public Anabul(String nama) {
        this.nama = nama;
        this.panggilan = nama;
        System.out.println("Anabul " + nama);
    }
    // membuat selektor nama
    public String getNama() {
        return nama;
    }
    // membuat mutator nama
    public void setNama(String nama) {
        this.nama = nama;
        System.out.println("Anabul " + nama);
    }
    // membuat selektor panggilan
    public String getPanggilan() {
        return panggilan;
    }
    // membuat mutator panggilan
    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }
    // membuat procedure Gerak
    public void Gerak() {
    }
    // membuat procedure Bersuara
    public void Bersuara() {
    }
    // mendapatkan bobot dari suatu anabul
    public double getBobot() {
        return 0.0;
    }
    // membuat method abstract getJenis: untuk menentukan jenis kucing atau anjing atau burung
    public abstract String getJenis();
}

