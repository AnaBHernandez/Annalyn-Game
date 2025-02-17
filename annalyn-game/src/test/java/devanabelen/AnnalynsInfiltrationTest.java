package devanabelen;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AnnalynsInfiltrationTest {
    @Test
    void testCanFastAttack() {
        assertFalse(AnnalynsInfiltration.canFastAttack(true));
        assertTrue(AnnalynsInfiltration.canFastAttack(false));
    }
}
