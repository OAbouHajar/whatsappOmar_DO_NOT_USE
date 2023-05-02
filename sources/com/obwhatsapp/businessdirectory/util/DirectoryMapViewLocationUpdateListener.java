package com.obwhatsapp.businessdirectory.util;

import X.AnonymousClass013;
import X.AnonymousClass027;
import X.AnonymousClass16R;
import X.C003501o;
import X.C011405n;
import X.C14870pt;
import X.C16320sq;
import X.C16980tz;
import X.C18450wi;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.lifecycle.OnLifecycleEvent;

public final class DirectoryMapViewLocationUpdateListener implements LocationListener, C003501o {
    public final AnonymousClass027 A00 = new AnonymousClass027();
    public final AnonymousClass16R A01;
    public final C14870pt A02;
    public final C16980tz A03;
    public final AnonymousClass013 A04;
    public final C16320sq A05;

    public DirectoryMapViewLocationUpdateListener(AnonymousClass16R r2, C14870pt r3, C16980tz r4, AnonymousClass013 r5, C16320sq r6) {
        C18450wi.A0H(r3, 1);
        C18450wi.A0H(r4, 2);
        C18450wi.A0H(r6, 3);
        C18450wi.A0H(r5, 4);
        C18450wi.A0H(r2, 5);
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A01 = r2;
    }

    @OnLifecycleEvent(C011405n.ON_RESUME)
    private final void connectListener() {
        this.A01.A05(this, "directory_map_view_business_search", 0.0f, 3, 5000, 1000);
    }

    @OnLifecycleEvent(C011405n.ON_PAUSE)
    private final void disconnectListener() {
        this.A01.A04(this);
    }

    public final void A00() {
        disconnectListener();
        connectListener();
    }

    public void onLocationChanged(Location location) {
        C18450wi.A0H(location, 0);
        C16320sq r6 = this.A05;
        C16980tz r4 = this.A03;
        LocationUpdateListener.A00(location, this.A00, this.A02, r4, this.A04, r6);
    }

    public void onStatusChanged(String str, int i2, Bundle bundle) {
    }
}
