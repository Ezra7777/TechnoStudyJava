package Day43;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestVegetable {
    /// create two more vegetable: Garlic, Tomato
    /// add check for onion also
    // use instanceof in your code

    public boolean checkForOnion(Vegetable v) {
        if (v instanceof Onion) {
            return true;
        } else {
            return false;
        }
    }

    @Test
    public void testForOnion1() {
        Garlic obj = new Garlic();
        boolean actual = checkForOnion(obj);

        Assert.assertFalse(actual);
    }

    @Test
    public void testForOnion2() {
        Onion obj = new Onion();
        boolean actual = checkForOnion(obj);

        Assert.assertTrue(actual);
    }


}
