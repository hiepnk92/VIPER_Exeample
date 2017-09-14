package com.example.hiepnk.viper.login;

import android.app.Activity;

/**
 * Created by hiepnk on 9/11/2017.
 */

public class LoginPresenter implements LoginContracts.Presenter, LoginContracts.InteractorResult {

    private LoginContracts.View mView;
    private LoginContracts.Interactor interactor;
    private LoginContracts.Router router;

    public LoginPresenter( LoginContracts.View loginView) {
        this.mView = loginView;
        interactor = new LoginInteractor(this);
        router = new LoginRouter((Activity) mView);
    }

    @Override
    public void onLoginButtonClicked(String username, String password) {
        interactor.login(username, password);

    }

    @Override
    public void onLoginSuccess(User user) {
        router.presentHomeScreen(user);

    }

    @Override
    public void onLoginError(String messeage) {
        mView.showError(messeage);

    }
}
