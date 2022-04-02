public class Client {
    public static void main(String[] args) {
        FastRice food = new FastRice();
        System.out.println(food.getPrice());
        System.out.println(food.getDesc());
        Garnish eggFood = new Egg(food);
        Garnish baconEggFood = new Bacon(eggFood);
        System.out.println(eggFood.getDesc());
        System.out.println(eggFood.cost());
        System.out.println(baconEggFood.getDesc());
        System.out.println(baconEggFood.getPrice());
    }
}
