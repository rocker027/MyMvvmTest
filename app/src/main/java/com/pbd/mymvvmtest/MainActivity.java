package com.pbd.mymvvmtest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pbd.mymvvmtest.databinding.ActivityMainDataBinding;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 對應activity_main data class ， DataBindingUtil是本身開啟databinding則可以引入
        ActivityMainDataBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        // new MainActivityViewModel
        MainActivityViewModel viewModel = new MainActivityViewModel("請輸入Email","請輸入密碼");
        dataBinding.setViewmodel(viewModel);
    }
}
