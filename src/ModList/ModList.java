/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModList;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;



/**
 *
 * @author Kiki
 */
public class ModList {

   public static void main(String[] args) throws FileNotFoundException, IOException {
           
           
     final String appname = "ModList.jar";
     final String name ="ModList.txt";
       try (BufferedWriter bow = new BufferedWriter(new FileWriter(name))) {
           File scan = new File(name);
           String path = (scan.getAbsolutePath().replace(name, ""));
           File f = new File(path);
           int counter=0;
           if (f.exists()&& f.isDirectory() ) {
               File[] list = f.listFiles();
               for(File e : list ){
                   if(e.isFile()){
                       String se = e.getName();
                       if (!se.equals(name)&& !se.equals(appname)){
                       bow.write(se);
                       bow.newLine();
                       counter++;
                       
                       
                   }
               }               
               
           }
           String brojac = "Number of mods is: " + (counter);           
           bow.write(brojac);
       }
   
   }
}
       
}
  
    
