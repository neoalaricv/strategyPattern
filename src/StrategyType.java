public class StrategyType {
    public static void main(String[] args) {
        // Create characters
        Character knight = new Character("Knight");
        Character wizard = new Character("Wizard");
        Character archer = new Character("Archer");

        // Perform actions
        knight.attack();
        knight.defend();

        wizard.attack();
        wizard.defend();

        archer.attack();
        archer.defend();
    }
}
