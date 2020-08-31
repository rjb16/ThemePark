package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void visitorIsAllowedOnRollerCoaster() {
        Visitor visitor = new Visitor(18, 1.80, 60.00);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorHasNotHeightForRollerCoaster() {
        Visitor visitor = new Visitor(18, 1.30, 60.00);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void visitorHasNotAgeForRollerCoaster() {
        Visitor visitor = new Visitor(11, 1.50, 60.00);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void priceForVisitor() {
        Visitor visitor = new Visitor(11, 1.50, 60.00);
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.01);
    }

    @Test
    public void priceForTallVisitor() {
        Visitor visitor = new Visitor(11, 2.10, 60.00);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.01);
    }
}