import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5};
	int[] solutionArray=new int[2]; 
	int target;
	System.out.println("Lütfen bir sayı girin");
	Scanner scn=new Scanner(System.in);
	
	target=scn.nextInt();
	solutionArray=solution(arr,target);	
	if((target>10) || (target<2)) {
		throw new IllegalArgumentException("Lütfen geçerli sayılar girin sayılar girin");
	}
	System.out.println("İndexler");
	for(int i=0;i<2;i++) {
		System.out.println(solutionArray[i]);
	}
	
}
public static int[] solution(int[] arr,int target) {
	int[] resultArray=new int[2]; 
	for(int i=0;i<5;i++) {
		for(int j=0;j<5;j++) {
			if(arr[i] + arr[j]==target) {
				resultArray[0]=j;
				resultArray[1]=i;
			}
		    
		}
	}
	return resultArray;
}

}
