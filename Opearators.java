public class Opearators {


	public static void main(String[] args) {
		int numerator = 7;
		int denominator = 5;

		int quotient = numerator / denominator; // Quotient of the division
		int remainder = numerator % denominator; // Remainder of the division

		System.out.println("Quotient: " + quotient);
		System.out.println("Remainder: " + remainder);
		System.out.println("mkweldc");

		// Adding number by itself

		int num = 7;
		// Types of methods we increment the value
		//num = num + 1; 
		//num++;
		//++num;

		int res = num++;
		System.out.println(res);

		// Relational operators

		int x = 1, y = 1, a = 3, b = 4;

		boolean result = x != y || a > b;

		System.out.println(result);

		int m = 10;
		if (m >= 10 && m < 40) System.out.println("Hello");
		else
			System.out.println("Bye");


	}


}
