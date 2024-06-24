import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class nextWeekdayTest {

    @Test
    void nextWeekday() {
        assertEquals("2024/05/16",Main.nextWeekday("2024/05/15"));
        assertEquals("2024/05/17",Main.nextWeekday("2024/05/16"));
        assertEquals("2024/05/20",Main.nextWeekday("2024/05/17"));
        assertEquals("2024/05/20",Main.nextWeekday("2024/05/18"));
        assertEquals("2024/05/20",Main.nextWeekday("2024/05/19"));
        assertEquals("2024/05/21",Main.nextWeekday("2024/05/20"));

    }
}