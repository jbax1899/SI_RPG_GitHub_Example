public class PlayerCharacter extends Character {
    private Inventory inventory = new Inventory();
    private Weapon equippedWeapon;
    private Armor equippedArmor;

    public PlayerCharacter(String name, int level, int health, int attackPower) {
        super(name, level, health, attackPower);
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void equipWeapon(Weapon weapon) {
        this.equippedWeapon = weapon;
        this.attackPower += weapon.getAttackBoost();
    }

    public void equipArmor(Armor armor) {
        this.equippedArmor = armor;
        // Optional: Apply defense logic
    }
}
