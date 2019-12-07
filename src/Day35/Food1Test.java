package Day35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Food1Test {



    @Test
    void hasButter() {
        Food1 food = new Food1();
        food.oil = "butter";
        Boolean actual = food.hasButter("butter");

        assertEquals(true, actual);

    }

    @Test
    void taste() {
    }
}