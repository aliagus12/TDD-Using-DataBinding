package com.example.ali.tddusingdatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.ali.tddusingdatabinding.databinding.MainActivityBinding;


public class LoginModel extends AppCompatActivity implements LoginInterface {

    private LoginPresenter presenter;
    private MainActivityBinding dataBinding;
    private Property property;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dataBinding = DataBindingUtil.setContentView(this, R.layout.main_activity);
        property = new Property("", "");
        presenter = new LoginPresenter(this);
        dataBinding.setPresenter(presenter);
        dataBinding.setProperty(property);
    }

    @Override
    public void showErrorNoUsername() {
        Toast.makeText(this, "no Username", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showErrorNoPassword() {
        Toast.makeText(this, "no Password", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSuccessLogin() {
        Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showErrorNoUsernamePassword() {
        Toast.makeText(this, "no Username and Password", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showWrongUsername() {
        Toast.makeText(this, "wrong Username", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showWrongPassword() {
        Toast.makeText(this, "wrong Password", Toast.LENGTH_SHORT).show();
    }
}
