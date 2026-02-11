package com.vinibiavatti1.mayor.data;

public enum Difficulty {
    EASY("Easy", -1),
    MEDIUM("Medium", -2),
    HARD("Hard", -3);

    private final String name;
    private final int landmarkDecrementAmount;

    Difficulty(String name, int landmarkDecrementAmount) {
        this.name = name;
        this.landmarkDecrementAmount = landmarkDecrementAmount;
    }

    public String getName() {
        return name;
    }

    public int getLandmarkDecrementAmount() {
        return landmarkDecrementAmount;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
