package itsjava.first.lesson_4.enums;

public class EnumPractice {
    public static void main(String[] args) {
        System.out.println("Season.WINTER = " + Season.WINTER);

        System.out.println("Season.valueOf(\"WINTER\") = " + Season.valueOf("WINTER"));

        Season[] seasons = Season.values();

        for (Season season: seasons){
            System.out.print(season + " ");
        }
        System.out.println();

        Season season = Season.FALL;
        switch (season){
            case FALL -> System.out.println("осень");
            case SPRING -> System.out.println("весна");
            default -> System.out.println("не весна и не осень");
        }

        System.out.println(Coffee.AMERICANO);

        //HW
        System.out.println(Weekday.MONDAY);
        System.out.println(Weekday.WEDNESDAY);
        System.out.println(Weekday.FRIDAY);
    }
}
