import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isSaturdayOrSundayTest {

    @Test
    void isSaturdayOrSunday() {
        assertFalse(Main.isSaturdayOrSunday("2024/05/13"));
        assertFalse(Main.isSaturdayOrSunday("2024/05/14"));
        assertFalse(Main.isSaturdayOrSunday("2024/05/15"));
        assertFalse(Main.isSaturdayOrSunday("2024/05/16"));
        assertFalse(Main.isSaturdayOrSunday("2024/05/17"));
        assertTrue(Main.isSaturdayOrSunday("2024/05/18"));
        assertTrue(Main.isSaturdayOrSunday("2024/05/19"));
        assertFalse(Main.isSaturdayOrSunday("2024/05/20"));
    }
}