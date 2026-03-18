//Nama File = Dosen.java
//Deskripsi = membuat fungsi dan prosedure Dosen
//Pembuat   = Diah Maulida Pratiwi-24060124120034
//Tanggal   = 14 Maret 2026
package Latihan;
import java.time.LocalDate;

public abstract class Dosen extends Pegawai {
    // Atribut
    protected String fakultas;

    // Konstruktor Dosen
    public Dosen (String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    // mengembalikan fakultas
    public String getFakultas() {
        return fakultas;
    }
    

}