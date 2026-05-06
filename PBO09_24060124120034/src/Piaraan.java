import Anabul.*;
import java.util.*;

// Nama File = Piaraan.java
// Pembuat = Diah Maulida Pratiwi-24060124120034
// Tanggal = 06 Mei 2026
// Deskripsi = Kelas Piaraan mengelola antrean objek Anabul menggunakan LinkedList

public class Piaraan {
    // Atribut
    private int nbelm;
    private LinkedList<Anabul> Lanabul;

    // Konstruktor
    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    // Mengembalikan banyaknya elemen dalam antrean
    public int getNbelm() {
        return Lanabul.size();
    }

    // Menambah anabul ke akhir antrean
    public void enqueueAnabul(Anabul anabul) {
        Lanabul.addLast(anabul);
        nbelm++;
    }

    // Mengecek apakah anabul ada dalam antrean
    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    // Mengambil anabul pertama tanpa mengeluarkannya
    public Anabul getAnabul() {
        return Lanabul.peekFirst();
    }

    // Mengambil anabul pertama sekaligus mengeluarkannya
    public Anabul dequeueAnabul() {
        nbelm--;
        return Lanabul.removeFirst();
    }

    // Menampilkan nama panggilan semua anabul dalam antrean
    public void showAnabul() {
        System.out.println("Daftar Anabul dalam antrean:");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getPanggilan());
        }
    }

    // Menghitung banyak keluarga Kucing dalam antrean
    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if ("Kucing".equals(a.getJenis())){
                count++;
            }
        }
        return count;
    }

    // Menghitung total bobot keluarga Kucing dalam antrean
    public double bobotKucing() {
        double total = 0;
        for (Anabul a : Lanabul) {
            if (a.getClass().getSimpleName().equals("Kucing")) {
                total += a.getBobot();
            }
        }
        return total;
    }

    // Menampilkan nama panggilan dan jenis objek setiap anabul
    public void showJenisAnabul() {
        System.out.println("Daftar Anabul beserta jenis:");
        for (Anabul a : Lanabul) {
            System.out.println("- " + a.getPanggilan() + " (" + a.getClass().getName() + ")");
        }
    }

}


