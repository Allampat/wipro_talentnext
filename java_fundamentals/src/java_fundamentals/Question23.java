package java_fundamentals;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int index=-1;
		int[]arr=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		int n=sc.nextInt();
		for(int i=0;i<5;i++) {
			if(arr[i]==n) {
				index=i;
				break;
			}
		}
		System.out.println(index);
	}

}
