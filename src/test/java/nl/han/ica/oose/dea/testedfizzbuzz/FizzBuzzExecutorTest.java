package nl.han.ica.oose.dea.testedfizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzExecutorTest {
    // arrange
    private FizzBuzzExecutor sut = new FizzBuzzExecutor();
    @Test
    void oneShouldReturnOne() {

        // act
        var result = sut.execute(1);
        // assert
        assertEquals("1", result);
    }

    @Test
    void threeShouldReturnFizz() {
        String result = sut.execute(3);

        assertEquals("Fizz", result);
    }

    @Test
    void fiveShouldReturnBuzz() {
        String result = sut.execute(5);

        assertEquals("Buzz", result);
    }

    @Test
    void fifteenShouldReturnFizzBuzz() {
        String result = sut.execute(15);

        assertEquals("FizzBuzz", result);
    }
}