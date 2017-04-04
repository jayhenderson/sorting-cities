package org.launchcode;

import org.launchcode.comparators.CompoundComparator;
import org.launchcode.comparators.NameComparator;
import org.launchcode.comparators.PopulationComparator;
import org.launchcode.comparators.StateComparator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//
        ArrayList<City> cities = CityData.loadData();
//
//        // TODO - Use different comparators here
//        NameComparator newNameComparator = new NameComparator();
//        PopulationComparator newPopulationComparator = new PopulationComparator();
//        StateComparator newStateComparator = new StateComparator();
//
//        cities.sort(newNameComparator);
//        printCities(cities);
//
//        cities.sort(newPopulationComparator);
//        printCities(cities);
//
//        cities.sort(newStateComparator);
//        printCities(cities);

        CompoundComparator comparer = new CompoundComparator();
        comparer.add(new StateComparator());
        comparer.add(new PopulationComparator());
        cities.sort(comparer);
        printCities(cities);
    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
