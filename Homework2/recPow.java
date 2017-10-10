
public class recPow {
	
	public static int recPow(int n){
		
		if (n == 0) {
			return 1; 
		}
		else {
			return 2 * recPow(n - 1);
			
		}
	}
	public static void main(String args[]) {
	    for (int n = 0; n <= 10; n++) {
	        System.out.println(recPow(n));
	    }
	}
}
