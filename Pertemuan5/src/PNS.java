//Nama File = PNS.java
//Deskripsi = membuat subclass PNS
//Pembuat   = Diah Maulida Pratiwi-24060124120034
//Tanggal   = 20 Maret 2026

import java.util.Date;
public class PNS extends Manusia implements Pajak {
    //Atribut
    private String nip;
    private static int counterPNS;
    // Method
    // Konstruktor
    public PNS(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
    //konstruktor tanpa alamat
    public PNS(String nama, Date tgl_mulai_kerja, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, "", pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    // selektor nip
    public String getNip(){
        return nip;
    }
    // mutator nip
    public void setNip(String nip) {
        this.nip = nip;
    }
    // mennghitung objek pengusaha dibuat
    public static int getCounterPNS() {
        return counterPNS;
    }
    //mengembalikan hitung masa kerja
    @Override
    public int hitungMasaKerja() {
        long diff = new Date().getTime() - getTgl_mulai_kerja().getTime();
        int tahun = (int) (diff / (1000L * 60 * 60 * 24 * 365));
        return tahun + 4;
    }
    //menghitung pajak
    @Override
    public double hitungPajak() {
        return 0.1 * getPendapatan();
    }
}



