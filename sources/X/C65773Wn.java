package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;

/* renamed from: X.3Wn  reason: invalid class name and case insensitive filesystem */
public final class C65773Wn extends C57972sH {
    public final C97854qg A00;

    public C65773Wn(Context context, Looper looper, C97854qg r13, C15650rc r14, C15670re r15, AnonymousClass4O1 r16) {
        super(context, looper, r14, r15, r16, 68);
        AnonymousClass4ZY r2 = new AnonymousClass4ZY(r13 == null ? C97854qg.A02 : r13);
        byte[] bArr = new byte[16];
        C815248r.A00.nextBytes(bArr);
        r2.A01 = Base64.encodeToString(bArr, 11);
        this.A00 = new C97854qg(r2);
    }

    public final Bundle A08() {
        return this.A00.A00();
    }

    public final /* bridge */ /* synthetic */ IInterface A09(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return !(queryLocalInterface instanceof C66173Yb) ? new C66173Yb(iBinder) : queryLocalInterface;
    }

    public final String A0A() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    public final String A0B() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    public final int ADl() {
        return 12800000;
    }
}
