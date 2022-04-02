public class FastNoddles extends Decorator{
    public FastNoddles() {
        super(10,"炒饭");
    }
    @Override
    public float cost() {
        return getPrice();
    }
}
