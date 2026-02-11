package com.vinibiavatti1.mayor.data;

public enum Resource {
    WORKERS("Workers", 1),
    REVENUE("Revenue", 2),
    GEARS("Gears", 3),
    FOOD("Food", 4),
    SOFTWARE("Software", 5),
    ELECTRICITY("Electricity", 6),
    WATER("Water", 7),
    CLEANLINESS("Cleanliness", 8),
    FIRE_SAFETY("Fire Safety", 9),
    CRIME_SAFETY("Crime Safety", 10),
    STUDENTS("Students", 11),
    HEALTH("Health", 12),
    ENGINEERS("Engineers", 13),
    CULTURE("Culture", 14),
    TOURISM("Tourism", 15),
    TRADING("Trading", 16),
    MILITARY("Military", 17),
    NATURE("Nature", 18);

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
