package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.3Wl  reason: invalid class name and case insensitive filesystem */
public final class C65753Wl extends C57972sH {
    public C65753Wl(Context context, Looper looper, C15650rc r10, C15670re r11, AnonymousClass4O1 r12) {
        super(context, looper, r10, r11, r12, 126);
    }

    public final /* synthetic */ IInterface A09(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return !(queryLocalInterface instanceof C109805Ts) ? new C92174h8(iBinder) : queryLocalInterface;
    }

    public final String A0A() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    public final String A0B() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    public final int ADl() {
        return 12451000;
    }
}
