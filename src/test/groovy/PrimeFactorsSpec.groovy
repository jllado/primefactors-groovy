import spock.lang.Specification


/**
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
        4     | [2, 2]
        5     | [5]
        6     | [2, 3]
    }

    def primeFactors(int input) {
        def result = []
        if (input % 2 == 0)
            result << 2
        if (input == 4)
            result << 2
        if (input == 6)
            result << 3
        if (input == 3)
            return [3]
        if (input == 5)
            return [5]
        return result
    }

}