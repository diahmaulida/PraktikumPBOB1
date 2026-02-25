/**
 * Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Diah Maulida Pratiwi
 * Tanggal      : 19 Februari 2026
 */
package pertemuan2;
public class Titik {
    /************************ ATRIBUT ************************/
    private double absis;
    private double ordinat;

    /************************* METHOD *************************/
    
    // konstruktor untuk membuat titik dengan absis dan ordinat tertentu
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
    }

     // konstruktor untuk membuat titik (0,0)
     public Titik() {
        this.absis = 0;
        this.ordinat = 0;
    }

    // mengembalikan nilai absis
    public double getAbsis() {
        return this.absis;
    }

    // mengembalikan nilai ordinat
    public double getOrdinat() {
        return this.ordinat;
    }

    // mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        this.absis = x;
    }

    // mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        this.ordinat = y;
    }

    // menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        this.absis = this.absis + x;
        this.ordinat = this.ordinat + y;
    }
    public void reflectX(){
        this.ordinat = -this.ordinat;
    }
    public void reflectY() {
        this.absis = -this.absis;
    }
    public double jarakTitikLain(Titik t) {
        return Math.sqrt(Math.pow(this.absis - t.getAbsis(),2) + Math.pow(this.ordinat - t.getOrdinat(),2));
    }


    // mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + this.absis + "," + this.ordinat + ")");
    }

    public double jarakPusat() {
        return Math.sqrt(Math.pow(this.absis,2) + Math.pow(this.ordinat,2));
    }
    
} // end class Titik