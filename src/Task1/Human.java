package Task1;

public class Human implements Jumpable, Runnable {

    @Override
    public void jump() {
        System.out.println("Human jumps");
    }

    @Override
    public void run() {
        System.out.println("Human runs");
    }
}
