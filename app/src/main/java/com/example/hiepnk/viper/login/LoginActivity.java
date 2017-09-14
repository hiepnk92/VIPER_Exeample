package com.example.hiepnk.viper.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.hiepnk.viper.*;


/**
 * Created by hiepnk on 9/11/2017.
 */

public class LoginActivity extends AppCompatActivity implements LoginContracts.View {


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



    }

    @Override
    public void showError(String messeage) {
        Toast.makeText(this,messeage,Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter!=null)
        mPresenter.onUnsubcribe();
    }
}
