## what this is

This is a basic Java application to that returns prime numbers from an array

### Implementation

I was able to acheive the desired functionality by creating a method that filters the input array through creating a stream from the input array and then applying logic that (in the form of my checkPrimes Method) checks if the number is less then 2 (not prime),
a for loop then checks if the number is divisable by i which starts at 2 since all numbers are divisible by 1. the reason the loop stops when i is greater than or equal to the square root of the number it is checking is because if a number is not prime (composite number) it will have at least one divisable number that is less then it's square root therefore greatly reducing the number of iterations that would be required if I stopped the loop when i=num.
after loop runs for an array item it returns a boolean value which then determines if number is included in the new array. Finally the new array is printed from the Main class if it has any items otherwise a message is displayed.

```java
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
```

### What I learnt

Through doing this exercise I have learnt that

1. all composite numbers have a diviser (other than 1) that is less than it's square root
2. learnt about method references (logic::checkPrime) these are more consise lambda
   expressions for calling methods
3. The filter method requires what is called a 'predicate interface' as an argument in order to
   define the filter to be applied.
