package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dao.UserDao;
import dao.dataAccess;
import model.GuitarSpec;

public class addGuitarTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	public void main(String[] args) {
		  String price="1 ";
			String serialNumber= "1" ;
			
			
			GuitarSpec spec = new GuitarSpec("1", "1", "1", "1", "1");
			UserDao i = dataAccess.createGuitarDao();
			i.addGuitar(serialNumber, price, spec);		

	  }

}
