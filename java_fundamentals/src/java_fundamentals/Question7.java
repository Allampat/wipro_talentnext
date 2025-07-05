package java_fundamentals;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch = sc.next().charAt(0);
		char ch2=sc.next().charAt(0);
		int a=(int)ch;
		int b=(int)ch2;
		if(a<b) {
			System.out.println(ch+","+ch2);
		}else {
			System.out.println(ch2+","+ch);
		}
	}

}
