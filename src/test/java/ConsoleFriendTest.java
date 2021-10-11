import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsoleFriendTest {
    @Test
    public void SpaceThemeChoice(){
        ConsoleFriend consoleFriend=new ConsoleFriend();
        consoleFriend.selectionTheme("Космос");
        assertEquals("Космос",consoleFriend.getTheme().getName());
    }
//    public void SpaceInfo(){
//
//    }
}
