import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5};
	int[] sol=new int[2]; 
	int target;
	Scanner scn=new Scanner(System.in);
	
	target=scn.nextInt();
	sol=solution(arr,target);	
	for(int i=0;i<2;i++) {
		System.out.println(sol[i]);
	}
	
}
public static int[] solution(int[] arr,int target) {
	int[] sol=new int[2]; 
	for(int i=0;i<5;i++) {
		for(int j=0;j<5;j++) {
			if(arr[i] + arr[j]==target) {
				sol[0]=j;
				sol[1]=i;
			}
		    
		}
	}
	return sol;
}

}
