package org.example.password;

import org.example.password.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {
    public String generatePassword() {
        return "abcdefgh"; // 8글자
    }
}
