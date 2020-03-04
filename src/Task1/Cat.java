package Task1;

public class Cat implements Jumpable, Runnable {

    @Override
    public void jump() {
        System.out.println("Cat jumps");
    }

    @Override
    public void run() {
        System.out.println("Cat runs");
    }
}
