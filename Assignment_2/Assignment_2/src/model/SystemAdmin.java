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
public class SystemAdmin {
    public static ArrayList<City> citylist;
    public static ArrayList<Community> communitylist;
    public static ArrayList<Hospital> hospitallist;
    
    
    public SystemAdmin() {
        this.citylist = new ArrayList<City>();
        this.communitylist = new ArrayList<Community>();
        this.hospitallist = new ArrayList<Hospital>();
    }

    public static ArrayList<City> getCitylist() {
        return citylist;
    }

    public static void setCitylist(ArrayList<City> citylist) {
        SystemAdmin.citylist = citylist;
    }

    public static ArrayList<Community> getCommunitylist() {
        return communitylist;
    }

    public static void setCommunitylist(ArrayList<Community> communitylist) {
        SystemAdmin.communitylist = communitylist;
    }

    public static ArrayList<Hospital> getHospitallist() {
        return hospitallist;
    }

    public static void setHospitallist(ArrayList<Hospital> hospitallist) {
        SystemAdmin.hospitallist = hospitallist;
    }

    
   
    
    public City addnewcity(){
        City newcity =new City();
        citylist.add(newcity);
        return newcity;
    }
    
    public Community addnewcommunity(){
        Community newcommunity =new Community();
        communitylist.add(newcommunity);
        return newcommunity;
    }
    
    public Hospital addnewhospital(){
        Hospital newhospital =new Hospital();
        hospitallist.add(newhospital);
        return newhospital;
    }
    
    
    
    
}
