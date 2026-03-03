package Consumable;

public class Consumable {
    private String name;
    private String rarity;

    public Consumable(String name, String rarity) {
        this.name = name;
        this.rarity = rarity;
    }

    // GETTER
    // Get Name
    public String getName() {
        return name;
    }

    // Get Rarity
    public String getRarity() {
        return rarity;
    }
}
