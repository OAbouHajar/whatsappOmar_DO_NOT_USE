package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.3Wm  reason: invalid class name and case insensitive filesystem */
public final class C65763Wm extends C57972sH {
    public C65763Wm(Context context, Looper looper, C15650rc r10, C15670re r11, AnonymousClass4O1 r12) {
        super(context, looper, r10, r11, r12, 40);
    }

    public final /* synthetic */ IInterface A09(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        return !(queryLocalInterface instanceof C109855Tx) ? new C92184h9(iBinder) : queryLocalInterface;
    }

    public final String A0A() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    public final String A0B() {
        return "com.google.android.gms.clearcut.service.START";
    }

    public final int ADl() {
        return 11925000;
    }
}
