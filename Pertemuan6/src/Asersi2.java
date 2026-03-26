// Nama File = Asersi2.java
// Pembuat = Diah Maulida Pratiwi - 24060124120034
// Tanggal = 26 Maret 2026
// Deskripsi = Program untuk demo asersi, yang akan menolak input
//             jari-jari lingkaran yang bernilai nol

// class Lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}
 
// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = -7;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " 
            + kelilingLingkaran);
    } 
}
 
/*
Apa yang kurang tepat pada program Asersi2? 
jawaban: kurang tepatnya yaitu pada letak penulisan assert assert (jariJari > 0) : "jari jari tidak boleh nol!!!";
hal ini fungsinya assert jadi berubah yang harusnya mendetekse kesalahan logika internal program
sedangkan pada program fungsinya memvalidasi argumen dari input pengguna
Tapi untuk menjalankan assertnya harus menggunakan -enableassertions
*/
 