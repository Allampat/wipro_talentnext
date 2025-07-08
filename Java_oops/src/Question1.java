import java.util.Scanner;

class Box{
	int height;
	int width;
	int depth;
	
	Box(int height,int width,int depth){
		this.height=height;
		this.width=width;
		this.depth=depth;
	}
	
	int getvolume() {
		return height*width*depth;
	}
}
public class Question1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			Box box=new Box(a,b,c);
			System.out.println(box.getvolume());
		}
	}

}
