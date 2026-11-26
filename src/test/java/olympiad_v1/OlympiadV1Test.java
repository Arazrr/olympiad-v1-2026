package olympiad_v1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * Created by: Demyd Titenko
 * <p>
 * Date: 26.11.2026
 * <p>
 * Time: 22:17
 * <p>
 * Project name: olympiad-v1
 */
class OlympiadV1Test {

    @Test
    @DisplayName("Reverse number")
    void testTask1_ReverseNumber() {
        assertEquals(1133, Task1.reverseNumber(3311));
        assertEquals(123456789, Task1.reverseNumber(987654321));
        assertEquals(0, Task1.reverseNumber(0));
        assertEquals(1, Task1.reverseNumber(1));
        assertEquals(123, Task1.reverseNumber(321));
    }
}