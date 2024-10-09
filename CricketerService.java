package com.Service;

import java.util.List;

import com.Dao.CricketerDAO;
import com.Entity.Cricketer;

public class CricketerService {

	private CricketerDAO cricketerDAO;

	public CricketerService() {
		cricketerDAO = new CricketerDAO();

	}
public void addCrecketer(Cricketer crecketer) {
	cricketerDAO.addCrecketer(crecketer);
	
}
public List<Cricketer> getAllCricketers(){
	return cricketerDAO.getAllcrecketers();
}
public Cricketer getCreicketerByName(String name) {
	return cricketerDAO.getCrecketerByName(name);
}
}
