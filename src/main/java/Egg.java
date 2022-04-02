public class Egg extends Garnish{

    public Egg(Decorator fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    @Override
    public float cost() {
        return getPrice()+getFastFood().cost();
    }
    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();

    }
}
