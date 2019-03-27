package com.example.parseogren;

import android.app.Application;

import com.parse.Parse;

//https://parseplatform.org  //parse ile kendi serverimiida kurabiliri

//https://www.back4app.com  server için arayüz

public class ParseStarterClass extends Application {
    //Parse baslatıcı sınıf
    //Parse bir servis tir
    //online suncuda tutulan bilgileri uygulamaya aracı oluyor
    //aşağıdada sunucu ile uygulama baglama ayarları yapılıyor
    @Override
    public void onCreate() {
        super.onCreate();

        //parsein logcatte hataları vermesi
        //set log level
        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("parse sitesini verdigi kendi app keyinizi giriniz")
                .clientKey("kendi client keyinizi giriniz")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
