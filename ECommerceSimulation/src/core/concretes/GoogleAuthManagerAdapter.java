package core.concretes;

import core.abstracts.AuthService;
import googleAuthService.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {
    @Override
    public boolean isValidUser() {
        return new GoogleAuthManager().isValidGoogleUser();
    }
}
