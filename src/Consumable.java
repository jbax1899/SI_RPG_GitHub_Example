public class Consumable extends Item {
    public Consumable(String name, String description, double weight) {
        super(name, description, weight);
    }

    public void consume(PlayerCharacter player) {
        // Example: restore health
        System.out.println(player.name + " uses " + name + " and feels better!");
    }
}
