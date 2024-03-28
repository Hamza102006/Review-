/**
 * Author; Hamza Khan 
 * Date; 9/11/2023
 * Description; Program displays the numbers sum of all divisble numbers from 3-47 and displays the total 
 */
public class sumNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// initialize variables and information

		String message = "";
		int sum = 0;

		// for loop which checks which adds the numbers together which are divisable by 7 until i < 47
		for (int i = 3; i < 47; i++) {
			if (i % 7 == 0) {
				sum = sum + i;

			}

		}
		//Print sum 
		System.out.println(sum);

		// initialize the variables and information 
		int i = 3;
		int sum1 = 0;
		
		//while true loop which will run when true 
		while (true) {

			
			//if i is divisble by 7 the program will add to the sum and repeat 
			if (i % 7 == 0) {
				sum1 = sum1+ i;
				
			}
			
			i++;
			
			// if i is == to 47 the program will break and display the sum of variable sum1
			if (i == 47) {
				break;

			}

			
			
	}
		//print the sum1
		System.out.println(sum1);


}
}



