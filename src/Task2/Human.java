package Task2;

public class Human implements Competitor {
    String name;

    int maxRunDistance;
    int maxJumpHeight;

    boolean active;

    public Human(String type, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.active = true;
    }

    public Human(String name) {
        this(name, 3000, 5 );
    }

    @Override
    public void run(String dist) {
        if (dist <= maxRunDistance) {
            System.out.println(name + " " + "Пробежал дистанцию");
        }
        else {
            System.out.println(name + " " + "Не пробежал дистанцию");
            active = false;
        }

    }

    @Override
    public void jump(String height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " " + "Перепрыгнул");
        }
        else {
            System.out.println(name + " " + "Не перепрыгнул");
            active = false;
        }

    }

    @Override
    public boolean isDistance() {
        return active;
    }

    @Override
    public void info() {
        System.out.println(name + " " + active);

    }
}
