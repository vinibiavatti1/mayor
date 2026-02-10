package com.vinibiavatti1.mayor;

public class Constants {
    public static final String TITLE = "Mayor";
    public static final String VERSION = "1.0.0";


    public static final String WELCOME_MESSAGE = """
            Welcome, Mayor!
            Your mission is to build the perfect city.
            Balance resources, manage growth, and discover the right ratios between buildings.
            To win, create one Landmark without allowing any resource to become negative.
            Every decision matters. Good luck!
            
            Select your difficulty:
            """;
    public static final String WIN_MESSAGE = """
            You Won!
            Congratulations! You have built a balanced and thriving city.
            Your leadership proves you are an excellent Mayor, capable of managing resources, growth, and harmony.
            The city stands as a true landmark of perfection!
            """;
    public static final String LOST_MESSAGE = """
            You Lost!
            Your city may have reached a landmark, but imbalance remains.
            To win, you must build at least one Landmark while keeping all resources above zero.
            Recalculate your strategy and try again - a perfect city requires careful planning.
            """;
    public static final String RESET_MESSAGE = """
            Reset Progress?
            Are you sure you want to reset your progress?
            This action cannot be undone and all current city data will be lost.
            """;
    public static final String QUIT_MESSAGE = """
            Exit Game?
            Are you sure you want to exit the game?
            All progress will be lost.
            """;
}
