import java.util.Scanner;

class Calculator{
	int n1;
	int n2;
	
	Calculator(int n1,int n2){
		this.n1=n1;
		this.n2=n2;
	}
	int powerInt() {
		return (int)Math.pow(n1, n2);
	}
}
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Calculator cal=new Calculator(a,b);
		System.out.println(cal.powerInt());
	}

}
