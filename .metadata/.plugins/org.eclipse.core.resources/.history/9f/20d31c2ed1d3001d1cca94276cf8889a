package com.robert.advancedoop;

import java.util.ArrayList;

public class Developer {
	//------------------ attributes (private/protected) ----------------------
	private String name;
    private int workingHours;
    protected double salary;

    // Static Variables
    private static int devCount;
    private static double totalSalary;
    private static int totalProjects;

    private ArrayList<String> languages;
    
    
  //------------------ constructors ----------------------
    public Developer(){
        this.languages = new ArrayList<String>();
        Developer.devCount++;
    }
    
    public Developer(String name) {
    	this.name = name;
    	this.languages = new ArrayList<String>();
    }

	public Developer(String name, int workingHours, double salary){
        this.name = name;
        this.workingHours = workingHours;
        this.salary = salary;
        this.languages = new ArrayList<String>();
        Developer.devCount++;
        Developer.totalSalary += salary;
    }
	
	
	//------------------ other class methods ----------------------
    public void displayStatus(){
        System.out.println("name: " + this.name);
        System.out.println("workingHours: " + this.workingHours);
        System.out.println("salary: " + this.salary);
        System.out.println("languages: " + this.languages);

    }
    
    public void addLanguage(String lang) {
    	this.languages.add(lang);
    }
    
    
    //------------------ getters / setters  ----------------------

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public ArrayList<String> getLanguages() {
		return languages;
	}

	public void setLanguages(ArrayList<String> languages) {
		this.languages = languages;
	}

	public static int getDevCount() {
		return devCount;
	}

	public static double getTotalSalary() {
		return totalSalary;
	}

	public static int getTotalProjects() {
		return totalProjects;
	}
    
    
    
	

}
