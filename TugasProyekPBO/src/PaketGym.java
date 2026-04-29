// Nama File = PaketGym.java
// Deskripsi = Class untuk paket gym

public class PaketGym {
    // Atribut
    private String paketId;
    private String namaPaket;
    private double harga;
    private int durasiHari;

    // Method
    // Konstruktor
    public PaketGym(String paketId, String namaPaket, double harga, int durasiHari) {
        this.paketId = paketId;
        this.namaPaket = namaPaket;
        this.harga = harga;
        this.durasiHari = durasiHari;
    }

    // Selektor & Mutator
    public String getPaketId() { 
        return paketId; 
    }
    public void setPaketId(String paketId) { 
        this.paketId = paketId; 
    }

    public String getNamaPaket() { 
        return namaPaket; 
    }
    public void setNamaPaket(String namaPaket) { 
        this.namaPaket = namaPaket; 
    }

    public double getHarga() { 
        return harga; 
    }
    public void setHarga(double harga) { 
        this.harga = harga; 
    }

    public int getDurasi() { 
        return durasiHari; 
    }
    public void setDurasiHari(int durasiHari) { 
        this.durasiHari = durasiHari; 
    }
}
