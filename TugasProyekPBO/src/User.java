// Nama File = User.java
// Deskripsi = Class induk untuk semua pengguna sistem gym
public abstract class User {
    // Atribut
    protected String userId;
    protected String nama;
    protected String email;
    protected String password;
    private static int jumlahUser = 0;

    // Method
    // Konstruktor
    public User() {
        jumlahUser++;
    }

    public User(String userId, String nama, String email, String password) {
        this.userId = userId;
        this.nama = nama;
        this.email = email;
        this.password = password;
        jumlahUser++;
    }
    // Selektor & Mutator
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public static int getJumlahUser() {
        return jumlahUser;
    }

    // login
    public boolean login() {
        System.out.println(nama + " berhasil login.");
        return true;
    }
    
    // logout
    public void logout() {
        System.out.println(nama + " berhasil Logout.");
    }

    // method abstrak tampil profil
    public abstract void tampilProfil();
}