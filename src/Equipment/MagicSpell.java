package Equipment;

public class MagicSpell extends Gear {
    private int magicPower;
        public MagicSpell(String name, String rarity, int magicPower) {
            super(name, rarity);
            this.magicPower = magicPower;
        }

    // GETTER
    // Get Magic Power
    public int getMagicPower() {
        return magicPower;
    }


}
