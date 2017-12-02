package com.example.ali.tddusingdatabinding;

/**
 * Created by ali on 02/12/17.
 */

public class LoginPresenter {
    private LoginInterface view;

    public LoginPresenter(LoginInterface view) {
        this.view = view;
    }

    public void onLogin(Property property) {
        String username = property.getUsername();
        String password = property.getPassword();
        String mUsername = "ali";
        String mPassword = "hutapea";
        if (username.isEmpty() && !password.isEmpty()) {
            view.showErrorNoUsername();
        } else if (!username.isEmpty() && password.isEmpty()) {
            view.showErrorNoPassword();
        } else if (!username.isEmpty() && !password.isEmpty()) {
            if (username.equals(mUsername) && password.equals(mPassword)) {
                view.showSuccessLogin();
            } else if (!username.equals(mUsername) && password.equals(mPassword)) {
                view.showWrongUsername();
            } else if (username.equals(mUsername) && !password.equals(mPassword)) {
                view.showWrongPassword();
            }
        } else if (username.isEmpty() && password.isEmpty()) {
            view.showErrorNoUsernamePassword();
        }
    }

}
