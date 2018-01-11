package com.example.hiepnk.viper.login;

import android.media.AudioManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hiepnk.viper.*;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by hiepnk on 9/11/2017.
 */

public class LoginActivity extends AppCompatActivity implements LoginContracts.View {


    private static final String TAG = "LoginActivity";
    private LoginContracts.Presenter mPresenter;
    private Button btnlogin;
    private EditText edtMail,edtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mPresenter = new LoginPresenter(this);


        edtMail = (EditText) findViewById(R.id.login_emailid);
        edtPass = (EditText) findViewById(R.id.login_password);
        btnlogin = (Button) findViewById(R.id.loginBtn);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.onLoginButtonClicked(edtMail.getText().toString().trim(),edtPass.getText().toString().trim());



            }
        });


        final Observer<String> observer =new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
                Log.e(TAG, "onSubscribe = " + Thread.currentThread().getName());
            }

            @Override
            public void onNext(String value) {
                Log.e(TAG, "onNext: " + value + Thread.currentThread().getName());

//                MediaPlayer mediaPlayer = new MediaPlayer();
//                mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
//                mediaPlayer.setDataSource(url);
//                mediaPlayer.prepare(); // might take long! (for buffering, etc)
//                mediaPlayer.start();
            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG, "onError: ");
            }

            @Override
            public void onComplete() {
                Log.e(TAG, "onComplete: All Done!" + Thread.currentThread().getName());

            }
        };

//        Observable.just("1","2","3").subscribeOn(Schedulers.newThread()).subscribe(observer);



    }

    @Override
    public void showError(String messeage) {
        Toast.makeText(this,messeage,Toast.LENGTH_LONG).show();

    }


}
