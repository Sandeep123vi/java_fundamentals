import java.util.*;

class Average {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int first = scan.nextInt();
		
		System.out.println("Enter second number");
		int second = scan.nextInt();
		
		System.out.println("Enter third number");
		int third = scan.nextInt();
		
		int average = (first + second + third)/3;
		
		System.out.println(average);
	}
}
