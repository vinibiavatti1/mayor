package com.vinibiavatti1.mayor.model;

import com.vinibiavatti1.mayor.data.Building;
import com.vinibiavatti1.mayor.data.Difficulty;
import com.vinibiavatti1.mayor.data.Resource;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Stats implements Serializable {
    private final HashMap<Resource, Integer> resources = new HashMap<>();

    public Stats() {
        this.reset();
    }

    public void add(Resource resource, int amount) {
        Objects.requireNonNull(resource);
        resources.computeIfPresent(resource, (_, v) -> v + amount);
    }

    public int get(Resource resource) {
        Objects.requireNonNull(resource);
        return resources.get(resource);
    }

    public void reset() {
        Arrays.stream(Resource.values()).forEach(resource -> resources.put(resource, 0));
    }

    public boolean hasNegativeStats() {
        return resources.values().stream().anyMatch(amount -> amount < 0);
    }

    public void applyBuildingResourceDeltas(Building building, Difficulty difficulty) {
        Objects.requireNonNull(building);
        Arrays.stream(building.getResourceDeltas()).forEach(delta -> {
            Resource resource = delta.resource();
            int amountToAdd = delta.amount();
            if (building != Building.LANDMARK) {
                amountToAdd = difficulty.computeDifficultyModifier(amountToAdd);
            }
            this.add(resource, amountToAdd);
        });
    }
}
