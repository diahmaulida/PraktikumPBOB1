//Nama File = BangunDatar.java
//Deskripsi = membuat fungsi dan prosedure BangunDatar
//Pembuat   = Diah Maulida Pratiwi-24060124120034
//Tanggal   = 18 Maret 2026
public abstract class BangunDatar {
    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }
    
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
}



