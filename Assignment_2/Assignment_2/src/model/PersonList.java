/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author anweshpeddineni
 */
public class PersonList {
    private ArrayList<PersonDetails> list;
    
    public PersonList(){
        this.list = new ArrayList<PersonDetails>();
    }

    public ArrayList<PersonDetails> getList() {
        return list;
    }

    public void setList(ArrayList<PersonDetails> list) {
        this.list = list;
    }
    
    
    
}
