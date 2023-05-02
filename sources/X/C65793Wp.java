package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* renamed from: X.3Wp  reason: invalid class name and case insensitive filesystem */
public final class C65793Wp extends C57972sH {
    public final GoogleSignInOptions A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C65793Wp(android.content.Context r13, android.os.Looper r14, com.google.android.gms.auth.api.signin.GoogleSignInOptions r15, X.C15650rc r16, X.C15670re r17, X.AnonymousClass4O1 r18) {
        /*
            r12 = this;
            r11 = 91
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r16
            r9 = r17
            r10 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.4b5 r4 = new X.4b5
            if (r15 == 0) goto L_0x004c
            r4.<init>(r15)
        L_0x0015:
            r0 = 16
            byte[] r1 = new byte[r0]
            java.util.Random r0 = X.C815248r.A00
            r0.nextBytes(r1)
            r0 = 11
            java.lang.String r0 = android.util.Base64.encodeToString(r1, r0)
            r4.A03 = r0
            java.util.Set r1 = r10.A06
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0050
            java.util.Iterator r3 = r1.iterator()
        L_0x0032:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0050
            java.lang.Object r2 = r3.next()
            r0 = 0
            com.google.android.gms.common.api.Scope[] r0 = new com.google.android.gms.common.api.Scope[r0]
            java.util.Set r1 = r4.A05
            r1.add(r2)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            goto L_0x0032
        L_0x004c:
            r4.<init>()
            goto L_0x0015
        L_0x0050:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r4.A00()
            r12.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65793Wp.<init>(android.content.Context, android.os.Looper, com.google.android.gms.auth.api.signin.GoogleSignInOptions, X.0rc, X.0re, X.4O1):void");
    }

    public final /* bridge */ /* synthetic */ IInterface A09(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return !(queryLocalInterface instanceof C66163Ya) ? new C66163Ya(iBinder) : queryLocalInterface;
    }

    public final String A0A() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public final String A0B() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final int ADl() {
        return 12451000;
    }

    public final Intent AG4() {
        Context context = this.A0F;
        GoogleSignInOptions googleSignInOptions = this.A00;
        AnonymousClass4YK.A00.A00("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(googleSignInOptions, context.getPackageName());
        Intent A02 = C13700nu.A02("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        A02.setPackage(context.getPackageName());
        A02.setClass(context, SignInHubActivity.class);
        Bundle A0D = C13690nt.A0D();
        A0D.putParcelable("config", signInConfiguration);
        A02.putExtra("config", A0D);
        return A02;
    }

    public final boolean Aav() {
        return true;
    }
}
