package ie.tudublin;

import java.util.ArrayList;


public class Nematode {
    
    private String name;
    private int length;
    private boolean hasLimbs;
    private char gender;
    private boolean eyes;



    // generating Nematode constrcutor
    public Nematode(String name, int length, boolean hasLimbs, char gender, boolean eyes) {
        this.name = name;
        this.length = length;
        this.hasLimbs = hasLimbs;
        this.gender = gender;
        this.eyes = eyes;
    }



    //creating getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public boolean isHasLimbs() {
        return hasLimbs;
    }
    public void setHasLimbs(boolean hasLimbs) {
        this.hasLimbs = hasLimbs;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public boolean isEyes() {
        return eyes;
    }
    public void setEyes(boolean eyes) {
        this.eyes = eyes;
    }




} //end class
