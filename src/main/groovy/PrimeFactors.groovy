/**
 * Created by jllado on 2/07/17.
 */
class PrimeFactors {

    private static final int FIRST_PRIME_NUMBER = 2

    def static generate(int number) {
        return breakDown(number, FIRST_PRIME_NUMBER)
    }

    private static List breakDown(int number, int primeNumber) {
        def result = []
        while (isDivisible(number, primeNumber)) {
            result << primeNumber
            number /= primeNumber
        }
        if (number == 1)
            return result
        return result + breakDown(number, nextPrimeNumber(number, primeNumber))
    }

    private static int nextPrimeNumber(int number, int primeNumber) {
        if (primeNumber == 2)
            return 3
        while (!isDivisible(number, primeNumber)) {
            primeNumber += 2
            if (primeNumber >= limit(number))
                return  number
        }
        return primeNumber
    }

    private static double limit(int number) {
        return Math.sqrt(number)
    }

    private static boolean isDivisible(int number, int candidate) {
        return number % candidate == 0
    }

}
