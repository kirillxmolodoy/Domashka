package inter;

public class Main {
    public static void main(String[] args) {
        Jumpable[] jumpables ={
                new Cat(),
                new Human(),
                new Robot()
        };

        for (Jumpable j : jumpables) {
            j.jump();
        }

        Runnable[] runnables ={
                new Cat(),
                new Human(),
                new Robot()
        };

        for (Runnable r : runnables) {
            r.run();
        }
    }
}

