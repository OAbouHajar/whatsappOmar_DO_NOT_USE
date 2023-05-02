package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass0Y7;
import X.C12290k9;
import android.graphics.Rect;
import androidx.car.app.utils.RemoteUtils$SurfaceCallbackStub;

public class IDxHCallShape76S0200000_I1 implements C12290k9 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxHCallShape76S0200000_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final Object A86() {
        int i2 = this.A02;
        RemoteUtils$SurfaceCallbackStub remoteUtils$SurfaceCallbackStub = (RemoteUtils$SurfaceCallbackStub) this.A00;
        Object obj = this.A01;
        switch (i2) {
            case 0:
                RemoteUtils$SurfaceCallbackStub.m5$r8$lambda$Us3aqspNPssoqTo05TqqsVHIzE(remoteUtils$SurfaceCallbackStub, (Rect) obj);
                break;
            case 1:
                RemoteUtils$SurfaceCallbackStub.$r8$lambda$agkemRv7pRP3C6NQN9BVj2kcidA(remoteUtils$SurfaceCallbackStub, (Rect) obj);
                break;
            case 2:
                RemoteUtils$SurfaceCallbackStub.$r8$lambda$OZtEIqNp19Tbq1qCTePWz81Lfjw(remoteUtils$SurfaceCallbackStub, (AnonymousClass0Y7) obj);
                break;
            default:
                RemoteUtils$SurfaceCallbackStub.$r8$lambda$RGBhsjx_1J8NWgBb4N8Ae6NrbZk(remoteUtils$SurfaceCallbackStub, (AnonymousClass0Y7) obj);
                break;
        }
        throw AnonymousClass000.A0Z();
    }
}
