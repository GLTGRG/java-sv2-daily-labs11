package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    @Test
    void testGetPassword(){
        User user = new AdminUser("email@email.com", "1234");

        assertEquals("****", user.getPassword());
    }

}