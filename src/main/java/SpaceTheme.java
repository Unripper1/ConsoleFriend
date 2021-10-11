public class SpaceTheme extends Theme{
    @Override
    public String command(int questionNumber) {
        return null;
    }

    @Override
    public String toString() {
        return "1 - Сколько лет вселенной?\n" +
                "2 - Что является причиной образования кратеров на Луне?\n" +
                "3 - Какие планеты солнечной системы вращаются в направлении, противоположном Земле?\n" +
                "4 - Что в переводе с греческого означает \"комета\"?";
    }
    @Override
    public String getName(){
        return "Космос";
    }
}
