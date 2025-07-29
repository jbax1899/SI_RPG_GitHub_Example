public class Armor extends Item {
    private int defense;

    public Armor(String name, String description, double weight, int defense) {
        super(name, description, weight);
        this.defense = defense;
    }

    public int getDefense() {
        return defense;
    }
}
