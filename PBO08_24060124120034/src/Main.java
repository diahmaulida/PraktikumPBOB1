public class Main {
    public static void main(String[] arg) {
        // Atribut
        Datum<Integer> I; Datum<Kucing> A;
        //=== Generik Pada Class ===
        System.out.println("=== Datum ===");
        // Datum <integer>
        I = new Datum<> (42);
        System.out.println(I.getIsi());  
        I.setIsi(100);
        System.out.println(I.getIsi());
        // Datum <Kucing>
        A = new Datum<> ();
        A.setIsi(new Kucing("Cimi", 5.0));
        System.out.println("Datum Anabul: " + A.getIsi().getNama() + " bobotnya " + A.getIsi().getBobot());
        A.setIsi(new Anggora("Comot", 4.5));
        System.out.println("Datum Anabul: " + A.getIsi().getNama() + " bobotnya " + A.getIsi().getBobot());

        // === Generik Pada Operator ===
        // Atribut
        Datum<Integer> a,b; Datum<String> c, d; Datum<Anabul> e,f;
        // Operasi Tukar
        System.out.println("=== Operasi Generik ===");
        a = new Datum<>(3);
        b = new Datum<>(6);
        System.out.println("Sebelum ditukar: " + a.getIsi() + ", " + b.getIsi());
        OperasiGenerik.tukar(a, b);
        System.out.println("Setelah ditukar: " + a.getIsi() + ", " + b.getIsi());
        c = new Datum<>("Hello");
        d = new Datum<>("World");
        System.out.println("Sebelum Tukar String: " + c.getIsi() + ", " + d.getIsi());
        OperasiGenerik.tukar(c, d);
        System.out.println("Setelah Tukar String: " + c.getIsi() + ", " + d.getIsi());
        e = new Datum<>(new Kucing("Cimi", 5.0));
        f = new Datum<>(new Anggora("Comot", 4.5));
        System.out.println("Sebelum Tukar Anabul: " + e.getIsi().getNama() + ", " + f.getIsi().getNama());
        OperasiGenerik.tukar(e, f);
        System.out.println("Setelah Tukar Anabul: " + e.getIsi().getNama() + ", " + f.getIsi().getNama());

        // Bobot2
        Anggora K1 = new Anggora("Cimol", 4.0);
        Kembangtelon K2 = new Kembangtelon("Cilor", 3.5);
        System.out.println("Jumlah bobot kucing K1 dan K2: " + OperasiGenerik.bobot2(K1, K2));

        // === Larik Generik ===
        System.out.println("=== Larik Generik ===");
        // Atribut
        Data<Anabul> dataAnabul;
        // membuat isi larik data
        dataAnabul = new Data<>();
        dataAnabul.setIsi(1, new Anjing("Tirex"));
        dataAnabul.setIsi(2, new Kucing("Cimi"));
        dataAnabul.setIsi(3, new Burung("Copet"));
        dataAnabul.setIsi(4, new Anggora("Comot", 3.0));
        dataAnabul.setIsi(5, new Kembangtelon("Cilor", 4.0));
        System.out.println("Banyak elemen: " + dataAnabul.getSize());
        for (int i = 1; i <= dataAnabul.getSize(); i++) {
            System.out.println(i + ". " + dataAnabul.getIsi(i).getNama());  
        }
    }
}


// Kelas generik maupun metode generik mempermudah dan lebih fleksibel dalam membuat objek lebih khususnya jika tipe data belum diketahui, Selain itu kesalahan pada tipe data
// terdeteksi pada compile time. pada generik dapat dibatasi dengan upper bound dengan menggunakan keyword "extends" pada parameter tipe, dan lower bound dengan keyword "super"
// hanya digunakan pada method saja menggunakan wildcard "?", yang berarti "semua tipe". Generic juga memungkinkan pembuatan class yang lebih umum.
// sehingga memungkinkan untuk penggunaan ulang suatu class.       
