package service;

import java.util.List;

import dao.InstrumentDao;
import dao.dataAccess1;
import no.Instrument;
import no.Inventory;

public class InstrumentService {

	public InstrumentDao dao = dataAccess1.createInstrumentDao();
	
	public InstrumentService()
	{}
	
	public Inventory getInventory(){
		Inventory inventory = new Inventory();
		List<Instrument> list = dao.getAllInstruments();
		for(Instrument i : list){
			inventory.addInstrument(i.getSerialNumber(), i.getPrice(), i.getSpec());
		}
		return inventory ;
	}
}
