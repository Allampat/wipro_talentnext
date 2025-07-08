import java.util.*;
class Author{
	private String name;
	private String email;
	private char gender;
	
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getname() {
		return name;
	}
	public String getemail() {
		return email;
	}
	public char getgender() {
		return gender;
	}
}
class Book{
	private String name;
	private Author author;
	private double price;
	private int qtyinstock;
	
	Book(String name, Author author,double price,int qtyinstock){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyinstock=qtyinstock;
	}
	public String getname() {
		return name;
	}
	public Author getauthor() {
		return author;
	}
	public double getprice() {
		return price;
	}
	public int getqtyinstock() {
		return qtyinstock;
	}
}
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String email=sc.nextLine();
		char gender=sc.next().charAt(0);
		Author au=new Author(name,email,gender);
		double price=sc.nextDouble();
		int qtyinstock=sc.nextInt();
		Book book=new Book(name,au,price,qtyinstock);
		System.out.println(au);
		System.out.println(book);
	}

}
