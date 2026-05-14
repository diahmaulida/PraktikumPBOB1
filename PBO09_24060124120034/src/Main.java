// Nama File = Main.java
// Pembuat = Diah Maulida Pratiwi-24060124120034
// Tanggal = 06 Mei 2026
// Deskripsi = Aplikasi kelas Teman dan Piaraan

import Anabul.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        //Kamus
        List<String> L; // collection<String>
        // Membuat objek teman dengan kapasitas 3
        Teman t = new Teman();
        // Menambahkan nama-nama teman
        t.addNama("Diah");
        t.addNama("Maulida");
        t.addNama("Pratiwi");
        // Mendapatkan jumlah elemen list
        System.out.println("Jumlah elemen: " + t.getNbelm());
        // Menampilkan daftar teman
        t.showTeman();
        // Mengubah nama teman di indeks 1
        t.setNama(1, "Maulida");
        // Mngembalikan true jika Diah adalah anggota
        System.out.println("Apakah Diah anggota? " + t.isMember("Diah"));
        // Mengganti nama Pratiwi menjadi tiwi
        t.gantiNama("Pratiwi", "tiwi");
        t.showTeman();
        // Menghitung jumlah nama 
        System.out.println("Jumlah nama Diah: " + t.countNama("Diah"));
        System.out.println("Jumlah nama Maulida:" + t.countNama("Maulida"));

        //=== linkedlist ===
        // membuat objek piaraan
        Piaraan p = new Piaraan();
        Piaraan myZoo = new Piaraan();

        // Asumsi konstruktor Kucing(String panggilan, double bobot)
        // Dan Anabul adalah Parent Class
        Kucing k1 = new Kucing("comot", 4.5);
        Kucing k2 = new Kucing("Copot", 3.2);
        
        // Menambah data antri dengan enqueueAnabul()
        myZoo.enqueueAnabul(k1);
        myZoo.enqueueAnabul(k2);

        // Menampilkan daftar anabul
        System.out.println("Jumlah elemen: " + myZoo.getNbelm());
        myZoo.showAnabul();
        
        // Menampilkan jumlah kucing dan total bobot kucing
        System.out.println("Jumlah Kucing: " + myZoo.countKucing());
        System.out.println("Total Bobot Kucing: " + myZoo.bobotKucing() + " kg");

        // Menampilkan jenis setiap anabul
        myZoo.showJenisAnabul();

        // Mengeluarkan anabul dari antrean dengan deququeAnabul()
        System.out.println("\nMengeluarkan: " + myZoo.dequeueAnabul().getPanggilan());
        System.out.println("Sisa antrean: " + myZoo.getNbelm());
    }

}

/* Pada materi ini disimpulkan bahwa koleksi objek (collection) adalaha
Struktur data yang digunakan untuk menyimpan sekumpulan objek. pada penerapan di java
menggunakan library java.util. dalam praktikum ini kita menerapkan konsep list dna linkedlist.
List adalah koleksi objek yang menyimpan elemen secara urut dan mengizikan adanya duplikat elemen dalam satu list
Sedangkan Linkedlist adalah koleksi objek yang saling terhubung, yang dimana konsepnya gabaungana dari list dan 
queue, sehingga List: Membuatnya bisa diakses berdasarkan indeks dan mengizinkan duplikat, dan dapat dilakukan
Deque (Double Ended Queue): Membuatnya memiliki fungsi antrean seperti addFirst(), addLast(), peek(), dan poll().
 */
