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
