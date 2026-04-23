// Nama File: Seminar.java
// Pembuat: Diah Maulida Pratiwi-24060124120034
// Tanggal: 23 April 2026
// Deskripsi: program yang merepresentasikan polimorfisme Universal Inclusion (nomor 4)

public class Seminar {
    // Atribut
    private Civitasakademika[] pesertas = new Civitasakademika[100];
    private int banyakpeserta;

    // Membuat konstruktor Seminar tanpa parameter
    public Seminar() {
        this.banyakpeserta = 0;
    }

    // Menghitung banyaknya peserta seminar dengan fungsi countPeserta
    public int countPeserta() {
        return banyakpeserta;
    }

    // Menambahkan peserta dengan prosedur registrasi dengan pengisian kontigu
    public void registrasi(Civitasakademika c) {
        if (banyakpeserta < 100) {
            pesertas[banyakpeserta] = c;
            banyakpeserta++;
            System.out.println(c.getNama() + " terdaftar dalam seminar.");
        }
        else {
            System.out.println("Maaf, kapasitas seminar sudah penuh.");
        }
    }

    // Menampilkan daftar Nomor dan Nama semua peserta
    public void tampilPeserta() {
        System.out.println("Daftar Peserta Seminar: ");
        for (int i = 0; i < banyakpeserta; i++) {
            System.out.println((i+1) + " Nomor: " + pesertas[i].getNomor() + ", Nama: " + pesertas[i].getNama());
        }
    }

    // Menghitung banyaknya peserta mahasiswa dengan fungsi countMahasiswa
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakpeserta; i++) {
            if (pesertas[i] instanceof Mahasiswa4) {
                count++;
            }
        }
        return count;
    }

}
