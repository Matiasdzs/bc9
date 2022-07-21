package earaya;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.condition.JRE.*;
import static org.junit.jupiter.api.condition.OS.*;

class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    void initEach() {
        mathUtils = new MathUtils();
    }

    @Nested
    class AddTest {
        @Test
        void testAddingTwoPositives() {
            assertEquals(2, mathUtils.add(1, 1),
                    "Add method should return the sum of two numbers");
        }

        @Test
        void testAddingTwoNegatives() {
            assertEquals(-2, mathUtils.add(-1, -1),
                    "Add method should return the sum of two numbers");
        }

        @Disabled("Disabled until bug #99 has been fixed")
        @Test
        void testAddingAPositiveAndANegative() {
            assertEquals(0, mathUtils.add(-1, 1),
                    "Add method should return the sum of two numbers");
        }
    }

    @Test
    @EnabledOnOs({ LINUX, MAC, WINDOWS })
    void testMultiply() {
        assertAll(
                () -> assertEquals(0, mathUtils.multiply(1, 0)),
                () -> assertEquals(1, mathUtils.multiply(1, 1)),
                () -> assertEquals(6, mathUtils.multiply(2, 3))
        );
    }

    @Test
    @EnabledOnJre(JAVA_11)
    void computeCircleArea() {
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10),
                "Should return right circle area");
    }

    @Test
    @EnabledForJreRange(min = JAVA_9, max = JAVA_11)
    void testDivide() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0),
                "Divide should throw ArithmeticException when denominator is zero");
    }


}
