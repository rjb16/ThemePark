package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 2);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void visitorCanBuyTobacco() {
        Visitor visitor = new Visitor(30, 1.87, 80.00);
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void visitorCannotBuyTobacco() {
        Visitor visitor = new Visitor(10, 1.87, 80.00);
        assertEquals(false, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void hasRating() {
        assertEquals(2, tobaccoStall.getRating());
    }

}