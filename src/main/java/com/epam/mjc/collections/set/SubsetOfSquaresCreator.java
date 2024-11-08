package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public static Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        for (Integer e : sourceList) {
            navigableSet.add((int) Math.pow(e, 2));
        }

        Set<Integer> subSet = navigableSet.subSet(lowerBound, true, upperBound, true);
        return subSet;
    }

    public static void main(String[] args) {
        // {2, -1, 5, -7, 4, 6, -9, 8};
        Integer[] list = {-1, 5, 3, -3, 6, -7, -4, 2};
        createSubsetOfSquares(new ArrayList<>(List.of(list)), 2, 30);
    }
}
