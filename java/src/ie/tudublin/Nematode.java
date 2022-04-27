package ie.tudublin;


import processing.core.PApplet;
import processing.data.TableRow;



public class Nematode {
    
    private String name;
    private int length;
    private boolean limbs;
    private String gender;
    private boolean eyes;

    

    // creating a toString()
    @Override
    public String toString() {
        return "Nematode [eyes=" + eyes + ", gender=" + gender + ", limbs=" + limbs + ", length=" + length
                + ", name=" + name + "]";
    }



    // generating Nematode constrcutor
    public Nematode(String name, int length, boolean limbs, String gender, boolean eyes) {
        this.name = name;
        this.length = length;
        this.limbs = limbs;
        this.gender = gender;
        this.eyes = eyes;
    }


    // creating second constrcutor
    public Nematode(TableRow tr){

        this(
            tr.getString("name"),
            tr.getInt("length"),
            tr.getInt("limbs") == 1,
            tr.getString("gender"),
            tr.getInt("eyes") == 1);

    }


    //generate getters & setters
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



    public boolean isLimbs() {
        return limbs;
    }



    public void setLimbs(boolean limbs) {
        this.limbs = limbs;
    }



    public String getGender() {
        return gender;
    }



    public void setGender(String gender) {
        this.gender = gender;
    }



    public boolean isEyes() {
        return eyes;
    }



    public void setEyes(boolean eyes) {
        this.eyes = eyes;
    }


    // drawing the Nematodes
    public void render(NematodeVisualiser pa){

        //draw nematode length
        pa.stroke(255, 204, 0);
        pa.noFill();
        pa.circle(400, 400, 50);

        


        // draw left arrow 
        pa.line(100, 400, 250, 400);
        pa.line(100, 400, 145, 375);
        pa.line(100, 400, 145, 425);


        // draw right arrow
        pa.line(600, 400, 750, 400);
        pa.line(705, 375, 750, 400);
        pa.line(705, 425, 750, 400);
        


    }




} //end class
