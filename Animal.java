/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctzoo;
import Buffer.buffwriter;
import java.util.concurrent.atomic.AtomicInteger;
/**
 *
 * @author Cephas Dirthanz
 */
//Parrent calss 
public abstract class Animal {
    //declearing AtomicInteger to rember the last assign value
    private static final AtomicInteger count = new AtomicInteger(0);
    public final int ani_id;
    String name,dob, doa,Med,gender,vac; //declearing String variables
    //int variables
    int exhbit,zk_id;
//Declearing method for Animal
public Animal (String name, String dob, String doa, String Med, String gender,String vac, int exhbit,int zk_id ){
    
    this.name =name;
    this.dob = dob;
    this.doa = doa;
    this.Med = Med;
    this.gender = gender;
    this.vac = vac;
    this.exhbit = exhbit;
    this.zk_id = zk_id;
    this.ani_id = count.incrementAndGet();
}    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getDoa() {
        return doa;
    }

    public void setDoa(String doa) {
        this.doa = doa;
    }

    public String getMed() {
        return Med;
    }

    public void setMed(String Med) {
        this.Med = Med;
    }

    public String  getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getVac() {
        return vac;
    }

    public void setVac(String vac) {
        this.vac = vac;
    }

    public int getExhbit() {
        return exhbit;
    }

    public void setExhbit(int exhbit) {
        this.exhbit = exhbit;
    }
    
    public int getZk_id() {
        return zk_id;
    }

    public void setZk_id(int zk_id) {
        this.zk_id = zk_id;
    }

   
    public int getAni_id() {
        return ani_id;
    }
    
    @Override
    public String toString()
    {
        //declaring empty result srting
        String result = "";
        //adding all the results into empty above string.
        result += //"\nAnimal Information: \n"+
                "Animal {ID : "+ani_id+
                ",Name of Animal : "+name+
                ",Animal Date of Birth : "+dob+ 
                ",Animal Date of Arrival: "+doa+
                ",Medication : "+Med+
                ",Gender: "+gender+
                ",vacination: "+vac+
                ",Exhbit: "+exhbit+
                ",Zookeper number: "+zk_id+ "}";
                
        //returning results
        return result;
       
    }
  
}
