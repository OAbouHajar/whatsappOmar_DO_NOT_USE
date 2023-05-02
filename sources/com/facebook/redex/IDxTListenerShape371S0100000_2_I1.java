package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass2Qx;
import X.AnonymousClass53K;
import X.C13680ns;
import X.C87374Wn;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import com.whatsapp.util.Log;

public class IDxTListenerShape371S0100000_2_I1 implements TextureView.SurfaceTextureListener {
    public Object A00;
    public final int A01;

    public IDxTListenerShape371S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (this.A01 != 0) {
            C87374Wn r2 = (C87374Wn) this.A00;
            AnonymousClass2Qx r0 = r2.A01;
            if (r0 != null) {
                r0.A06(surfaceTexture);
                r2.A01.A08(surfaceTexture, i2, i3);
                r2.A01.setCornerRadius(r2.A00);
                return;
            }
            return;
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass53K r1 = (AnonymousClass53K) this.A00;
        A0o.append("voip/video/TextureViewVideoPort/");
        A0o.append("/onSurfaceTextureAvailable port = ");
        A0o.append(r1.hashCode());
        C13680ns.A1V(A0o);
        r1.A04();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            AnonymousClass2Qx r0 = ((C87374Wn) obj).A01;
            if (r0 == null) {
                return true;
            }
            r0.A07(surfaceTexture);
            return true;
        }
        AnonymousClass53K r02 = (AnonymousClass53K) obj;
        r02.hashCode();
        r02.A03();
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (this.A01 != 0) {
            AnonymousClass2Qx r0 = ((C87374Wn) this.A00).A01;
            if (r0 != null) {
                r0.A08(surfaceTexture, i2, i3);
                return;
            }
            return;
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass53K r1 = (AnonymousClass53K) this.A00;
        A0o.append("voip/video/TextureViewVideoPort/");
        A0o.append("/surfaceTextureSizeChanged port = ");
        A0o.append(r1.hashCode());
        A0o.append(", size: ");
        A0o.append(i2);
        Log.i(C13680ns.A0i("x", A0o, i3));
        r1.A06(i2, i3);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
