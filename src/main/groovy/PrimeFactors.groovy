import groovy.transform.CompileStatic

/**
 * Created by jllado on 2/07/17.
 */
@CompileStatic
class PrimeFactors {

    static generate(int number) {
        def result = []
        for (int candidate = 2; number > 1; candidate++) {
            while (isDivisibleByCandidate(number, candidate)) {
                result << candidate
                number /= candidate
            }
        }
        result
    }

    private static boolean isDivisibleByCandidate(int number, int candidate) {
        number % candidate == 0
    }

}
