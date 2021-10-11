import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Выбери тему: Космос, Автомобили, География");
        Scanner scanner=new Scanner(System.in);
        String theme=scanner.nextLine();
        ConsoleFriend consoleFriend =new ConsoleFriend();
        consoleFriend.selectionTheme(theme);
        System.out.println(consoleFriend.info());
        String x="";
        while (true){
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            if (str.equals("exit"))
                break;
            System.out.println(consoleFriend.command(str));
        }
    }
}
