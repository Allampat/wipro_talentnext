class Animal{
	
	void eat() {
		System.out.println("the animal is eating");	
	}
	void sleep() {
		System.out.println("The animal is sleeping");
	}
}
class Bird extends Animal{
	void fly() {
		System.out.println("The bird is flying");
	}
}
public class Question4 {

	public static void main(String[] args) {
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}

}
