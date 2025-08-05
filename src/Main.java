/**
 * RPG Studio - Legends of Eldoria
 *
 * This project models the core structure of a fantasy RPG game using object-oriented design.
 * You will find classes for characters (players and NPCs), items (weapons, armor, consumables),
 * combat logic, inventory, and a quest system.
 *
 * Use this project to:
 * - Practice identifying inheritance relationships (e.g., PlayerCharacter is a Character)
 * - Model composition (e.g., Inventory has Items)
 * - Extend functionality with methods like attack(), equip(), assignQuest(), etc.
 * - Draw the UML diagram based on these class definitions
 */

/**
public class Main {
    public static void main(String[] args) {

        PlayerCharacter hero = new PlayerCharacter("Arin", 1, 100, 10);
        Weapon sword = new Weapon("Iron Sword", "Basic sword", 5.0, 8);
        Armor shield = new Armor("Wooden Shield", "Weak but sturdy", 6.0, 3);
        Consumable potion = new Consumable("Health Potion", "Restores health", 1.0);

        hero.getInventory().addItem(sword);
        hero.getInventory().addItem(shield);
        hero.getInventory().addItem(potion);
        hero.getInventory().addItem(potion);

        hero.equipWeapon(sword);
        hero.equipArmor(shield);

        NonPlayerCharacter villager = new NonPlayerCharacter("Elda", 1, 30, 2, "Welcome to our village!");
        Quest quest = new Quest("Goblin Menace", "Defeat the goblins near the cave", "50 gold");

        villager.assignQuest(quest);
    }
}
 */

//TODO:
/*
1. Scanner for user input
2. Present a simple menu, user can choose a number to do something
3. Print the contents of the room & update on action
*/


//for loop that renders an empty room
// 1. for loop that prints a line of asterisks (top of the room):    **********************
// 2. for loop that prints a line of spaces (inside of the room):    *                    *
// 3. for loop that prints a line of asterisks (bottom of the room): **********************

// 2D array represnting the contents of the room
// contents could be either:
// 1. a wall (represented by a number, e.g., 1)
// 2. a door (represented by a number, e.g., 2)
// 3. a window (represented by a number, e.g., 3)
// 4. a player (represented by a number, e.g., 4)