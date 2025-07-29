public class Quest {
    private String title;
    private String description;
    private String reward;
    private boolean isCompleted;

    public Quest(String title, String description, String reward) {
        this.title = title;
        this.description = description;
        this.reward = reward;
        this.isCompleted = false;
    }

    public String getTitle() {
        return title;
    }

    public void complete() {
        isCompleted = true;
    }
}
