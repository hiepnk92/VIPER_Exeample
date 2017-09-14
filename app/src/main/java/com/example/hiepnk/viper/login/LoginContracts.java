package com.example.hiepnk.viper.login;

/**
 * Created by hiepnk on 9/11/2017.
 */

public class LoginContracts {

    interface View {
/*
        display error if login fail
*/
        void showError(String messeage);
    }

    interface Presenter {

        /* event click button login
                 send request from View to Presenter*/
        void onLoginButtonClicked(String username, String password);
    }

    interface Interactor {
        /* event click button login
                 send data from Presenter to Interactor to validate*/
        void login(String username, String password);

    }

    interface InteractorResult {
/*
        after validate,Interactor send result to Presenter
*/
        void onLoginSuccess(User user);
        void onLoginError(String messeage);
    }

    interface Router {
/*
        Handles routing to other views in the app
*/
        void presentHomeScreen(User user);
    }
}
