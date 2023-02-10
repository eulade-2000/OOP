
import java.awt.Color;
import java.awt.Image;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eulade
 */


public class Umuntu {
       
 String firstName;
 String secondName;
 String middleName;
 
 String nationalId;
 
 //int age;NIYUWO MWAKA GUSA 
 Date DOB;
 String placeOfBirth;
 Color skinColor;
 
 String gender;
 
 //BIRAHINDAGURIKA BUT
 double weight;
 double height;
 
 //TECHNOLOGY
 String phoneNumber;
 String maritusStatus;
 String ubudehe;
 
 //for fun
 String bloodGroup;
 double brainIQ;
 Image passportPicture;
 String ADN;
         
//FAMILY    papa/mama     
// String papaName;
// String mamaName;
//String papaID;
//String mamaID; 
 
Umuntu papa;
Umuntu mama;

    public Umuntu(String firstName, String secondName, String middleName, String nationalId, 
            Date DOB, String placeOfBirth, Color skinColor, String gender, double weight, 
            double height, String phoneNumber, String maritusStatus, String ubudehe, String bloodGroup, 
            double brainIQ, Image passportPicture, String ADN, Umuntu papa, Umuntu mama) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.nationalId = nationalId;
        this.DOB = DOB;
        this.placeOfBirth = placeOfBirth;
        this.skinColor = skinColor;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.phoneNumber = phoneNumber;
        this.maritusStatus = maritusStatus;
        this.ubudehe = ubudehe;
        this.bloodGroup = bloodGroup;
        this.brainIQ = brainIQ;
        this.passportPicture = passportPicture;
        this.ADN = ADN;
        this.papa = papa;
        this.mama = mama;
    }

public String myNames()
{ 
return ""+firstName+" "+secondName+" "+middleName;
}
    
 @Override
 public String toString()
{
return " I AM "+myNames()+" born on "+DOB+" My Dad is "+papa.myNames()+" My Mam is "+mama.myNames();


 
}

}
    
