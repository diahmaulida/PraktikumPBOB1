/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();

    public static void main(String[] args) {
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");

        // 1. INSERT
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        Mahasiswa mhsAdd1 = new Mahasiswa(10, "Diah"); // Gunakan ID yang belum ada
        service.add(mhsAdd1);
        System.out.println("berhasil insert: " + mhsAdd);
        System.out.println("berhasil insert: " + mhsAdd1);
        displayAll();

        // 2. UPDATE
        System.out.println("\n===update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        
        service.update(mhsUpdate);
        displayAll();

        // 3. DELETE
        System.out.println("\n===delete");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }

    public static void displayAll() {
        System.out.println("===displayAll");
        List<Mahasiswa> list = service.getAll();
        for (Mahasiswa m : list) {
            System.out.println(m);
        }
    }
}