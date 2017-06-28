import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		// Do not edit these values
		double minValue = -10;
		double maxValue = 10;
		Random r = new Random();
		double randomValue = 0;
		final int N = 10;
		double[] evenNumbers= new double[10];
		int even = 0;
		double[] oddNumbers= new double[10];
		int odd= 0;
		double[] negativeNumbers= new double[10];
		int negative = 0;
		double[]positiveNumbers = new double[10];
		int positive = 0;
		double[] zeroNumbers = new double[10];
		int zero = 0;
		double[] unsortedArray = new double[10];
		double[] sorted = new double[10];
		
		
	      
	    
		// I haven't gone over for loops yet, but I will next week, just know that this loop is also equivalent to:
		// while(i++ < 10), with int i = 0;
		for(int i = 0; i < 10; i++){
			
			// r.nextDouble generates a random double between 0 and 1. 
			// To adjust this to get values from -10 to 10, we first multiply it by the range (20), which equals maxValue - minValue, which changes the range from 0 to 20
			// To adjust it to get the minValue, we just add it, so the range then becomes -10 to 10
			
			// The reason I do this if else is to guarantee an int, otherwise, you'd be refreshing forever until you got an exact integer value
			if(r.nextInt(3) > 1){ // r.nextInt includes an argument so I can set the upper bound, with the lower bound being 0
				randomValue = minValue + (maxValue - minValue) * r.nextDouble();
				unsortedArray[i] = randomValue;
			}
			else{
				randomValue = r.nextInt((int)maxValue - (int)minValue) + minValue; // The min/max is casted here because the .nextInt() function only accepts integer values
				unsortedArray[i] = randomValue;
			}
			// Example output format. The number [x] is an (odd/even?) (double/int?) that is (positive/negative?)
			System.out.println(randomValue);
			
			if(randomValue %2 == 0){
				System.out.println("The number is even and an interger.");
			}
			
			else if (Math.abs(randomValue)%2 == 1) {
				System.out.println("The number is odd and an interger.");
				odd++;
				}
			else{
				System.out.println("The number is a double.");
			}
			if ((randomValue) > 0) {
				System.out.println("The number is positive.");
				positive++; 
				}
			else if ((randomValue) < 0) {
				System.out.println("The number is negative.");
				negative++;
				}
			else{
				System.out.println("The number is zero.");
			} 
		}
			

		//Array stores values into a new/separate array
		for(int i = 0; i < 10; i++)
			sorted[i] = unsortedArray[i];
		//Number of values sorting
		
		for(int i = 0 ; i < 9; i++){
			for(int j = 0; j < N - 1 - i; j++){
				if(sorted[j] > sorted[j + 1]){
					double temp = sorted[j + 1];
					sorted[j + 1] = sorted[j];
					sorted[j] = temp;
				}
			}
		}
			System.out.println();
			for(int i = 0; i < 10; i++)
				System.out.print(unsortedArray[i] + "\t");
				System.out.println();
			for(int i = 0; i < 10; i++)
				System.out.print(sorted[i] + "\t");
		
			
			for(int i = 0 ; i < 10; i++){
				if(sorted[i] %2 == 0){
					evenNumbers[even] = sorted[i];
					even++;
				}
			}	
			System.out.println();
			System.out.println();
			System.out.println("Even numbers:");
			for(int i = 0; i < even; i++)
				System.out.print(evenNumbers[i] + "\t");
				System.out.println();
				
				
			for(int i = 0; i < even; i++)
			
				for(int i = 0; i < 10; i++)
					sorted[i] = negativeNumbers[i];
				//Number of values sorting
			
				for(int i = 0 ; i < negative; i++){
					for(int j = 0; j < negative - 1 - i; j++){
						if(sorted[j] > sorted[j + 1]){
							double temp = sorted[j + 1];
							sorted[j + 1] = sorted[j];
							sorted[j] = temp;
				}
			}
		}
				System.out.println();
				System.out.println();
				System.out.println("Negative numbers:");
				for(int i = 0; i < negative; i++)
					System.out.print(negativeNumbers[i] + "\t");
					System.out.println();
				for(int i = 0; i < negative; i++)
					System.out.print(sorted[i] + "\t");
				
			for(int i = 0; i < 10; i++)
				sorted[i] = oddNumbers[i];
			//Number of values sorting
		
			for(int i = 0 ; i < odd; i++){
				for(int j = 0; j < odd - 1 - i; j++){
					if(sorted[j] > sorted[j + 1]){
						double temp = sorted[j + 1];
						sorted[j + 1] = sorted[j];
						sorted[j] = temp;
				}
			}
		}
					
					System.out.println();
					System.out.println();
					System.out.println("Odd numbers:");
					for(int i = 0; i < odd; i++)
						System.out.print(oddNumbers[i] + "\t");
						System.out.println();	
						
					for(int i = 0; i < odd; i++)
						System.out.print(sorted[i] + "\t");
		
			for(int i = 0; i < 10; i++)
				sorted[i] = positiveNumbers[i];
			//Number of values sorting
		
			for(int i = 0 ; i < positive; i++){
				for(int j = 0; j < positive - 1 - i; j++){
					if(sorted[j] > sorted[j + 1]){
						double temp = sorted[j + 1];
						sorted[j + 1] = sorted[j];
						sorted[j] = temp;	
				}
			}
		}
					
			System.out.println();
			System.out.println();
			System.out.println("Positive numbers:");
			for(int i = 0; i < positive; i++)
				System.out.print(positiveNumbers[i] + "\t");
				System.out.println();
				
		for(int i = 0; i < 10; i++)
			sorted[i] = zeroNumbers[i];
		//Number of values sorting
	
		for(int i = 0 ; i < zero; i++){
			for(int j = 0; j < zero - 1 - i; j++){
				if(sorted[j] > sorted[j + 1]){
					double temp = sorted[j + 1];
					sorted[j + 1] = sorted[j];
					sorted[j] = temp;
				}
			}
		}
					System.out.println();
					System.out.println();
					System.out.println("Zeros:");
					for(int i = 0; i < zero; i++)
						System.out.print(zeroNumbers[i] + "\t");
						System.out.println();
					for(int i = 0; i < zero; i++)
						System.out.print(sorted[i] + "\t");
				}
			}