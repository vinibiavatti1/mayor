package com.vinibiavatti1.mayor.data;

public enum Difficulty {
    EASY("Easy", 3.0),
    MEDIUM("Medium", 2.0),
    HARD("Hard", 1.0);

    private final String name;
    private final double difficultyModifier;

    Difficulty(String name, double difficultyModifier) {
        this.name = name;
        this.difficultyModifier = difficultyModifier;
    }

    public String getName() {
        return name;
    }

    public int computeDifficultyModifier(int amount) {
        if (amount <= 0) {
            return amount;
        }
        return (int) Math.ceil(amount * this.difficultyModifier);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
