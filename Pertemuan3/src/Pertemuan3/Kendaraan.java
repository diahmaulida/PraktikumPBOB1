// Nama File = Kendaraan.java
// Nama = Diah Maulida Pratiwi/24060124120034
// Tanggal = 04 Maret 2026
public class Kendaraan {
    /********Atribut**********/
    private String noPlat;
    private String jenis;

    /*********Method**********/
    // konstruktor tanpa parameter
    public Kendaraan() {
        noPlat = "";
        jenis = "";
    }
    //konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //selektor untuk noPlat
    public String getNoPlat() {
        return noPlat;
    }
    //selektor untuk jenis
    public String getJenis() {
        return jenis;
    }

    //mutator untuk noPlat
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }
    //mutator untuk jenis
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
}
