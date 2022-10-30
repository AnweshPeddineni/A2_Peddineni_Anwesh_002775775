/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.Person;
/**
 *
 * @author Anwesh Peddineni
 */
public class VitalSign {
    
    private String hospitalName;
    private String doctorName;
    private String patientID;
    private String encounterNO;
    
    private Double bp;
    private Double temperature;
    private Double sugar;
    private Double weight;
    
    
    public VitalSign(Double bp, Double temperature, Double sugar, Double weight, String hospitalName, String doctorName, String patientID, String encounterNO ) 
    {
        this.hospitalName = hospitalName;
        this.doctorName = doctorName;
        this.patientID = patientID;
        this.encounterNO = encounterNO;
        this.bp = bp;
        this.sugar = sugar;
        this.temperature = temperature;
        this.weight = weight;
        
    }
    public VitalSign(){}

    public Double getBp() {
        return bp;
    }

    public void setBp(Double bp) {
        this.bp = bp;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getSugar() {
        return sugar;
    }

    public void setSugar(Double sugar) {
        this.sugar = sugar;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getEncounterNO() {
        return encounterNO;
    }

    public void setEncounterNO(String encounterNO) {
        this.encounterNO = encounterNO;
    }
    
}
