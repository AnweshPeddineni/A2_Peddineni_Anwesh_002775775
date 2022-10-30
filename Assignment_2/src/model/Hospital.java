/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Anwesh Peddineni
 */
public class Hospital {
    private String hospital;
    private String doctor;
    
    public Hospital(){}
      public Hospital(String hospitalname,String doctorname)
      {
      this.hospital=hospitalname;
      this.doctor=doctorname;
      }
      
    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    
    
      
    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    
    
}
