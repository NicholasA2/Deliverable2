/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 2145747
 */
public class PartTimeTeacher extends Teacher implements PayRoll{

    public PartTimeTeacher(String specialty, String degree, double salary, double degreeRate, int hoursWorked, String fname, String lname, int age, String gender, String status) {
        super(specialty, degree, salary, degreeRate, hoursWorked, fname, lname, age, gender, status);
    }

   
    @Override
    public String toString() {
        return specialty + " " + degree + " " + salary + " " + hoursWorked;
    }
        @Override
    public void ComputePayRoll() {
        salary = (hoursWorked * degreeRate * 2) * 0.76;
        System.out.println(salary + "is the salary");
    }
    
    @Override
    public String assignDep() throws Exception{
    //Assigns values in file to variables,
    //then assigns variable randomly to class
    ArrayList<String> deps = new ArrayList<String>();
    File file = new File("Departments");
    try (Scanner input = new Scanner(file);) {
    String row = input.nextLine();
    String[] strs = row.split(" ");
    deps.add(strs[0]);
    deps.add(strs[1]);
    deps.add(strs[2]);
    }
    catch (FileNotFoundException e) {
        System.out.println("File not found");
    }
    String assign = deps.get((int)Math.random() * (2 - 0 + 1));
    if (assign == null) {
        throw new Exception("Error");
    }
    return assign;
    }
    @Override
    public void talk() {
        
    }
    
    @Override
     public boolean equals(Person person) {
        if (this == person) {
            return true;
        }
        else {return false;}
    }
}
