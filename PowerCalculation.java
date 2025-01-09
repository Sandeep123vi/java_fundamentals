import java.util.*;

class PowerCalculation {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base ");
		double base = scan.nextInt();
		
		System.out.println("Enter exponent ");
		double exponent = scan.nextInt();
		
		double result  = Math.pow(base,exponent);
		
		System.out.println(result);
	}
}
