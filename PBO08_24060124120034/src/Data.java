// Nama File: Data.java
// Pembuat: Diah Maulida Pratiwi-24060124120034
// Tanggal: 29 April 2026
// Deskripsi: Kelas generik data

public class Data<T> {
    // Atribut
    private T[] ruang;
    private int banyak;
    
    // Membuat Konstruktor untuk membuat objek dengan inisialisasi larik 100 elemen
    @SuppressWarnings("unchecked")
    public Data() {
        ruang = (T[]) new Object[100];
        banyak = 0;
    }

    // Prosedur setIsi: mengisi elemen pada posisi pos {1... 100}
    public void setIsi(int pos, T objek) {
        if (pos >= 1 && pos <= 100) {
            ruang[pos - 1] = objek;
            if (pos > banyak) {
                banyak = pos;
            }
        }
    }

    // Fungsi getIsi: mengembalikan elemen pada posisi pos {1...100}
    public T getIsi(int pos) {
        if (pos >= 1 && pos <= 100) {
            return ruang[pos - 1];
        }
        return null;
    }

    // Fungsi getSize: mengembalikan banyak elemen
    public int getSize() {
        return banyak;
    }
}
