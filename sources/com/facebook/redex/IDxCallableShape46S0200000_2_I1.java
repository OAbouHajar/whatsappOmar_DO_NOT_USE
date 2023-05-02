package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass4V1;
import X.AnonymousClass53K;
import X.C90194dg;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.concurrent.Callable;

public class IDxCallableShape46S0200000_2_I1 implements Callable {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCallableShape46S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final Object call() {
        int i2;
        C90194dg A002;
        if (this.A02 != 0) {
            AnonymousClass4V1 r1 = (AnonymousClass4V1) this.A01;
            C90194dg r0 = ((AnonymousClass53K) this.A00).A03;
            if (r0 == null || !r0.A0B()) {
                i2 = -6;
                return Integer.valueOf(i2);
            }
            r1.A00();
        } else {
            AnonymousClass53K r4 = (AnonymousClass53K) this.A00;
            Object obj = this.A01;
            if (r4.A03 == null) {
                if ((obj instanceof Surface) || (obj instanceof SurfaceTexture)) {
                    try {
                        if (r4.A0B) {
                            A002 = C90194dg.A00(C90194dg.A00);
                            AnonymousClass00B.A06(A002);
                        } else {
                            A002 = C90194dg.A00(C90194dg.A01);
                            AnonymousClass00B.A06(A002);
                        }
                        r4.A03 = A002;
                        if (!r4.A07(obj)) {
                            i2 = -5;
                        } else {
                            GlVideoRenderer glVideoRenderer = r4.A08;
                            if (!glVideoRenderer.init(29, 0)) {
                                r4.A05();
                                i2 = -2;
                            } else {
                                glVideoRenderer.setWindow(0, 0, r4.A03.A04(), r4.A03.A03());
                            }
                        }
                    } catch (Exception e2) {
                        Log.e((Throwable) e2);
                        r4.A05();
                        i2 = -5;
                    }
                    return Integer.valueOf(i2);
                }
                throw AnonymousClass000.A0V("Input must be either a Surface or SurfaceTexture");
            }
        }
        i2 = 0;
        return Integer.valueOf(i2);
    }
}
