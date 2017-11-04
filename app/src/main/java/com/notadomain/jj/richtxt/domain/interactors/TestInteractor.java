package com.notadomain.jj.richtxt.domain.interactors;

import com.notadomain.jj.richtxt.domain.interactors.interfaces.ITestInteractor;

/**
 * Created by Jay on 11/4/2017.
 */

public class TestInteractor implements ITestInteractor {

    private ITestInteractor.Callback callback;


    public TestInteractor(ITestInteractor.Callback callback){
        this.callback = callback;
    }

    @Override
    public void run() {
        //Method executes its logic then uses callback to return data
        //E.g. calls network for data then returns data through returnData()

        callback.returnData();
    }
}
