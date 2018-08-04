import java.util.Scanner;

public class BMICalculator {
    public static void main( String[] args ) {
	    Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi, inches, feet, pounds, bmi2;
		
		System.out.print( "Your height in m: " );
		m = keyboard.nextDouble();
		
		System.out.print( "Your weight in kg: " );
		kg = keyboard.nextDouble();
		
		bmi = kg / (m*m);
		
		System.out.println( "Your BMI is " + bmi + "\n");
		
		System.out.print( "Your height (feet only): " );
		feet = keyboard.nextDouble();
		
		System.out.print( "Your height (inches): " );
		inches = keyboard.nextDouble();
		
		System.out.print( "Your weight in pounds: " );
		pounds = keyboard.nextDouble();
		
		bmi2 = (pounds / ((feet*12)+inches) / ((feet*12)+inches)) * 703;
		
		System.out.println( "Your BMI is " + bmi2 );
		
		//Finished.
	}
}