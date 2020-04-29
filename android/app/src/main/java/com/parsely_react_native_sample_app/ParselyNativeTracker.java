//PUT YOUR PACKAGE HERE, IT'S THE SAME AS IN MainApplication.java
package com.parsely_react_native_sample_app;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.parsely.parselyandroid.ParselyMetadata;
import com.parsely.parselyandroid.ParselyTracker;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import java.util.Map;
import android.app.Activity;
import android.util.Log;

public class ParselyNativeTracker extends ReactContextBaseJavaModule {

    public ParselyNativeTracker(ReactApplicationContext reactContext) {

        super(reactContext);
    }

    @Override
    public String getName() {
        return "ParselyNativeTracker";
    }

    @ReactMethod
    public void pInit(String siteId) {
        final Activity activity = getCurrentActivity();
      ParselyTracker.sharedInstance(siteId, activity);
    }

    @ReactMethod
    public void trackPageView(@NonNull String url, @Nullable String urlRef, @Nullable ReadableMap urlMetadata, @Nullable ReadableMap extraData) {
        final Activity activity = getCurrentActivity();
        ParselyTracker.sharedInstance("elevatedtoday.com", activity).trackPageview(url, urlRef, urlMetadata, extraData);
    }

    @ReactMethod
    public void startEngagement(@NonNull String url) {
        final Activity activity = getCurrentActivity();
        ParselyTracker.sharedInstance("elevatedtoday.com", activity).startEngagement(url, null);
    }

    @ReactMethod
    public void stopEngagement() {
        final Activity activity = getCurrentActivity();
        ParselyTracker.sharedInstance("elevatedtoday.com", activity).stopEngagement();
    }
}

