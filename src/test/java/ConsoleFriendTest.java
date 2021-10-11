import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

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
        assertEquals("Сечас выбрана тема Космос\n" +
                "Вот что вы можете у меня спросить!\n" +
                "1 - Сколько лет вселенной?\n" +
                "2 - Что является причиной образования кратеров на Луне?\n" +
                "3 - Какие планеты солнечной системы вращаются в направлении, противоположном Земле?\n" +
                "4 - Что в переводе с греческого означает \"комета\"?\n" +
                "Сменить тему - change\n" +
                "Выйти - exit",consoleFriend.info());

    }
    @Test
    public void ChangeTest(){
        ConsoleFriend consoleFriend=new ConsoleFriend();
        consoleFriend.selectionTheme("Космос");
        consoleFriend.command("change Автомобили");
        assertEquals("Автомобили",consoleFriend.getTheme().getName());
    }
}
