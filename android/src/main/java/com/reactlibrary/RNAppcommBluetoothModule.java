
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;

public class RNAppcommBluetoothModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNAppcommBluetoothModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNAppcommBluetooth";
  }

  @ReactMethod
  public void isAvailable(final Promise promise) {
    try {
      promise.resolve("LOO HONG CHAI");
    } catch (Exception ex) {
      promise.reject("ERR_UNEXPECTED_EXCEPTION", ex);
    }
  }
}