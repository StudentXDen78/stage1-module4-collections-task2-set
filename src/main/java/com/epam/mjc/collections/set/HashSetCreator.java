package com.epam.mjc.collections.set;

import java.util.*;

public class HashSetCreator {
    public static HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> newHashSet = new HashSet<>();
        for (Integer e : sourceList) {
            if (e % 2 == 0) {
                int element = e;
                newHashSet.add(element);
                while (element % 2 == 0) {
                    element = element / 2;
                    newHashSet.add(element);
                }
            }
            else {
                newHashSet.add(e);
                newHashSet.add(e * 2);
            }
        }
        return newHashSet;
        // [2, 1, -1, -2, 3, 6, 8, 4, -5, -10, 12]
        // expected: <[16, 8, 1, 2, 4]> but was: <[16, 1, 2, 4, 8]>
        // expected: <[14, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12]> but was: <[2, 3, 4, 5, 6, 7, 8, 10, 12, 14]>
    }

    public static void main(String[] args) {
        Integer[] list = {16};
        createHashSet(new ArrayList<>(List.of(list)));
    }
}
