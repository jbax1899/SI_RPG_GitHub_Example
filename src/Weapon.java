public class Weapon extends Item {
    private int attackBoost;

    public Weapon(String name, String description, double weight, int attackBoost) {
        super(name, description, weight);
        this.attackBoost = attackBoost;
    }

    public int getAttackBoost() {
        return attackBoost;
    }
}
