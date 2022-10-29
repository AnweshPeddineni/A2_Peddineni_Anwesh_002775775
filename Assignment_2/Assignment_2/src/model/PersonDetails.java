/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author anweshpeddineni
 */
public class PersonDetails {
    private String name;
    private int patientId;
    private int age;
    private String gender;
    private long cellPhoneNumber;
    private String emailID;
 
    
    
//    City Cityx = new City();
//    Community Communityx = new Community();
//    Hospital Hospitalx = new Hospital();
//    House Housex = new House();
//    DoctorDetails Doctorx = new DoctorDetails();
    
//    private String address;
//    private String city;
//    private String community;
//    private String hospital;
//    private String doctor;

    
    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    Community community;
    
    
    
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    City city;
    
    
    
    public House getHouse() {
        return address;
    }

    public void setHouse(House house) {
        this.address = house;
    }

    House address;
    
    
    
    public DoctorDetails getDoctorDetails() {
        return doctor;
    }

    public void setDoctorDetails(DoctorDetails doctorDetails) {
        this.doctor = doctorDetails;
    }

    DoctorDetails doctor;
    
    
    
   public Hospital getHospital() {
       return hospital;
   }
   
   public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    Hospital hospital;
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


   
    public long getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(long cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
    
    
}