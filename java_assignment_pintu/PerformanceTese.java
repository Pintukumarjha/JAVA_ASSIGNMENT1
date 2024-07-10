public class PerformanceTest {

    public static void main(String[] args) {
        CountryLocator locator = new CountryLocator();
        int requestsPerSecond = 100;
        long totalExecutionTime = 0;
        int numRequests = 1000; // Total number of requests to simulate

        for (int i = 0; i < numRequests; i++) {
            long startTime = System.currentTimeMillis();
            locator.getCountryCode(37.7749, -122.4194); // Example coordinates for San Francisco
            long endTime = System.currentTimeMillis();
            totalExecutionTime += (endTime - startTime);
           
            // Simulate 100 requests per second
            try {
                Thread.sleep(1000 / requestsPerSecond);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Calculate average execution time
        double avgExecutionTime = (double) totalExecutionTime / numRequests;
        System.out.println("Average execution time per request: " + avgExecutionTime + " ms");
    }
}
