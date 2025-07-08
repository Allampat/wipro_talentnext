import java.util.Scanner;

class Person{
	String name;
	
	Person(String name){
		this.name=name;
	}
	public String getname() {
		return name;
	}
}
class Employee extends Person{
	 double annulsalary;
	 int year;
	 String insurance;
	
	Employee(String name,double annulsalary, int year, String insurance){
		super(name);
		this.annulsalary=annulsalary;
		this.year=year;
		this.insurance=insurance;
	}
	public double getsalary() {
		return annulsalary;
	}
	public int getyear() {
		return year;
	}
	public String getinsurance() {
		return insurance;
	}
	
}

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		double salary=sc.nextDouble();
		int year=sc.nextInt();
		sc.nextLine();
		String insurance=sc.nextLine();
		Employee em=new Employee(name,salary,year,insurance);
		System.out.println(em.getname());
		System.out.println(em.getsalary());
		System.out.println(em.getyear());
		System.out.println(em.getinsurance());
		
		
	}

}
