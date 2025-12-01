public class CaramelSyrup implements CoffeeDecorator {
    private final Coffee wrappedCoffee;

    public CaramelSyrup(Coffee wrappedCoffee) {
        this.wrappedCoffee = wrappedCoffee;
    }

    @Override
    public final String getDescription() {
        return wrappedCoffee.getDescription() + ", Caramel Syrup";
    }

    @Override
    public final double getCost() {
        return wrappedCoffee.getCost() + 40.00;
    }

    @Override
    public final Coffee getWrappedCoffee() {
        return wrappedCoffee;
    }
}
