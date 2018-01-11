package com.example.hiepnk.viper.main;

/**
 * Created by hiepnk on 1/11/2018.
 */

public class MainPresenter implements MainContracts.Presenter {

        private MainContracts.View mView;

    public MainPresenter(MainContracts.View mView) {
        this.mView = mView;
    }
}
