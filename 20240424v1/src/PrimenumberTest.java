import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimenumberTest {

    @Test
    void getPrime() {
        assertEquals(7, Primenumber.getPrime(4));
        assertEquals(11, Primenumber.getPrime(5));
        assertEquals(17, Primenumber.getPrime(7));

    }
}