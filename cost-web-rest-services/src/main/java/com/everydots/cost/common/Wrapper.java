package com.everydots.cost.common;

import com.everydots.cost.beans.SuccessResult;

public class Wrapper {

    public static Object wrapperSuccess(Object result){
        return new SuccessResult(result);
    }
}
