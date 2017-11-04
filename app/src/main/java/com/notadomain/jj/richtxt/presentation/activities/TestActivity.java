package com.notadomain.jj.richtxt.presentation.activities;

/**
 * Created by Jay on 11/4/2017.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.notadomain.jj.richtxt.R;
import com.notadomain.jj.richtxt.presentation.presenters.TestPresenter;

public class TestActivity extends AppCompatActivity implements TestPresenter.View{

    private TestPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        mPresenter.methodFromActivity(); //Calls presenter method to create interactor

    }

    @Override
    public void testMethod1(){
        //Using data from domain callbacks, updates the activity from TestPresenter's call
    }
}
