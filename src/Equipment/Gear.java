package Equipment;

public class Gear {
    private String name;
    private String rarity;

    public Gear(String name, String rarity) {
        this.name = name;
        this.rarity = rarity;
    }

    // GETTER
    // Get name
    public String getName() {
        return name;
    }

    // Get rarity
    public String getRarity() {
        return rarity;
    }
}
