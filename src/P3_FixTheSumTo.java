/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
3. What problems did you identify in the sumTo method below?
There needs to be a return statement added outside of the loop. 

*/

public class P3_FixTheSumTo {

	public static void main(String[] args) {
		int totalSum = sumTo( 5 );
		System.out.println("The total sum is: " + totalSum );

	}
	
	public static int sumTo(int n) { 
	    int sum = 0; 
	    for (int i = 1; i <= n; i++) {
	        sum += i;
	    }
		return sum;
	}

}
