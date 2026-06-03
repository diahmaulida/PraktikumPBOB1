import java.util.HashMap;
import java.util.Map;

/**
 * File: LambdaMap.java
 * Nama: Diah Maulida Pratiwi - 24060124120034
 * Deskripsi: Implementasi lambda pada Map untuk menampilkan
 *            NIM dan nama mahasiswa.
 */
public class LambdaMap {

    public static void main(String[] args) {

        Map<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("230001001", "Adi");
        mahasiswaMap.put("230001002", "Bambang");
        mahasiswaMap.put("230001003", "Cici");
        mahasiswaMap.put("230001004", "Didi");

        // Lambda digunakan untuk menampilkan key dan value
        mahasiswaMap.forEach((nim, nama) ->
                System.out.println("NIM : " + nim +
                                   ", Nama : " + nama));
    }
}