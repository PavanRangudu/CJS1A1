
public class CJS1A1_add_num {
	public static void main (String s[]){
		int a = 33 , b = 91 ; //Sample numbers 
		System.out.println("Sum of a and b is: "+Add(a,b));
	}
	public static int Add(int a, int b){
	    // Iterate till there is no carry  
	    while (b != 0)
	    {
	        // carry variable to store common set bits of a and b
	        int carry = a & b;  
	 
	        // Sum of bits of a and b is again stored in first variable a
	        a = a ^ b; 
	 
	        // Carry is shifted by one so that adding it to 'a' gives the required sum
	        b = carry << 1;
	    }
	    return a;
	}
}
