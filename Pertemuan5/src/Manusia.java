//Nama File = Manusia.java
//Deskripsi = membuat parents inheritance yaitu manusia
//Pembuat   = Diah Maulida Pratiwi-24060124120034
//Tanggal   = 20 Maret 2026

import java.text.SimpleDateFormat;
import java.util.Date;
public abstract class  Manusia {
    // Atribut
    protected String nama, alamat;
    protected  static  int counterMns;
    protected Date tgl_mulai_kerja;
    protected double pendapatan;

    //kontruktor dengan parameter
    public Manusia(String nama, Date tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tgl_mulai_kerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;

    }
    // selektor nama
    public String getNama() {
        return nama;
    }
    // mutator nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    // selektor tgl mulai kerja
    public Date getTgl_mulai_kerja() {
        return tgl_mulai_kerja;
    }
    // mutator tgl mulai kerja
    public void setTgl_mulai_kerja(Date tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }
    // selektor alamat
    public String getAlamat() {
        return alamat;
    }
    // mutator alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    // selektor pendapatan
    public double getPendapatan() {
        return pendapatan;
    }
    // mutator pendapatan
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }
    // menghitung jumlah objek yang dibuat
    public static int getCounterMns() {
        return counterMns;
    }
    // mencetak objek dengan detail
    public void cetakInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Nama= " + nama);
        System.out.println("Tanggal Mulai Kerja= " + sdf.format(tgl_mulai_kerja));
        System.out.println("Alamat= " + alamat);
        System.out.println("Pendapatan= " + pendapatan);
    }

    // abstrak method
    public abstract int hitungMasaKerja();

}