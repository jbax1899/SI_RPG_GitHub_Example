import java.io.*;
import java.util.*;

/**
 * ExceptionAdventure.java
 *
 * This activity simulates a buggy RPG adventure where *each event*
 * causes a common Java exception. Your task is to identify the issue,
 * understand the exception, and fix or handle it.
 *
 * Exceptions demonstrated (alphabetical order):
 * - ArithmeticException
 * - ArrayIndexOutOfBoundsException
 * - ClassCastException
 * - FileNotFoundException
 * - IndexOutOfBoundsException
 * - InputMismatchException
 * - IOException
 * - NullPointerException
 * - NumberFormatException
 */

public class ExceptionAdventure {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        System.out.println("🧙 The hero Arin begins their journey...");
        System.out.println("They try to speak to a ghostly figure...");
        PlayerCharacter ghost = null;
        interactWithGhost(ghost);

        System.out.println("\n⚔️ Arin enters battle and scans the enemy party...");
        scanEnemyParty();

        System.out.println("\n🎁 Arin opens a treasure chest and checks the loot...");
        checkTreasureChest();

        System.out.println("\n🛡️ Arin strikes an armored foe and calculates damage...");
        calculateDamage();

        System.out.println("\n🧑‍🤝‍🧑 Arin tries to befriend a strange NPC...");
        befriendNPC();

        System.out.println("\n📈 Arin checks their experience points listed on a scroll...");
        parseExperiencePoints();

        System.out.println("\n📜 Arin attempts to load a saved game from their journal...");
        loadSavedGame();

        System.out.println("\n📖 Arin flips back to a previously closed page...");
        readClosedScroll();

        System.out.println("\n🧪 Arin is asked to enter a number into a magical console...");
        readNumberFromConsole();
    }

    public static void interactWithGhost(PlayerCharacter ghost) {
        // Hint: What happens when you try to use an object that doesn't exist?
        try {
            System.out.println("Ghost's level: " + ghost.getLevel());
        }
        catch (NullPointerException npe) {
            System.out.println("We encountered a NullPointerException: " + npe.toString() + " (within method interactWithGhost)");
            // TODO
            // Handle the exception by creating a new PlayerCharacter instance for the ghost
        }
        catch (Exception e) {
            System.out.println("We encountered a general exception: " + e.toString() + " (within method interactWithGhost)");
            // TODO
            // ?
        }
    }

    public static void scanEnemyParty() {
        // Hint: The array only has 3 elements, but we're trying to access the 4th one
        int[] enemyLevels = {2, 3, 5};
        System.out.println("Accessing fourth enemy: " + enemyLevels[3]);
    }

    public static void checkTreasureChest() {
        // Hint: The list only has 2 items, but we're trying to get the 6th one
        List<String> loot = new ArrayList<>();
        loot.add("Potion");
        loot.add("Gold");
        System.out.println("Loot item: " + loot.get(5));
    }

    public static void calculateDamage() {
        // Hint: Be careful with division operations - what can't you divide by?
        int damage = 100;
        int defense = 0;
        int actualDamage = damage / defense;
        System.out.println("Actual damage: " + actualDamage);
    }

    public static void befriendNPC() {
        // Hint: Can you cast any object to any type? What if the types don't match?
        Object npc = new Weapon("Fake Sword", "Not a real sword", 1.0, 0);
        NonPlayerCharacter badCast = (NonPlayerCharacter) npc;
        System.out.println(badCast.getDialogue());
    }

    public static void parseExperiencePoints() {
        // Hint: Can you convert any string to a number? What if it's not a number?
        String xp = "ten";
        int xpValue = Integer.parseInt(xp);
        System.out.println("Parsed XP: " + xpValue);
    }

    public static void loadSavedGame() throws FileNotFoundException {
        // Hint: What if the file you're trying to open doesn't exist?
        FileReader file = new FileReader("savegame.dat");
        BufferedReader reader = new BufferedReader(file);
    }

    public static void readClosedScroll() throws IOException {
        // Hint: Can you read from a stream after closing it?
        BufferedReader reader = new BufferedReader(new StringReader("Line1\nLine2"));
        reader.close();
        String line = reader.readLine();
        System.out.println("Read: " + line);
    }

    public static void readNumberFromConsole() {
        // Hint: What happens when the input doesn't match what the Scanner expects?
        Scanner scanner = new Scanner("forty-two");
        int level = scanner.nextInt();
        System.out.println("You entered level: " + level);
        scanner.close();
    }
}