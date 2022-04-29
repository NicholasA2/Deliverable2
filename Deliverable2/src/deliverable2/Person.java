/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable2;

/**
 *
 * @author 2145747
 */
abstract class Person {
    String fname;
    String lname;
    int age;
    String gender;
    String status;
    
    public Person(String fname, String lname, int age, String gender, String status) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.gender = gender;
        this.status = status;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getFname() {
        return fname;
    }
    public String getLname() {
     return lname;   
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getStatus() {
        return status;
    }
    public abstract void talk();
    
    @Override
    public String toString() {
        return fname + " " + lname + " " + age + " " + gender + " " + age;
    }
    public boolean equals(Person person) {
        if (this == person) {
            return true;
        }
        else {return false;}
    }
}

