// Nama File = MainGym.java
// Deskripsi = Class utama untuk menjalankan program sistem gym

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainGym {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        // ===================== PAKET GYM =====================
        // Membuat paket gym yang tersedia
        PaketGym paketBasic   = new PaketGym("PKT-001", "Basic",   300000, 30);
        PaketGym paketPremium = new PaketGym("PKT-002", "Premium", 600000, 40);
        PaketGym paketVIP     = new PaketGym("PKT-003", "VIP",     1200000, 40);

        // ===================== MEMBER =====================
        // Membuat objek member baru
        Member m1 = new Member("USR-001", "Andi",  "andi@email.com",  "pass123", "MBR-001", sdf.parse("01-01-2024"));
        Member m2 = new Member("USR-002", "Budi",  "budi@email.com",  "pass456", "MBR-002", sdf.parse("15-02-2024"));
        Member m3 = new Member("USR-003", "Citra", "citra@email.com", "pass789", "MBR-003", sdf.parse("10-03-2024"));

        // Member mendaftar membership dengan paket tertentu
        m1.daftarMembership(paketBasic);
        m2.daftarMembership(paketPremium);
        m3.daftarMembership(paketVIP);

        // ===================== PERSONAL TRAINER =====================
        // Membuat objek personal trainer
        PersonalTrainer pt1 = new PersonalTrainer("USR-004", "Doni", "doni@email.com", "trainerpass", "TRN-001", "Cardio");
        PersonalTrainer pt2 = new PersonalTrainer("USR-005", "Eka",  "eka@email.com",  "trainerpass", "TRN-002", "Strength");

        // Trainer menambahkan klien
        pt1.tambahKlien(m1);
        pt1.tambahKlien(m2);
        pt2.tambahKlien(m3);

        // ===================== ADMIN =====================
        // Membuat objek admin
        Admin admin = new Admin("USR-006", "Fajar", "fajar@email.com", "adminpass", 1);

        // Admin mengelola member dan trainer
        admin.tambahMember(m1);
        admin.tambahTrainer(pt1);
        admin.hapusMember(m2);

        // ===================== JADWAL =====================
        // Membuat jadwal sesi latihan
        Jadwal j1 = new Jadwal("JDW-001", sdf.parse("20-04-2026"), "08:00");
        Jadwal j2 = new Jadwal("JDW-002", sdf.parse("21-04-2026"), "10:00");

        // ===================== SESI LATIHAN =====================
        // Membuat sesi latihan antara member dan trainer
        SesiLatihan s1 = new SesiLatihan("SES-001", m1, pt1, j1);
        SesiLatihan s2 = new SesiLatihan("SES-002", m3, pt2, j2);

        // Membuat dan membatalkan sesi
        s1.buatSesi();
        s2.buatSesi();
        s2.batalkanSesi();

        // ===================== PEMBAYARAN =====================
        // Membuat dan memproses pembayaran member
        Pembayaran pay1 = new Pembayaran("PAY-001", new Date());
        Pembayaran pay2 = new Pembayaran("PAY-002", new Date());

        pay1.prosesPembayaran();
        pay1.validasiPembayaran();
        pay2.validasiPembayaran(); // belum diproses, status false

        // ===================== LOGIN & LOGOUT =====================
        // Simulasi login dan logout
        m1.login();
        pt1.login();
        admin.logout();

        // ===================== TAMPIL PROFIL =====================
        // Menampilkan profil semua objek
        System.out.println();
        m1.tampilProfil();
        System.out.println();
        m2.tampilProfil();
        System.out.println();
        pt1.tampilProfil();
        System.out.println();
        pt2.tampilProfil();
        System.out.println();
        admin.tampilProfil();

        // ===================== COUNTER =====================
        // Menampilkan jumlah objek yang telah dibuat
        System.out.println();
        System.out.println("Jumlah User    : " + User.getJumlahUser());
        System.out.println("Jumlah Member  : " + Member.getJumlahMember());
        System.out.println("Jumlah Trainer : " + PersonalTrainer.getJumlahTrainer());

        // Trainer melihat jadwal
        pt1.lihatJadwal();
        pt2.lihatJadwal();

        // ===================== LAPORAN (interface Laporan) =====================
        // Mencetak laporan admin - total seluruh user, member, dan trainer
        System.out.println();
        admin.cetakLaporan();

        // Mencetak laporan pembayaran - pay1 sudah lunas, pay2 belum
        System.out.println();
        pay1.cetakLaporan();
        System.out.println();
        pay2.cetakLaporan();
    }
}
