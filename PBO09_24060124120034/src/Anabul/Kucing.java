package Anabul;

// Nama File: Kucing.java
// Pembuat: Diah Maulida Pratiwi-24060124120034
// Tanggal: 29 April 2026
// Deskripsi: program yang merepresentasikan polimorfisme Universal Inclusion (nomor 3) + atribut bobot

public class Kucing extends Anabul{
    // Atribut
    private double bobot; //berat dalam kilogram

    // Konstruktor dengan parameter nama
    public Kucing(String nama) {
    super(nama);
    this.bobot = 0;
    }

    // Konstruktor dengan parameter nama dan berat
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    // Mengembalikan berat kucing
    public double getBobot() {
        return this.bobot;
    }

    // Mengatur berat kucing
    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    // Membuat procedure gerak kucing
    public void Gerak() {
        System.out.println("Melata");
    }

    // Membuat procedure suara kucing
    public void Bersuara() {
        System.out.println("meong");
    }
    
    // Membuat getJenis untuk yang kucing (override)
    @Override
    public String getJenis(){
        return "Kucing";
    }
}

