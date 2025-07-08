class shape{
	
	public void draw() {
		System.out.println("Drawing shape");
	}
	public void erase() {
		System.out.println("Erasing shape");
	}
}
class Circle extends shape{
	
	public void draw() {
		System.out.println("Drawing circle");
	}
	public void erase() {
		System.out.println("Erasing circle");
	}
}
class Triangle extends shape{
	
	public void draw() {
		System.out.println("Drawing Triangle");
	}
	public void erase() {
		System.out.println("Erasing Triangle");
	}
}
class Square extends shape{
	
	public void draw() {
		System.out.println("Drawing square");
	}
	public void erase() {
		System.out.println("Erasing square");
	}
}



public class Question7 {

	public static void main(String[] args) {
		shape s;
		s=new Circle();
		s.draw();
		s.erase();
		s=new Triangle();
		s.draw();
		s.erase();
		s=new Square();
		s.draw();
		s.erase();
	}

}
