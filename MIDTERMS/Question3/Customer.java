import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
