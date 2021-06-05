package edu.escuelaing.arsw.oODesign;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This is the main class, the goal is to get data and return the average and deviation of this data.
 * @author Miguel Ángel Rodríguez Siachoque
 */
public class OoDesing
{
    public static LinkedList linkedList = new LinkedList();
    
    /**
     * This is the main method that gets the input parameter and show average and deviation.
     * @param args Receives the name of the file to which the avarage and deviation will be make.
     */
    public static void main (String[] args)
    {
        String nameFile = args[0];
        double [] cal = Constructor(nameFile);
        System.out.print("Average of " + nameFile + ": " + cal[0] + "\n");
        System.out.print("Deviation of " + nameFile + ": " + cal[1] + "\n");
    }
    
    /**
     * This is the constructor method that manages the organization of the tasks of reading files, LinkedList and calculation of values.
     * @param nameFile Name of the file to which the data will be obtained.
     * @return 
     */
    public static double[] Constructor (String nameFile) 
    {
        ArrayList<String> data = ReadLine(nameFile);
        for (String i : data) {
            linkedList.add(i);
        }
        
        Calculator calculator = new Calculator();
        double [] calculations = {calculator.getAverage(),calculator.getDeviation()};
        return calculations;
    }
    
    /**
     * This method read and save the lines in the ArrayList.
     * @param nameFile Name of the file to which the data will be obtained.
     * @return ArrayList String, save the lines of the read file.
     */
    public static ArrayList<String> ReadLine (String nameFile) 
    {
        //paramLocate: location's unity of the repository.
        String paramLocate = System.getProperty("user.dir");
        String line = "";
        //lines: Arraylist where file lines are saved.
        ArrayList<String> lines = new ArrayList<String>();
        //Read the file.
        try{
            FileReader file = new FileReader(paramLocate + "\\src\\test\\java\\edu\\escuelaing\\arsw\\oOdesign\\TextTest\\" + nameFile);
            if (file.ready()){
                BufferedReader read = new BufferedReader(file);
                while((line = read.readLine())!= null){
                    lines.add(line);
                }
            }
        }
        //Exception that not read the file.
        catch (IOException e){
            System.out.println("Error"+e.getMessage());
        }
        return lines;
    }
}
