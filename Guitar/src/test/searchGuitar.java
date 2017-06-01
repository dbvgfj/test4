package test;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import model.Guitar;
import model.GuitarSpec;
import model.Inventory;

public class searchGuitar {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	 public static void main(String[] args) {
		    // Set up Rick's guitar inventory
		    Inventory inventory = new Inventory();
		    GuitarSpec test = 
		      new GuitarSpec("1", "1", "1", "1","1");
		    List matchingGuitars = inventory.search(test);
		    if (!matchingGuitars.isEmpty()) {
		      System.out.println("yor guitar find");
		      for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
		        Guitar guitar = (Guitar)i.next();
		        GuitarSpec spec = guitar.getSpec();
		        System.out.println(spec.getBuilder() + "--" + spec.getModel() + "--" +
		          spec.getType() + "--" +spec.getBackWood() + "--" +spec.getTopWood() + "--" +
		          guitar.getPrice()+"--"+guitar.getSerialNumber());
		      }
		    } else {
		      System.out.println("Sorry, Erin, we have nothing for you.");
		    }
		  }
}
