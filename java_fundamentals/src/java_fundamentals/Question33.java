package java_fundamentals;

import java.util.*;

public class Question33 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[][]arr=new int[3][3];
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					while(!sc.hasNextInt()) {
						System.out.println("Please enter 9 integer numbers");
						sc.next();
					}
					arr[i][j]=sc.nextInt();
				}
			}
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			int big=arr[0][0];
			for(int i=0;i<3;i++) {
				for(int j=1;j<3;j++) {
					if(arr[i][j]>big) {
						big=arr[i][j];
					}
				}
			}
			System.out.println(big);
		}
	}

}
