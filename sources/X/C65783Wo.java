package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: X.3Wo  reason: invalid class name and case insensitive filesystem */
public final class C65783Wo extends C57972sH {
    public final Bundle A00 = C13690nt.A0D();

    public C65783Wo(Context context, Looper looper, C15650rc r11, C15670re r12, AnonymousClass4O1 r13) {
        super(context, looper, r11, r12, r13, 128);
    }

    public final Bundle A08() {
        return this.A00;
    }

    public final /* synthetic */ IInterface A09(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
        return !(queryLocalInterface instanceof C109835Tv) ? new AnonymousClass3Yg(iBinder) : queryLocalInterface;
    }

    public final String A0A() {
        return "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService";
    }

    public final String A0B() {
        return "com.google.android.gms.auth.api.accounttransfer.service.START";
    }

    public final int ADl() {
        return 12451000;
    }
}
