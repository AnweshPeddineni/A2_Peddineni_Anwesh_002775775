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
public class VitalSignHistory {
    
    private static ArrayList<VitalSign> vitalList = new ArrayList<VitalSign>();
    
    public VitalSignHistory()
    {
        
    }

    public static ArrayList<VitalSign> getVitalList() {
        return vitalList;
    }

    public static void setVitalList(ArrayList<VitalSign> vitalList) {
        VitalSignHistory.vitalList = vitalList;
    }
    public VitalSign addNewVitalSign(){
        VitalSign newVitalSign = new VitalSign();
        vitalList.add(newVitalSign);
        return newVitalSign;
    }
    
    public void deleteVitalSign(VitalSign vs){
        vitalList.remove(vs);
    }
}
