package com.example.hiepnk.viper.login;

import android.app.Activity;
import android.content.Intent;

import com.example.hiepnk.viper.main.MainActivity;

/**
 * Created by hiepnk on 9/11/2017.
 */

public class LoginRouter implements LoginContracts.Router {
    private Activity activity;

    public LoginRouter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void unregister() {
        activity=null;

    }

    @Override
    public void presentHomeScreen(User user) {
        Intent intent = new Intent(activity, MainActivity.class);
        intent.putExtra("name", user.getUsername());
        intent.putExtra("pass", user.getPassWord());
        activity.startActivity(intent);

    }
}
