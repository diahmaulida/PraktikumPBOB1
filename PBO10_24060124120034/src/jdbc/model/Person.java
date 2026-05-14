/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.model;
import java.io.Serializable;
/**
 *
 * @author Asus
 */
/**
 * File : Person.java
 * Deskripsi : Person database model
 */

/**
 * File : Person.java
 * Deskripsi : Person database model
 */
// 2. Tambahkan 'implements Serializable' di sini
public class Person implements Serializable {
    private int id;
    private String name;

    public Person(String n) {
        this.name = n;
    }

    public Person(int i, String n) {
        this.id = i;
        this.name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}