import java.util.*;

class Interest {
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Principal amount");
		int principal = sc.nextInt();
		
		System.out.println("Enter Rate");
		int rate = sc.nextInt();
		
		System.out.println("Enter Time");
		int time = sc.nextInt();
		
		double simpleInterest = (principal * rate * time)/100;
		
		System.out.println("Simple interest is : " + simpleInterest);
	}
}
		