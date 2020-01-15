package com.example.lding.learnmvp.libding.rerxmvp.model;

import com.example.lding.learnmvp.libding.entity.GetListRsp;
import com.example.lding.learnmvp.libding.http.manager.RetrofitManager;
import com.example.lding.learnmvp.libding.rerxmvp.interfaceUtils.interfaceUtilsAll;

import java.util.Map;
import rx.Subscriber;

public class MainModel implements interfaceUtilsAll.BaseModel {
    @Override
    public void getGetListRsp(Subscriber<GetListRsp> subscriber, Map<String, String> params) {
        RetrofitManager.getInstance().getGetListRsp(subscriber,params);
    }
}
