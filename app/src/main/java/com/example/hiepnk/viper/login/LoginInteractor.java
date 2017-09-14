package com.example.hiepnk.viper.login;

/**
 * Created by hiepnk on 9/11/2017.
 */

public class LoginInteractor implements LoginContracts.Interactor {


    private LoginContracts.InteractorResult interactorResult;

    public LoginInteractor(LoginContracts.InteractorResult interactorResult) {
        this.interactorResult = interactorResult;
    }

    @Override
    public void login(String username, String password) {
        if (username.isEmpty() || password.isEmpty()){
            interactorResult.onLoginError("Lỗi cmnr");
        }else {
            User user =new User(username,password);
            interactorResult.onLoginSuccess(user);
        }

    }
}
