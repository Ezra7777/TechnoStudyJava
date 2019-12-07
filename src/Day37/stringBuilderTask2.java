package Day37;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class stringBuilderTask2 {
    // this method will reverse your string

    public String reverseString(String yourString) {
        // write you code here
        StringBuilder sb = new StringBuilder();

        StringBuilder reverse = sb.reverse();
        String result = reverse.toString();
        return result;
    }
    @Test
    public void test1() {
        // Given
        String s1 = "something";

        // WHEN
        String actual = reverseString(s1);
        String expecting = "gnihtemos";

        Assert.assertEquals(expecting, actual);
    }

    @Test
    public void test2() {
        // Given
        String s1 = "ADAM";

        // WHEN
        String actual = reverseString(s1);
        String expecting = "MADA";

        Assert.assertEquals(expecting, actual);
    }

    @Test
    public void test3() {
        // Given
        String s1 = "";

        // WHEN
        String actual = reverseString(s1);
        String expecting = "";

        Assert.assertEquals(expecting, actual);
    }

    @Test
    public void test4() {
        // Given
        String s1 = "-1";

        // WHEN
        String actual = reverseString(s1);
        String expecting = "1-";

        Assert.assertEquals(expecting, actual);
    }

}

