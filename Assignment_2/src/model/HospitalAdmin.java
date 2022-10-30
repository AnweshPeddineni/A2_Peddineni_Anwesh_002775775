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
public class HospitalAdmin {
    
    private ArrayList<DoctorDetails> doctorlist;
    
    
    public HospitalAdmin() {
        this.doctorlist = new ArrayList<DoctorDetails>();
    }

    public ArrayList<DoctorDetails> getDoctorlist() {
        return doctorlist;
    }

    public void setDoctorlist(ArrayList<DoctorDetails> doctorlist) {
        this.doctorlist = doctorlist;
    }
}
