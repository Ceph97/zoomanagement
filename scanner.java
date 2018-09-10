/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctzoo;


import Buffer.buffwriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Khan
 */
  
public class scanner {
    private buffwriter mbff=new buffwriter();
   
    //Method for Input Values for Mammal
    public void scmammal() throws IOException{
        //initialising variable for mammal 
        String nam,dob,doa,med,gender,vac;
        int id=1,exhbit,num,zk_id;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many Mammals you want to add : ");
        num= sc.nextInt();
        //creating while loop to add multiple Mammals
        while (num >= id){
         
        System.out.print("Please enter the Mammal : ");
        nam= sc.next();   
            
        System.out.print("Please enter Date of Birth: ");
        dob= sc.next();
        
        System.out.print("Please enter Date of Arrival: ");
        doa= sc.next();
        
        System.out.print("Please enter Medication: ");
        med= sc.next();
        
        System.out.print("Please enter Gender: ");
        gender= sc.next();
        
        System.out.print("Please enter Vaccination: ");
        vac= sc.next();
        
        System.out.print("Please enter exhbit number: ");
        exhbit= sc.nextInt();
        
        System.out.print("Assigned A ZooKeeper ID: ");
        zk_id= sc.nextInt();
        //constructor to assign values
        mammal m = new mammal (nam, dob, doa,med,gender,vac,exhbit,zk_id);
        //printing given values
        System.out.print(m);
        id++;// adding 1 each time while loop will run
        mbff.mammal(m.toString());//calling bufferwriter class to write into on to a textfile

      
  
        }
        
    }
    
