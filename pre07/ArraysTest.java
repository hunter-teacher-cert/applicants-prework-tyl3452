import java.util.Arrays;


public class ArraysTest{
	
	public static void main(String[] args) {
		System.out.println("Eric Liu pre07");

		//test powArray
		double[] test = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(powArray(test)));


	}//end main
	
	
	public static double[] powArray(double[] a) {
		
		double[] b = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = Math.pow(a[i],2);
		}//end for

		return (b);

	}//end powArray		
	
	
	
	
}//end class