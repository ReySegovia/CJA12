/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CJA12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author reyse
 */

public class AddressBook {  
    HashMap<String, String> hm = new HashMap<>();
    final static String outputFilePath = "C://Users//reyse//OneDrive//Desktop//file.txt";
    
    public void create() {
        File file = new File(outputFilePath);
        BufferedWriter bf = null;

        try {
            bf = new BufferedWriter(new FileWriter(file));
            for (Map.Entry<String, String> entry : hm.entrySet()) {

                bf.write(entry.getKey() + ":" + entry.getValue());

                bf.newLine();
            }

            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bf.close();
            } catch (Exception e) {
            }
        }
        System.out.println("Contacto agregado correctamente. ");
    }
    
    public void list() throws FileNotFoundException, IOException {
        File file = new File("C:\\Users\\reyse\\OneDrive\\Desktop\\file.txt");
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        String list; 
	 
	  while ((list = br.readLine()) != null) 
	    System.out.println(list);
    }
    
    public void delete() {
        File file = new File(outputFilePath);
        BufferedWriter bf = null;

        try {
            bf = new BufferedWriter(new FileWriter(file));
            for (Map.Entry<String, String> entry : hm.entrySet()) {
                bf.write(entry.getKey() + ":" + entry.getValue());

                bf.newLine();
            }

            bf.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bf.close();
            } catch (Exception e) {
            }
        }
        System.out.println("Contacto eliminado correctamente. ");
    }
}
