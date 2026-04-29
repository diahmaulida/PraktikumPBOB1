// Nama File: Anabul.java
// Pembuat: Diah Maulida Pratiwi-24060124120034
// Tanggal: 22 April 2026
// Deskripsi: Kelas anabul sebagai superclass

public class Anabul {
    // Atribut
    private String nama;

    // Membuat konstruktor Anabul
    public Anabul(String nama) {
        this.nama = nama;
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
    // membuat procedure Gerak
    public void Gerak() {
    }
    // membuat procedure Bersuara
    public void Bersuara() {
    }
}
