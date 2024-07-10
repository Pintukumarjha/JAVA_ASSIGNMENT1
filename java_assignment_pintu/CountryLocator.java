import java.util.HashMap;
import java.util.Map;

public class CountryLocator {
   
    // Static map to simulate country boundaries (for illustration purposes)
    private static final Map<String, String> COUNTRY_BOUNDARIES = new HashMap<>();
   
    static {
        // Populate the map with latitude, longitude ranges for each country
        // Example data (not real boundaries)
        COUNTRY_BOUNDARIES.put("US", "39.8,-119.2,33.8,-84.6"); // Example coordinates for the USA
        COUNTRY_BOUNDARIES.put("IN", "35.5,68.1,6.7,97.4");    // Example coordinates for India
        // Add more countries as needed
    }
   
    public String getCountryCode(double latitude, double longitude) {
        // Iterate through the country boundaries map and check where the given coordinates lie
        for (Map.Entry<String, String> entry : COUNTRY_BOUNDARIES.entrySet()) {
            String countryCode = entry.getKey();
            String boundaryCoordinates = entry.getValue();
            if (isInBoundary(latitude, longitude, boundaryCoordinates)) {
                return countryCode;
            }
        }
        // Return null or throw exception if coordinates don't match any country
        return null;
    }
   
    // Helper method to check if given coordinates are within the boundary of a country
    private boolean isInBoundary(double latitude, double longitude, String boundaryCoordinates) {
        // Implement logic to parse boundaryCoordinates and check if latitude, longitude fall within the range
        // Example logic (pseudo-code):
        // Parse boundaryCoordinates into minLat, maxLat, minLong, maxLong
        // if (latitude >= minLat && latitude <= maxLat && longitude >= minLong && longitude <= maxLong) return true;
        return false;
    }
}