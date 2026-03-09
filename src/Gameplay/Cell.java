package Gameplay;

import DefensiveEquipment.DefensiveEquipment;
import Enemy.Enemy;
import OffensiveEquipment.OffensiveEquipment;
import Characters.Character;

/**
 * A Board is made out of Cells, that is the use of the Cell class.
 */
public class Cell {
    private int id;
    private Character player = null;
    private Enemy enemy;
    private OffensiveEquipment offEquip = null;
    private DefensiveEquipment defEquip = null;
//    private MysteryBox mysteryBox = null;

    /**
     * Cell Class and Constructor are made to create instance of a Board Cell. In a boardgame, there is a number of Cells and each cell has a content.
     * Here a cell must have an id, and it can have a Enemy, an OffensiveEquipment and a DefensiveEquipement
     *
     * @param id
     * @param enemy
     * @param offEquip
     * @param defEquip
     */
    public Cell(int id, Enemy enemy, OffensiveEquipment offEquip, DefensiveEquipment defEquip) {
        this.id = id;
        this.enemy = enemy;
        this.offEquip = offEquip;
        this.defEquip = defEquip;
//        this.mysteryBox = mysteryBox;
    }

    // GETTER

    /**
     * Get Cell id
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Get the Cell Character
     *
     * @return Character
     */
    public Character getPlayer() {
        return player;
    }

    /**
     * Get Cell Enemy
     *
     * @return enemy
     */
    public Enemy getEnemy() {
        return enemy;
    }

    /**
     * Get the Cell OffensiveEquipment
     *
     * @return OffensiveEquipement
     */
    public OffensiveEquipment getOffEquip() {
        return offEquip;
    }

    /**
     * Get the Cell DefensiveEquipment
     *
     * @return DefensiveEquipement
     */
    public DefensiveEquipment getDefEquip() {
        return defEquip;
    }

    /**
     * Get Cell MysteryBox
     *
     * @return mysteryBox
     */

//    public MysteryBox getMysteryBox() {
//        return mysteryBox;
//    }

    //SETTER
    /**
     * The setPlayer method is made to add the player to the Cell when he is currently within the Cell.
     * It set the value to null when the player leave the cell.
     * @param player - An instance of Player
     */
    public void setPlayer(Character player) {
        if (player.getCurrentPosition() == this.id) {
            this.player = player;
        }
        player = null;
    }

    //toString
    /**
     * toString method here returns a description of what is on the cell.
     * It could be empty or containing equipment, an enemy etc...
     * @return the description of its content.
     */
    @Override
    public String toString() {
        String sentence = "Empty Cell";
        if (enemy != null) {
            sentence = "\nCell " + this.getId() + "\nYou encounter: " + enemy.toString();
        }
        if (offEquip != null) {
                sentence = "\nCell " + this.getId() + "\nYou found: " + offEquip.toString();
            }
        if (defEquip != null) {
                sentence = "\nCell " + this.getId() + "\nYou found: " + defEquip.toString();
        }
        return sentence;
        }
    }

