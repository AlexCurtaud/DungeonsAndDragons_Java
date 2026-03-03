package Equipment;

public class Sword extends Gear {
    private int physicalAttack;

    public Sword(String name, String rarity, int physicalAttack) {
        super(name, rarity);
        this.physicalAttack = physicalAttack;
    }

    // GETTER
    // Get Physical Attack
    public int getPhysicalAttack() {
        return physicalAttack;
    }
}
