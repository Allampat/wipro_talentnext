package java_fundamentals;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			int[]arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int min=arr[0];
			int max=arr[0];
			for(int i=1;i<n;i++) {
				if(arr[i]<min) {
					min=arr[i];
				}
			}
			System.out.println(min);
			for(int i=1;i<n;i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			}
			System.out.println(max);
		}
	}

}