    //Method for Input Values for reptile
    public void screptile() throws IOException{
        //initialising variable for reptile 
        String nam,dob,doa,med,gender,vac,type;
        int id=1,exhbit,num,zk_id;
        
        Scanner sc = new Scanner(System.in);
        
        type="Reptiles";
        System.out.print("How many Reptiles you want to add : ");
        num= sc.nextInt();
       //creating while loop to add multiple 
        while (num >= id){
         
        System.out.print("Please enter the Reptiles : ");
        nam= sc.next();   
            
        System.out.print("Please enter Date of Birth: ");
        dob= sc.next();
        
        System.out.print("Please enter Date of Arrival: ");
        doa= sc.next();
        
        System.out.print("Please enter Medication: ");
        med= sc.next();
        
        System.out.print("Please enter Gender: ");
        gender= sc.next();
        
        System.out.print("Please enter Vaccination: ");
        vac= sc.next();
        
        System.out.print("Please enter exhbit number: ");
        exhbit= sc.nextInt();
        
        System.out.print("Assigned A ZooKeeper ID: ");
        zk_id= sc.nextInt();
       //constructor to assign values
        reptile r = new reptile (nam, dob, doa,med,gender,vac,exhbit,zk_id);
        //printing given values
        System.out.print(r);
        id++;// adding 1 each time while loop will run
       
        mbff.Reptile(r.toString());//calling bufferwriter class to write into on to a textfile
        }
    }
    
    
    //Method for Input Values for avian
    public void scavian() throws IOException{
        //initialising variable for avian
        String nam,dob,doa,med,gender,vac,flight;
        int id=1,exhbit,num,zk_id;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many Avians you want to add : ");
        num= sc.nextInt();
       //creating while loop to add multiple avian
        while (num >= id){
         
        System.out.print("Please enter the Avian : ");
        nam= sc.next();   
            
        System.out.print("Please enter Date of Birth: ");
        dob= sc.next();
        
        System.out.print("Please enter Date of Arrival: ");
        doa= sc.next();
        
        System.out.print("Please enter Medication: ");
        med= sc.next();
        
        System.out.print("Please enter Gender: ");
        gender= sc.next();
        
        System.out.print("Please enter Vaccination: ");
        vac= sc.next();
        
        System.out.print("Please enter exhbit number: ");
        exhbit= sc.nextInt();
        
        System.out.print("Please enter Flight: ");
        flight= sc.next();
        
        System.out.print("Assigned A ZooKeeper ID: ");
        zk_id= sc.nextInt();
         //constructor to assign values
        avian a = new avian (nam, dob, doa,med,gender,vac,exhbit,flight,zk_id);
        //printing given values
        System.out.print(a);
        id++;// adding 1 each time while loop will run
    
        mbff.Avian(a.toString());//calling bufferwriter class to write into on to a textfile
        }
    }
     //Method for Input Values for aquatic       
     public void scaquatic() throws IOException{
        //initialising variable for aquatic
        String nam,dob,doa,med,gender,vac;
        int id=1,exhbit,num,zk_id;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many Aquatics you want to add : ");
        num= sc.nextInt();
       //creating while loop to add multiple Aquatic
        while (num >= id){
         
        System.out.print("Please enter the Aquatic : ");
        nam= sc.next();   
            
        System.out.print("Please enter Date of Birth: ");
        dob= sc.next();
        
        System.out.print("Please enter Date of Arrival: ");
        doa= sc.next();
        
        System.out.print("Please enter Medication: ");
        med= sc.next();
        
        System.out.print("Please enter Gender: ");
        gender= sc.next();
        
        System.out.print("Please enter Vaccination: ");
        vac= sc.next();
        
        System.out.print("Please enter exhbit number: ");
        exhbit= sc.nextInt();
        
        System.out.print("Assigned A ZooKeeper ID: ");
        zk_id= sc.nextInt();
         //constructor to assign values
        aquatic a = new aquatic (nam, dob, doa,med,gender,vac,exhbit,zk_id);
        //printing given values
        System.out.print(a);
        id++;// adding 1 each time while loop will run
    
        mbff.Aquatic(a.toString());//calling bufferwriter class to write into on to a textfile
        }
    }
            
    
    //method to Input Values for insect
    public void scinsect() throws IOException{
        //initialising variable for insect
        String nam,dob,doa,med,gender,vac;
        int id=1,exhbit,num,zk_id;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many insects you want to add : ");
        num= sc.nextInt();
       //creating while loop to add multiple Insect
        while (num >= id){
         
        System.out.print("Please enter the insect : ");
        nam= sc.next();   
            
        System.out.print("Please enter Date of Birth: ");
        dob= sc.next();
        
        System.out.print("Please enter Date of Arrival: ");
        doa= sc.next();
        
        System.out.print("Please enter Medication: ");
        med= sc.next();
        
        System.out.print("Please enter Gender: ");
        gender= sc.next();
        
        System.out.print("Please enter Vaccination: ");
        vac= sc.next();
        
        System.out.print("Please enter exhbit number: ");
        exhbit= sc.nextInt();
        
        System.out.print("Assigned A ZooKeeper ID: ");
        zk_id= sc.nextInt();
         //constructor to assign values
        insect a = new insect (nam, dob, doa,med,gender,vac,exhbit,zk_id);
        //printing given values
        System.out.print(a);
        id++;// adding 1 each time while loop will run
   
        mbff.Insects(a.toString());//calling bufferwriter class to write into on to a textfile
        }
    } 
    
        //method to Input Values for ZooKeeper
        public void sczookeeper() throws IOException{
        //initialising variable for zooKeeper
        String name,gender;
        int id=1,no_ani,num;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many Zookeeper you want to add : ");
        num= sc.nextInt();
       //creating while loop to add multiple ZooKeeper
        while (num >= id){
         
        System.out.print("Please enter the Zookeeper Name : ");
        name= sc.next();   
        
        System.out.print("Please enter Gender: ");
        gender= sc.next();
        
        System.out.print("Assigned Number of Animals: ");
        no_ani= sc.nextInt();    
        //constructor to assign values
        zookeeper a = new zookeeper (name,  gender, no_ani);
        
        //printing given values
        System.out.print(a);
        id++;// adding 1 each time while loop will run
        
        mbff.zookeeper(a.toString());//calling bufferwriter class to write into on to a textfile
        }
    }   
}
