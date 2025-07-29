public abstract class Character {
    protected String name;
    protected int level;
    protected int health;
    protected int attackPower;

    public Character(String name, int level, int health, int attackPower) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack(Character target) {
        int damage = this.attackPower;
        target.health -= damage;
        System.out.println(name + " attacks " + target.name + " for " + damage + " damage!");
    }
}
