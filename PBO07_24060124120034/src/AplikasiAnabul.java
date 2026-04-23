// Nama File: AplikasiAnabul.java
// Pembuat: Diah Maulida Pratiwi-24060124120034
// Tanggal: 22 April 2026
// Deskripsi: program yang merepresentasikan polimorfisme Universal Inclusion (nomor 3)

public class AplikasiAnabul {
    public static void main(String[] args) {
        // kamus
        Anabul A;

        // Membuat objek anabul berisi anjing
        A = new Anjing();
        A.setNama("Heli");
        // Memanggil method gerak dan bersuara dari objek Anjing
        A.Gerak();
        A.Bersuara();
        // Membuat objek Anjing
        Anjing anjing = new Anjing("Dog");
        // Memanggil method gerak dan bersuara dari objek Anjing
        anjing.Gerak();
        anjing.Bersuara();
        System.out.println();

        // Membuat objek anabul berisi kucing
        A = new Kucing();
        A.setNama("Keli");
        // Memanggil method gerak dan bersuara dari objek kucing
        A.Gerak();
        A.Bersuara();
        // Membuat objek Anjing
        Kucing kucing = new Kucing("Catty");
        // Memanggil method gerak dan bersuara dari objek Kucing
        kucing.Gerak();
        kucing.Bersuara();
        System.out.println();

        // Membuat objek anabul berisi Burung
        A = new Burung();
        A.setNama("Beo");
        // Memanggil method gerak dan bersuara dari objek Burung
        A.Gerak();
        A.Bersuara();
        // Membuat objek Burung
        Burung burung = new Burung("Walet");
        // Memanggil method gerak dan bersuara dari objek Burung
        burung.Gerak();
        burung.Bersuara();
        System.out.println();

        // Membuat objek anabul berisi Anabul
        A = new Anabul("Atan");
        // Memanggil procedure gerak dan suara anabul
        A.Gerak(); // ini kosong karena pakai method class anabul
        A.Bersuara(); // ini kosong karena pakai method class anabul
    }
}
