package Consumable;

public class Potion extends Consumable {
    private int heal;

    public Potion(String name, String rarity, int heal) {
        super(name, rarity);
        this.heal = heal;
    }

    // GETTER
    public int getHeal() {
        return heal;
    }
}
