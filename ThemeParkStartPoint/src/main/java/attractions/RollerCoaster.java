package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, IReviewed, ITicketed {

    private double price;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.40;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() >= 12 && visitor.getHeight() >= 1.45);
    }

    @Override
    public double defaultPrice() {
        return this.price;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 2.00) {
            return this.price * 2;
        } else {
            return this.defaultPrice();
        }
    }
}