/**
 * Created by jllado on 2/07/17.
 */
class PrimeFactors {

    def static generate(int number) {
        def result = []
        int remaining = number
        for (int candidate = 2; candidate <= number; candidate++) {
            while (isDivisibleByCandidate(remaining, candidate)) {
                result << candidate
                remaining /= candidate
            }
        }
        return result
    }

    private static boolean isDivisibleByCandidate(int number, int candidate) {
        return number % candidate == 0
    }

}
