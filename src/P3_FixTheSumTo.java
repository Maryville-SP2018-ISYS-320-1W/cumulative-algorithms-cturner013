/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
3. What problems did you identify in the sumTo method below?
there is not max set. Shouldn't it be a void set? on the second half

*/

public class P3_FixTheSumTo {

	public static void main(String[] args) {
		int totalSum = sumTo( 5 );
		System.out.println("The total sum is: " + totalSum );

	}
	
	public static int sumTo(int n) { 
	    for (int i = 1; i <= n; i++) {
	        int sum = 0; 
	        sum += i;
	    }
		return n;
	}

}
