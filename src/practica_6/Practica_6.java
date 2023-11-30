/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_6;

import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author felix
 */
public class Practica_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File csv = new File("C:\\Users\\felix\\OneDrive\\Documentos\\NetBeansProjects\\Practica6\\src\\main\\java\\com\\mycompany\\practica6\\mergeSort(caso1).csv");
        try
        {
            FileWriter output = new FileWriter(csv);
            System.out.println("SIIIIII");
            output.write("something");
        }
        catch (IOException e)
        {
            System.out.println("NOOOOOOO");
            e.printStackTrace();
        }
    }
    
}
