package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.3Wt  reason: invalid class name and case insensitive filesystem */
public final class C65833Wt extends C57972sH {
    public final C97834qe A00;

    public C65833Wt(Context context, Looper looper, C15660rd r10, C15680rf r11, AnonymousClass4O1 r12, C97834qe r13) {
        super(context, looper, r10, r11, r12, 270);
        this.A00 = r13;
    }

    public final boolean A05() {
        return true;
    }

    public final AnonymousClass3Y2[] A07() {
        return AnonymousClass4AU.A01;
    }

    public final Bundle A08() {
        return C13690nt.A0D();
    }

    public final /* synthetic */ IInterface A09(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return !(queryLocalInterface instanceof C66283Yt) ? new C66283Yt(iBinder) : queryLocalInterface;
    }

    public final String A0A() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    public final String A0B() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    public final int ADl() {
        return 203400000;
    }
}
