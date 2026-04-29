// Nama File: Datum.java
// Pembuat: Diah Maulida Pratiwi-24060124120034
// Tanggal: 29 April 2026
// Deskripsi: kelas generik Dataum

public class Datum<T> {
    // Atribut
    private T isi;

    // Membuat Konstruktor untuk membuat objek generik tanpa parameter
    public Datum() {
    this.isi = null;
    }

    // Membuat Konstruktor untuk membuat objek generik dengan parameter
    public Datum(T isi) {
        this.isi = isi;
    } 

    // Membuat method untuk mengambil nilai isi
    public T getIsi() {
        return isi;
    }

    // Membuat method untuk mengubah nilai isi
    public void setIsi(T isibaru) {
        this.isi = isibaru;
    }
}
