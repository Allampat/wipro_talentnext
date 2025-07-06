package java_fundamentals;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			int[]arr=new int[n];
			boolean s=false;
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			for(int i=0;i<n;i++) {
				if(arr[i]==1 || arr[i]==4) {
					s=true;
				}else {
					s=false;
					break;
				}
			}
			if(s) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
	}

}
