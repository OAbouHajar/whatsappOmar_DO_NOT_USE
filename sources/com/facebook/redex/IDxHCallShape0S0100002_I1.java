package com.facebook.redex;

import X.AnonymousClass000;
import X.C12290k9;
import androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub;

public class IDxHCallShape0S0100002_I1 implements C12290k9 {
    public float A00;
    public float A01;
    public Object A02;
    public final int A03;

    public IDxHCallShape0S0100002_I1(RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub, float f2, float f3, int i2) {
        this.A03 = i2;
        this.A02 = remoteUtils$SurfaceCallbackStub;
        this.A00 = f2;
        this.A01 = f3;
    }

    public final Object A86() {
        throw AnonymousClass000.A0W(this.A03 != 0 ? "onScroll" : "onFling");
    }
}
