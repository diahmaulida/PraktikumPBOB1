// Nama File: Burung.java
// Pembuat: Diah Maulida Pratiwi-24060124120034
// Tanggal: 22 April 2026
// Deskripsi: program yang merepresentasikan polimorfisme Universal Inclusion (nomor 3)

public class Burung extends Anabul {
    // Atribut
    
    // Membuat Konstruktor dengan parameter nama    
    public Burung(String nama) {
        super(nama);
    }

    // Membuat procedure gerak burung
    public void Gerak() {
        System.out.println("terbang");
    }
    
    // Membuat procedure suara burung
    public void Bersuara() {
        System.out.println("cuit");
    }
}
