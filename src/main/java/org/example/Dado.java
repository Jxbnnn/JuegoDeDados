import java.util.Random;

public class Dado {
    private int cara;
    private Random random;

    public Dado() {
        this.random = new Random();
        this.cara = 1;
    }
    public void lanzar() {
        this.cara = random.nextInt(6) + 1;
    }
    public int getCara() {
        return this.cara;
    }
    @Override

}