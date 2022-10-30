/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
/**
 *
 * @author Anwesh Peddineni
 */
public class PersonHistory {
    
    private static ArrayList<Person> history = new ArrayList<Person>();
    
    public PersonHistory(){
        //this.history = new ArrayList<Person>();
    }

    public static ArrayList<Person> getHistory() {
        return history;
    }

  public void setHistory(ArrayList<Person> history) {
        this.history = history;
    }
    
    public Person addNewPerson(){
      
        Person newPerson = new Person();
        history.add(newPerson);
        return newPerson;
        
    }
    
    public void deletePerson(Person pd){
        history.remove(pd);
        
    }
    
//    public ArrayList<Person> getPersonList(){
//        return history;
//    }
}
