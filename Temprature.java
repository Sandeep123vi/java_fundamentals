import java.util.*;

class Temprature {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter temprature in celsius");
		double celsius = scan.nextInt();
		
		double fahrenheit = (celsius * (9/5)) + 32;
		
		System.out.println(fahrenheit);
	}
}