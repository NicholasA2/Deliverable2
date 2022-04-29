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
public class Teacher extends Person implements PayRoll{
    String specialty;
    String degree;
    double salary;
    double degreeRate;
    int hoursWorked;
    
    
    
    public Teacher(String specialty, String degree, double salary, double degreeRate, int hoursWorked, String fname, String lname, int age, String gender, String status) {
        super(fname, lname, age, gender, status);
        this.specialty = specialty;
        this.degree = degree;
        this.salary = salary;
        this.degreeRate = degreeRate;
        this.hoursWorked = hoursWorked;
       
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    public void setDegree(String degree) {
        this.degree = degree;
    }
    public String getSpecialty() {
        return specialty;
    }
    public String getDegree() {
        return degree;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void setDegreeRate(double degreeRate) {
        if (degree == "PhD") {
            degreeRate = 112;
        }
        else if(degree == "Master") {
            degreeRate = 82;
        }
        else if (degree == "Bachelor") {
            degreeRate = 42;
        }
        else {this.degreeRate = degreeRate;}
    }
    public double getDegreeRate() {
        return degreeRate;  
    }
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public String toString() {
        return specialty + " " + degree  +" " + salary + " " + hoursWorked;
    }
    
    @Override
    public void ComputePayRoll() {
    }
    
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
