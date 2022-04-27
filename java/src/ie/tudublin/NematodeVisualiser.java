package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
	// creating an arrayList 
	ArrayList<Nematode> nematodes = new ArrayList<Nematode>();

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}		
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();
		
		loadNematodes();
		printNematodes();
	}
	

	public void loadNematodes()
	{

		// load csv into table
		Table table = loadTable("nematodes.csv", "header");

		// enhanced for loop to iterate over csv file
		for(TableRow r:table.rows()){

			Nematode n = new Nematode(r);
			nematodes.add(n);
		}

	} //end loadNematodes

	
	
	// print Nematodes to check ArrayList gets populated correctly
	public void printNematodes(){

		for(Nematode n:nematodes){

			System.out.println(n);
		}
	}


	public void draw()
	{	
	}
}
