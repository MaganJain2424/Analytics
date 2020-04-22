package com.walmart.analyticslibrary;

import android.content.Context;
import android.os.Bundle;

import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.iid.FirebaseInstanceId;

public class LogUtils  {

    Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void InitlizaeAnalyticsLibrary(Context context) {
            this.context = context;
        FirebaseApp.initializeApp(context);
    }

    public String getData() {
        return "ReaCHING HERE";
    }

    public FirebaseInstanceId getFirebaseInstanceId() {
        return FirebaseInstanceId.getInstance();
    }

    public void sendAddToCart() {
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "12345");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Nougat");
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "Image");
        bundle.putString(FirebaseAnalytics.Param.CURRENCY, "THB");
        bundle.putString(FirebaseAnalytics.Param.TRANSACTION_ID, "111");
        bundle.putString(FirebaseAnalytics.Param.VALUE, "300");
        FirebaseAnalytics.getInstance(this.context).logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
    }
}
