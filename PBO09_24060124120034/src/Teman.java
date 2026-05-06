import java.util.*;
// Nama File = Teman.java
// Pembuat = Diah Maulida Pratiwi-24060124120034
// Tanggal = 06 Mei 2026
// Deskripsi = Menerapkan koleksi dalam bentuk list
public class Teman {
    //Atribut
    private int nbelm;
    private List<String> Lnama;

    // Konstruktor teman
    public Teman() {
        Lnama = new ArrayList<String>();
        nbelm = 0;
    }

    // Operator
    // Mengembalikan jumlah elemen list
    public int getNbelm() {
        return Lnama.size();
    }
    // Mengembalikan nama list  di indeks tertentu
    public String getNama(int indeks) {
        return Lnama.get(indeks);
    }
    // Mengubah nama List di indeks tertentu
    public void setNama(int indeks, String nama) {
        Lnama.set(indeks, nama);
    }
    // Menambahkan nama ke dalam list
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }
    // Menghapus nama dari dalam list
    public void delNama(String nama) {
        Lnama.remove(nama);
        nbelm--;
    }
    // Mengembalikan true jika nama berada dalam anggota list
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // Mengganti nama lama dengan nama baru
    public void gantiNama(String nama, String namabaru) {
        int indeks = Lnama.indexOf(nama);
        if (indeks != -1) {
            Lnama.set(indeks, namabaru);
        }
    }
    // Menghitung jumlah suatu nama dalam list
    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) {
                count++;
            }
        }
        return count;
    }
    // Menampilkan daftar teman
    public void showTeman() {
        System.out.println("Daftar Teman: ");
        for (int i = 0; i < Lnama.size(); i++) {
            System.out.println((i+1) + ". " + Lnama.get(i));
        }
    }

}
/*
Program Java mengelola koleksi objek generik dengan mengimpor paket util. Sebuah kelas bernama
Teman memiliki sebuah atribut nbelm yang menyatakan banyaknya elemen, dan sebuah atribut
Lnama yang merupakan koleksi list dengan elemen String. Atribut Lnama harus diinstantiasi pada
kontruktor kelas Teman. Operator dalam kelas Teman disertai aplikasinya, antara lain :
a. getNbelm(), b. getNama(indeks), c. setNama(indeks,nama), d. addNama(nama),
e. delNama(nama), f. isMember(nama), g. gantiNama(nama,namabaru), h. countNama(nama),
i. showTeman(){menampilkan semua nama teman dalam Lnama}.
Buatlah realisasi dan aplikasi kelas Teman beserta atribut dan operator yang relevan!
 */
