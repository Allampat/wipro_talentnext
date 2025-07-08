package java_fundamentals;

import java.util.Scanner;

class Employee{
	int EmpNo;
	String EmpName;
	String JoinDate;
	char Designation;
	String Department;
	int basic;
	int HRA;
	int IT;
	
	Employee(int EmpNo, String EmpName, String JoinDate, char DesignationCode, String Department, int basic,int HRA,int IT){
		this.EmpNo=EmpNo;
		this.EmpName=EmpName;
		this.JoinDate=JoinDate;
		this.Designation=Designation;
		this.Department=Department;
		this.basic=basic;
		this.HRA=HRA;
		this.IT=IT;
	}
	
}

public static String getDesignation(char code) {
    switch (code) {
        case 'e': return "Engineer";
        case 'c': return "Consultant";
        case 'k': return "Clerk";
        case 'r': return "Receptionist";
        case 'm': return "Manager";
        default: return "Unknown";
    }
}

public class MiniProject {

	public static void main(String[] args) {
		Employee[] employees= {
				new Employee(1001, "Ashish"," 01/04/2009",'e'," R&D", 20000, 8000, 3000),
				new Employee(1002, "Sushma", "23/08/2012 ",'c'," PM", 30000, 12000, 9000),
				new Employee( 1003," Rahul", "12/11/2008", 'k'," Acct", 10000, 8000, 1000),
				new Employee(1004," Chahat", "29/01/2013", 'r'," Front Desk", 12000 ,6000, 2000),
				new Employee( 1005," Ranjan", "16/07/2005", 'm'," Engg",50000 ,20000, 20000),
				new Employee(1006," Suman"," 1/1/2000",'e'," Manufacturing ",23000, 9000, 4400),
				new Employee(  1007," Tanmay", "12/06/2006",'c'," PM", 29000, 12000, 10000)
		};
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(Employee emp : employees) {
			if(emp.EmpNo==n) {
				int salary=emp.basic+emp.HRA+emp.IT;
				int dsa=getDesignation(emp.designation);
				System.out.println("EmpNo \t EmpName \t\t Department \t Desination \t  Salary");
				System.out.println(emp.EmpNo+"\t"+emp.EmpName+"\t"+emp.Department+"\t"+emp.Designation+"\t"+salary);
			}
		}
	}

}
