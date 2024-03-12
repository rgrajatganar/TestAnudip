package com.stringdemo;

public class PrimeNumber {


    public static void main(String[] args) {
    	
    	System.out.println("Prime number between 1 and 1000 :");
        // Define the range
        int lowerBound = 1;
        int upperBound = 1000;

        //  to find prime numbers
        for (int number = lowerBound; number <= upperBound; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        // 0 and 1 are not prime numbers
        if (num <= 1) {
            return false;
        }
        // Check for factors
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
