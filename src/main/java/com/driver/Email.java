package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        boolean flagUp = false, flagLow = false, flagDig = false, flagSpcl = false;
        if (this.password.equals(oldPassword)){
            if (newPassword.length() >= 8){
                for (int i=0; i<newPassword.length(); i++){
                    char chr = newPassword.charAt(i);
                    if (chr >= 65 && chr <= 90){
                        flagUp = true;
                    }
                    else if (chr >= 97 && chr <= 122){
                        flagLow = true;
                    }
                    else if (chr >= 48 && chr <=57){
                        flagDig = true;
                    }
                    else{
                        flagSpcl = true;
                    }
                    if (flagUp && flagLow && flagDig && flagSpcl){
                        this.password = newPassword;
                        break;
                    }
                }
            }
        }
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
    }
}
