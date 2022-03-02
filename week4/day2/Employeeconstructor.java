package week4.day2;

import week2.day3.string;

public class Employeeconstructor {
    String EmployeeNmae;
    String CompanyNmae;
   int empId;
    boolean IsActive;
    
   
    
  
  Employeeconstructor() {
		// TODO Auto-generated constructor stub
	System.out.println("DEFAULT CONTRUCTOR");
    }
    Employeeconstructor(String name,String companyname,int id){
    
    	//System.out.println("employename");
    	this();
    	this.EmployeeNmae=   name;
    	this.CompanyNmae=companyname;
    	this.empId=id;
System.out.println("PARAMETERIZED CONTRUCTOR");    	
    }
  
	public static void main(String[] args) {
	  Employeeconstructor emp2=new Employeeconstructor("NITHISH","testleaf",181);
		Employeeconstructor emp1=new Employeeconstructor("HARISH","mahendra",123);
	 
		System.out.println(emp1.EmployeeNmae);
		System.out.println(emp2.CompanyNmae);
		System.out.println(emp1.empId);
		 System.out.println(emp2.EmployeeNmae);
			System.out.println(emp2.CompanyNmae);
			System.out.println(emp2.empId);
		
		
		
	}
}
