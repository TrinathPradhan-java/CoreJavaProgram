/*3) Finding the square and cube of a number by using following
   criteria :
   a) If number is 0 or negative should return -1.
   b) If number is even, return the square of the number
   c) If number is odd, return the cube of the number*/

package com.nit.static_method_demo;

public class Calculate {
	public static int getCubeandSquare (int num) {
		if(num <=0) {
			return -1;
		}
		else if(num%2 == 0) {
			return num*num;
		}
		else {
			return num*num*num;
		}
		
	}

}
