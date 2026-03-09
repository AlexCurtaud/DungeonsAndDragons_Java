package Enum;

public enum PlayerClass {
    WIZARD("Wizard"), WARRIOR("Warrior");

    private String name;

    PlayerClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
