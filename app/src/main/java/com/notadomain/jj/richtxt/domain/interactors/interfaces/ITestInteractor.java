package com.notadomain.jj.richtxt.domain.interactors.interfaces;

/**
 * Created by Jay on 11/4/2017.
 */

public interface ITestInteractor {
    void run();

    interface Callback{
        void returnData();
    }
}
