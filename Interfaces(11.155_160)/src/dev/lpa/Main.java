package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnable flier = bird;
        Trackable tracked = bird;

//        animal.move();
////        flier.move();
////        tracked.move();
//        flier.takeOff();
//        flier.fly();
//        tracked.track();
        inFlight(flier);
        inFlight(new Jet());
        Trackable truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnable.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n",
                kmsTraveled, milesTraveled);

        LinkedList<FlightEnable> fliers = new LinkedList<>();
        fliers.add(bird);

        List<FlightEnable> betterFlier = new LinkedList<>();
        betterFlier.add(bird);

        triggerFlier(fliers);
        flyFlier(fliers);
        landFlier(fliers);
    }
    private static void inFlight(FlightEnable flier)
    {
        flier.takeOff();
        flier.fly();
        if (flier instanceof Trackable tracked)
        {
            tracked.track();
        }
        flier.land();
    }

    private static void triggerFlier(List<FlightEnable> fliers)
    {
        for (var flier : fliers)
        {
            flier.takeOff();
        }
    }
    private static void flyFlier(List<FlightEnable> fliers)
    {
        for (var flier : fliers)
        {
            flier.fly();
        }
    }

    private static void landFlier(List<FlightEnable> fliers)
    {
        for (var flier : fliers)
        {
            flier.land();
        }
    }
}
