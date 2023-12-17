package org.example.password;

import org.example.password.PasswordGenerator;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {

        // as-is (내부에서 생성하는 경우는 강한 결합(의존))
        // RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();

        // to-be (상위에 인터페이스통해 결합을 낮춘다)
        String password = passwordGenerator.generatePassword();

        /**
         * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */
        if(password.length() >= 8 && password.length() <= 12) {
            this.password = password;
        }

    }

    public String getPassword() {
        return password;
    }
}
