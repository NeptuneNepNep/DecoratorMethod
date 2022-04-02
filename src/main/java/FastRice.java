public class FastRice extends Decorator{
    public FastRice() {
        super(12,"炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
