// Nama File: AplikasiMahasiswa.java
// Pembuat: Diah Maulida Pratiwi-24060124120034
// Tanggal: 22 April 2026
// Deskripsi: Aplikasi program yang merepresentasikan polimorfisme Ad Hoc Overloading (nomor 2)

public class AplikasiMahasiswa{
    public static void main (String[] args) {
        //c. Konstruktor tanpa parameter
        System.out.println("Konstruktor tanpa parameter");
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.tampilData();
        System.out.println();

        //d. Konstruktor dengan tiga parameter 
        System.out.println("Konstruktor dengan tiga parameter");
        Mahasiswa mhs2 = new Mahasiswa(24120034, "Diah Maulida", "Informatika");
        mhs2.tampilData();
        System.out.println();

        //e. Konstruktor kloning mahasiswa lain
        System.out.println("Konstruktor kloning mahasiswa lain");
        Mahasiswa mhs3 = new Mahasiswa(mhs2);
        mhs3.tampilData();
        System.out.println();

        //b. test method setter
        System.out.println("Test Method Setter");
        System.out.println("Ubah nama mhs1 menjadi Riska");
        System.out.println("Ubah NIM mhs1 menjadi 24120035");
        System.out.println("Ubah Program studi menjadi Matematika");
        mhs1.setNama("Riska");
        mhs1.setNIM(24120035);
        mhs1.setProgramstudi("Matematika");
        mhs1.tampilData();
        System.out.println();
        
        //b. test method getter
        System.out.println("Test Method Getter");
        System.out.println("Nama mhs2: " + mhs3.getNama());
        System.out.println("NIM mhs2: " + mhs3.getNIM());   
        System.out.println("Program studi mhs2: " + mhs3.getProgramstudi());
        System.out.println();
        
        //b. test method setProgramstudi dengan 3 macam variasi
        System.out.println("Test Method setProgramstudi dengan variasi tanpa parameter");
        mhs1.setProgramstudi();
        mhs1.tampilData();
        System.out.println();

        System.out.println("Test Method setProgramstudi dengan variasi satu parameter");
        mhs1.setProgramstudi("Biologi");
        mhs1.tampilData();
        System.out.println();

        System.out.println("Test Method setProgramstudi dengan variasi parameter object mahasiswa lain"); 
        mhs1.setProgramstudi(mhs2);
        mhs1.tampilData();

    }
}
