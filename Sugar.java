public class Sugar implements CoffeeDecorator {
    private final Coffee wrappedCoffee;

    public Sugar(Coffee wrappedCoffee) {
        this.wrappedCoffee = wrappedCoffee;
    }

    @Override
    public final String getDescription() {
        return wrappedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public final double getCost() {
        return wrappedCoffee.getCost() + 10.00;
    }

    @Override
    public final Coffee getWrappedCoffee() {
        return wrappedCoffee;
    }
}