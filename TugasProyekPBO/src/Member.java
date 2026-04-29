// Nama File = Member.java
// Deskripsi = Class Member turunan dari User
import java.util.Date;
public class Member extends User {
    // Atribut
    private String memberId;
    private Date joinDate;
    private boolean statusAktif;
    private Membership membership;
    private static int jumlahMember = 0;

    // Method
    // Konstruktor
    public Member(String userId, String nama, String email, String password, String memberId, Date joinDate) {
        super(userId, nama, email, password);
        this.memberId = memberId;
        this.joinDate = joinDate;
        this.statusAktif = true;
        jumlahMember++;
    }

    // Selektor dan Mutator
    public String getMemberId() {
        return memberId;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Date getJoinDate() {
        return joinDate;
    }
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public boolean isStatusAktif() {
        return statusAktif;
    }
    public void setStatusAktif(boolean statusAktif) {
        this.statusAktif = statusAktif;
    }

    public Membership getMembership() {
        return membership;
    }
    public void setMembership(Membership membership) {
        this.membership = membership;
    }
    
    public static int getJumlahMember() {
        return jumlahMember;
    }

    // Daftar Membership
    public void daftarMembership(PaketGym paket) {
        this.membership = new Membership("MBR-" + memberId, new Date(), paket);
        this.membership.aktifkan();
        System.out.println(getNama() + " mendaftar paket: " + paket.getNamaPaket());
    }
    // Expired date menjadi membership
    public int expiredDate() {
        if (membership != null) return membership.expiredDate();
        return 0;
    }
    // Booking Sesi
    public void bookingSesi() {
        System.out.println(getNama() + " melakukan booking sesi latihan.");
    }
    // Menampilkan profil member
    @Override
    public void tampilProfil() {
        System.out.println("=== Profil Member ===");
        System.out.println("ID     : " + memberId);
        System.out.println("Nama   : " + nama);
        System.out.println("Email  : " + email);
        System.out.println("Status : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    }

}
