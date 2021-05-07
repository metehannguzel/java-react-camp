package core.concretes;

import core.abstracts.EmailService;

public class EmailManager implements EmailService {
    @Override
    public void sendVerificationEmail(String message) {
        System.out.println("Verification email has been sent to the user : " + message);
        System.out.println("Email --> Please click on this link to verify your account : " + "www.verifyyouraccount.com");
    }
}
