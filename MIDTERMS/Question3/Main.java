import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class UserProfile {
    private final int userId;
    private String password;
    private String name;
    private int age;
    private String emailId;
    private final List<String> documents = new ArrayList<>();

    public UserProfile(int userId, String password, String name, int age, String emailId) {
        if (userId <= 0 || password == null || password.isEmpty())
            throw new IllegalArgumentException("User ID and password are required.");
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
    }
    public int getUserId() { return userId; }
    public String getPassword() { return password; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return emailId; }
    public void editProfile(String name, int age, String emailId) {
        if (name == null || name.trim().isEmpty() || age < 0 || emailId == null || !emailId.contains("@"))
            throw new IllegalArgumentException("Invalid profile data.");
        this.name = name; this.age = age; this.emailId = emailId;
    }
    public void addDocument(String document) {
        if (document == null || !(document.endsWith(".jpg") || document.endsWith(".png") || document.endsWith(".pdf")))
            throw new IllegalArgumentException("Only JPG, PNG, and PDF documents are accepted.");
        documents.add(document);
    }
    public List<String> showDocuments() { return Collections.unmodifiableList(documents); }
    public void changePassword(String newPassword) {
        if (newPassword == null || newPassword.length() < 8)
            throw new IllegalArgumentException("Password must contain at least 8 characters.");
        password = newPassword;
    }
}

class User {
    private final UserProfile profile;
    private boolean loggedIn;
    public User(UserProfile profile) { this.profile = profile; }
    public UserProfile getProfile() { return profile; }
    public boolean logIn(int userId, String password) {
        loggedIn = profile.getUserId() == userId && profile.getPassword().equals(password);
        return loggedIn;
    }
    public void recoverPassword(String newPassword) { profile.changePassword(newPassword); }
    public void logOut() { loggedIn = false; }
    protected void requireLogin() {
        if (!loggedIn) throw new IllegalStateException("Please log in first.");
    }
}

class Customer extends User {
    private boolean verificationStatus = false;
    public Customer(UserProfile profile) { super(profile); }
    public boolean getVerificationStatus() { return verificationStatus; }
    public void applyVerification(String document) {
        requireLogin();
        getProfile().addDocument(document);
        verificationStatus = true;
    }
}

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

public class Main {
    public static void main(String[] args) {
        UserProfile customerProfile = new UserProfile(101, "customer123", "Alya", 20, "alya@example.com");
        Customer customer = new Customer(customerProfile);
        System.out.println("Customer login: " + customer.logIn(101, "customer123"));
        customer.applyVerification("identity.pdf");
        System.out.println("Verification status: " + customer.getVerificationStatus());
        System.out.println("Documents: " + customerProfile.showDocuments());
        customer.logOut();

        UserProfile adminProfile = new UserProfile(1, "adminpass123", "Admin One", 30, "admin@example.com");
        Admin admin = new Admin(adminProfile);
        System.out.println("Admin login: " + admin.logIn(1, "adminpass123"));
        admin.updateVehicleDetails(5001, "Blue sedan, available");
        System.out.println(admin.addVehicle(5002, "Electric scooter"));
        admin.retrieveComplain("Vehicle arrived late");
        admin.verifyUser(customer);
        admin.logOut();
    }
}
