public class Client {
    public static void main(String[] args) {
        FastRice food = new FastRice();
        System.out.println(food.getPrice());
        System.out.println(food.getDesc());
        Egg eggFood = new Egg(food);
        System.out.println(eggFood.getDesc());
        System.out.println(eggFood.cost());
    }
}
