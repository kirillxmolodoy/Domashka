package Task1;

public class Robot implements Jumpable, Runnable{
    @Override
    public void jump() {
        System.out.println("Robot jumps");
    }

    @Override
    public void run() {

        System.out.println("Robot runs");
    }
}
