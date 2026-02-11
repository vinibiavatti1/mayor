package com.vinibiavatti1.mayor.data;

import com.vinibiavatti1.mayor.model.ResourceDelta;

public enum Building {
    RESIDENCE("Residence", 1, "/residence.png", new ResourceDelta[] {
            new ResourceDelta(Resource.POPULATION, 2),
            new ResourceDelta(Resource.SUPPLIES, -1),
            new ResourceDelta(Resource.ELECTRICITY, -1),
            new ResourceDelta(Resource.WATER, -1),
            new ResourceDelta(Resource.CLEANLINESS, -1),
            new ResourceDelta(Resource.FIRE_SAFETY, -1),
            new ResourceDelta(Resource.CRIME_SAFETY, -1),
            new ResourceDelta(Resource.NATURE, -1),
    }),
    COMMERCE("Commerce", 2, "/commerce.png", new ResourceDelta[] {
            new ResourceDelta(Resource.BUSINESS, 4),
            new ResourceDelta(Resource.POPULATION, -1),
            new ResourceDelta(Resource.ELECTRICITY, -1),
            new ResourceDelta(Resource.FIRE_SAFETY, -1),
            new ResourceDelta(Resource.CRIME_SAFETY, -1),
            new ResourceDelta(Resource.NATURE, -1),
    }),
    INDUSTRY("Industry", 3, "/industry.png", new ResourceDelta[] {
            new ResourceDelta(Resource.PRODUCTION, 2),
            new ResourceDelta(Resource.POPULATION, -1),
            new ResourceDelta(Resource.ELECTRICITY, -1),
            new ResourceDelta(Resource.CLEANLINESS, -1),
            new ResourceDelta(Resource.FIRE_SAFETY, -1),
            new ResourceDelta(Resource.CRIME_SAFETY, -1),
            new ResourceDelta(Resource.HEALTH, -1),
            new ResourceDelta(Resource.TOURISM, -1),
            new ResourceDelta(Resource.NATURE, -1),
    }),
    FARM("Farm", 4, "/farm.png", new ResourceDelta[] {
            new ResourceDelta(Resource.SUPPLIES, 5),
            new ResourceDelta(Resource.POPULATION, -1),
            new ResourceDelta(Resource.ELECTRICITY, -1),
            new ResourceDelta(Resource.FIRE_SAFETY, -1),
            new ResourceDelta(Resource.EDUCATION, -1),
            new ResourceDelta(Resource.NATURE, -1),
    }),
    OFFICE("Office", 5, "/office.png", new ResourceDelta[] {
            new ResourceDelta(Resource.TECHNOLOGY, 2),
            new ResourceDelta(Resource.POPULATION, -1),
            new ResourceDelta(Resource.BUSINESS, -1),
            new ResourceDelta(Resource.ELECTRICITY, -1),
            new ResourceDelta(Resource.FIRE_SAFETY, -1),
            new ResourceDelta(Resource.PROFESSIONALISM, -1),
            new ResourceDelta(Resource.NATURE, -1),
    }),
    POWER_PLANT("Power Plant", 6, "/power_plant.png", new ResourceDelta[] {
            new ResourceDelta(Resource.ELECTRICITY, 30),
            new ResourceDelta(Resource.POPULATION, -1),
            new ResourceDelta(Resource.CLEANLINESS, -1),
            new ResourceDelta(Resource.FIRE_SAFETY, -1),
            new ResourceDelta(Resource.CRIME_SAFETY, -1),
            new ResourceDelta(Resource.HEALTH, -1),
            new ResourceDelta(Resource.TOURISM, -1),
            new ResourceDelta(Resource.NATURE, -1),
    }),
    WATER_PUMP("Water Pump", 7, "/water_pump.png", new ResourceDelta[] {
            new ResourceDelta(Resource.WATER, 8),
            new ResourceDelta(Resource.POPULATION, -1),
            new ResourceDelta(Resource.ELECTRICITY, -1),
            new ResourceDelta(Resource.FIRE_SAFETY, -1),
            new ResourceDelta(Resource.TOURISM, -1),
            new ResourceDelta(Resource.NATURE, -1),
    }),
    LANDFILL("Landfill", 8, "/landfill.png", new ResourceDelta[] {
            new ResourceDelta(Resource.CLEANLINESS, 9),
            new ResourceDelta(Resource.POPULATION, -1),
            new ResourceDelta(Resource.FIRE_SAFETY, -1),
            new ResourceDelta(Resource.HEALTH, -1),
            new ResourceDelta(Resource.TOURISM, -1),
            new ResourceDelta(Resource.NATURE, -1),
    }),
    FIRE_STATION("Fire Station", 9, "/fire_station.png", new ResourceDelta[] {
            new ResourceDelta(Resource.FIRE_SAFETY, 47),
            new ResourceDelta(Resource.POPULATION, -1),
            new ResourceDelta(Resource.BUSINESS, -1),
            new ResourceDelta(Resource.ELECTRICITY, -1),
            new ResourceDelta(Resource.NATURE, -1),
    }),
    POLICE_STATION("Police Station", 10, "/police_station.png", new ResourceDelta[] {
            new ResourceDelta(Resource.CRIME_SAFETY, 21),
            new ResourceDelta(Resource.POPULATION, -1),
            new ResourceDelta(Resource.BUSINESS, -1),
            new ResourceDelta(Resource.ELECTRICITY, -1),
            new ResourceDelta(Resource.FIRE_SAFETY, -1),
            new ResourceDelta(Resource.NATURE, -1),
    }),
    SCHOOL("School", 11, "/school.png", new ResourceDelta[] {
            new ResourceDelta(Resource.EDUCATION, 2),
            new ResourceDelta(Resource.POPULATION, -1),
            new ResourceDelta(Resource.BUSINESS, -1),
            new ResourceDelta(Resource.ELECTRICITY, -1),
            new ResourceDelta(Resource.FIRE_SAFETY, -1),
            new ResourceDelta(Resource.NATURE, -1),
    }),
    HOSPITAL("Hospital", 12, "/hospital.png", new ResourceDelta[] {
            new ResourceDelta(Resource.HEALTH, 9),
            new ResourceDelta(Resource.POPULATION, -1),
            new ResourceDelta(Resource.BUSINESS, -1),
            new ResourceDelta(Resource.ELECTRICITY, -1),
            new ResourceDelta(Resource.FIRE_SAFETY, -1),
            new ResourceDelta(Resource.NATURE, -1),
    }),
    UNIVERSITY("University", 13, "/university.png", new ResourceDelta[] {
            new ResourceDelta(Resource.PROFESSIONALISM, 6),
            new ResourceDelta(Resource.EDUCATION, 3),
            new ResourceDelta(Resource.POPULATION, -1),
            new ResourceDelta(Resource.BUSINESS, -1),
            new ResourceDelta(Resource.PRODUCTION, -1),
            new ResourceDelta(Resource.TECHNOLOGY, -1),
            new ResourceDelta(Resource.ELECTRICITY, -1),
            new ResourceDelta(Resource.FIRE_SAFETY, -1),
            new ResourceDelta(Resource.NATURE, -1),
    }),
    MUSEUM("Museum", 14, "/museum.png", new ResourceDelta[] {
            new ResourceDelta(Resource.CULTURE, 2),
            new ResourceDelta(Resource.TOURISM, 2),
            new ResourceDelta(Resource.POPULATION, -1),
            new ResourceDelta(Resource.BUSINESS, -1),
            new ResourceDelta(Resource.PRODUCTION, -1),
            new ResourceDelta(Resource.TECHNOLOGY, -1),
            new ResourceDelta(Resource.ELECTRICITY, -1),
            new ResourceDelta(Resource.TOURISM, -1),
            new ResourceDelta(Resource.NATURE, -1),
    }),
    AIRPORT("Airport", 15, "/airport.png", new ResourceDelta[] {
            new ResourceDelta(Resource.TOURISM, 10),
            new ResourceDelta(Resource.POPULATION, -1),
            new ResourceDelta(Resource.BUSINESS, -1),
            new ResourceDelta(Resource.PRODUCTION, -1),
            new ResourceDelta(Resource.TECHNOLOGY, -1),
            new ResourceDelta(Resource.ELECTRICITY, -1),
            new ResourceDelta(Resource.FIRE_SAFETY, -1),
            new ResourceDelta(Resource.CRIME_SAFETY, -1),
            new ResourceDelta(Resource.PROFESSIONALISM, -1),
            new ResourceDelta(Resource.NATURE, -1),
    }),
    STOCK_EXCHANGE("Stock Exchange", 16, "/stock_exchange.png", new ResourceDelta[] {
            new ResourceDelta(Resource.TRADING, 2),
            new ResourceDelta(Resource.POPULATION, -1),
            new ResourceDelta(Resource.BUSINESS, -1),
            new ResourceDelta(Resource.PRODUCTION, -1),
            new ResourceDelta(Resource.TECHNOLOGY, -1),
            new ResourceDelta(Resource.ELECTRICITY, -1),
            new ResourceDelta(Resource.FIRE_SAFETY, -1),
            new ResourceDelta(Resource.CRIME_SAFETY, -1),
            new ResourceDelta(Resource.PROFESSIONALISM, -1),
            new ResourceDelta(Resource.TOURISM, -1),
            new ResourceDelta(Resource.NATURE, -1),
    }),
    HEADQUARTERS("Headquarters", 17, "/headquarters.png", new ResourceDelta[] {
            new ResourceDelta(Resource.MILITARY, 2),
            new ResourceDelta(Resource.CRIME_SAFETY, 10),
            new ResourceDelta(Resource.POPULATION, -1),
            new ResourceDelta(Resource.BUSINESS, -1),
            new ResourceDelta(Resource.PRODUCTION, -1),
            new ResourceDelta(Resource.TECHNOLOGY, -1),
            new ResourceDelta(Resource.ELECTRICITY, -1),
            new ResourceDelta(Resource.CLEANLINESS, -1),
            new ResourceDelta(Resource.FIRE_SAFETY, -1),
            new ResourceDelta(Resource.NATURE, -1),
    }),
    PARK("Park", 18, "/park.png", new ResourceDelta[] {
            new ResourceDelta(Resource.NATURE, 9),
            new ResourceDelta(Resource.ELECTRICITY, -1),
            new ResourceDelta(Resource.FIRE_SAFETY, -1),
    }),
    LANDMARK("Landmark", 19, "/landmark.png", new ResourceDelta[] {
            new ResourceDelta(Resource.LANDMARK, 1),
            new ResourceDelta(Resource.POPULATION, -1),
            new ResourceDelta(Resource.BUSINESS, -1),
            new ResourceDelta(Resource.PRODUCTION, -1),
            new ResourceDelta(Resource.SUPPLIES, -1),
            new ResourceDelta(Resource.TECHNOLOGY, -1),
            new ResourceDelta(Resource.ELECTRICITY, -1),
            new ResourceDelta(Resource.WATER, -1),
            new ResourceDelta(Resource.CLEANLINESS, -1),
            new ResourceDelta(Resource.FIRE_SAFETY, -1),
            new ResourceDelta(Resource.CRIME_SAFETY, -1),
            new ResourceDelta(Resource.EDUCATION, -1),
            new ResourceDelta(Resource.HEALTH, -1),
            new ResourceDelta(Resource.PROFESSIONALISM, -1),
            new ResourceDelta(Resource.CULTURE, -1),
            new ResourceDelta(Resource.TOURISM, -1),
            new ResourceDelta(Resource.TRADING, -1),
            new ResourceDelta(Resource.MILITARY, -1),
            new ResourceDelta(Resource.NATURE, -1),
    });

    private final String name;
    private final int order;
    private final String imagePath;
    private final ResourceDelta[] resourceDeltas;

    Building(String name, int order, String imagePath, ResourceDelta[] resourceDeltas) {
        this.name = name;
        this.order = order;
        this.imagePath = imagePath;
        this.resourceDeltas = resourceDeltas;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    public String getImagePath() {
        return imagePath;
    }

    public ResourceDelta[] getResourceDeltas() {
        return resourceDeltas;
    }

    @Override
    public String toString() {
        return this.name;
    }
}