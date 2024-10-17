import java.util.Scanner;

public class Sum{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("Enter the third number");
		int c = sc.nextInt();
		int Largest = a;
		int smallest = a;
		if(a < b){
			 Largest = b;
		}else{
			smallest = b;
			}
		if(a<c) {
			Largest = c;
		}else
			smallest = c; 
		System.out.println("Sum of smallest and largest number is " + (Largest + smallest));
		sc.close();
	}

}