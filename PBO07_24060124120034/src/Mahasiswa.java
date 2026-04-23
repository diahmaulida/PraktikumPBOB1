// Nama File: Mahasiswa.java
// Pembuat: Diah Maulida Pratiwi-24060124120034
// Tanggal: 22 April 2026
// Deskripsi: program yang merepresentasikan polimorfisme Ad Hoc Overloading (nomor 2)

public class Mahasiswa {
    //a. Atribut
    private int NIM;
    private String Nama;
    private String Programstudi;

    //c. Konstruktor tanpa parameter (default)
    public Mahasiswa() {
        this.NIM = -999;
        this.Nama = "n/a";
        this.Programstudi = "n/a";
    }

    //d. Konstruktor dengan tiga buah parameter
    public Mahasiswa(int NIM, String Nama, String Programstudi) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Programstudi = Programstudi;
    }

    //e. Konstruktor dengan satu parameter ibjek mahasiswa lain
    public Mahasiswa(Mahasiswa m) {
        this.NIM = m.NIM;
        this.Nama = m.Nama;
        this.Programstudi = m.Programstudi;
    }

    //a. Selektor dan Mutator
    // mengambil nilai nim
    public int getNIM() {
        return NIM;
    }
    
    // mengambil nilai nama
    public String getNama() {
        return Nama;
    }
    
    // mengambil nilai program studi
    public String getProgramstudi() {
        return Programstudi;
    }
    
    // mengubah nilai nim
    public void setNIM(int NIM) {
        this.NIM = NIM;
    }
    
    // mengubah nilai nama
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    // mengubah nilai program studi tanpa parameter 
    public void setProgramstudi() {
        this.Programstudi = "Kosong";
    }

    // mengubah nilai program studi dengan satu parameter string
    public void setProgramstudi(String Programstudi) {
        this.Programstudi = Programstudi;
    }
    
    // mengubah nilai program studi dengan satu parameter objem mahasiswa lain
    public void setProgramstudi(Mahasiswa m) {
        this.Programstudi = m.Programstudi;
    }

    // Menampilkan data mahasiswa
    public void tampilData() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("NIM: "+ NIM);
        System.out.println("Nama: "+ Nama);
        System.out.println("Program Studi: "+ Programstudi);
    }

}
