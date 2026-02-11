package com.vinibiavatti1.mayor.data;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class ResourceStats implements Serializable {
    private final HashMap<Resource, Integer> resources = new HashMap<>();

    public ResourceStats() {
        this.reset();
    }

    public void processResource(Resource resource, int amount, boolean rollback) {
        Objects.requireNonNull(resource);
        resources.computeIfPresent(resource, (_, v) -> rollback ? v - amount : v + amount);
    }

    public int getResourceAmount(Resource resource) {
        Objects.requireNonNull(resource);
        return resources.get(resource);
    }

    public void reset() {
        Arrays.stream(Resource.values()).forEach(resource -> resources.put(resource, 0));
    }

    public boolean hasNegativeResources() {
        return resources.values().stream().anyMatch(amount -> amount < 0);
    }
}
