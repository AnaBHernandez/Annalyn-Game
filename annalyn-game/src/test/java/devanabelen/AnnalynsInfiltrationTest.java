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

    @Test
    void testCanSignalPrisoner() {
        assertFalse(AnnalynsInfiltration.canSignalPrisoner(true));
        assertTrue(AnnalynsInfiltration.canSignalPrisoner(false));
    }

    @Test
    void testCanFreePrisoner() {
        assertTrue(AnnalynsInfiltration.canFreePrisoner(false));
        assertFalse(AnnalynsInfiltration.canFreePrisoner(true));
    }
}
