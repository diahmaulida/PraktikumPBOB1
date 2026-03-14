package Latihan;

import java.time.LocalDate;
import java.time.Period;
import java.text.NumberFormat;
import java.util.Locale;

public abstract class Pegawai {
    protected String nip, nama;
    protected LocalDate tanggalLahir, tmt;
    protected double gajiPokok;
    protected static final String[] BULAN = {
        "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli",
        "Agustus", "September", "Oktober", "November", "Desember"
    };

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }
    
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public LocalDate getTmt() {
        return tmt;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public Period getMasaKerja() {
        return tmt.until(LocalDate.now());
    }

    public String formatMasaKerja() {
        Period p = getMasaKerja();
        return p.getYears() + " tahun " + p.getMonths() + " bulan";
    }

    public LocalDate getTanggalPensiun(int bup) {
        return tanggalLahir.plusYears(bup).withDayOfMonth(1).plusMonths(1);
    }

    public static String formatTanggal(LocalDate date) {
        return date.getDayOfMonth() + " " + BULAN[date.getMonthValue() - 1] + " " + date.getYear();
    }

    public static String formatRupiah(double nominal) {
        return NumberFormat.getCurrencyInstance(new Locale("id", "ID")).format(nominal);
    }
    public abstract double getTunjangan();
    public abstract void printInfo();
}
