import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTests {

    @Test
    //all tests are public void methods

    //The class should have a double static property called version that is not initialized, but it could set any floating number to simulate we have a version number.
    public void testIfVersionIsSet(){
        assertEquals(0.0, CodeupCrypt.version, 0);
        CodeupCrypt.version = 1.2;
        assertEquals(1.2, CodeupCrypt.version, 0);  //this tells us that we are capable of setting the version
    }

    //It should have a method called hashPassword that takes in a string parameter and hashes it into a new string and return it.
    @Test
    public void testHashPassword(){
        String password = "Password";
        String expectedHash = "P4ssw0rd";

        String hashedPassword = CodeupCrypt.hashPassword(password);

        assertEquals(expectedHash, hashedPassword);
        assertEquals("P13", CodeupCrypt.hashPassword("Pie"));
        assertEquals("J9n1t", CodeupCrypt.hashPassword("JUnit"));
    }

    //It should have a method called checkPassword that compares two string parameters to make sure they match with a valid hash.

    @Test
    public void testCheckPassword(){
        assertTrue("Password and Hash are not the same", CodeupCrypt.checkPassword("Douglas", "D09gl4s"));
        assertFalse(CodeupCrypt.checkPassword("Douglas", "Douglas"));
    }

}
