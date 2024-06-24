import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class cntBetweenWeekdayTest {

    @Test
    void cntBetweenWeekday() {
        assertEquals(1,Main.cntBetweenWeekday("2024/05/15","2024/05/16"));
        assertEquals(2,Main.cntBetweenWeekday("2024/05/15","2024/05/17"));
        assertEquals(2,Main.cntBetweenWeekday("2024/05/15","2024/05/18"));
        assertEquals(2,Main.cntBetweenWeekday("2024/05/15","2024/05/19"));
        assertEquals(3,Main.cntBetweenWeekday("2024/05/15","2024/05/20"));
    }
}