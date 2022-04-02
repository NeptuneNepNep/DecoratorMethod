public abstract class Garnish extends Decorator{
    public Decorator getFastFood() {
        return fastFood;
    }

    public void setFastFood(Decorator fastFood) {
        this.fastFood = fastFood;
    }

    private Decorator fastFood;


    public Garnish(float price, String desc, Decorator fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }

}
