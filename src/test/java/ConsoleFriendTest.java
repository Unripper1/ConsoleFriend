import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsoleFriendTest {
    @Test
    public void SpaceThemeChoice(){
        ConsoleFriend consoleFriend=new ConsoleFriend();
        consoleFriend.selectionTheme("Космос");
        assertEquals("Космос",consoleFriend.getTheme().getName());
    }
    @Test
    public void SpaceInfo(){
        ConsoleFriend consoleFriend=new ConsoleFriend();
        consoleFriend.selectionTheme("Космос");
        assertEquals("Сечас выбрана тема Космос",consoleFriend.info());

    }
}
