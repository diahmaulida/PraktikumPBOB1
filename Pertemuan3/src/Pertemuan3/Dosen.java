// Nama File = Dosen.java
// Nama = Diah Maulida Pratiwi
// Tanggal = 04 Maret 2026

public class Dosen {
    /****************Atribut******************/
    private String nip;
    private String nama;
    private String prodi;

    /****************Method******************/
    //konstruktor dosen tanpa parameter
    public Dosen() {
        nip = "";
        nama = "";
        prodi = "";
    }
    //konstruktor dosen dengan parameter nip, nama, dan prodi
    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    //selektor untuk nip
    public String getNip() {
        return nip;
    }

    public String getProdi() {
        return prodi;
    }

    public String getNama() {
        return nama;
    }

    //mutator untuk nip
    public void setNip(String nip) {
        this.nip = nip;
    }

    //mutator untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    //mutator untuk prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

}