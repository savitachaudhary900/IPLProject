package com.Controller;

import java.util.List;

import com.Entity.Cricketer;
import com.Service.CricketerService;

public class CricketerController {
	private CricketerService cricketerService;

	public CricketerController() {
		cricketerService = new CricketerService();

	}

	public void addCricketer(String name, String category, int runs, String teamName) {
		Cricketer cricketer = new Cricketer(name, category, runs, teamName);
		cricketerService.addCrecketer(cricketer);

	}

	public List<Cricketer> getAllCricketers() {
		return cricketerService.getAllCricketers();
	}

	public List<Cricketer> getAllCricketers(String name) {
		return (List<Cricketer>) cricketerService.getCreicketerByName(name);

	}

}
