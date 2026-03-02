public class Character {
    private final String name;
    private final int type;
    private int currentPosition = 1;

    public Character(String name, int type) {
        this.name = name;
        this.type = type;
    }

    // GETTER
    // Get the character's name
    public String getName() {
        return name;
    }
    // Get the character's position
    public int getCurrentPosition() {
        return currentPosition;
    }

    public int getMagicPower() {
        return wizard.getMagicPower();
    }
}
