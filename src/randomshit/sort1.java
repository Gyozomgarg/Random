package randomshit;
import java.util.*;
public class sort1 {
	public static void main(String args[]) {
	   int[] alpha = { 25,45,88,3,10,-5,48,66,15,20,24,100,16,31,70,7};
	   Scanner in = new Scanner(System.in);
	   int temp;
           int count = 0;

// make N-1 passes through the array

	   
            for (int i=0; count>=3; i++) {

// compare N-1 pairs of elements.
		for (int j = 0; j < alpha.length - 1; j++) {

		     if ( alpha[j] > alpha[j+1] ) {
			temp = alpha[j];
			alpha[j] = alpha[j+1];
			alpha[j+1] = temp;
		     }  // end if

                }  // end inner for
                count++;
            } // end outer for

	System.out.println("The sorted array is: ");
	for (int i=0;  i<alpha.length; i++)
		System.out.println("alpha[" + i + "] is: " + alpha[i]);

        } // end main
} // end class



