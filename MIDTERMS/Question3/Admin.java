import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Admin extends User {
    public Admin(UserProfile profile) { super(profile); }
    public void updateVehicleDetails(int vehicleId, String details) {
        requireLogin();
        if (vehicleId <= 0 || details == null || details.trim().isEmpty())
            throw new IllegalArgumentException("Invalid vehicle details.");
        System.out.println("Updated vehicle " + vehicleId + ": " + details);
    }
    public String addVehicle(int vehicleId, String description) {
        requireLogin();
        if (vehicleId <= 0 || description == null || description.trim().isEmpty())
            throw new IllegalArgumentException("Invalid vehicle.");
        return "Vehicle{id=" + vehicleId + ", description='" + description + "'}";
    }
    public void retrieveComplain(String complaint) {
        requireLogin();
        System.out.println("Complaint retrieved: " + complaint);
    }
    public void verifyUser(Customer customer) {
        requireLogin();
        if (customer == null) throw new IllegalArgumentException("Customer is required.");
        System.out.println("Customer verification status: " + customer.getVerificationStatus());
    }
}
