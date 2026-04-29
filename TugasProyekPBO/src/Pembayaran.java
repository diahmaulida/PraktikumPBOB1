// Nama File = Pembayaran.java
// Deskripsi = Class untuk pembayaran

import java.util.Date;

public class Pembayaran implements Laporan {
    // Atribut
    private String pembayaranId;
    private Date tanggalBayar;
    private boolean status;

    // Method
    // Konstruktor
    public Pembayaran(String pembayaranId, Date tanggalBayar) {
        this.pembayaranId = pembayaranId;
        this.tanggalBayar = tanggalBayar;
        this.status = false;
    }

    // Selektor & Mutator
    public String getPembayaranId() { 
        return pembayaranId; 
    }
    public void setPembayaranId(String pembayaranId) { 
        this.pembayaranId = pembayaranId; 
    }

    public Date getTanggalBayar() { 
        return tanggalBayar; 
    }
    public void setTanggalBayar(Date tanggalBayar) { 
        this.tanggalBayar = tanggalBayar; 
    }

    public boolean isStatus() { 
        return status; 
    }
    public void setStatus(boolean status) { 
        this.status = status; 
    }

    // Memproses pembayaran dan statusnya akan berubah true
    public void prosesPembayaran() {
        this.status = true;
        System.out.println("Pembayaran " + pembayaranId + " diproses.");
    }

    // Memvalidasi pembayaran
    public void validasiPembayaran() {
        System.out.println("Pembayaran " + pembayaranId + " valid: " + status);
    }

    // Method interface menampilkan laporan
    @Override
    public void cetakLaporan() {
        System.out.println("=== Laporan Pembayaran ===");
        System.out.println("ID Pembayaran: " + pembayaranId);
        System.out.println("Tanggal Bayar: " + tanggalBayar);
        System.out.println("Status       : " + (status ? "Lunas" : "Belum Lunas"));
    }
}
