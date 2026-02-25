/**
 * Nama File    : MTitik.java
 * Deskripsi    : main class untuk mencoba class Titik
 * Pembuat      : diah maulida pratiwi
 * Tanggal      : 19 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        // Membuat objek titik T1 (0,0)
        Titik T1 = new Titik(); 
        
        // Mengubah absis T1 dengan nilai 3
        T1.setAbsis(3); 
        
        // Mengubah ordinat T1 dengan nilai 4
        T1.setOrdinat(4); 
        
        // Mencetak koordinat T1 ke layar
        T1.printTitik(); 
        
        // Menggeser T1 sejauh (3,4)
        T1.geser(3, 4); 
        
        // Menampilkan koordinat T1 setelah digeser
        T1.printTitik();

        // Menampilkan kuadran T1 setelah digeser
        System.out.println("Kuadran T1: " + T1.getKuadran());

        // Menampilkan jumlah objek Titik yang telah dibuat
        System.out.println("Jumlah objek Titik yang telah dibuat: " + Titik.getCounterTitik());

        // setRefleksiX untuk T1
        T1.setRefleksiX();

        // Menampilkan koordinat T1 setelah direfleksikan terhadap sumbu X
        T1.printTitik();

        // setRefleksiY untuk T1
        T1.setRefleksiY();

        // Menampilkan koordinat T1 setelah direfleksikan terhadap sumbu Y
        T1.printTitik();

        // Jarak untuk T1 ke titik lain (5,6)
        Titik T2 = new Titik();
        T2.setAbsis(5);
        T2.setOrdinat(6);
        double jarak = T1.getJarak(T2);
        System.out.println("Jarak antara T1 dan T2: " + jarak);
        
        // Menampilkan jarakpusat T1 ke titik pusat (0,0)
        double jarakPusat = T1.getJarakPusat();
        System.out.println("Jarak T1 ke titik pusat (0,0): " + jarakPusat);
    }
}