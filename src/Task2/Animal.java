package Task2;

public class Animal implements Competitor {
    String type;

    int maxRunDistance;
    int maxJumpHeight;

    boolean onDistance;

    public Animal(String type, int maxRunDistance, int maxJumpHeight) {
        this.type = type;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    @Override
    public void run(String dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + "Пробежал дистанцию");
        }
                else {
            System.out.println(type + " " + "Не пробежал дистанцию");
            onDistance = false;
        }

    }

    @Override
    public void jump(String height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + "Перепрыгнул");
        }
        else {
            System.out.println(type + " " + "Не перепрыгнул");
            onDistance = false;
        }

    }

    @Override
    public boolean isDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(type + " " + onDistance);

    }
}
