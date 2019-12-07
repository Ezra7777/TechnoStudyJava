package Day40;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {


        Person p = new Person();
        p.setName("Techno");
        String actual = p.getName();
        String expected = "Techno";
        Assert.assertEquals(actual, expected);
    }

    @Test
    void setName() {
    }

    public String something() {
        return "Something";
    }

    @Test
    void something1() {
        Person p = new Person();
        p.Method();
        String actual = "Something";
        String expected = "Something";
        Assert.assertEquals(actual, expected);

    }
}