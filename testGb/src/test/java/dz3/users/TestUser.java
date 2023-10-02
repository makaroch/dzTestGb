package dz3.users;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

public class TestUser {
    User user;

    @Test
    public void testAuthenticateTrue(){
        user = new User("user", "passwd", false);
        assertTrue(user.authenticate("user", "passwd"));
    }
    @Test
    public void testAuthenticateFalse(){
        user = new User("user", "passwd", false);
        assertFalse(user.authenticate("user1", "passwd1"));
    }
    @Test
    public void testAuthenticateExcept(){
        user = new User("user", "passwd", false);
        assertThatThrownBy( () -> user.authenticate(null, null)).
                isInstanceOf(RuntimeException.class);
    }
}

