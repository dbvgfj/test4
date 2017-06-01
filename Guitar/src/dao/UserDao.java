package dao;

import java.util.List;

import model.Guitar;
import model.GuitarSpec;
import model.Inventory;

public interface UserDao {
	public List<Guitar> getAllGuitars();
	public Inventory Inventory();
	public void addGuitar(String serialNumber, String price, GuitarSpec spec) ;
	public void delGuitar(String serialNumber) ;

}
