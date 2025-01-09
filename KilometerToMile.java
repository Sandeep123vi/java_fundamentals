import java.util.*;

class KilometerToMiles {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter kilometer");
		double kilometer = scan.nextInt();
		
		double miles = kilometer*0.621371;
		
		System.out.println(miles);
	}
}
	