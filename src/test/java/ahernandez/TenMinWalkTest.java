package ahernandez;

import earaya.TenMinWalk;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TenMinWalkTest {

    @Test
    public void Test() {
        assertEquals(true, ahernandez.TenMinWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        assertEquals(false, ahernandez.TenMinWalk.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
        assertEquals(false, ahernandez.TenMinWalk.isValid(new char[] {'w'}));
        assertEquals( false, ahernandez.TenMinWalk.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
    }
}
