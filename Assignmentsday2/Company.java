package com.hcltech.Assignmentsday2;

public class Company {

	
	    protected int compId;
	    protected String name;
	    protected String HO; // Head Office
	    protected String CEO;

	    // Constructor to initialize Company details
	    public Company(int compId, String name, String HO, String CEO) {
	        this.compId = compId;
	        this.name = name;
	        this.HO = HO;
	        this.CEO = CEO;
	    }

	    // Method to display Company details
	    public void display() {
	        System.out.println("Company ID: " + compId);
	        System.out.println("Company Name: " + name);
	        System.out.println("Head Office: " + HO);
	        System.out.println("CEO: " + CEO);
	    }
	}

	// Class to store branch office details, inherits from Company
	class BranchOffices extends Company {
	    private int brId;
	    private String location;
	    private String dept;

	    // Constructor to initialize BranchOffices details along with Company details
	    public BranchOffices(int compId, String name, String HO, String CEO, int brId, String location, String dept) {
	        super(compId, name, HO, CEO);
	        this.brId = brId;
	        this.location = location;
	        this.dept = dept;
	    }

	    // Overridden method to display BranchOffices details along with Company details
	    @Override
	    public void display() {
	        super.display();
	        System.out.println("Branch ID: " + brId);
	        System.out.println("Branch Location: " + location);
	        System.out.println("Department: " + dept);
	    }
	}
