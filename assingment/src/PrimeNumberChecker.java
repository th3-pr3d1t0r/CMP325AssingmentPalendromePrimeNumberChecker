public class PrimeNumberChecker {
    public static void main(String[] args) {
        int number = 29; // Replace with your desired number

        boolean isPrime = true;

        // A prime number is greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to the square root of the number
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static void isPrime(int i) {
    }
}
