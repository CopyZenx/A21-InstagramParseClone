package com.musayilmaz.instagramparseclone;

import android.app.Application;

import com.parse.Parse;

public class ParseStarterActivity extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.setLogLevel(Parse.LOG_LEVEL_DEBUG);

        Parse.initialize(new Parse.Configuration.Builder(this)
        .applicationId("EcOxQO6R9TJudYKbGXWIF8rhY5nGNjwlFsgzvOYE")
        .clientKey("8QjcwnezetP5cN7A9FBjDwV7fJiItBrC6iUOJBEx")
        .server("https://parseapi.back4app.com/")
        .build()
        );

    }
}
