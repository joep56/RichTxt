package com.notadomain.jj.richtxt.presentation.presenters;

import com.notadomain.jj.richtxt.domain.interactors.TestInteractor;
import com.notadomain.jj.richtxt.domain.interactors.interfaces.ITestInteractor;
import com.notadomain.jj.richtxt.presentation.presenters.interfaces.ITestPresenter;

/**
 * Created by Jay on 11/4/2017.
 */


public class TestPresenter implements ITestPresenter, ITestInteractor.Callback {
    private TestPresenter.View mView;

    public TestPresenter(View view){
        mView = view;
    }

    public void returnData() {
        //Method used in interactor to return data to presentation layer
        mView.testMethod1();
    }

    @Override
    public void methodFromActivity() {
        //Method from Activity call
        //Creates interactor
        TestInteractor interactor = new TestInteractor(this);
        interactor.run();
    }
}
