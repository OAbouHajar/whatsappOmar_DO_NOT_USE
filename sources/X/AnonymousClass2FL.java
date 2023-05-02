package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.obwhatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: X.2FL  reason: invalid class name */
public class AnonymousClass2FL extends C16690tT {
    public final C16980tz A00;
    public final C15860rz A01;
    public final AnonymousClass1KP A02;
    public final String A03;
    public final String A04;
    public final WeakReference A05;

    public AnonymousClass2FL(C16980tz r2, C15860rz r3, AnonymousClass1KP r4, VerifyTwoFactorAuth verifyTwoFactorAuth, String str, String str2) {
        super(verifyTwoFactorAuth, true);
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = new WeakReference(verifyTwoFactorAuth);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        try {
            C15860rz r3 = this.A01;
            int i2 = ((SharedPreferences) r3.A01.get()).getInt("reg_attempts_check_exist", 0) + 1;
            r3.A0K().putInt("reg_attempts_check_exist", i2).apply();
            C47002Hc r2 = new C47002Hc(i2);
            Context context = this.A00.A00;
            String str = this.A04;
            return this.A02.A00(r2, this.A03, str, AnonymousClass3A8.A00(context, str), "-1", (JSONObject) null, (byte[]) null);
        } catch (Exception e2) {
            Log.e("verifytwofactorauth/checkifexists/error", e2);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005a, code lost:
        if (((r9.A02 * 1000) + (r9.A03 - (r9.A04 * 1000))) >= r9.A05.A00()) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0A(java.lang.Object r15) {
        /*
            r14 = this;
            X.1ej r15 = (X.C31601ej) r15
            java.lang.ref.WeakReference r0 = r14.A05
            java.lang.Object r9 = r0.get()
            com.obwhatsapp.registration.VerifyTwoFactorAuth r9 = (com.obwhatsapp.registration.VerifyTwoFactorAuth) r9
            if (r9 == 0) goto L_0x0045
            r3 = 0
            r9.A0N = r3
            r4 = 5000(0x1388, double:2.4703E-320)
            r8 = 1
            if (r15 == 0) goto L_0x0046
            int r0 = r15.A0J
            if (r0 != r8) goto L_0x005d
            java.lang.String r0 = "verifytwofactorauth/checkifexists ok"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.A3A(r8)
            X.0rz r1 = r9.A09
            boolean r0 = r15.A0O
            r1.A1L(r0)
            X.0rz r1 = r9.A09
            boolean r0 = r15.A0N
            r1.A1K(r0)
            X.0rz r0 = r9.A09
            boolean r2 = r15.A0M
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "first_party_migration_initiated"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.apply()
            java.lang.String r0 = r15.A0L
            r9.A39(r3, r0)
        L_0x0045:
            return
        L_0x0046:
            X.0t3 r0 = r9.A05
            long r12 = r0.A00()
            long r6 = r9.A03
            long r2 = r9.A04
            long r0 = r9.A02
            r10 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r10
            long r0 = r0 * r10
            long r6 = r6 - r2
            long r0 = r0 + r6
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 < 0) goto L_0x0077
            goto L_0x006f
        L_0x005d:
            long r2 = r15.A05
            long r0 = r15.A04
            long r2 = r2 + r0
            long r6 = r9.A02
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x0077
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            long r4 = java.lang.Math.max(r0, r4)
        L_0x006f:
            android.os.Handler r1 = r9.A0c
            java.lang.Runnable r0 = r9.A0e
            r1.postDelayed(r0, r4)
            return
        L_0x0077:
            r9.A3A(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2FL.A0A(java.lang.Object):void");
    }
}
