class Fruit{
	String name;
	String taste;
	int size;
	
	Fruit(String name,String taste,int size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	public void eat() {
		System.out.println("The fruit taste is good");
	}
}
class Apple extends Fruit{
	
	Apple(String name,String taste,int size){
		super(name,taste,size);
	}
	
	public void eat() {
		System.out.println(name+" is "+taste+" and in size "+size);
	}
	
}
class Orange extends Fruit{
	
	Orange(String name,String taste,int size){
		super(name,taste,size);
	}
	
	public void eat() {
		System.out.println(name+" is "+taste+" and in size "+size);
	}
}
public class Question6 {

	public static void main(String[] args) {
		Fruit f;
		f=new Apple("Apple ","sweet",5);
		f.eat();
		f=new Orange("orange","sour",6);
		f.eat();
	}

}
