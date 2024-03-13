package Main;

import java.util.Arrays;

public class Main {
public static void main (String[] args) {
	int[] numbers = {2, 3, 13, 5, 17, 7, 22, 9, 10, 11};
	//int[] numbers = {22, 4, 6, 8, 10, 12, 14, 16, 18, 20};
	int[] primeNumbers = Logic.getPrimes(numbers);
	
	if (primeNumbers.length == 0) {
	System.out.println("No prime numbers");
	} else {
		System.out.println(Arrays.toString(primeNumbers));
	}
}
}
