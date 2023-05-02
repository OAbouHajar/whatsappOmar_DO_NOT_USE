package X;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.15P  reason: invalid class name */
public class AnonymousClass15P {
    public Boolean A00;
    public final AnonymousClass2J0 A01;
    public final C16440t3 A02;
    public final C15860rz A03;
    public final C14710pd A04;

    public AnonymousClass15P(C16440t3 r3, C16980tz r4, C15860rz r5, C14710pd r6) {
        this.A02 = r3;
        this.A04 = r6;
        this.A03 = r5;
        boolean A0E = r6.A0E(C16620tM.A02, 266);
        Context context = r4.A00;
        this.A01 = A0E ? new C47442Iz(context) : new AnonymousClass2J1(context);
    }

    public void A00(Activity activity) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            A01(activity);
        } else if (i2 >= 26) {
            Class<Activity> cls = Activity.class;
            try {
                Method method = cls.getMethod("setDisablePreviewScreenshots", new Class[]{Boolean.TYPE});
                method.setAccessible(true);
                method.invoke(activity, new Object[]{Boolean.valueOf(A04())});
            } catch (Exception e2) {
                Log.e("Could not invoke setDisablePreviewScreenshots()", e2);
            }
        }
    }

    public final void A01(Activity activity) {
        activity.setRecentsScreenshotEnabled(!A04());
    }

    public void A02(boolean z2) {
        Boolean bool = this.A00;
        if (bool == null || bool.booleanValue() != z2) {
            this.A00 = Boolean.valueOf(z2);
            StringBuilder sb = new StringBuilder("AppAuthManager/setIsAuthenticationNeeded: ");
            sb.append(z2);
            Log.i(sb.toString());
            this.A03.A0K().putBoolean("fingerprint_authentication_needed", z2).apply();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r3.A01.AHW() == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
            r3 = this;
            boolean r0 = r3.A05()
            if (r0 == 0) goto L_0x000f
            X.2J0 r0 = r3.A01
            boolean r0 = r0.AHW()
            r2 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            java.lang.String r1 = "AppAuthManager/hasEnrolledBiometrics: enrolled: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass15P.A03():boolean");
    }

    public boolean A04() {
        return Build.VERSION.SDK_INT >= 23 && this.A03.A1h() && this.A01.A5t();
    }

    public boolean A05() {
        return Build.VERSION.SDK_INT >= 23 && this.A01.AIt();
    }

    public boolean A06() {
        C15860rz r0 = this.A03;
        boolean A1h = r0.A1h();
        AnonymousClass01D r4 = r0.A01;
        boolean z2 = ((SharedPreferences) r4.get()).getBoolean("fingerprint_authentication_needed", false);
        boolean A032 = A03();
        if (!A032 || !A1h || !z2) {
            StringBuilder sb = new StringBuilder("AppAuthManager/shouldShowAuthPrompt: No prompt: ");
            sb.append(!A032);
            sb.append(" || ");
            sb.append(!A1h);
            sb.append(" || ");
            sb.append(!z2);
            Log.i(sb.toString());
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = ((SharedPreferences) r4.get()).getLong("app_background_time", 0);
        long j3 = ((SharedPreferences) r4.get()).getLong("privacy_fingerprint_timeout", 60000);
        StringBuilder sb2 = new StringBuilder("AppAuthManager/shouldShowAuthPrompt: show prompt if necessary: ");
        long j4 = j2 + j3;
        boolean z3 = false;
        if (j4 < elapsedRealtime) {
            z3 = true;
        }
        sb2.append(z3);
        Log.i(sb2.toString());
        return j4 < elapsedRealtime;
    }

    public boolean A07() {
        return !A04() || ((SharedPreferences) this.A03.A01.get()).getBoolean("privacy_fingerprint_show_notification_content", true);
    }
}
