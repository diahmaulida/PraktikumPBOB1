// Nama File = Membership.java
// Deskripsi = Class untuk membership gym

import java.util.Date;

public class Membership {
    // Atribut
    private String membershipId;
    private Date tanggalMulai;
    private Date tanggalSelesai;
    private boolean statusAktif;
    private PaketGym paket;

    // Method
    // Konstruktor
    public Membership(String membershipId, Date tanggalMulai, PaketGym paket) {
        this.membershipId = membershipId;
        this.tanggalMulai = tanggalMulai;
        this.paket = paket;
        this.statusAktif = false;
    }

    // Selektor & Mutator
    public String getMembershipId() {
        return membershipId; 
    }
    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId; 
    }

    public Date getTanggalMulai() { 
        return tanggalMulai; 
    }
    public void setTanggalMulai(Date tanggalMulai) { 
        this.tanggalMulai = tanggalMulai; 
    }

    public Date getTanggalSelesai() {
        return tanggalSelesai; 
    }
    public void setTanggalSelesai(Date tanggalSelesai) { 
        this.tanggalSelesai = tanggalSelesai; 
    }

    public boolean isStatusAktif() { 
        return statusAktif; 
    }
    public void setStatusAktif(boolean statusAktif) { 
        this.statusAktif = statusAktif; 
    }

    public PaketGym getPaket() { 
        return paket; 
    }
    public void setPaket(PaketGym paket) { 
        this.paket = paket; 
    }

    // Mengaktifkan membership
    public void aktifkan() {
        this.statusAktif = true;
        System.out.println("Membership " + membershipId + " diaktifkan.");
    }
    // Menonaktifkan membership
    public void nonAktifkan() {
        this.statusAktif = false;
        System.out.println("Membership " + membershipId + " dinonaktifkan.");
    }
    // Menghitung sisa hari expired membership
    public int expiredDate() {
        long diff = tanggalSelesai.getTime() - new Date().getTime();
        return (int) (diff / (1000L * 60 * 60 * 24));
    }
}
