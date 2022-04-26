// https://www.codecademy.com/courses/learn-java/projects/java-prime-directive

/*
Simple class finding prime numbers as well as we do the fibonacci sequence here the extra challenge on Q15
*/

// Import statement: Q1
import java.util.ArrayList;
class PrimeDirective {


    // Add your methods here:
    // Q2 - Q7
    public boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Q9 - Q13
    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int number : numbers) {
            // if (number % number == 0 && number > 1) {
            // primes.add(number);
            // } the above logic is done with isPrime so straight forward we if it returns true we add the number if not it wont add the number!!
            if (isPrime(number)) {
                primes.add(number);
            }

        }
        return primes;
    }

    // Q15 additional challenges!
    public ArrayList<Integer> isEven(int[] numbers) {
        ArrayList<Integer> evenArray = new ArrayList<Integer>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenArray.add(number);
            }
        }
        return evenArray;
    }

    // first n primes in array
    public int firstPrime(ArrayList<Integer> numbers) {
        return numbers.get(0);
    }

    // fibonacci numbers
    public ArrayList<Integer> fibonacci(int n) {
        ArrayList<Integer> fib = new ArrayList<Integer>();

        if (n == 1 || n < 1) {
            fib.add(0);
            return fib;
        } else if (n == 2) {
            fib.add(0);
            fib.add(1);
            return fib;
        } else {
            fib.add(0);
            fib.add(1);
            int first, second, fibi;
            System.out.println(fib.size());
            for (int i = 2; i < n; i++) {
                first = fib.get(fib.size() - 2);
                second = fib.get(fib.size() - 1);
                fibi = first + second;
                fib.add(fibi);
            }
        }
        return fib;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        // Q8
        System.out.println(pd.isPrime(2));

        // Q14
        System.out.println(pd.onlyPrimes(numbers));


        // Q15 tests

        System.out.println(pd.fibonacci(13));
    }

}