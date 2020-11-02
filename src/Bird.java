import java.sql.Array;

public abstract class Bird {
    public  boolean feathers = true;
    public  boolean layEggs = true;
    public  abstract void fly();

    public static void main(String[] args) {
        Bird[] bd = new Bird[4];
        bd[0] = new Chicken();
        bd[1] = new Penguin();
        bd[2] = new Swallow();
        bd[3] = new Eagle();
        bd[0].fly();



    }
}
