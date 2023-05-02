package X;

import android.app.ActivityManager;
import android.content.Context;
import android.location.Location;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import com.obwhatsapp.Me;
import com.whatsapp.util.Log;

/* renamed from: X.1GE  reason: invalid class name */
public class AnonymousClass1GE {
    public static final String[] A07 = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    public boolean A00;
    public final AnonymousClass16R A01;
    public final C16040sK A02;
    public final AnonymousClass01V A03;
    public final C16440t3 A04;
    public final C16980tz A05;
    public final C15860rz A06;

    public AnonymousClass1GE(AnonymousClass16R r1, C16040sK r2, AnonymousClass01V r3, C16440t3 r4, C16980tz r5, C15860rz r6) {
        this.A04 = r4;
        this.A05 = r5;
        this.A02 = r2;
        this.A03 = r3;
        this.A06 = r6;
        this.A01 = r1;
    }

    public static void A00(C438521u r4, C39721sx r5, Integer num) {
        double d2 = r5.A00;
        r4.A03();
        C438621v r3 = (C438621v) r4.A00;
        r3.A04 |= 1;
        r3.A00 = d2;
        double d3 = r5.A01;
        r4.A03();
        C438621v r32 = (C438621v) r4.A00;
        r32.A04 |= 2;
        r32.A01 = d3;
        int i2 = r5.A03;
        if (i2 != -1) {
            r4.A03();
            C438621v r1 = (C438621v) r4.A00;
            r1.A04 |= 4;
            r1.A03 = i2;
        }
        float f2 = r5.A02;
        if (f2 != -1.0f) {
            r4.A03();
            C438621v r12 = (C438621v) r4.A00;
            r12.A04 |= 8;
            r12.A02 = f2;
        }
        int i3 = r5.A04;
        if (i3 != -1) {
            r4.A03();
            C438621v r13 = (C438621v) r4.A00;
            r13.A04 |= 16;
            r13.A05 = i3;
        }
        if (num != null) {
            int intValue = num.intValue();
            r4.A03();
            C438621v r14 = (C438621v) r4.A00;
            r14.A04 |= 128;
            r14.A06 = intValue;
        }
    }

    public static boolean A01(Location location, Location location2) {
        return location2 == null || location2.getTime() + 120000 < location.getTime() || location2.getAccuracy() > location.getAccuracy() || (TextUtils.equals(location2.getProvider(), location.getProvider()) && location2.distanceTo(location) > Math.max(10.0f, location.getAccuracy()));
    }

    public C33211iD A02(C39721sx r5, Integer num) {
        C28581Wr A0U = C33211iD.A0o.A0U();
        C438621v r0 = ((C33211iD) A0U.A00).A0T;
        if (r0 == null) {
            r0 = C438621v.A0B;
        }
        C438521u r02 = (C438521u) r0.A0U();
        A00(r02, r5, num);
        A0U.A03();
        C33211iD r2 = (C33211iD) A0U.A00;
        r2.A0T = (C438621v) r02.A02();
        r2.A00 |= AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
        return (C33211iD) A0U.A02();
    }

    public void A03(Context context) {
        C16040sK r0 = this.A02;
        r0.A0B();
        Me me = r0.A00;
        C007803p.A03 = me == null ? "ZZ" : C18160wF.A01(me.cc, me.number);
        if (C007903q.A00 == null) {
            C007903q.A00 = new C438821x(this.A01);
        }
        C007803p.A01(context, AnonymousClass021.A08);
        C007803p.A02(true);
        C008103s.A00(context);
    }

    public void A04(Context context) {
        if (C007903q.A00 == null) {
            C007903q.A00 = new C438821x(this.A01);
        }
        C007803p.A01(context, AnonymousClass021.A08);
        C008103s.A00(context);
    }

    public boolean A05(Context context) {
        if (!C437421i.A01(context) || C438721w.A00(context) != 0) {
            return false;
        }
        ActivityManager A032 = this.A03.A03();
        if (A032 != null) {
            return A032.getDeviceConfigurationInfo().reqGlEsVersion >= 131072 ? false : false;
        }
        Log.w("app/has-google-maps-v2 am=false");
        return false;
    }
}
