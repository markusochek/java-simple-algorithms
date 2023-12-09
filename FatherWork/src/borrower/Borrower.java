package borrower;

import javax.xml.crypto.Data;

import allEnum.AllEnum.Confirmation;
import fullName.FullName;

public class Borrower {
	private FullName fullName;
	
	private Data dateOfBirth;
	private int age;
	private boolean salaryProject;
	private int dependents;
	private double income;
	
	private Confirmation confirmation;
	
	private boolean delayOfMoreThan20Days;
	private boolean bankrupt;
	private int scoring;
}
