package Task2;

public class Robot implements Competitor {
    String type;

    int maxRunDistance;
    int maxJumpHeight;

    boolean active;

    public Robot(String type, int maxRunDistance, int maxJumpHeight) {
        this.type = type;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.active = true;
    }

    public Robot() {
        this(type, 7000, 8 );
    }

    @Override
    public void run(String dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + "Пробежал дистанцию");
        }
        else {
            System.out.println(type + " " + "Не пробежал дистанцию");
            active = false;
        }

    }

    @Override
    public void jump(String height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + "Перепрыгнул");
        }
        else {
            System.out.println(type + " " + "Не перепрыгнул");
            active = false;
        }

    }

    @Override
    public boolean isDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(type + " " + active);

    }
}
