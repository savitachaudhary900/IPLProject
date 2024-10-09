package com.Dao;

import java.util.ArrayList;
import java.util.List;

import com.Entity.Cricketer;

public class CricketerDAO {

	private List<Cricketer> crecketers;

	public CricketerDAO() {

		crecketers = new ArrayList<>();
	}

	public void addCrecketer(Cricketer crecketer) {
		crecketers.add(crecketer);

	}

	public List<Cricketer> getAllcrecketers() {
		return crecketers;
	}

	public Cricketer getCrecketerByName(String name) {
		for (Cricketer c : crecketers) {
			if (c.getName().equalsIgnoreCase(name)) {
				return c;
			}
		}
		return null;

	}
}
