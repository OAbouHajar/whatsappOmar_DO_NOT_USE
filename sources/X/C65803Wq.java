package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;

/* renamed from: X.3Wq  reason: invalid class name and case insensitive filesystem */
public final class C65803Wq extends C57972sH {
    public final Bundle A00 = C13690nt.A0D();

    public C65803Wq(Context context, Looper looper, C15650rc r11, C15670re r12, AnonymousClass4O1 r13) {
        super(context, looper, r11, r12, r13, 16);
    }

    public final Bundle A08() {
        return this.A00;
    }

    public final /* synthetic */ IInterface A09(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return !(queryLocalInterface instanceof C109815Tt) ? new AnonymousClass3Ye(iBinder) : queryLocalInterface;
    }

    public final String A0A() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    public final String A0B() {
        return "com.google.android.gms.auth.service.START";
    }

    public final int ADl() {
        return 12451000;
    }

    public final boolean AcM() {
        AnonymousClass4O1 r2 = this.A00;
        if (!TextUtils.isEmpty((CharSequence) null)) {
            r2.A04.get(AnonymousClass4B4.A03);
            return !r2.A05.isEmpty();
        }
    }
}
