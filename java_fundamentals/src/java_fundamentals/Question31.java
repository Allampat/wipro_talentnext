package java_fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[]arr1=new int[3];
			int[]arr2=new int[3];
			for(int i=0;i<3;i++) {
				arr1[i]=sc.nextInt();
			}
			for(int i=0;i<3;i++) {
				arr2[i]=sc.nextInt();
			}
			int[]arr=new int[2];
			arr[0]=arr1[1];
			arr[1]=arr2[1];
			System.out.println(Arrays.toString(arr));
		}
	}

}
