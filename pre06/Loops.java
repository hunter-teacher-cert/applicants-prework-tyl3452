public class Loops{
	
	
	public static void main(String[] args) {
		System.out.println("Eric Liu pre06");

		//test power
		System.out.println("Test power");
		System.out.println(power(2,16));
		System.out.println(power(98,0));
		System.out.println(power(23,1));
		
		//test factorial
		System.out.println("Test factorial");
		System.out.println(factorial(3));
		System.out.println(factorial(5));
		System.out.println(factorial(12));

		//test myexp
		System.out.println("Test myexp");
		System.out.println(myexp(1,1));
		System.out.println(myexp(1,2));
		System.out.println(myexp(1,6));

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
		double total = 1;
		for(int i = 0; i < n; i++) {
			total *= x;
		}//end for
		
		return (total);
		
	}//end power
	
	/* @desc exercise 4
	 * iterative factorial
	 *
	 * @param double x is the number
	 * @param integer n is the power
	 * @return double of the resulting expression
	 */
	public static int factorial(int n) {
		int result = 1;
		for(int i = n;i > 0; i--) {
			result *= i;
		}//end for 
		return (result);
	}//end factorial
	
	
	/* @desc exercise 5
	 * myexp
	 *
	 * @param integer x is the power
	 * @param integer n is number of terms
	 * @return double of the resulting expression
	 */
	public static double myexp(int x, int n) {
		//iterative myexp
		double result = 0;
		
		for(int i = 0; i < n; i++) {
			result += power(x,i+1) / factorial(i+1);
		}//end for

		return (result);

	}//end myexp
	
	
	
}//end class