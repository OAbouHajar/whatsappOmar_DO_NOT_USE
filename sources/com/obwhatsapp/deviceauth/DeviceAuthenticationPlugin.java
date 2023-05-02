package com.obwhatsapp.deviceauth;

import X.C003501o;
import X.C011405n;
import androidx.lifecycle.OnLifecycleEvent;

public abstract class DeviceAuthenticationPlugin implements C003501o {
    public abstract void A00();

    public abstract boolean A01();

    @OnLifecycleEvent(C011405n.ON_CREATE)
    public void onCreate() {
        if (A01()) {
            A00();
        }
    }
}
