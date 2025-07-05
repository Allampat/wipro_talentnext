package java_fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]arr=new int[5];
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
