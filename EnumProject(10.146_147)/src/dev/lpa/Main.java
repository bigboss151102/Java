package dev.lpa;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);

        for (int i = 0; i < 10; i++)
        {
            weekDay = getRandomDay();
//            System.out.printf("Name is %s, Ordinal value = %d%n", weekDay.name(), weekDay.ordinal());
            switchDayOfWeek(weekDay);
        }
        for (Toping toping : Toping.values())
        {
            System.out.println(toping.name() + " : " + toping.getPrice());
        }
    }

    public static void switchDayOfWeek(DayOfTheWeek weekDay)
    {
        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay)
        {
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) +
                    weekDay.name().substring(1).toLowerCase() +
                    "day is Day " + weekDayInteger);
        }
    }

    public static DayOfTheWeek getRandomDay()
    {
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();

        return allDays[randomInteger];
    }
}