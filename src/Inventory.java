import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
        System.out.println(item.name + " added to inventory.");
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
