// Nama File: Dosen.java
// Pembuat: Diah Maulida Pratiwi-24060124120034
// Tanggal: 23 April 2026
// Deskripsi: program yang merepresentasikan polimorfisme Universal Inclusion (nomor 4a)

public class Dosen extends Civitasakademika{
    // Atribut
    private String nip;

    // Membuat konstruktor Dosen tanpa parameter
    public Dosen() {
        super();
    }
    
    // Membuat konstruktor Dosen dengan parameter
    public Dosen(String nama, String nip) {
        super(nama);
        this.nip = nip;
    }

    // Method selektor dan mutator
    // Mengambil nilai nip
    public String getNip() {
        return nip;
    }

    // Mengambil nilai nomor
    public String getNomor() {
        return nip;
    }

    // Mengubah nilai nip
    public void setNip(String nip) {
        this.nip = nip;
    }

}
