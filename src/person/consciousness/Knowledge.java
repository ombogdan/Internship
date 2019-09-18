package person.consciousness;

import main.Application;

public class Knowledge {
    private int level;

    public Knowledge(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void addPoints(int points) {
        this.level += points;
    }
}
