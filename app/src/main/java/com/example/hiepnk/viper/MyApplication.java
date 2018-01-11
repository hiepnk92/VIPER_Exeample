package com.example.hiepnk.viper;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by hiepnk on 1/11/2018.
 */

public class MyApplication extends Application {

    private Realm realmSherlockholmes;

    @Override
    public void onCreate() {
        super.onCreate();

        RealmConfiguration config = new RealmConfiguration.Builder()
                .assetFile("sherlockholmes.db") // e.g "default.realm" or "lib/data.realm"
                .deleteRealmIfMigrationNeeded()
                .build();
        realmSherlockholmes = Realm.getInstance(config);
    }

    public Realm getRealmSherlockholmes() {
        return realmSherlockholmes;
    }
}
