public abstract class Item {
    protected String name;
    protected String description;
    protected double weight;

    public Item(String name, String description, double weight) {
        this.name = name;
        this.description = description;
        this.weight = weight;
    }
}
