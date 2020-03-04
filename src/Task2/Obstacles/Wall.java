package Task2.Obstacles;

import Task2.Competitor;

public class Wall extends Obstacle {
    String height;

    public Wall(String height) {
        this.height = height;
    }

    @Override
    public void doIT(Competitor competitor) {
        competitor.jump(height);

    }
}
