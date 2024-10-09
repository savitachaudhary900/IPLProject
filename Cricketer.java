package com.Entity;

public class Cricketer {
	private String name;
	private String category;
	private int runs;
	private String teamName;

	public Cricketer(String name, String category, int runs, String teamName) {
		super();
		this.name = name;
		this.category = category;
		this.runs = runs;
		this.teamName = teamName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", category=" + category + ", runs=" + runs + ", teamName=" + teamName + "]";
	}

}
