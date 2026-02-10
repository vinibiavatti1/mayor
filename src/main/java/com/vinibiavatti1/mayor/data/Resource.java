package com.vinibiavatti1.mayor.data;

public enum Resource {
    POPULATION("Population", 1),
    BUSINESS("Business", 2),
    PRODUCTION("Production", 3),
    SUPPLIES("Supplies", 4),
    TECHNOLOGY("Technology", 5),
    ELECTRICITY("Electricity", 6),
    WATER("Water", 7),
    CLEANLINESS("Cleanliness", 8),
    FIRE_SAFETY("Fire Safety", 9),
    CRIME_SAFETY("Crime Safety", 10),
    EDUCATION("Education", 11),
    HEALTH("Health", 12),
    PROFESSIONALISM("Professionalism", 13),
    CULTURE("Culture", 14),
    TOURISM("Tourism", 15),
    TRADING("Trading", 16),
    MILITARY("Military", 17),
    NATURE("Nature", 18),
    LANDMARK("Landmark", 19);

    private final String name;
    private final int order;

    Resource(String name, int order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
