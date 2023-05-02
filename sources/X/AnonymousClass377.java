package X;

import android.app.Activity;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.377  reason: invalid class name */
public final class AnonymousClass377 extends C16690tT {
    public final long A00;
    public final C16760tb A01;
    public final AnonymousClass1ZI A02;
    public final C25931Lr A03;
    public final C16010sH A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final WeakReference A08;
    public final WeakReference A09;
    public final boolean A0A = true;
    public final boolean A0B;
    public final boolean A0C;

    public AnonymousClass377(C000900k r3, C14600pS r4, C16760tb r5, AnonymousClass1ZI r6, C25931Lr r7, C16010sH r8, String str, String str2, String str3, boolean z2, boolean z3) {
        this.A0B = z2;
        this.A0C = z3;
        this.A08 = C13690nt.A0h(r3);
        this.A09 = C13690nt.A0h(r4);
        this.A01 = r5;
        this.A03 = r7;
        this.A04 = r8;
        this.A06 = str;
        this.A07 = str2;
        this.A05 = str3;
        this.A02 = r6;
        this.A00 = SystemClock.elapsedRealtime();
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Activity activity = (Activity) this.A08.get();
        if (activity != null) {
            if (this.A0C) {
                this.A03.A01(this.A04, this.A05, (List) null);
            }
            C25931Lr r2 = this.A03;
            C16010sH r5 = this.A04;
            r2.A00(activity, (AnonymousClass1Y7) null, r5, this.A06, this.A07, this.A05, true);
            this.A01.A0I(C16010sH.A01(r5), this.A0A);
            C14550pN.A0y(this.A00, 300);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C14600pS r0 = (C14600pS) this.A09.get();
        if (r0 != null) {
            r0.Ac1();
        }
        AnonymousClass1ZI r1 = this.A02;
        if (r1 != null) {
            r1.AWT(true);
        }
        Activity activity = (Activity) this.A08.get();
        if (activity != null && this.A0B) {
            activity.finish();
        }
    }
}
