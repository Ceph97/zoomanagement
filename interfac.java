/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cctzoo;

import Buffer.*;

import java.io.IOException;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Khan
 */
public class interfac {
   
    bufferReader br = new bufferReader();
    FileSearch fs = new FileSearch();
    //main method includes interface and calling different classes and methods
   static void mainmenu() throws IOException{
    
       int a,c;
       
        Scanner sc = new Scanner(System.in);
        //CCTZoo Menu ( Main menu)
        System.out.println("===============Wellcome to CCT zoo===========\nPlease Select one of the following Option\n1: For Animals\n2: For ZooKeeper\n3: Exit");
        System.out.print("Select Option: ");
         a = sc.nextInt();
            //Animal menu will show all the different Animal Species
           if (a == 1){
            System.out.println("===============Animal Menu===========");
            System.out.println("1: For Mammal\n2: For Reptile\n3: For Avian\n4: For Aquatic\n5: For Insect\n6 For go back to main menu");
              mainmenu2();
           }
            //ZOOKeeper Menu
            else if(a==2){
             System.out.println("===============Zoo Keeper===========");
             System.out.println("1: For search \n2: For Display All ZooKeepers\n3: For Edit" );
             
             System.out.print("Select Option: ");
             c = sc.nextInt();
             //for ZooKeeper Search
            if(c==1){
            System.out.println("Search");
             FileSearch.zookeeper();
            }
             //for Display all the ZooKeepers form Text file
             else if(c==2){
             System.out.println("Display");    
             bufferReader.rzookeeper();
             }
             //edit the ZooKeeper Data
             else if(c==3){
             System.out.println("Add");    
                 scanner m = new scanner();
                m.sczookeeper();
             }
             //if Wrog input Go back to CCTZoo Menu
             else{
             System.out.println("Wrong Selection Please Select from 1 to 3");
             interfac.mainmenu();
         }
            }
            //if want to exit progeam.
            else if(a==3) {
                System.out.println("Program Has been Closed Succesfully");
            }
         //in case of wrong value go back to CCT Zoo MEnu
         else {
                
                System.out.println("Wrong Option Please Try again: ");
                mainmenu();
            }
        }//end Main menu
            
