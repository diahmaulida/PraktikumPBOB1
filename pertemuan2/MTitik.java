/*
Nama : Diah Maulida Pratiwi - 24060124120034

*/
package pertemuan2;

public class MTitik {
    public static void main(String[] args) {
        // membuat objek titik dengan konstruktor default
        Titik T1 = new Titik();
        // membuat objek titik dengan konstruktor dengan parameter
        Titik T2 = new Titik(3, 4);
        // mencetak koordinat titik T1 dan T2
        System.out.println("Titik T1:");
        // memanggil method printTitik() untuk mencetak koordinat titik T1
        T1.printTitik();    
        System.out.println("Titik T2:");
        // memanggil method printTitik() untuk mencetak koordinat titik T2
        T2.printTitik();
        // menggeser titik T1 sejauh 2 satuan ke kanan dan 3 satuan ke atas
        T1.geser(2, 3);
        // mencetak koordinat titik T1 setelah digeser
        System.out.println("Titik T1 setelah digeser:");
        T1.printTitik();
        // mencetak jarak antara titik T1 dan T2
        System.out.println("Jarak antara T1 dan T2: " + T1.jarakTitikLain(T2));
        // memantulkan titik T2 terhadap sumbu X
        T2.reflectX();
        // mencetak koordinat titik T2 setelah dipantulkan terhadap sumbu X
        System.out.println("Titik T2 setelah dipantulkan terhadap sumbu X:");
        // memanggil method printTitik() untuk mencetak koordinat titik T2
        T2.printTitik();
        // memantulkan titik T2 terhadap sumbu Y
        T2.reflectY();
        // mencetak koordinat titik T2 setelah dipantulkan terhadap sumbu Y
        System.out.println("Titik T2 setelah dipantulkan terhadap sumbu Y:");
        // memanggil method printTitik() untuk mencetak koordinat titik T2
        T2.printTitik();
        // mencetak jarak antara titik T1 dan pusat koordinat
        System.out.println("Jarak antara T1 dan pusat koordinat: " + T1.jarakPusat());
        // mencetak jarak antara titik T2 dan pusat koordinat
        System.out.println("Jarak antara T2 dan pusat koordinat: " + T2.jarakPusat());
        // mencetak jarak antara titik T1 dan titik T2 setelah dipantulkan
        System.out.println("Jarak antara T1 dan T2 setelah dipantulkan: " + T1.jarakTitikLain(T2));
    }
    
}
