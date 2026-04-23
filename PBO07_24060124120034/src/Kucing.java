// Nama File: Kucing.java
// Pembuat: Diah Maulida Pratiwi-24060124120034
// Tanggal: 22 April 2026
// Deskripsi: program yang merepresentasikan polimorfisme Universal Inclusion (nomor 3)

public class Kucing extends Anabul{
    // Atribut

    // Membuat Konstruktor tanpa parameter
    public Kucing() {
        super();
    }
    
    // Membuat Konstruktor dengan parameter nama
    public Kucing(String nama) {
        super(nama);
    }

    // Membuat procedure gerak kucing
    public void Gerak() {
        System.out.println("Melata");
    }

    // Membuat procedure suara kucing
    public void Bersuara() {
        System.out.println("meong");
    }
}
