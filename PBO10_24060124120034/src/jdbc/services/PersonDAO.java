/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package jdbc.services;
import jdbc.model.Person;
/**
 *
 * @author Asus
 */
/**
 * File : PersonDAO.java
 * Deskripsi : interface untuk person access object
 */

public interface PersonDAO {
    // Pastikan namanya savePerson, bukan saveOrUpdate
    public void savePerson(Person p) throws Exception;
}