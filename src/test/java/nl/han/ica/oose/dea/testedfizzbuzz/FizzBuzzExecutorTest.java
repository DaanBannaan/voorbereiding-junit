package nl.han.ica.oose.dea.testedfizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzExecutorTest {
    // arrange
    private FizzBuzzExecutor sut;

    @BeforeEach
    public void setup() {
        sut = new FizzBuzzExecutor();
    }
    @Test
    void oneShouldReturnOne() {

        // act
        var result = sut.execute(1);
        // assert
        assertEquals("1", result);
    }

    @Test
    void threeShouldReturnFizz() {
        var result = sut.execute(3);

        assertEquals("Fizz", result);
    }

    @Test
    void fiveShouldReturnBuzz() {
        var result = sut.execute(5);

        assertEquals("Buzz", result);
    }

    @Test
    void fifteenShouldReturnFizzBuzz() {
        var result = sut.execute(15);

        assertEquals("FizzBuzz", result);
    }
}