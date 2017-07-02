/**
 * Created by jllado on 2/07/17.
 */
class PrimeFactors {

    def static generate(int number) {
        return breakDown(number)
    }

    private static List breakDown(int number) {
        def result = []
        for (int candidate = 2; candidate <= number; candidate++) {
            while (isDivisibleByCandidate(number, candidate)) {
                result << candidate
                number /= candidate
            }
        }
        return result
    }

    private static boolean isDivisibleByCandidate(int number, int candidate) {
        return number % candidate == 0
    }

}
