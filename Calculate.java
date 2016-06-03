public class Calculate {

	public static void main(String[] args) {
		
		System.out.println("Calculate...");
		
		double first = Double.valueOf(args[0]);
		double second = Double.valueOf(args[1]);
		
		System.out.println("Sum = " + (first+second));
		System.out.println("Difference = " + (first-second));
		System.out.println("Multiplication = " + (first*second));
		System.out.println("Power = " + (Math.pow(first, second)));
		if (second!=0){			
			System.out.println("Private = " + (first/second));			
		}else{
			System.out.println("At zero divided cannot be !!");			
		}
	}
}