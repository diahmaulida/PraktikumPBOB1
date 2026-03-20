//Nama File = Pengusaha.java
//Deskripsi = membuat sub class pengusaha
//Pembuat   = Diah Maulida Pratiwi-24060124120034
//Tanggal   = 20 Maret 2026

import java.util.Date;
public class Pengusaha extends Manusia implements Pajak {
    //Atribut
    private String npwp;
    private static int counterPengusaha;
    // Method
    // Konstruktor
    public Pengusaha(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }
    // selektor npwp
    public String getNpwp(){
        return npwp;
    }
    // mutator npwp
    public void setNpwp(String npwp) {
        this.npwp = npwp;
    }
    // mennghitung objek pengusaha dibuat
    public static int getCounterPengusaha() {
        return counterPengusaha;
    }
    //mengembalikan hitung masa kerja
    @Override
    public int hitungMasaKerja() {
        long diff = new Date().getTime() - getTgl_mulai_kerja().getTime();
        int tahun = (int) (diff / (1000L * 60 * 60 * 24 * 365));
        return tahun + 3;
    }
    //menghitung pajak
    @Override
    public double hitungPajak() {
        return 0.15 * getPendapatan();
    }
}

