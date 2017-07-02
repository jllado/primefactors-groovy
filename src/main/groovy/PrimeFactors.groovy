/**
 * Created by jllado on 2/07/17.
 */
class PrimeFactors {

    def static generate(int number) {
        return breakDownByCandidate(number, 2)
    }

    private static List breakDownByCandidate(int number, int candidate) {
        def result = []
        if (number == 1)
            return result
        while (isDivisibleByCandidate(number, candidate)) {
            result << candidate
            number /= candidate
        }
        result.addAll(breakDownByCandidate(number, candidate + 1))
        return result
    }

    private static boolean isDivisibleByCandidate(int number, int candidate) {
        return number % candidate == 0
    }

}
