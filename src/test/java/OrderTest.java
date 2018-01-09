import org.junit.Test;

import static org.junit.Assert.*;

public class OrderTest {
    @Test
    public void shouldReturnCostOnlyForMusicWithWrongCoupon() throws Exception {
        Order testParty = new Order(100, false, false, true, "7899");
        assertEquals("Should return 3500", 3500, testParty.calculateCost());

    }

    @Test
    public void shouldReturnCostOnlyForDrinksWithNoCoupon() throws Exception {
        Order testParty = new Order(100, false, true, false, "no");
        assertEquals("Should return 2500", 2500, testParty.calculateCost());
    }

    @Test
    public void shouldReturnCostOnlyForFoodWithNoCoupon() throws Exception {
        Order testParty = new Order(100, true, false, false, "no");
        assertEquals("Should return 1500", 1500, testParty.calculateCost());
    }

    @Test
    public void shouldReturnCostOnlyForDrinksAndMusicWithNoCoupon() throws Exception {
        Order testParty = new Order(100, false, true, true, "no");
        assertEquals("Should return 6000", 6000, testParty.calculateCost());
    }

    @Test
    public void shouldReturnCostOnlyForDrinksAndMusicWithCouponCode() throws Exception {
        Order testParty = new Order(100, false, true, true, "#B17");
        assertEquals("Should return 5945", 5945, testParty.calculateCost());
    }

    @Test
    public void shouldReturnCostOnlyForMusicWithNoCoupon10people() throws Exception {
        Order testParty = new Order(10, false, true, false, "no");
        assertEquals("Should return 250", 250, testParty.calculateCost());
    }

    @Test
    public void shouldReturnCostOnlyForMusicWithNoCoupon1person() throws Exception {
        Order testParty = new Order(1, false, true, false, "no");
        assertEquals("Should return 25", 25, testParty.calculateCost());
    }

    @Test
    public void shouldReturnCostOnlyForFoodNoMusicNoCoupon1person() throws Exception {
        Order testParty = new Order(1, true, false, false, "no");
        assertEquals("Should return 15", 15, testParty.calculateCost());
    }



}