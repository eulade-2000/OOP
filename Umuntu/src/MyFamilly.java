/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eulade
 */
import java.awt.Color;
import java.util.Date;
import java.util.LinkedList;
public class MyFamilly {



    
    String isano(Umuntu njyewe,Umuntu undi) {
       
       
        if (njyewe.equals(undi)) {
            return "Uwo ninjye";
        } 
        else if (njyewe.papa != null && njyewe.papa.equals(undi)) {
            return "ni Papa";
        } else if (njyewe.mama != null && njyewe.mama.equals(undi)) {
            return "ni Mama";
        }else if(njyewe.papa==undi.papa&&njyewe.mama==undi.mama){
            if("MALE".equals(undi.gender)){
                return "ni Brother";
            }else{
                return "ni Sister";
            }
        }
            else if (njyewe.mama != null && (njyewe.papa.mama ==undi || njyewe.mama.mama==undi)) {
            return "ni Nyogokuru";
            
        }
            else if (njyewe.papa != null && (njyewe.papa.mama ==undi || njyewe.papa.papa==undi)) {
            return "ni Sogokuru";
            
        }
            
            else if (njyewe.papa != null && njyewe.papa.papa ==undi.papa) {
                if("FEMALE".equals(undi.gender)){
                   return "ni Tante";
                }else{
                   return "ni Tonto";
                }
            
        }
            
            
            else if ((undi.papa!=null&&undi.mama!=null)&&njyewe.papa.papa==undi.papa||njyewe.mama.mama==undi.mama) {
                if(undi.gender=="FEMALE"){
                   return "ni Cousine";
                }else{
                   return "ni Cousin";
                }
            
        }
            
            else{
            return "ntasano";
        }
}
    
public static void main(String[] arghs) {
Umuntu sogokuru = new Umuntu("JOHN", "KAGABO", "", "11112", 
        new Date(), "BUTARE", Color.pink, "MALE", 80, 186, 
        "078433", "MARRIED", "RICH", "AB+", 40
        , null, "adbh", null, null);

Umuntu nyogokuru = new Umuntu("MARIA", "MUKAMANA", "", "11113", 
        new Date(), "RWANZA", Color.pink, "FEMALE", 80, 186, 
        "078455", "MARRIED", "RICH", "A+", 40
        , null, "adbh", null, null);

Umuntu papa = new Umuntu("JOSEPH", "BARAME", "", "5445", 
        new Date(), "Kigali", Color.pink, "MALE", 80, 186, 
        "44444", "MARRIED", "RICH", "B+", 40
        , null, "adbh",sogokuru, nyogokuru);
Umuntu mama = new Umuntu("ESPERANCE", "MUKESHIMANA", "", "22222", 
        new Date(), "MBAZI", Color.yellow, "FEMALE", 70, 175, 
        "1365455555", "MARRIED", "RICH", "B+", 50
        , null, "adbh", null, null);

Umuntu tonto= new Umuntu("felex", "Hageni", "", "22222", 
        new Date(), "TEXAS", Color.white, "MALE", 70, 175, 
        "1365455555", "MARRIED", "RICH", "B+", 50
        , null, "adbh",sogokuru, nyogokuru);

Umuntu tante = new Umuntu("MARINA", "UWITONZE", "", "22222", 
        new Date(), "KINTEKO", Color.white, "FEMALE", 70, 175, 
        "1365455555", "MARRIED", "RICH", "B+", 70
        , null, "adbh", sogokuru, nyogokuru);

Umuntu njyewe = new Umuntu("EULADE", "DUSINGIZIMANA", "", "33333", 
        new Date(), "KIGALI", Color.white, "MALE", 175, 45, 
        "1365455555", "MARRIED", "RICH", "B+", 100
        , null, "adbh", papa, mama); 
Umuntu brother= new Umuntu("ABRAHAM", "NIYONZIMA", "", "7775", 
        new Date(), "KIGALI", Color.white, "MALE", 175, 45, 
        "1365455555", "SINGLE", "RICH", "B+", 99
        , null, "adbh", papa, mama);
Umuntu sister= new Umuntu("VUMILIA", "JEANNE", "", "33yyty", 
        new Date(), "KIGALI", Color.white, "FEMALE", 175, 45, 
        "1365455555", "MARRIED", "RICH", "B+", 88
        , null, "adbh",papa,mama);

Umuntu cousine= new Umuntu("DATIVA", "UWIKUNDA", "", "33rrr", 
        new Date(), "MBUGA", Color.white, "FEMALE", 175, 45, 
        "1365455555", "MARRIED", "RICH", "B+", 90
        , null, "adbh",tonto,null);
Umuntu cousin= new Umuntu("ALPHONSE", "NZABONA", "", "333ttt", 
        new Date(), "KIGALI", Color.white, "MALE", 175, 45, 
        "1365455555", "SINGLE", "RICH", "B+", 70
        , null, "adbh",null,tante);
Umuntu ntasano= new Umuntu("SINA", "RWAZA", "", "33mmm", 
        new Date(), "KIGALI", Color.white, "MALE", 175, 45, 
        "1365455555", "MARRIED", "RICH", "B+", 100
        , null, "adbh",null,null);


 LinkedList<Umuntu> famille=new LinkedList <>();

 
 famille.add(sogokuru);
 famille.add(nyogokuru);
 famille.add(papa);
 famille.add(mama);
 famille.add(njyewe);
 famille.add(brother);
 famille.add(sister);
 
 famille.add(tonto);
 famille.add(tante);
 famille.add(cousin);
 famille.add(cousine);
 famille.add(ntasano);
 
 
    System.out.println(" "+njyewe);
    MyFamilly obj=new MyFamilly();
    System.out.println(njyewe.firstName+" "+obj.isano(njyewe,njyewe));
    //Output: Ninjye
    
        System.out.println(papa.firstName+" "+obj.isano(njyewe,papa));
    //Output: ni Papa
    
        System.out.println(brother.firstName+" "+obj.isano(njyewe,brother));
    //Output: ni Brother
            System.out.println(sister.firstName+" "+obj.isano(njyewe,sister));
    //Output: ni Sister
    
            System.out.println(nyogokuru.firstName+" "+obj.isano(njyewe,nyogokuru));
    //Output: ni Nyogokuru
            System.out.println(sogokuru.firstName+" "+obj.isano(njyewe,sogokuru));
    //Output: ni Sogokuru
    
            System.out.println(tante.firstName+" "+obj.isano(njyewe,tante));
    //Output: ni Tante
            System.out.println(tonto.firstName+" "+obj.isano(njyewe,tonto));
    //Output: ni Tonto
    
    

            System.out.println(cousine.firstName+" "+obj.isano(njyewe,cousine));
    //Output: ni Cousine
    
            System.out.println(ntasano.firstName+" "+obj.isano(njyewe,ntasano));
    //Output: ni Ntasano
                System.out.println(cousin.firstName+" "+obj.isano(njyewe,cousin));
    //Output: ni Cousin

}} 