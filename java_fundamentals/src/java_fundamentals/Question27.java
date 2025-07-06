package java_fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			int[]arr=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(Arrays.toString(arr));
			int[]arr2=new int[n];
			int k=0;
			for(int i=0;i<n;i++) {
				boolean found=false;
				for(int j=0;j<k;j++) {
					if(arr[i]==arr2[j]) {
						found=true;
						break;
					}
				}
				if(!found) {
					arr2[k++]=arr[i];
				}
			}
			for(int i=0;i<n;i++) {
				System.out.print(arr2[i]+" ");
			}
			System.out.println(Arrays.toString(arr2));
		}
		
	}

}
