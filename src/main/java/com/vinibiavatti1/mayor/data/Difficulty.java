package com.vinibiavatti1.mayor.data;

public enum Difficulty {
    EASY("Easy", 2),
    MEDIUM("Medium", 1),
    HARD("Hard", 0);

    private final String name;
    private final int difficultyModifier;

    Difficulty(String name, int difficultyModifier) {
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
        return amount + this.difficultyModifier;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
