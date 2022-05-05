package cl.rglabs.domain.entities;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void testGetAge(){
        User user = new User();
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            user.setBirthdate(formatter.parse("1985-11-12"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        assertEquals(36, user.getAge());
    }
}
