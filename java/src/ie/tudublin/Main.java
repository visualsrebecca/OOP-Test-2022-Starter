package ie.tudublin;



public class Main
{
    public static void nematodeVisualiser()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new NematodeVisualiser());
    }

    
    public static void main(String[] args)
    {
        nematodeVisualiser();
        
    }
}


/* 

Write a class called Nematode that has appropriate fields, a constructor, accessor methods and a toString method.
Include in your solution a constructor that takes a TableRow parameter from the Processing library as a parameter.


*/