//Nama File = Pegawai.java
//Deskripsi = membuat fungsi dan prosedure Pegawai
//Pembuat   = Diah Maulida Pratiwi-24060124120034
//Tanggal   = 14 Maret 2026
package Latihan;

import java.time.LocalDate;
import java.time.Period;
import java.text.NumberFormat;
import java.util.Locale;

public class Pegawai {
    // Atribut protected agar bisa diakses langsung oleh subclass
    protected String nip, nama;
    protected LocalDate tanggalLahir, tmt;
    protected double gajiPokok;
    protected static final String[] BULAN = {
        "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli",
        "Agustus", "September", "Oktober", "November", "Desember"
    };

    // Konstruktor
    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    // mengembalikan nama
    public String getNama() { return nama; }

    // mengembalikan nip
    public String getNip() { return nip; }

    // mengembalikan gaji pokok
    public double getGajiPokok() { return gajiPokok; }

    // mengembalikan tanggal lahir
    public LocalDate getTanggalLahir() { return tanggalLahir; }

    // mengembalikan tmt
    public LocalDate getTmt() { return tmt; }

    // menghitung masa kerja dari TMT hingga tanggal sekarang
    public Period getMasaKerja() {
        return tmt.until(LocalDate.now());
    }

    // memformat masa kerja "x tahun y bulan"
    public String formatMasaKerja() {
        Period p = getMasaKerja();
        return p.getYears() + " tahun " + p.getMonths() + " bulan";
    }

    // menghitung tanggal pensiun: tanggal 1 bulan setelah ulang tahun ke-BUP
    public LocalDate getTanggalPensiun(int bup) {
        return tanggalLahir.plusYears(bup).withDayOfMonth(1).plusMonths(1);
    }

    // memformat tanggal "dd bulan yyyy"
    public static String formatTanggal(LocalDate date) {
        return date.getDayOfMonth() + " " + BULAN[date.getMonthValue() - 1] + " " + date.getYear();
    }

    // memformat nominal rupiah
    public static String formatRupiah(double nominal) {
        return NumberFormat.getCurrencyInstance(new Locale("id", "ID")).format(nominal);
    }

    // implementasi default, di-override oleh subclass
    public double getTunjangan() {
        return 0;
    }

    // implementasi default, di-override oleh subclass
    public void printInfo() {
        System.out.println("NIP       : " + nip);
        System.out.println("Nama      : " + nama);
        System.out.println("Gaji Pokok: " + formatRupiah(gajiPokok));
    }
}
