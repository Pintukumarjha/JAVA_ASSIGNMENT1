import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CountryLocatorTest {

    @Test
    void testGetCountryCode() {
        CountryLocator locator = new CountryLocator();
       
        // Test cases with known coordinates and expected country codes
        assertEquals("US", locator.getCountryCode(37.7749, -122.4194)); // San Francisco coordinates
        assertEquals("IN", locator.getCountryCode(28.6139, 77.2090)); // New Delhi coordinates
        // Add more test cases as needed for other countries
    }
}
