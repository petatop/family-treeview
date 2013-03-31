/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.petatop.familytree;

import java.util.Date;

/**
 *
 * @author Zlej robočlověk
 */
public class Person {
    private String name;
    private String surname;
    private String birth;
    

    public Person(){
    }
    
    
    public Person(String name, String surname, String birth){
        this.name = name;
        this.surname = surname;
        this.birth = birth;    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
}
