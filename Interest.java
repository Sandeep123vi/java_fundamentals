import java.util.*;

class Interest {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Principal amount");
		int principal = scan.nextInt();
		
		System.out.println("Enter Rate");
		int rate = scan.nextInt();
		
		System.out.println("Enter Time");
		int time = scan.nextInt();
		
		double simpleInterest = (principal * rate * time)/100;
		
		System.out.println("Simple interest is : " + simpleInterest);
	}
}
		