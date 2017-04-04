package org.launchcode.comparators;

import org.launchcode.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by LaunchCode
 */
public class CompoundComparator implements Comparator<City> {

    List<Comparator<City>> comparators = new ArrayList<>();


    @Override
    public int compare(City o1, City o2){
        int found = 0;
        for (Comparator<City> comparator : comparators) {
            found = comparator.compare(o1, o2);
            if(found != 0){
                return found;
            }
        }
        return found;
    }

    public void add(Comparator<City> aComparator){
        this.comparators.add(aComparator);
    }
}
