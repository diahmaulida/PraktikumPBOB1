// Nama File = Jadwal.java
// Deskripsi = Class untuk jadwal sesi latihan
// Pembuat   = Diah Maulida Pratiwi-24060124120034

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Jadwal {
    // Atribut
    private String jadwalId;
    private Date tanggal;
    private String jam;
    private boolean available;

    // Method
    // Konstruktor
    public Jadwal(String jadwalId, Date tanggal, String jam) {
        this.jadwalId = jadwalId;
        this.tanggal = tanggal;
        this.jam = jam;
        this.available = true;
    }

    // Selektor & Mutator
    public String getJadwalId() { 
        return jadwalId; 
    }
    public void setJadwalId(String jadwalId) { 
        this.jadwalId = jadwalId; 
    }

    public Date getTanggal() {
        return tanggal; 
    }
    public void setTanggal(Date tanggal) { 
        this.tanggal = tanggal; 
    }

    public String getJam() { 
        return jam; 
    }
    public void setJam(String jam) { 
        this.jam = jam; 
    }

    public boolean isAvailable() { 
        return available; 
    }
    public void setAvailable(boolean available) { 
        this.available = available; 
    }

    // Overloading cariJadwal
    // Mencari jadwal dengan inputan nama trainer
    public List<Jadwal> cariJadwal(String namaTrainer) {
        System.out.println("Mencari jadwal trainer: " + namaTrainer);
        return new ArrayList<>();
    }
    // Mencari jadwal dengan inputan tanggal dan jam
    public List<Jadwal> cariJadwal(Date tanggal, String jam) {
        System.out.println("Mencari jadwal tanggal " + tanggal + " jam " + jam);
        return new ArrayList<>();
    }
}
