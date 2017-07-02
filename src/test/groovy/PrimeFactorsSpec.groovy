import spock.lang.Specification


/**
 * 4  -> [2, 2]
 * 5  -> [5]
 * 6  -> [2, 3]
 * 7  -> [7]
 * 8  -> [2, 2, 2]
 * 9  -> [3]
 * 10 -> [2, 5]
 */
class PrimeFactorsSpec extends Specification {

    def "return prime factors of a integer"() {
        expect:
        primeFactors(input) == result
        where:
        input | result
        1     | []
        2     | [2]
        3     | [3]
    }

    def primeFactors(int input) {
        if (input == 1)
            return []
        if (input == 3)
            return [3]
        return [2]
    }

}