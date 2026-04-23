// Nama File: Mahasiswa4.java
// Pembuat: Diah Maulida Pratiwi-24060124120034
// Tanggal: 23 April 2026
// Deskripsi: program yang merepresentasikan polimorfisme Universal Inclusion (nomor 4a)

public class Mahasiswa4 extends Civitasakademika {
    // Atribut
    private String nim;
    private String dosenwali;

    // Membuat konstruktor Mahasiswa4 tanpa parameter
    public Mahasiswa4() {
        super();
    }
     
    // Membuat konstruktor Mahasiswa4 dengan parameter
    public Mahasiswa4(String nama, String nim) {
        super(nama);
        this.nim = nim;
        this.dosenwali = "n/a";
    }

    // Method selektor dan mutator
    // Mengambil nilai nim
    public String getNim() {
        return nim;
    }

    // Mengambil nilai nomor
    public String getNomor() {
        return nim;
    }

    // Mengambil nilai dosen wali
    public String getDosenwali() {
        return dosenwali;
    }

    // Mengubah nilai nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Mengubah nilai dosen wali
    public void setWali(String dosenwali) {
        this.dosenwali = dosenwali;
    }

    // Menampilkan data NIM, Nama Mahasiswa, dan Dosenwali
    public void tampilDataMahasiswa() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + getNama());
        System.out.println("Dosen Wali: " + dosenwali);
    }

}
