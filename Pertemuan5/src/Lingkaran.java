//Nama File = Lingkaran.java
//Deskripsi = membuat fungsi dan prosedure lingkaran
//Pembuat   = Diah Maulida Pratiwi-24060124120034
//Tanggal   = 18 Maret 2026
public class Lingkaran extends BangunDatar implements iResize {
    //Atribut
    private double jari;

    //Konstruktor
    public Lingkaran(double jari) {
        this.jari = jari;
    }

    //get jari
    public double getJari() {
        return jari;
    }

    @Override
    // luas lingkaran
    public double getLuas() {
        // Rumus: π * r^2
        return Math.PI * Math.pow(jari, 2);
    }

    @Override
    //mengembalikan nilai keliling lingkaran
    public double getKeliling() {
        // Rumus: 2 * π * r
        return 2 * Math.PI * jari;
    }
    @Override
    // memperbesar jari-jari lingkaran sebesar 10%
    public void zoomIn() {
        jari *= 1.1;
    }

    @Override
    // memperkecil jari-jari lingkaran sebesar 10%
    public void zoomOut() {
        jari *= 0.9;
    }

    @Override
    // menskalakan jari-jari lingkaran sesuai persentase yang diberikan
    public void zoom(int percent) {
        jari *= (percent / 100.0);
    }
}