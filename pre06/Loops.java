public class Loops{
	
	
	public static void main(String[] args) {
		System.out.println("Eric Liu pre06");

		//test power
		System.out.println(power(2,10));
		System.out.println(power(98,0));
		System.out.println(power(23,1));
		
		//test factorial
		
		
		
	}//end main
	
	/* @desc exercise 3
	 * iterative power
	 *
	 * @param double x is the number
	 * @param integer n is the power
	 * @return double of the resulting expression
	 */
	public static double power(double x, int n) {
		//iterative power
		/*
		if(n == 0) {
			return 1;
		} else {
			double total = 1;
			for(int i = 0; i < n; i++) {
				total += x;
			}//end for
			return(total);
		}
		*/
		double total = 1;
		for(int i = 0; i < n; i++) {
			total *= x;
		}//end for
		
		
		
	}//end power
	
	/* @desc exercise 4
	 * iterative factorial
	 *
	 * @param double x is the number
	 * @param integer n is the power
	 * @return double of the resulting expression
	 */
	public static double factorial(double x, int n) {
		//iterative power
		if(n == 0) {
			return 1;
		} else {
			double total = 0;
			for(int i = 0; i < n; i++) {
				total += x;
			}//end for
			return(total);
		}
	}//end factorial
	
	
	
	
	
	
}//end class