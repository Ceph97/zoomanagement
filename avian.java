package cctzoo;

import java.util.concurrent.atomic.AtomicInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cephas Dirthanz
 */
public class avian extends Animal {
   
    String flight;
    private String result;
    public avian(String name,String dob, String doa, String Med, String gender, String vac, int exhbit, String flight,int zk_id) {
        super(name,dob, doa, Med, gender, vac, exhbit,zk_id);
        
        this.flight = flight;
    }
    
    
    
    public void avian (String flight){
        this.flight = flight;
        
    }

    public String getFlight() {
        return flight;
    }

   

    @Override
   public String toString()
    {
        String result ="";
        //declaring empty result srting
        result += "\nAnimal Information: \n"+
                "Animal ID : "+ani_id+
                ",Name of Animal : "+name+
                ",Animal Date of Birth : "+dob+ 
                ",Animal Date of Arrival: "+doa+
                ",Medication : "+Med+
                ",Gender: "+gender+
                ",vacination: "+vac+
                ",Exhbit: "+exhbit+
                ",Zookeper number: "+zk_id+
                "\n\n";
        return result;
    }  
}
