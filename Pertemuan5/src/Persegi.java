//Nama File = Persegi.java
//Deskripsi = membuat fungsi dan prosedure Persegi
//Pembuat   = Diah Maulida Pratiwi-24060124120034
//Tanggal   = 18 Maret 2026
public class Persegi extends BangunDatar implements iResize {
    // Atribut
    private double sisi;

    //konstruktor
    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    @Override
    //mengembalikan nilai luas persegi
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    //mengembalikan nilai keliling persegi
    public double getKeliling() {
        return 4 * sisi;
    }

    @Override
    // mengubah ukuran persegi menjadi 10% lebih besar
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    //mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    @Override
    //menskalakan ukuran sesuai dengan input percent
    public void zoom(int percent) {
        sisi = sisi * percent / 100.0;
    }
}