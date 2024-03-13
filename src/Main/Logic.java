package Main;

import java.util.Arrays;

public class Logic {
public static int[] getPrimes(int[] array) {
	int[] primeNumberArray = Arrays.stream(array).filter(Logic::checkPrimes).toArray();
	return primeNumberArray;
}

public static boolean checkPrimes(int num) {
	if (num <= 1) {
		return false;
	}
	for (int i = 2; i <= Math.sqrt(num); i++) {
		if (num % i == 0) {
			return false;
		}
	}
	return true;
}

}
