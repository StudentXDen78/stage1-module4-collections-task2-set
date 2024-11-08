package com.epam.mjc.collections.set;

import java.util.*;

public class SetCombinationCreator {
    public static Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> setCombination= new LinkedHashSet<>();
        for (String element : firstSet) {
            if (secondSet.contains(element) && !thirdSet.contains(element)) {
               setCombination.add(element);
            }
        }

        for (String element : thirdSet) {
            if (!firstSet.contains(element) && !secondSet.contains(element)) {
                setCombination.add(element);
            }
        }
        return setCombination;
    }

    public  static  void main(String[] args) {
        Set<String> f = new LinkedHashSet<>(Arrays.asList(new String[]{"Java", "Collection",  "framework", "interface", "class", "Queue"}));
        Set<String> s = new LinkedHashSet<>(Arrays.asList(new String[]{"Queue", "iterator", "Java", "Collection","comparator"}));
        Set<String> th = new LinkedHashSet<>(Arrays.asList(new String[]{"Java", "Set", "Map", "List"}));
        createSetCombination(f, s, th);
    }
}
