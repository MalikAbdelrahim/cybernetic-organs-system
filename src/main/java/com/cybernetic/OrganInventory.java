package com.cybernetic;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrganInventory {
    private final List<Organ> inventory;

    public OrganInventory() {
        this.inventory = new ArrayList<>();
    }

    public void addOrgan(Organ organ) {
        inventory.add(organ);
    }

    public List<Organ> getOrganList() {
        return Collections.unmodifiableList(inventory);
    }

    //ability to sort by multiple properties in order. name, model, compatibility using built-in sort
    public List<Organ> sortOrganByNameModelAndCompatibilityUsingBuiltInSort(List<Organ> sortedOrgans) {
        sortedOrgans.sort(Comparator.comparing(Organ::getName)
        .thenComparing(Organ::getModel)
        .thenComparing(Organ::getCompatibility));
        return getOrganList();
    }

    //ability to sort by multiple properties in order. name, model, compatibility using quicksort
    public List<Organ> quickSortOrganByNameModelAndCompatibility(List<Organ> unmodifiableOrganList) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}