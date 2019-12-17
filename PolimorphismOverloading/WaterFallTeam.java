package com.PolimorphismOverloading;

import com.Polymorphism.Employee;

public class WaterFallTeam  extends Employee{

	public static void main(String[] args) {
	
		WaterFallTeam team=new WaterFallTeam();
		team.companyName="Syntax";
		//accessing protected variable in different package
		team.employeeId=102;
		
		
	}
}
