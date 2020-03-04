package Task2.Obstacles;

import Task2.Competitor;

public class Cross extends Obstacle {
    String length;

    public Cross(String length) {
        this.length = length;
    }

    @Override
    public void doIT(Competitor competitor) {
        competitor.run(length);

    }
}
