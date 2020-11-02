public class Penguin extends NonFlyingBird {
    @Override
    public void fly() {
        String goup = "they can not  fly";
        System.out.println("Penguins: "+goup+"\nDo the Penguins have feathers? "+ feathers+"\nDo the Penguins have ability to layEggs? "+ layEggs);

    }
}
