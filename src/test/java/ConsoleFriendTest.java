import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsoleFriendTest {
    @Test
    public void SpaceThemeChoice(){
        assertEquals("Space",new ConsoleFriend().selectionTheme("Space"));
    }
}
