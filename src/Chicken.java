public class Chicken extends NonFlyingBird {
    @Override
    public void fly() {
        String goup = "they can not  fly";
        System.out.println("Chickens: "+goup+"\nDo the Chickens have feathers? "+ feathers+"\nDo the Chickens have ability to layEggs? "+ layEggs);


    }
}
