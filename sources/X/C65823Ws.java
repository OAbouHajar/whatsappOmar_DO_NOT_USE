package X;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.3Ws  reason: invalid class name and case insensitive filesystem */
public final class C65823Ws extends C57972sH {
    public C65823Ws(Context context, Looper looper, C15660rd r10, C15680rf r11, AnonymousClass4O1 r12) {
        super(context, looper, r10, r11, r12, 258);
    }

    public final boolean A05() {
        return true;
    }

    public final boolean A06() {
        return true;
    }

    public final AnonymousClass3Y2[] A07() {
        return AnonymousClass4BK.A06;
    }

    public final /* synthetic */ IInterface A09(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        return !(queryLocalInterface instanceof C66243Yp) ? new C66243Yp(iBinder) : queryLocalInterface;
    }

    public final String A0A() {
        return "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";
    }

    public final String A0B() {
        return "com.google.android.gms.auth.blockstore.service.START";
    }

    public final int ADl() {
        return 17895000;
    }
}
