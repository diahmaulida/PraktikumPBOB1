//Nama File = DosenTetap.java
//Deskripsi = membuat fungsi dan prosedure Dosen Tetap
//Pembuat   = Diah Maulida Pratiwi-24060124120034
//Tanggal   = 14 Maret 2026
package Latihan;

import java.time.LocalDate;

public class DosenTetap extends Dosen {
    // Atribut
    private String nidn;
    private static final int BUP = 65;

    // Konstruktor DosenTetap
    public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    // mengembalikan nidn
    public String getNidn() {
        return nidn;
    }

    // mengembalikan BUP
    public int getBUP() {
        return BUP;
    }

    // mengembalikan Tunjangan dosen tetap
    @Override
    public double getTunjangan() {
        return 0.02 * getMasaKerja().getYears() * gajiPokok;
    }

    // menampilkan informasi dosen tetap
    @Override
    public void printInfo() {
        int tahun = getMasaKerja().getYears();
        System.out.println("NIP             : " + nip);
        System.out.println("NIDN            : " + nidn);       
        System.out.println("Nama            : " + nama);        
        System.out.println("Tanggal lahir   : " + formatTanggal(tanggalLahir));
        System.out.println("TMT             : " + formatTanggal(tmt));
        System.out.println("Jabatan         : Dosen Tetap");  
        System.out.println("Fakultas        : " + fakultas);
        System.out.println("Masa Kerja      : " + formatMasaKerja());
        System.out.println("Tanggal Pensiun : " + formatTanggal(getTanggalPensiun(BUP)));
        System.out.println("Gaji Pokok      : " + formatRupiah(gajiPokok));             
        System.out.printf("Tunjangan       : 2%% x %d x %s = %s%n", tahun, formatRupiah(gajiPokok), formatRupiah(getTunjangan()));
    }
}