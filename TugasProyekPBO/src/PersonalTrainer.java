// Nama File = PersonalTrainer.java
// Deskripsi = Class PersonalTrainer turunan dari User
public class PersonalTrainer extends User {
    // Atribut
    private String trainerId;
    private String spesialisasi;
    private int jumlahKlien;
    private static int jumlahTrainer = 0;

    // Method
    // Konstruktor
    public PersonalTrainer(String userId, String nama, String email, String password, String trainerId, String spesialisasi) {
        super(userId, nama, email, password);
        this.trainerId = trainerId;
        this.spesialisasi = spesialisasi;
        this.jumlahKlien = 0;
        jumlahTrainer++;
    }

    // selektor dan mutator
    public String getTrainerId() {
        return trainerId;
    }
    public void setTrainerId(String trainerId) {
        this.trainerId = trainerId;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }
    public void setSpesialisasi(String spesialisasi) {
        this.spesialisasi = spesialisasi;
    }

    public int getJumlahKlien() {
        return jumlahKlien;
    }
    public void setJumlahKlien(int jumlahKlien) {
        this.jumlahKlien = jumlahKlien;
    }
    
    public static int getJumlahTrainer() {
        return jumlahTrainer;
    }

    //menambah klien
    public void tambahKlien(Member member) {
        jumlahKlien++;
        System.out.println(member.getNama() + " ditambahkan sebagai klien " + getNama());
    }
    
    //melihat jadwal
    public void lihatJadwal() {
        System.out.println("Menampilkan jadwal trainer: " + getNama());
    }
    
    // Menampilkan profil personal trainer
    @Override
    public void tampilProfil() {
        System.out.println("=== Profil Personal Trainer ===");
        System.out.println("ID Trainer: " + trainerId);
        System.out.println("Nama: " + nama);
        System.out.println("Spesialisasi: " + spesialisasi);
        System.out.println("Jumlah Klien: " + jumlahKlien);
    }

}
