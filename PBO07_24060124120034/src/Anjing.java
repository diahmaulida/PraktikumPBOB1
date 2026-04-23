// Nama File: Anjing.java
// Pembuat: Diah Maulida Pratiwi-24060124120034
// Tanggal: 22 April 2026
// Deskripsi: program yang merepresentasikan polimorfisme Universal Inclusion (nomor 3)

public class Anjing extends Anabul {
    // membuat konstruktor Anjing tanpa parameter
    public Anjing() {
        super();
    }

    // membuat konstruktor Anjing dengan parameter nama 
    public Anjing(String nama) {
        super(nama);
    }

    // membuat procedure gerak anjing
    public void Gerak() {
        System.out.println("Melata");
    }

    // membuat procedure suara anjing
    public void Bersuara() {
        System.out.println("guk-guk");
    }
}
