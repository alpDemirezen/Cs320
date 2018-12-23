import org.junit.Test;
import static org.junit.Assert.*;

public class deneme {

    @Test
    public void testZeroArgumentConstructor() {
        Apartment apartment = new Apartment("For Sale", 600000, 180, "Cekmekoy", "Apartment");
        assertEquals("For Sale", apartment.saleType);
    }

}