            // Creating a different Method mainmenu2 While will allow us to split interface into two differnet parts  
            //  easy navigation we can jump from differnt menus
            static void mainmenu2() throws IOException{
            Scanner sc = new Scanner(System.in);
            int b,c; //declearing variables
              
            
            System.out.print("Select Option: ");
            b = sc.nextInt();
            //mammal menu if select 1
            if(b==1){
            System.out.println("===============Mammal===========\n1: For Search\n2: For Display\n3: For Edit\n4: Back To Animal Menu");
            
            System.out.print("Select Option: ");
            b = sc.nextInt();
            // search For mammal in database
            if(b== 1){
            System.out.println("===============Search===========");        

                 FileSearch.mammal();
            }
            //Display all mammals
            else if(b==2){
                System.out.println("===============Display===========");        
                  
                bufferReader.rmammal();
            }
            //add Animals
            else if(b==3){
                System.out.println("===============Edit===========");        
                  
                scanner m = new scanner();
                m.scmammal();
            }
            //call back to 
            else if(b==4){
                System.out.println("back to Animal menu");
                
            System.out.println("===============Animal Menu===========");
            System.out.println("1: For Mammal\n2: For Reptile\n3: For Avian\n4: For Aquatic\n5: For Insect\n6 For go back to main menu");
            interfac.mainmenu2(); 
            }
            //if wrong input go back to animal Menu
            else {
                System.out.println("Wrong Selection Please Select from 1 to 3");
                interfac.mainmenu2();
            }
            
            } //if mammal ends here
            //menu for Reptile
            else if(b==2){
            System.out.println("===============Reptile===========\n1: For Search\n2: For Display\n3: For Edit\n4: Back To Animal Menu");    
            
            System.out.print("Select Option: ");
           b = sc.nextInt();
           //Search for Reptile
           if(b== 1){
            System.out.println("===============Search===========");        
                    
                  FileSearch.reptile();
            }
            //Display Reptile database
           else if(b==2){
                System.out.println("===============Display===========");        
                  
                bufferReader.rreptile();
            }
           //adding new reptiles
            else if(b==3){
                System.out.println("===============Edit===========");        
                    
                    scanner r = new scanner();
                    r.screptile();
            }
            //going back to animal menu
            else if(b==4){
                System.out.println("back to Animal menu");
                
                System.out.println("===============Animal Menu===========");
            System.out.println("1: For Mammal\n2: For Reptile\n3: For Avian\n4: For Aquatic\n5: For Insect\n6 For go back to main menu");
                       interfac.mainmenu2(); 
             }
            //wrong input shwo message and go back to animal menu
            else {
                System.out.println("Wrong Selection Please Select from 1 to 3");
                interfac.mainmenu2();
            }
         } //Reptile ends here
            //show the Avian Interface menu
            else if(b==3){
            System.out.println("===============Avian===========\n1: For Search\n2: For Display\n3: For Edit\n4: Back To Animal Menu");
            
            System.out.print("Select Option: ");
            b = sc.nextInt();
            //Search the Avian from Database
            if(b== 1){
            System.out.println("===============Search===========");        
                 
                 FileSearch.avian();
            }
            //display all Animal from database
            else if(b==2){
                System.out.println("===============Display===========");        
                  
                bufferReader.ravian();
            }
            //Add Avian into database
            else if(b==3){
                System.out.println("===============Edit===========");        
            
                scanner m = new scanner();
                  m.scavian();
            }
            //back to Animal Menu
            else if(b==4){
                System.out.println("back to Animal menu");
                
                System.out.println("===============Animal Menu===========");
            System.out.println("1: For Mammal\n2: For Reptile\n3: For Avian\n4: For Aquatic\n5: For Insect\n6 For go back to main menu");
            interfac.mainmenu2(); 
                       
                
            }
            //In case wrong wrong input show message and go back to Animal menu
            else {
                System.out.println("Wrong Selection Please Select from 1 to 3");
                interfac.mainmenu2();
                
            }
            } //Avian Ends here
            
            else if(b==4){
            System.out.println("===============Aquatic===========\n1: For Search\n2: For Display\n3: For Edit\n4: Back To Animal Menu");
            
            System.out.print("Select Option: ");
            b = sc.nextInt();
            //Search the Aquatic from Database
            if(b== 1){
            System.out.println("===============Search===========");        
                 
                 FileSearch.aquatic();
            }
            //display all Animal from database
            else if(b==2){
                System.out.println("===============Display===========");        
                  
                bufferReader.raquatic();
            }
            //Add Aquatic into database
            else if(b==3){
                System.out.println("===============Edit===========");        
            
                scanner m = new scanner();
                m.scaquatic();
            }
            //back to Animal Menu
            else if(b==4){
                System.out.println("back to Animal menu");
                
                 System.out.println("===============Animal Menu===========");
            System.out.println("1: For Mammal\n2: For Reptile\n3: For Avian\n4: For Aquatic\n5: For Insect\n6 For go back to main menu");
                       interfac.mainmenu2(); 
                       
                
            }
             //In case wrong wrong input show message and go back to Animal menu
            else {
                System.out.println("Wrong Selection Please Select from 1 to 3");
                interfac.mainmenu2();
                
            }
            } //Aquatic
            //calling the Incest Menu
            else if(b==5){
            System.out.println("===============Insect===========\n1: For Search\n2: For Display\n3: For Edit\n4: Back To Animal Menu");
            
            System.out.print("Select Option: ");
            b = sc.nextInt();
            //Searching
            if(b== 1){
            System.out.println("===============Search===========");        
            FileSearch.insects();
            }
            //Display
            else if(b==2){
                System.out.println("===============Display===========");        
                  
                bufferReader.rinsects();
            }
            //Display
            else if(b==3){
                System.out.println("===============Edit===========");        
                    scanner m = new scanner();
                    m.scinsect();
           }
            //back to Animal menu
            else if(b==4){
            System.out.println("back to Animal menu");
            System.out.println("===============Animal Menu===========");
            System.out.println("1: For Mammal\n2: For Reptile\n3: For Avian\n4: For Aquatic\n5: For Insect\n6 For go back to main menu");
            interfac.mainmenu2(); 
                }
            //In case of wrong input values    
            else {
                System.out.println("Wrong Selection Please Select from 1 to 3");
            }
            }//Insect
            //going backt to main menu
            else if(b==6){
                System.out.println("back to main menu");
                interfac.mainmenu();
           }
            //in case of wrong input go back ti Animal 
            else {
                System.out.println("Wrong Selection Please Select from 1 to 3");
                interfac.mainmenu2();
            }
         
         } //end first if loop 
}
