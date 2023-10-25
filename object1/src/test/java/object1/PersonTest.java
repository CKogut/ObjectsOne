package object1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void setName() {
        Person p = new Person();
        p.setName("Joe");
        assertEquals("Joe", p.getName());
    }
}