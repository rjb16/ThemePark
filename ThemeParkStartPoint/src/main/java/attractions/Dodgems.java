package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements IReviewed, ITicketed {

    private double price;

    public Dodgems(String name, int rating) {

        super(name, rating);
        this.price = 4.50;
    }

    @Override
    public double defaultPrice() {
        return this.price;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getAge() < 12) {
            return this.price / 2;
        } else {
            return this.defaultPrice();
        }
    }
}