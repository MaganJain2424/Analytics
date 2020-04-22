package com.walmart.analyticslibrary;

import android.content.Context;

import com.google.firebase.FirebaseApp;
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





}
