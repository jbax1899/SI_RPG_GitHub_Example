public class NonPlayerCharacter extends Character {
    private String dialogue;
    private Quest assignedQuest;

    public NonPlayerCharacter(String name, int level, int health, int attackPower, String dialogue) {
        super(name, level, health, attackPower);
        this.dialogue = dialogue;
    }

    public void assignQuest(Quest quest) {
        this.assignedQuest = quest;
        System.out.println(name + " has a quest for you: " + quest.getTitle());
    }

    public String getDialogue() {
        //TODO
        return "Sample dialogue - Needs implemented!";
    }
}
