package itsjava.first.lesson_4.enums;

public enum Weekday {
    SUNDAY("воскресенье"), MONDAY("понедельник"), TUESDAY("вторник"),
    WEDNESDAY("среда"), THURSDAY("четверг"), FRIDAY("пятница"), SATURDAY("суббота");

    String translate;
    Weekday(String translate) {
        this.translate = translate;
    }

    @Override
    public String toString() {
        return super.toString() + " translate on russian is - " + translate;
    }
}
