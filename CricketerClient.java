package com.client;

import com.Controller.CricketerController;
import com.Entity.Cricketer;

public class CricketerClient {

	public static void main(String[] args) {
		CricketerController cricketerController = new CricketerController();

		Cricketer[] cricketersArray = { new Cricketer("Virat Kohli", "Batsman", 12000, "gt"),
				new Cricketer("Rohit Sharma", "Batsman", 10000, "mi"),
				new Cricketer("Jasprit Bumrah", "Bowler", 150, "csk"),
				new Cricketer("Hardik Pandya", "All-rounder", 2000, "csk"),
				new Cricketer("Ravindra Jadeja", "All-rounder", 2500, "mi"),
				new Cricketer("Shikhar Dhawan", "Batsman", 7000, "gt"),
				new Cricketer("Rishabh Pant", "Wicketkeeper", 3000, "gt"),
				new Cricketer("KL Rahul", "Batsman", 4000, "csk"), new Cricketer("Shreyas Iyer", "Batsman", 3500, "mi"),
				new Cricketer("Yuzvendra Chahal", "Bowler", 100, "rbc"),
				new Cricketer("Mohammad Shami", "Bowler", 200, "rbc"),
				new Cricketer("Suryakumar Yadav", "Batsman", 2500, "gt"),
				new Cricketer("Bhuvneshwar Kumar", "Bowler", 250, "mi"),
				new Cricketer("Axar Patel", "All-rounder", 500, "gt") };

		for (Cricketer cricketer : cricketersArray) {
			cricketerController.addCricketer(cricketer.getName(), cricketer.getCategory(), cricketer.getRuns(),
					cricketer.getTeamName());
		}

		System.out.printf("%-20s %-15s %-10s %-10s%n", "Name", "Category", "Runs", "Team Name");
		System.out.println("---------------------------------------------------------------");

		for (Cricketer cricketer : cricketerController.getAllCricketers()) {
			System.out.printf("%-20s %-15s %-10d %-10s%n", cricketer.getName(), cricketer.getCategory(),
					cricketer.getRuns(), cricketer.getTeamName());
			System.out.println("---------------------------------------------------------------");

		}

	}
}
