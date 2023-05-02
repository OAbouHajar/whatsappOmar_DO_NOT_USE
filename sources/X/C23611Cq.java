package X;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import com.obwhatsapp.RequestPermissionActivity;
import java.util.List;

/* renamed from: X.1Cq  reason: invalid class name and case insensitive filesystem */
public class C23611Cq {
    public final C16260sj A00;
    public final C15860rz A01;
    public final AnonymousClass3H1 A02;
    public final AnonymousClass3H2 A03;
    public final C30801cy A04 = new C30801cy();
    public final C16320sq A05;
    public final AnonymousClass01D A06;

    public C23611Cq(C16180sb r3, C16980tz r4, C16260sj r5, C15860rz r6, C16320sq r7, AnonymousClass01D r8) {
        AnonymousClass1AP r1 = new AnonymousClass1AP(r3, r4);
        this.A05 = r7;
        this.A00 = r5;
        this.A02 = new AnonymousClass3H1(r4, r1);
        this.A03 = new AnonymousClass3H2(r4, r1);
        this.A01 = r6;
        this.A06 = r8;
    }

    public void A00(Intent intent) {
        if (intent != null) {
            C15860rz r4 = this.A01;
            boolean z2 = ((SharedPreferences) r4.A01.get()).getBoolean("is_status_sharing_with_fb_disabled", false);
            boolean booleanExtra = intent.getBooleanExtra("feature_disabled", z2);
            if (booleanExtra != z2) {
                r4.A0K().putBoolean("is_status_sharing_with_fb_disabled", booleanExtra).apply();
            }
        }
    }

    public boolean A01() {
        AnonymousClass3H1 r3 = this.A02;
        int i2 = 0;
        while (true) {
            AnonymousClass5S8[] r1 = r3.A00;
            if (i2 >= r1.length) {
                break;
            } else if (r1[i2].AJs()) {
                return !((SharedPreferences) this.A01.A01.get()).getBoolean("is_status_sharing_with_fb_disabled", false);
            } else {
                i2++;
            }
        }
    }

    public final boolean A02(Activity activity, AnonymousClass01A r9, C30781cw r10, List list) {
        C16260sj r1 = this.A00;
        Activity activity2 = activity;
        if (!r1.A0B()) {
            if (!(r9 != null ? RequestPermissionActivity.A0Y(r9, r1) : RequestPermissionActivity.A0S(activity, r1))) {
                return false;
            }
        }
        this.A05.Acl(new RunnableRunnableShape0S0400000_I0(this, r10, activity2, list, 34));
        return true;
    }
}
