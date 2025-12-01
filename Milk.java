public class Milk implements CoffeeDecorator {
    private final Coffee wrappedCoffee;

    public Milk(Coffee wrappedCoffee) {
        this.wrappedCoffee = wrappedCoffee;
    }

    @Override
    public final String getDescription() {
        return wrappedCoffee.getDescription() + ", Milk";
    }

    @Override
    public final double getCost() {
        return wrappedCoffee.getCost() + 25.00;
    }

    @Override
    public final Coffee getWrappedCoffee() {
        return wrappedCoffee;
    }
}
