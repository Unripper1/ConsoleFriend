import javax.xml.transform.sax.SAXResult;
import java.util.Scanner;

public class ConsoleFriend {
    Theme theme;

    public Theme getTheme() {
        return theme;
    }

    public String selectionTheme(String theme) {
        switch (theme){
            case("Космос"):
                this.theme = new SpaceTheme();
                break;
            case("Автомобили"):
                this.theme = new CarsTheme();
                break;
            case("География"):
                this.theme = new GeographyTheme();
                break;
        }
        return "Тема " + theme;
    }
    public String info(){
        return "Сечас выбрана тема "+theme.getName()+"\nВот что вы можете у меня спросить!\n"+theme+"\nСменить тему - change\nВыйти - exit";
    }
    public String command(String command){
        if(command.equals("exit")){
            return "exit";
        }
        if(command.equals("change")){
            System.out.println("Выберете тему: Космос, География, Автомобили");
            return selectionTheme("Автомобили");
        }
        return "ошибка";
    }
}
