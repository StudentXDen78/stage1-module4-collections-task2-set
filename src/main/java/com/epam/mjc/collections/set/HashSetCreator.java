package com.epam.mjc.collections.set;

import java.util.*;

public class HashSetCreator {
    public static HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> newHashSet = new HashSet<>();
        for (Integer e : sourceList) {
            if (e % 2 == 0) {
                int element = e;
                while (element % 2 == 0) {
                    newHashSet.add(element);
                    element = element / 2;
                }
            }
            else {
                newHashSet.add(e);
                newHashSet.add(e * 2);
            }
        }
        return newHashSet;
        // [2, 1, -1, -2, 3, 6, 8, 4, -5, -10, 12]
    }

    public static void main(String[] args) {
        Integer[] list = {2, -1, 3, 8, -5, 12};
        createHashSet(new ArrayList<>(List.of(list)));
    }
}
