// Nama File = SesiLatihan.java
// Deskripsi = Class untuk sesi latihan

public class SesiLatihan {
    // Atribut
    private String sesiId;
    private Member member;
    private PersonalTrainer trainer;
    private Jadwal jadwal;

    // Method 
    // Konstruktor
    public SesiLatihan(String sesiId, Member member, PersonalTrainer trainer, Jadwal jadwal) {
        this.sesiId = sesiId;
        this.member = member;
        this.trainer = trainer;
        this.jadwal = jadwal;
    }

    // Selektor & Mutator
    public String getSesiId() { 
        return sesiId; 
    }
    public void setSesiId(String sesiId) { 
        this.sesiId = sesiId; 
    }

    public Member getMember() { 
        return member; 
    }
    public void setMember(Member member) { 
        this.member = member; 
    }

    public PersonalTrainer getTrainer() { 
        return trainer; 
    }
    public void setTrainer(PersonalTrainer trainer) { 
        this.trainer = trainer; 
    }

    public Jadwal getJadwal() { 
        return jadwal; 
    }
    public void setJadwal(Jadwal jadwal) { 
        this.jadwal = jadwal; 
    }

    // Membuat sesi latihan
    public void buatSesi() {
        jadwal.setAvailable(false);
        System.out.println("Sesi " + sesiId + " dibuat untuk " + member.getNama());
    }

    // Membatalkan sesi latihan
    public void batalkanSesi() {
        jadwal.setAvailable(true);
        System.out.println("Sesi " + sesiId + " dibatalkan.");
    }
}
