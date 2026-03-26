/**
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 * Pengenalan klausa 'throw' dan 'throws'
 */
public class AngkaSial {
 
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }
 
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
/* 
Jawaban Pertanyaan
1. Ketika terjadi eksepsi, pada baris 12 di atas apakah dieksekusi?
jawab: pada saat di angka 10 baris 12 masih dijalankan, tapi saat angka 13 dijalankan baris 12 tidak dijalankan 
karena masuk ke dalam catch menjalankan exceptionnya, dan inputan setelah angka 13 yaitu 12 diabaikan.
2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
jawab: mungkin jika terdapat angka 13 yang merupakan exception angka sial, sehingga baris 21 dijalankan
namun jika tida terdapat angka 13 baris 21 tidak akan pernah dijalankan.


*/