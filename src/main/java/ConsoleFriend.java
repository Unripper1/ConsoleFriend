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
        try {
            return "Сечас выбрана тема " + theme.getName() + "\nВот что вы можете у меня спросить!\n" + theme + "\nСменить тему - change\nВыйти - exit\nИнформация - info";
        }
        catch (Exception e){
            System.out.println("Ошибка, введите тему еще раз");
            Scanner sc =new Scanner(System.in);
            selectionTheme(sc.nextLine());
            return info();
        }
    }
    public String command(String command){
        if(command.contains("change")){
            String theme=command.replace("change ","");
            selectionTheme(theme);
            return info();
        }
        if(command.contains("info")){
            return info();
        }
        return theme.command(Integer.parseInt(command));
    }
}
