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
        return "Сечас выбрана тема "+theme;
    }
}
