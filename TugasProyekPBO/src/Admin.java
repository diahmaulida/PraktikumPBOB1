// Nama File = Admin.java
// Deskripsi = Class Admin turunan dari User

public class Admin extends User implements Laporan {
    // Atribut
    private int adminLevel;

    //Method
    // Konstruktor
    public Admin(String userId, String nama, String email, String password, int adminLevel) {
        super(userId, nama, email, password);
        this.adminLevel = adminLevel;
    }

    // Selektor & Mutator
    public int getAdminLevel() { 
        return adminLevel; 
    }
    public void setAdminLevel(int adminLevel) {
        this.adminLevel = adminLevel; 
    }

    // Menambah member
    public void tambahMember(Member member) {
        System.out.println("Member " + member.getNama() + " ditambahkan oleh admin.");
    }

    // Menghapus Member
    public void hapusMember(Member member) {
        System.out.println("Member " + member.getNama() + " dihapus oleh admin.");
    }

    // Tambah Trainer
    public void tambahTrainer(PersonalTrainer trainer) {
        System.out.println("Trainer " + trainer.getNama() + " ditambahkan oleh admin.");
    }

    // Menampilkan profil admin
    @Override
    public void tampilProfil() {
        System.out.println("=== Profil Admin ===");
        System.out.println("Nama        : " + nama);        
        System.out.println("Email       : " + email);       
        System.out.println("Admin Level : " + adminLevel);
    }

    // Method interface menampilkan laporan
    @Override
    public void cetakLaporan() {
        System.out.println("=== Laporan Admin ===");
        System.out.println("Total Member                         : " + Member.getJumlahMember());
        System.out.println("Total Trainer                        : " + PersonalTrainer.getJumlahTrainer());
        System.out.println("Total Penghuni Gym (Member + Trainer): " + (Member.getJumlahMember() + PersonalTrainer.getJumlahTrainer()));
    }
}
