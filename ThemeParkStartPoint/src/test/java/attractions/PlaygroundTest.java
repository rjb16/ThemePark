package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void visitorIsNotAllowedOnPlayground() {
        Visitor visitor = new Visitor(25, 1.70, 30.50);
        assertEquals(false, playground.isAllowedTo(visitor));
    }

    @Test
    public void visitorIsAllowedOnPlayground() {
        Visitor visitor = new Visitor(12, 1.70, 30.50);
        assertEquals(true, playground.isAllowedTo(visitor));
    }
}