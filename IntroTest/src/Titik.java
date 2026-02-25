/**
 * Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Diah Maulida Pratiwi
 * Tanggal      : 25 Februari 2026
 */

public class Titik {
    /************************ ATRIBUT ************************/
    double absis;
    double ordinat;
    static int counterTitik = 0; // atribut untuk menghitung jumlah objek Titik yang dibuat

    /************************* METHOD *************************/
    
    // konstruktor untuk membuat titik (0,0)
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++; // setiap kali objek Titik dibuat, counterTitik akan bertambah 1
    }
    static int getCounterTitik() {
        return counterTitik;
    }

    // mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    void setAbsis(double x) {
        absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    void setOrdinat(double y) {
        ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }
    
    int getKuadran(){
        if (absis > 0 && ordinat > 0) {
        return 1;
        } else if (absis < 0 && ordinat > 0) {
        return 2;
        } else if (absis < 0 && ordinat < 0) {
        return 3;
        } else if (absis > 0 && ordinat < 0) {
        return 4;
        } else {
        return 0;
        }
    }
    double getJarakPusat() {
        double jarak = Math.sqrt(Math.pow(absis, 2) + Math.pow(ordinat, 2));
        return jarak;
    }
    double getJarak(Titik t) {
        double jarak = Math.sqrt(Math.pow(absis - t.absis, 2) + Math.pow(ordinat - t.ordinat, 2));
        return jarak;
    }

    void setRefleksiX() {
        ordinat = -ordinat;
    }
    void setRefleksiY() {
        absis = -absis;
    }
    Titik getRefleksiX() {
        Titik t = new Titik();
        t.absis = absis;
        t.ordinat = -ordinat;
        return t;
    }
    Titik getRefleksiY() {
        Titik t = new Titik();
        t.absis = -absis;
        t.ordinat = ordinat;
        return t;
    }

} // end class Titik