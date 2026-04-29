// Nama File: OperatorGenerik.java
// Pembuat: Diah Maulida Pratiwi-24060124120034
// Tanggal: 29 April 2026
// Deskripsi: Kelas OperatorGenerik dengan prosedur generik Tukar dan fungsi generik Bobot2

public class OperasiGenerik<T> {
    // Membuat prosedur generik tukar isi dari objek a dengan objek b
    public static <T> void tukar(Datum<T> a, Datum<T> b) {
            T temp = a.getIsi();
            a.setIsi(b.getIsi());
            b.setIsi(temp);
    }

    // Mengembalikan jumlah bobot keduanya
    public static <T extends Kucing> double bobot2(T k1, T k2) {
        return k1.getBobot() + k2.getBobot();
    }
}
