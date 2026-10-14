import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
