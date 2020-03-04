package Task2;

import Task2.Obstacles.Cross;
import Task2.Obstacles.Obstacle;
import Task2.Obstacles.Wall;

public class Start {
    public static void main(String[] args) {
        Obstacle[] obstacles ={new Wall("5"), new Cross("100")};
        Competitor[] competitors ={new Human("Oleg"),
        new Cat(),
        new Robot()};
    }
}
