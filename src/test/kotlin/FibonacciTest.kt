import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class FibonacciTest {
    @ParameterizedTest
    @CsvSource(
        "0,0",
        "1,1",
        "2,1",
        "3,2",
        "4,3",
        "5,5",
        "6,8",
        "7,13",
        "15,610",
    )
    fun `returns fibonacci sequence`(input: Int, result: Int) {
        assertThat(fib(input)).isEqualTo(result)
    }
}

