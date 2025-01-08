import java.util.*;

class PerimeterOfRectangle {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter length");
		int length = scan.nextInt();
		
		System.out.println("Enter width");
		int width = scan.nextInt();
		
		double perimeter = 2 * (length * width);
		
		System.out.println("Perimeter of rectangle is : " + perimeter);
	}
}
	