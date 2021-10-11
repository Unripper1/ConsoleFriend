import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsoleFriendTest {
    @Test
    public void SpaceThemeChoice(){
        ConsoleFriend consoleFriend=new ConsoleFriend();
        consoleFriend.selectionTheme("Space");
        consoleFriend.getTheme();
        assertEquals("class SpaceTheme",consoleFriend.getTheme().toString());
    }
}
