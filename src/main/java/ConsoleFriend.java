public class ConsoleFriend {
    Theme theme;

    public Class<? extends Theme> getTheme() {
        return theme.getClass();
    }

    public String selectionTheme(String theme) {
        switch (theme){
            case("Space"):
                this.theme = new SpaceTheme();
                break;
            case("Cars"):
                this.theme = new CarsTheme();
                break;
            case("Geography"):
                this.theme = new GeographyTheme();
                break;
        }

        return theme;
    }
}
