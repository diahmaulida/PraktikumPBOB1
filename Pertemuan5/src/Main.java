//Nama File = Main.java
//Deskripsi = menjalankan fungsi dan prosedure bangun datar dan sub classnya
//Pembuat   = Diah Maulida Pratiwi-24060124120034
//Tanggal   = 18 Maret 2026
public class Main {
    public static void main(String[] args) {
        //pembuatan objek
        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran(14);

        //menampilkan luas dan keliling lingkaran
        System.out.println("Luas P1 (persegi 10): " + P1.getLuas());
        System.out.println("Luas L1 (Lingkaran 7): " + L1.getLuas());

        //Memanggil method
        System.out.println("\n---Pengujian Method Perbandingan---");
        //Membandingkan objek yang berbeda
        boolean cekLuas1 = P1.isEqualLuas(L1);
        System.out.println("Apakah Luas P1 sama dengan L1? " + cekLuas1);
        boolean cekLuas2 = P1.isEqualLuas(P2);
        System.out.println("Apakah Luas P1 sama dengan P2? " + cekLuas2);

        //Contoh perbandingan yang bernilai true
        BangunDatar P3 = new Persegi(10);
        System.out.println("Apakah Luas P1 sama dengan P3? " + P1.isEqualLuas(P3));

        //Pengujian iResize pada Lingkaran
        System.out.println("\n---Pengujian iResize Lingkaran---");
        System.out.println("Jari-jari awal L2: " + L2.getJari());
        System.out.println("Luas awal L2: " + L2.getLuas());

        //zoomIn: memperbesar jari-jari 10%
        L2.zoomIn();
        System.out.println("\nSetelah zoomIn (10% lebih besar):");
        System.out.println("Jari-jari L2: " + L2.getJari());
        System.out.println("Luas L2: " + L2.getLuas());

        //zoomOut: memperkecil jari-jari 10%
        L2.zoomOut();
        System.out.println("\nSetelah zoomOut (10% lebih kecil):");
        System.out.println("Jari-jari L2: " + L2.getJari());
        System.out.println("Luas L2: " + L2.getLuas());

        //zoom: menskalakan jari-jari sesuai persentase
        L2.zoom(150);
        System.out.println("\nSetelah zoom(150) (skala 150%):");
        System.out.println("Jari-jari L2: " + L2.getJari());
        System.out.println("Luas L2: " + L2.getLuas());

        //zoomIn: memperbesar Persegi 10%
        P2.zoomIn();
        System.out.println("\nSetelah zoomIn (10% lebih besar):");
        System.out.println("sisi P2: " + P2.getSisi());
        System.out.println("Luas P2: " + P2.getLuas());

        //zoomOut: memperkecil jari-jari 10%
        P2.zoomOut();
        System.out.println("\nSetelah zoomOut (10% lebih kecil):");
        System.out.println("sisi P2: " + P2.getSisi());
        System.out.println("Luas P2: " + P2.getLuas());

        //zoom: menskalakan jari-jari sesuai persentase
        P2.zoom(150);
        System.out.println("\nSetelah zoom(150) (skala 150%):");
        System.out.println("sisi P2: " + P2.getSisi());
        System.out.println("Luas P2: " + P2.getLuas());
    }
}
