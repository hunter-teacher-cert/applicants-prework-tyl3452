import java.util.Arrays;


public class ArraysTest{
	
	public static void main(String[] args) {
		System.out.println("Eric Liu pre07");

		//test powArray
		double[] test = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Test powArray");
		System.out.println(Arrays.toString(powArray(test, 3)));


		//test histogram
		int[] testScores = {15,34,34,23,23,0,1,2,99,66,23,23,12,6,7,43,0,0,1,1,1,1,1};
		System.out.println("Test histogram");
		System.out.println(Arrays.toString(histogram(testScores)));

		//test indexOfMax
		int[] maxTest = {1,2,3,4,5,6,7,8,9,10,23423,234,2342,154};
		System.out.println("Test indexOfMax");
		System.out.println(indexOfMax(maxTest));

		//test sieve
		System.out.println("Test sieve");
		System.out.println(Arrays.toString(sieve(14)));

	}//end main
	
	
	public static double[] powArray(double[] a, int power) {
		
		double[] b = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = Math.pow(a[i],power);
		}//end for

		return (b);

	}//end powArray		
	
	
	public static int[] histogram(int[] scores) {
		
		int[] counters = new int[100];
		for (int score : scores) {
			counters[score]++;
		}//end for	
		
		return (counters);
		
	}//end histogram
	
	
	public static int indexOfMax(int[] stuff) {
		
		int currentIndex = 0;
		for (int i = 0; i < stuff.length; i++) {
			if (stuff[i] > stuff[currentIndex]) {
				currentIndex = i;
			}//end if
		}//end for
		
		return (currentIndex);
		
	}//end indexOfMax
	
	
	public static boolean[] sieve(int n) {
		boolean[] primeArray = new boolean[n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 2; j <= i; ++j) {
				if (i % j == 0 ) {
					primeArray[i] = false;
				} else {
					primeArray[i] = true;
				}
			}//end for j
			
				
		}//end for i
		
		
		return (primeArray);
		
		
		
	}//end sieve
	
	
	
	
}//end class