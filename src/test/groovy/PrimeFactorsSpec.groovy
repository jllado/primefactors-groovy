import spock.lang.Specification


class PrimeFactorsSpec extends Specification {

    def "return prime factors of a integer"() {
        expect:
        primeFactors(input) == result
        where:
        input | result
        1     | []
        2     | [2]
        3     | [3]
        4     | [2, 2]
        5     | [5]
        6     | [2, 3]
        7     | [7]
        8     | [2, 2, 2]
        9     | [3, 3]
        10    | [2, 5]
    }

    def primeFactors(int input) {
        def result = []
        int remaining = input
        for (int candidate = 2; candidate <= input; candidate++) {
            while (isDivisibleByCandidate(remaining, candidate)) {
                result << candidate
                remaining /= candidate
            }
        }
        return result
    }

    private boolean isDivisibleByCandidate(int remaining, int candidate) {
        return remaining % candidate == 0
    }

}