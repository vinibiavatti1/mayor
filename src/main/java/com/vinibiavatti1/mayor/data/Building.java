package com.vinibiavatti1.mayor.data;

import javax.swing.*;
import java.net.URL;
import java.util.Objects;

public enum Building {
    RESIDENCE("Residence", 1, "/residence.png") {
        @Override
        public void updateStats(Stats stats, Difficulty difficulty, boolean rollback) {
            stats.processResource(Resource.WORKERS,          3, rollback);
            stats.processResource(Resource.REVENUE,          0, rollback);
            stats.processResource(Resource.GEARS,            0, rollback);
            stats.processResource(Resource.FOOD,            -2, rollback);
            stats.processResource(Resource.SOFTWARE,         0, rollback);
            stats.processResource(Resource.ELECTRICITY,     -1, rollback);
            stats.processResource(Resource.WATER,           -2, rollback);
            stats.processResource(Resource.CLEANLINESS,      0, rollback);
            stats.processResource(Resource.FIRE_SAFETY,     -1, rollback);
            stats.processResource(Resource.CRIME_SAFETY,    -1, rollback);
            stats.processResource(Resource.STUDENTS,         0, rollback);
            stats.processResource(Resource.HEALTH,          -1, rollback);
            stats.processResource(Resource.ENGINEERS,        0, rollback);
            stats.processResource(Resource.CULTURE,          1, rollback);
            stats.processResource(Resource.TOURISM,          0, rollback);
            stats.processResource(Resource.TRADING,          0, rollback);
            stats.processResource(Resource.MILITARY,         0, rollback);
            stats.processResource(Resource.NATURE,          -1, rollback);
        }
    },
    COMMERCE("Commerce", 2, "/commerce.png") {
        @Override
        public void updateStats(Stats stats, Difficulty difficulty, boolean rollback) {
            stats.processResource(Resource.WORKERS,         -1, rollback);
            stats.processResource(Resource.REVENUE,          4, rollback);
            stats.processResource(Resource.GEARS,           -1, rollback);
            stats.processResource(Resource.FOOD,             0, rollback);
            stats.processResource(Resource.SOFTWARE,        -1, rollback);
            stats.processResource(Resource.ELECTRICITY,     -2, rollback);
            stats.processResource(Resource.WATER,           -1, rollback);
            stats.processResource(Resource.CLEANLINESS,     -1, rollback);
            stats.processResource(Resource.FIRE_SAFETY,     -1, rollback);
            stats.processResource(Resource.CRIME_SAFETY,    -1, rollback);
            stats.processResource(Resource.STUDENTS,        -2, rollback);
            stats.processResource(Resource.HEALTH,          -1, rollback);
            stats.processResource(Resource.ENGINEERS,       -1, rollback);
            stats.processResource(Resource.CULTURE,          0, rollback);
            stats.processResource(Resource.TOURISM,          3, rollback);
            stats.processResource(Resource.TRADING,          1, rollback);
            stats.processResource(Resource.MILITARY,         0, rollback);
            stats.processResource(Resource.NATURE,          -1, rollback);
        }
    },
    INDUSTRY("Industry", 3, "/industry.png") {
        @Override
        public void updateStats(Stats stats, Difficulty difficulty, boolean rollback) {
            stats.processResource(Resource.WORKERS,         -2, rollback);
            stats.processResource(Resource.REVENUE,          1, rollback);
            stats.processResource(Resource.GEARS,            9, rollback);
            stats.processResource(Resource.FOOD,             0, rollback);
            stats.processResource(Resource.SOFTWARE,        -1, rollback);
            stats.processResource(Resource.ELECTRICITY,     -3, rollback);
            stats.processResource(Resource.WATER,           -1, rollback);
            stats.processResource(Resource.CLEANLINESS,     -3, rollback);
            stats.processResource(Resource.FIRE_SAFETY,     -3, rollback);
            stats.processResource(Resource.CRIME_SAFETY,    -2, rollback);
            stats.processResource(Resource.STUDENTS,        -1, rollback);
            stats.processResource(Resource.HEALTH,          -1, rollback);
            stats.processResource(Resource.ENGINEERS,       -1, rollback);
            stats.processResource(Resource.CULTURE,         -3, rollback);
            stats.processResource(Resource.TOURISM,         -3, rollback);
            stats.processResource(Resource.TRADING,         -1, rollback);
            stats.processResource(Resource.MILITARY,         0, rollback);
            stats.processResource(Resource.NATURE,          -3, rollback);
        }
    },
    FARM("Farm", 4, "/farm.png") {
        @Override
        public void updateStats(Stats stats, Difficulty difficulty, boolean rollback) {
            stats.processResource(Resource.WORKERS,         -2, rollback);
            stats.processResource(Resource.REVENUE,          1, rollback);
            stats.processResource(Resource.GEARS,            0, rollback);
            stats.processResource(Resource.FOOD,            11, rollback);
            stats.processResource(Resource.SOFTWARE,         0, rollback);
            stats.processResource(Resource.ELECTRICITY,     -1, rollback);
            stats.processResource(Resource.WATER,           -1, rollback);
            stats.processResource(Resource.CLEANLINESS,     -2, rollback);
            stats.processResource(Resource.FIRE_SAFETY,     -1, rollback);
            stats.processResource(Resource.CRIME_SAFETY,    -1, rollback);
            stats.processResource(Resource.STUDENTS,         0, rollback);
            stats.processResource(Resource.HEALTH,          -1, rollback);
            stats.processResource(Resource.ENGINEERS,        0, rollback);
            stats.processResource(Resource.CULTURE,          0, rollback);
            stats.processResource(Resource.TOURISM,         -1, rollback);
            stats.processResource(Resource.TRADING,         -1, rollback);
            stats.processResource(Resource.MILITARY,         0, rollback);
            stats.processResource(Resource.NATURE,           0, rollback);
        }
    },
    OFFICE("Office", 5, "/office.png") {
        @Override
        public void updateStats(Stats stats, Difficulty difficulty, boolean rollback) {
            stats.processResource(Resource.WORKERS,         -1, rollback);
            stats.processResource(Resource.REVENUE,          2, rollback);
            stats.processResource(Resource.GEARS,           -1, rollback);
            stats.processResource(Resource.FOOD,             0, rollback);
            stats.processResource(Resource.SOFTWARE,         5, rollback);
            stats.processResource(Resource.ELECTRICITY,     -2, rollback);
            stats.processResource(Resource.WATER,           -1, rollback);
            stats.processResource(Resource.CLEANLINESS,     -1, rollback);
            stats.processResource(Resource.FIRE_SAFETY,     -1, rollback);
            stats.processResource(Resource.CRIME_SAFETY,     0, rollback);
            stats.processResource(Resource.STUDENTS,        -2, rollback);
            stats.processResource(Resource.HEALTH,           0, rollback);
            stats.processResource(Resource.ENGINEERS,       -3, rollback);
            stats.processResource(Resource.CULTURE,          0, rollback);
            stats.processResource(Resource.TOURISM,          0, rollback);
            stats.processResource(Resource.TRADING,          1, rollback);
            stats.processResource(Resource.MILITARY,         0, rollback);
            stats.processResource(Resource.NATURE,          -1, rollback);
        }
    },
    POWER_PLANT("Power Plant", 6, "/power_plant.png") {
        @Override
        public void updateStats(Stats stats, Difficulty difficulty, boolean rollback) {
            stats.processResource(Resource.WORKERS,         -2, rollback);
            stats.processResource(Resource.REVENUE,         -1, rollback);
            stats.processResource(Resource.GEARS,           -3, rollback);
            stats.processResource(Resource.FOOD,             0, rollback);
            stats.processResource(Resource.SOFTWARE,        -1, rollback);
            stats.processResource(Resource.ELECTRICITY,     45, rollback);
            stats.processResource(Resource.WATER,           -1, rollback);
            stats.processResource(Resource.CLEANLINESS,     -1, rollback);
            stats.processResource(Resource.FIRE_SAFETY,     -3, rollback);
            stats.processResource(Resource.CRIME_SAFETY,    -1, rollback);
            stats.processResource(Resource.STUDENTS,        -1, rollback);
            stats.processResource(Resource.HEALTH,          -1, rollback);
            stats.processResource(Resource.ENGINEERS,       -1, rollback);
            stats.processResource(Resource.CULTURE,         -3, rollback);
            stats.processResource(Resource.TOURISM,         -2, rollback);
            stats.processResource(Resource.TRADING,          0, rollback);
            stats.processResource(Resource.MILITARY,         0, rollback);
            stats.processResource(Resource.NATURE,          -3, rollback);
        }
    },
    WATER_PUMP("Water Pump", 7, "/water_pump.png") {
        @Override
        public void updateStats(Stats stats, Difficulty difficulty, boolean rollback) {
            stats.processResource(Resource.WORKERS,         -1, rollback);
            stats.processResource(Resource.REVENUE,         -1, rollback);
            stats.processResource(Resource.GEARS,           -3, rollback);
            stats.processResource(Resource.FOOD,             0, rollback);
            stats.processResource(Resource.SOFTWARE,         0, rollback);
            stats.processResource(Resource.ELECTRICITY,     -1, rollback);
            stats.processResource(Resource.WATER,           40, rollback);
            stats.processResource(Resource.CLEANLINESS,      0, rollback);
            stats.processResource(Resource.FIRE_SAFETY,      9, rollback);
            stats.processResource(Resource.CRIME_SAFETY,     0, rollback);
            stats.processResource(Resource.STUDENTS,        -1, rollback);
            stats.processResource(Resource.HEALTH,          -1, rollback);
            stats.processResource(Resource.ENGINEERS,       -1, rollback);
            stats.processResource(Resource.CULTURE,          0, rollback);
            stats.processResource(Resource.TOURISM,          0, rollback);
            stats.processResource(Resource.TRADING,          0, rollback);
            stats.processResource(Resource.MILITARY,         0, rollback);
            stats.processResource(Resource.NATURE,          -2, rollback);
        }
    },
    LANDFILL("Landfill", 8, "/landfill.png") {
        @Override
        public void updateStats(Stats stats, Difficulty difficulty, boolean rollback) {
            stats.processResource(Resource.WORKERS,         -1, rollback);
            stats.processResource(Resource.REVENUE,         -1, rollback);
            stats.processResource(Resource.GEARS,            0, rollback);
            stats.processResource(Resource.FOOD,             0, rollback);
            stats.processResource(Resource.SOFTWARE,         0, rollback);
            stats.processResource(Resource.ELECTRICITY,     -1, rollback);
            stats.processResource(Resource.WATER,           -1, rollback);
            stats.processResource(Resource.CLEANLINESS,     13, rollback);
            stats.processResource(Resource.FIRE_SAFETY,     -3, rollback);
            stats.processResource(Resource.CRIME_SAFETY,    -2, rollback);
            stats.processResource(Resource.STUDENTS,         0, rollback);
            stats.processResource(Resource.HEALTH,          -3, rollback);
            stats.processResource(Resource.ENGINEERS,        0, rollback);
            stats.processResource(Resource.CULTURE,         -3, rollback);
            stats.processResource(Resource.TOURISM,         -3, rollback);
            stats.processResource(Resource.TRADING,          0, rollback);
            stats.processResource(Resource.MILITARY,         0, rollback);
            stats.processResource(Resource.NATURE,          -3, rollback);
        }
    },
    FIRE_STATION("Fire Station", 9, "/fire_station.png") {
        @Override
        public void updateStats(Stats stats, Difficulty difficulty, boolean rollback) {
            stats.processResource(Resource.WORKERS,         -1, rollback);
            stats.processResource(Resource.REVENUE,         -2, rollback);
            stats.processResource(Resource.GEARS,           -1, rollback);
            stats.processResource(Resource.FOOD,             0, rollback);
            stats.processResource(Resource.SOFTWARE,         0, rollback);
            stats.processResource(Resource.ELECTRICITY,     -1, rollback);
            stats.processResource(Resource.WATER,           -1, rollback);
            stats.processResource(Resource.CLEANLINESS,      0, rollback);
            stats.processResource(Resource.FIRE_SAFETY,     25, rollback);
            stats.processResource(Resource.CRIME_SAFETY,     0, rollback);
            stats.processResource(Resource.STUDENTS,        -1, rollback);
            stats.processResource(Resource.HEALTH,           0, rollback);
            stats.processResource(Resource.ENGINEERS,        0, rollback);
            stats.processResource(Resource.CULTURE,          0, rollback);
            stats.processResource(Resource.TOURISM,          0, rollback);
            stats.processResource(Resource.TRADING,          0, rollback);
            stats.processResource(Resource.MILITARY,         0, rollback);
            stats.processResource(Resource.NATURE,          -1, rollback);
        }
    },
    POLICE_STATION("Police Station", 10, "/police_station.png") {
        @Override
        public void updateStats(Stats stats, Difficulty difficulty, boolean rollback) {
            stats.processResource(Resource.WORKERS,         -1, rollback);
            stats.processResource(Resource.REVENUE,         -2, rollback);
            stats.processResource(Resource.GEARS,           -1, rollback);
            stats.processResource(Resource.FOOD,             0, rollback);
            stats.processResource(Resource.SOFTWARE,         0, rollback);
            stats.processResource(Resource.ELECTRICITY,     -1, rollback);
            stats.processResource(Resource.WATER,           -1, rollback);
            stats.processResource(Resource.CLEANLINESS,      0, rollback);
            stats.processResource(Resource.FIRE_SAFETY,     -1, rollback);
            stats.processResource(Resource.CRIME_SAFETY,    15, rollback);
            stats.processResource(Resource.STUDENTS,        -1, rollback);
            stats.processResource(Resource.HEALTH,           0, rollback);
            stats.processResource(Resource.ENGINEERS,        0, rollback);
            stats.processResource(Resource.CULTURE,          0, rollback);
            stats.processResource(Resource.TOURISM,          0, rollback);
            stats.processResource(Resource.TRADING,          0, rollback);
            stats.processResource(Resource.MILITARY,         0, rollback);
            stats.processResource(Resource.NATURE,          -1, rollback);
        }
    },
    SCHOOL("School", 11, "/school.png") {
        @Override
        public void updateStats(Stats stats, Difficulty difficulty, boolean rollback) {
            stats.processResource(Resource.WORKERS,         -1, rollback);
            stats.processResource(Resource.REVENUE,         -1, rollback);
            stats.processResource(Resource.GEARS,           -1, rollback);
            stats.processResource(Resource.FOOD,            -1, rollback);
            stats.processResource(Resource.SOFTWARE,         0, rollback);
            stats.processResource(Resource.ELECTRICITY,     -1, rollback);
            stats.processResource(Resource.WATER,           -1, rollback);
            stats.processResource(Resource.CLEANLINESS,      0, rollback);
            stats.processResource(Resource.FIRE_SAFETY,     -1, rollback);
            stats.processResource(Resource.CRIME_SAFETY,     0, rollback);
            stats.processResource(Resource.STUDENTS,        13, rollback);
            stats.processResource(Resource.HEALTH,          -1, rollback);
            stats.processResource(Resource.ENGINEERS,        0, rollback);
            stats.processResource(Resource.CULTURE,          0, rollback);
            stats.processResource(Resource.TOURISM,          0, rollback);
            stats.processResource(Resource.TRADING,          0, rollback);
            stats.processResource(Resource.MILITARY,         0, rollback);
            stats.processResource(Resource.NATURE,          -1, rollback);
        }
    },
    HOSPITAL("Hospital", 12, "/hospital.png") {
        @Override
        public void updateStats(Stats stats, Difficulty difficulty, boolean rollback) {
            stats.processResource(Resource.WORKERS,         -1, rollback);
            stats.processResource(Resource.REVENUE,         -1, rollback);
            stats.processResource(Resource.GEARS,           -1, rollback);
            stats.processResource(Resource.FOOD,            -1, rollback);
            stats.processResource(Resource.SOFTWARE,        -1, rollback);
            stats.processResource(Resource.ELECTRICITY,     -1, rollback);
            stats.processResource(Resource.WATER,           -1, rollback);
            stats.processResource(Resource.CLEANLINESS,      3, rollback);
            stats.processResource(Resource.FIRE_SAFETY,     -1, rollback);
            stats.processResource(Resource.CRIME_SAFETY,     0, rollback);
            stats.processResource(Resource.STUDENTS,        -1, rollback);
            stats.processResource(Resource.HEALTH,           9, rollback);
            stats.processResource(Resource.ENGINEERS,       -2, rollback);
            stats.processResource(Resource.CULTURE,          0, rollback);
            stats.processResource(Resource.TOURISM,          0, rollback);
            stats.processResource(Resource.TRADING,          0, rollback);
            stats.processResource(Resource.MILITARY,         0, rollback);
            stats.processResource(Resource.NATURE,          -1, rollback);
        }
    },
    UNIVERSITY("University", 13, "/university.png") {
        @Override
        public void updateStats(Stats stats, Difficulty difficulty, boolean rollback) {
            stats.processResource(Resource.WORKERS,         -1, rollback);
            stats.processResource(Resource.REVENUE,         -1, rollback);
            stats.processResource(Resource.GEARS,           -1, rollback);
            stats.processResource(Resource.FOOD,            -1, rollback);
            stats.processResource(Resource.SOFTWARE,        -1, rollback);
            stats.processResource(Resource.ELECTRICITY,     -2, rollback);
            stats.processResource(Resource.WATER,           -1, rollback);
            stats.processResource(Resource.CLEANLINESS,      0, rollback);
            stats.processResource(Resource.FIRE_SAFETY,     -1, rollback);
            stats.processResource(Resource.CRIME_SAFETY,     0, rollback);
            stats.processResource(Resource.STUDENTS,        -3, rollback);
            stats.processResource(Resource.HEALTH,           0, rollback);
            stats.processResource(Resource.ENGINEERS,       29, rollback);
            stats.processResource(Resource.CULTURE,          0, rollback);
            stats.processResource(Resource.TOURISM,          1, rollback);
            stats.processResource(Resource.TRADING,          0, rollback);
            stats.processResource(Resource.MILITARY,         0, rollback);
            stats.processResource(Resource.NATURE,          -2, rollback);
        }
    },
    MUSEUM("Museum", 14, "/museum.png") {
        @Override
        public void updateStats(Stats stats, Difficulty difficulty, boolean rollback) {
            stats.processResource(Resource.WORKERS,         -1, rollback);
            stats.processResource(Resource.REVENUE,         -1, rollback);
            stats.processResource(Resource.GEARS,           -1, rollback);
            stats.processResource(Resource.FOOD,             0, rollback);
            stats.processResource(Resource.SOFTWARE,         0, rollback);
            stats.processResource(Resource.ELECTRICITY,     -1, rollback);
            stats.processResource(Resource.WATER,            0, rollback);
            stats.processResource(Resource.CLEANLINESS,      0, rollback);
            stats.processResource(Resource.FIRE_SAFETY,     -1, rollback);
            stats.processResource(Resource.CRIME_SAFETY,     0, rollback);
            stats.processResource(Resource.STUDENTS,        -1, rollback);
            stats.processResource(Resource.HEALTH,           0, rollback);
            stats.processResource(Resource.ENGINEERS,        0, rollback);
            stats.processResource(Resource.CULTURE,          7, rollback);
            stats.processResource(Resource.TOURISM,          3, rollback);
            stats.processResource(Resource.TRADING,          0, rollback);
            stats.processResource(Resource.MILITARY,         0, rollback);
            stats.processResource(Resource.NATURE,          -1, rollback);
        }
    },
    AIRPORT("Airport", 15, "/airport.png") {
        @Override
        public void updateStats(Stats stats, Difficulty difficulty, boolean rollback) {
            stats.processResource(Resource.WORKERS,         -2, rollback);
            stats.processResource(Resource.REVENUE,         -3, rollback);
            stats.processResource(Resource.GEARS,           -3, rollback);
            stats.processResource(Resource.FOOD,             0, rollback);
            stats.processResource(Resource.SOFTWARE,        -3, rollback);
            stats.processResource(Resource.ELECTRICITY,     -3, rollback);
            stats.processResource(Resource.WATER,            0, rollback);
            stats.processResource(Resource.CLEANLINESS,      0, rollback);
            stats.processResource(Resource.FIRE_SAFETY,     -3, rollback);
            stats.processResource(Resource.CRIME_SAFETY,     0, rollback);
            stats.processResource(Resource.STUDENTS,        -1, rollback);
            stats.processResource(Resource.HEALTH,          -1, rollback);
            stats.processResource(Resource.ENGINEERS,       -3, rollback);
            stats.processResource(Resource.CULTURE,          0, rollback);
            stats.processResource(Resource.TOURISM,          8, rollback);
            stats.processResource(Resource.TRADING,          0, rollback);
            stats.processResource(Resource.MILITARY,         1, rollback);
            stats.processResource(Resource.NATURE,          -3, rollback);
        }
    },
    STOCK_EXCHANGE("Stock Exchange", 16, "/stock_exchange.png") {
        @Override
        public void updateStats(Stats stats, Difficulty difficulty, boolean rollback) {
            stats.processResource(Resource.WORKERS,         -1, rollback);
            stats.processResource(Resource.REVENUE,          2, rollback);
            stats.processResource(Resource.GEARS,           -1, rollback);
            stats.processResource(Resource.FOOD,             0, rollback);
            stats.processResource(Resource.SOFTWARE,        -3, rollback);
            stats.processResource(Resource.ELECTRICITY,     -2, rollback);
            stats.processResource(Resource.WATER,           -1, rollback);
            stats.processResource(Resource.CLEANLINESS,      0, rollback);
            stats.processResource(Resource.FIRE_SAFETY,     -1, rollback);
            stats.processResource(Resource.CRIME_SAFETY,     0, rollback);
            stats.processResource(Resource.STUDENTS,        -1, rollback);
            stats.processResource(Resource.HEALTH,           0, rollback);
            stats.processResource(Resource.ENGINEERS,       -3, rollback);
            stats.processResource(Resource.CULTURE,          0, rollback);
            stats.processResource(Resource.TOURISM,          2, rollback);
            stats.processResource(Resource.TRADING,          4, rollback);
            stats.processResource(Resource.MILITARY,         0, rollback);
            stats.processResource(Resource.NATURE,          -1, rollback);
        }
    },
    HEADQUARTERS("Headquarters", 17, "/headquarters.png") {
        @Override
        public void updateStats(Stats stats, Difficulty difficulty, boolean rollback) {
            stats.processResource(Resource.WORKERS,         -2, rollback);
            stats.processResource(Resource.REVENUE,         -1, rollback);
            stats.processResource(Resource.GEARS,           -1, rollback);
            stats.processResource(Resource.FOOD,            -1, rollback);
            stats.processResource(Resource.SOFTWARE,         0, rollback);
            stats.processResource(Resource.ELECTRICITY,     -2, rollback);
            stats.processResource(Resource.WATER,           -1, rollback);
            stats.processResource(Resource.CLEANLINESS,     -2, rollback);
            stats.processResource(Resource.FIRE_SAFETY,     -2, rollback);
            stats.processResource(Resource.CRIME_SAFETY,    12, rollback);
            stats.processResource(Resource.STUDENTS,         0, rollback);
            stats.processResource(Resource.HEALTH,           0, rollback);
            stats.processResource(Resource.ENGINEERS,        0, rollback);
            stats.processResource(Resource.CULTURE,          0, rollback);
            stats.processResource(Resource.TOURISM,         -1, rollback);
            stats.processResource(Resource.TRADING,         -1, rollback);
            stats.processResource(Resource.MILITARY,         3, rollback);
            stats.processResource(Resource.NATURE,          -1, rollback);
        }
    },
    PARK("Park", 18, "/park.png") {
        @Override
        public void updateStats(Stats stats, Difficulty difficulty, boolean rollback) {
            stats.processResource(Resource.WORKERS,          0, rollback);
            stats.processResource(Resource.REVENUE,         -1, rollback);
            stats.processResource(Resource.GEARS,            0, rollback);
            stats.processResource(Resource.FOOD,             0, rollback);
            stats.processResource(Resource.SOFTWARE,         0, rollback);
            stats.processResource(Resource.ELECTRICITY,     -1, rollback);
            stats.processResource(Resource.WATER,            0, rollback);
            stats.processResource(Resource.CLEANLINESS,      1, rollback);
            stats.processResource(Resource.FIRE_SAFETY,     -1, rollback);
            stats.processResource(Resource.CRIME_SAFETY,     0, rollback);
            stats.processResource(Resource.STUDENTS,         0, rollback);
            stats.processResource(Resource.HEALTH,           5, rollback);
            stats.processResource(Resource.ENGINEERS,        0, rollback);
            stats.processResource(Resource.CULTURE,          0, rollback);
            stats.processResource(Resource.TOURISM,          1, rollback);
            stats.processResource(Resource.TRADING,          0, rollback);
            stats.processResource(Resource.MILITARY,         0, rollback);
            stats.processResource(Resource.NATURE,          12, rollback);
        }
    },
    LANDMARK("Landmark", 19, "/landmark.png") {
        @Override
        public void updateStats(Stats stats, Difficulty difficulty, boolean rollback) {
            int amount = difficulty.getLandmarkDecrementAmount();
            stats.processResource(Resource.WORKERS,          amount, rollback);
            stats.processResource(Resource.REVENUE,          amount, rollback);
            stats.processResource(Resource.GEARS,            amount, rollback);
            stats.processResource(Resource.FOOD,             amount, rollback);
            stats.processResource(Resource.SOFTWARE,         amount, rollback);
            stats.processResource(Resource.ELECTRICITY,      amount, rollback);
            stats.processResource(Resource.WATER,            amount, rollback);
            stats.processResource(Resource.CLEANLINESS,      amount, rollback);
            stats.processResource(Resource.FIRE_SAFETY,      amount, rollback);
            stats.processResource(Resource.CRIME_SAFETY,     amount, rollback);
            stats.processResource(Resource.STUDENTS,         amount, rollback);
            stats.processResource(Resource.HEALTH,           amount, rollback);
            stats.processResource(Resource.ENGINEERS,        amount, rollback);
            stats.processResource(Resource.CULTURE,          amount, rollback);
            stats.processResource(Resource.TOURISM,          amount, rollback);
            stats.processResource(Resource.TRADING,          amount, rollback);
            stats.processResource(Resource.MILITARY,         amount, rollback);
            stats.processResource(Resource.NATURE,           amount, rollback);
        }
    };

    private final String name;
    private final int order;
    private final Icon icon;

    Building(String name, int order, String imagePath) {
        this.name = name;
        this.order = order;
        URL iconUrl = Objects.requireNonNull(getClass().getResource(imagePath));
        this.icon = new ImageIcon(iconUrl);
    }

    public abstract void updateStats(Stats stats, Difficulty difficulty, boolean rollback);

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    public Icon getIcon() {
        return icon;
    }

    @Override
    public String toString() {
        return this.name;
    }
}