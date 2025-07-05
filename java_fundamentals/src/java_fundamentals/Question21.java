package java_fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			s+=arr[i];
		}
		int avg=s/n;
		System.out.println(s);
		System.out.println(avg);
	}

}
