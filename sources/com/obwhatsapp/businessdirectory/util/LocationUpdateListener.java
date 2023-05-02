package com.obwhatsapp.businessdirectory.util;

import X.AnonymousClass013;
import X.AnonymousClass027;
import X.AnonymousClass16R;
import X.C003501o;
import X.C011405n;
import X.C14870pt;
import X.C16320sq;
import X.C16980tz;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.redex.RunnableRunnableShape1S0500000_I1;

public class LocationUpdateListener implements LocationListener, C003501o {
    public final AnonymousClass027 A00 = new AnonymousClass027();
    public final AnonymousClass16R A01;
    public final C14870pt A02;
    public final C16980tz A03;
    public final AnonymousClass013 A04;
    public final C16320sq A05;

    public LocationUpdateListener(AnonymousClass16R r2, C14870pt r3, C16980tz r4, AnonymousClass013 r5, C16320sq r6) {
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A01 = r2;
    }

    public static void A00(Location location, AnonymousClass027 r8, C14870pt r9, C16980tz r10, AnonymousClass013 r11, C16320sq r12) {
        r12.Acl(new RunnableRunnableShape1S0500000_I1(r8, r10, location, r11, r9, 2));
    }

    @OnLifecycleEvent(C011405n.ON_RESUME)
    private void connectListener() {
        this.A01.A05(this, "user-location-picker", 800.0f, 3, 1000, 1000);
    }

    @OnLifecycleEvent(C011405n.ON_PAUSE)
    private void disconnectListener() {
        this.A01.A04(this);
    }

    public void A01() {
        disconnectListener();
        connectListener();
    }

    public void onLocationChanged(Location location) {
        C16320sq r5 = this.A05;
        C16980tz r3 = this.A03;
        Location location2 = location;
        A00(location2, this.A00, this.A02, r3, this.A04, r5);
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i2, Bundle bundle) {
    }
}
