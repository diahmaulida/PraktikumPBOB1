//Nama File = Petani.java
//Deskripsi = membuat subclass Petani
//Pembuat   = Diah Maulida Pratiwi-24060124120034
//Tanggal   = 20 Maret 2026

import java.util.Date;
public class Petani extends Manusia implements Pajak {
    //Atribut
    private String asal_kota;
    private static int counterPetani;
    // Method
    // Konstruktor
    public Petani(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }
    // selektor asal kota
    public String getAsalKota(){
        return asal_kota;
    }
    // mutator asal kota
    public void setasal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }
    // mennghitung objek pengusaha dibuat
    public static int getCounterPetani() {
        return counterPetani;
    }
    //mengembalikan hitung masa kerja
    @Override
    public int hitungMasaKerja() {
        long diff = new Date().getTime() - getTgl_mulai_kerja().getTime();
        int tahun = (int) (diff / (1000L * 60 * 60 * 24 * 365));
        return tahun + 0;
    }
    //menghitung pajak
    @Override
    public double hitungPajak() {
        return 0;
    }
}

