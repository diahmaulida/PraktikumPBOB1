/*
Nama File    : MGaris.java
Deskripsi    : main class untuk garis
Pembuat      : Diah maulida pratiwi
Tanggal      : 26 Februari 2026
*/
public class MGaris {
    public static void main(String[] args) {
        // Membuat objek garis G1 dengan titik awal (-2,0) dan titik akhir (0,4)
        Garis G1 = new Garis(-2, 0, 0, 4);
        
        // membuat objek garis G2 dengan titik awal (0,0) dan titik akhir (0,0)
        Garis G2 = new Garis();

        // mengubah titik awal G2 menjadi (2,3) dan titik akhir menjadi (5,7)
        Titik t1 = new Titik();
        t1.setAbsis(0);
        t1.setOrdinat(0);
        G2.setTitik1(t1);
        Titik t2 = new Titik();
        t2.setAbsis(1);
        t2.setOrdinat(1);
        G2.setTitik2(t2);
        
        // mencetak garis G1 dan G2
        System.out.println("Garis G1:");
        G1.printGaris();
        System.out.println("Garis G2:");
        G2.printGaris();

        // menghitung banyaknya objek garis yang telah dibuat
        System.out.println("Jumlah objek garis yang telah dibuat: " + Garis.getCountGaris());

        // menghitung panjang garis G1 dan G2
        System.out.println("Panjang garis G1: " + G1.getPanjangGaris());
        System.out.println("Panjang garis G2: " + G2.getPanjangGaris());

        // menghitung gradien garis G1 dan G2
        System.out.println("Gradien garis G1: " + G1.getGradien());
        System.out.println("Gradien garis G2: " + G2.getGradien());
        
        //menampilkan titik tengah garis G1 dan G2
        System.out.println("Titik tengah garis G1: (" + G1.getTitikTengah().getAbsis() + "," + G1.getTitikTengah().getOrdinat() + ")");
        System.out.println("Titik tengah garis G2: (" + G2.getTitikTengah().getAbsis() + "," + G2.getTitikTengah().getOrdinat() + ")");

        // menanpilkan apakah garis G1 dan G2 sejajar atau tidak
        System.out.println("Apakah garis G1 dan G2 sejajar? " + G1.isSejajar(G2));
        // menampilkan apakah garis G1 dan G2 tegak lurus atau tidak
        System.out.println("Apakah garis G1 dan G2 tegak lurus? " + G1.isTegakLurus(G2));

        // mencetak persamaan garis G1 dan G2
        System.out.println("Persamaan garis G1:");
        G1.printPersamaanGaris();
        System.out.println("Persamaan garis G2:");
        G2.printPersamaanGaris();
    }
}
