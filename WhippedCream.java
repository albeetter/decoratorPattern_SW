public class WhippedCream implements CoffeeDecorator {
    private final Coffee wrappedCoffee;

    public WhippedCream(Coffee wrappedCoffee) {
        this.wrappedCoffee = wrappedCoffee;
    }

    @Override
    public final String getDescription() {
        return wrappedCoffee.getDescription() + ", Whipped Cream";
    }

    @Override
    public final double getCost() {
        return wrappedCoffee.getCost() + 30.00;
    }

    @Override
    public final Coffee getWrappedCoffee() {
        return wrappedCoffee;
    }
}