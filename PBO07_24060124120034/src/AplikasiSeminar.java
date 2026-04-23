// Nama File: AplikasiSeminar.java
// Pembuat: Diah Maulida Pratiwi-24060124120034
// Tanggal: 23 April 2026
// Deskripsi: program yang merepresentasikan polimorfisme Universal Inclusion (nomor 4b)

public class AplikasiSeminar {
    public static void main(String[] args) {
        // e. buat 2 objek dosen dan 5 objek mahasiswa
        Dosen dosen1 = new Dosen("Diah", "NIP001");
        Dosen dosen2 = new Dosen("Tiwi", "NIP002");
        Mahasiswa4 mahasiswa1 = new Mahasiswa4("Maulida", "NIM001");
        Mahasiswa4 mahasiswa2 = new Mahasiswa4("Baba", "NIM002");
        Mahasiswa4 mahasiswa3 = new Mahasiswa4("Caca", "NIM003");
        Mahasiswa4 mahasiswa4 = new Mahasiswa4("Dada", "NIM004");
        Mahasiswa4 mahasiswa5 = new Mahasiswa4("Gaga", "NIM005");

        // d. uji registrasi seminar dari 7 objek yang telah dibuat
        Seminar seminar1 = new Seminar();
        System.out.println("==Registrasi peserta==");
        seminar1.registrasi(dosen1);
        seminar1.registrasi(dosen2);
        seminar1.registrasi(mahasiswa1);
        seminar1.registrasi(mahasiswa2);
        seminar1.registrasi(mahasiswa3);
        seminar1.registrasi(mahasiswa4);
        seminar1.registrasi(mahasiswa5);

        // c. tampilkan jumlah peserta seminar
        System.out.println("Jumlah peserta seminar: " + seminar1.countPeserta());

        // g. tampilkan nama peserta seminar
        System.out.println("===Daftar nama peserta seminar===");
        seminar1.tampilPeserta();

        // h. tampilkan jumlah peserta mahasiswa
        System.out.println("Jumlah peserta mahasiswa: " + seminar1.countMahasiswa());

        // i. mengubah dosen wali
        mahasiswa1.setWali("Pak Kaka");
        mahasiswa2.setWali("Pak Kaka");
        mahasiswa3.setWali("Pak Jaja");
        mahasiswa4.setWali("Pak Jaja");
        mahasiswa5.setWali("Pak Kaka");
        System.out.println("===Daftar nama mahasiswa beserta dosen walinya===");

        // j. menampilkan nama mahasiswa dan dosen walinya
        mahasiswa1.tampilDataMahasiswa();
        System.out.println();
        mahasiswa2.tampilDataMahasiswa();
        System.out.println();
        mahasiswa3.tampilDataMahasiswa();
        System.out.println();
        mahasiswa4.tampilDataMahasiswa();
        System.out.println();
        mahasiswa5.tampilDataMahasiswa();
    }
}
