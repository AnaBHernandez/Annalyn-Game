package devanabelen;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AnnalynsInfiltrationTest {

    @Test
    void testCanFastAttack() {
        assertFalse(AnnalynsInfiltration.canFastAttack(true));
        assertTrue(AnnalynsInfiltration.canFastAttack(false));
    }

    @Test
    void testCanSpy() {
        assertTrue(AnnalynsInfiltration.canSpy(true, false, false));
        assertFalse(AnnalynsInfiltration.canSpy(false, false, false));
    }
}
