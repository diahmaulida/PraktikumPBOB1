// Nama File: Civitasakademika.java
// Pembuat: Diah Maulida Pratiwi-24060124120034
// Tanggal: 23 April 2026
// Deskripsi: program yang merepresentasikan polimorfisme Universal Inclusion (nomor 4)

public abstract class Civitasakademika {
    // Atribut
    private String nama;

    // Membuat konstruktor Civitasakademika tanpa parameter
    public Civitasakademika() {   
    }
    
    // Membuat konstruktor Civitasakademika dengan parameter
    public Civitasakademika(String nama) {
        this.nama = nama;
    }

    // Method selektor dan mutator
    // Mengambil nilai nama
    public String getNama() {
        return nama;
    }

    // Mengambil nilai nomor
    public abstract String getNomor();

    // Mengubah nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }

}