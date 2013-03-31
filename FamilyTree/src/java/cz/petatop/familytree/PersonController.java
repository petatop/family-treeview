/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.petatop.familytree;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Zlej robočlověk
 */
@ManagedBean
@SessionScoped
public class PersonController {
    List<Person> personList = new ArrayList<Person>();
    /**
     * Creates a new instance of PersonAdder
     */
    public PersonController() {       
       personList.add(new Person("Jan","Novák","1923/02/02"));
       personList.add(new Person("Milan","Parek","1943/12/22"));
       personList.add(new Person("Rostislav","Zebrina","1993/01/05")); 
    }
    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;    
    }    
}
