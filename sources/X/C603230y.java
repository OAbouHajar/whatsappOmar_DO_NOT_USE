package X;

import android.content.Context;
import android.view.MotionEvent;

/* renamed from: X.30y  reason: invalid class name and case insensitive filesystem */
public class C603230y extends AnonymousClass31K {
    public boolean A00;

    public C603230y(Context context, C30581cc r3) {
        super(context, (AnonymousClass1YG) null, r3);
        A0g();
    }

    public static void A0c(C16150sX r1, AnonymousClass31K r2) {
        r2.A0F = (AnonymousClass124) r1.ALe.get();
        r2.A0D = C16150sX.A0p(r1);
        r2.A0C = (AnonymousClass11A) r1.A5U.get();
        r2.A0B = new C809846j();
        r2.A0A = (C26681Os) r1.A39.get();
        r2.A0E = (C24551Gj) r1.A5l.get();
        r2.A08 = (AnonymousClass1PH) r1.A5Z.get();
    }

    public void A0g() {
        if (!this.A00) {
            this.A00 = true;
            C52652eD A07 = C30011bb.A07(this);
            C16150sX A06 = C30011bb.A06(A07, this);
            C49132Rg A05 = C30011bb.A05(A06, A07, this, C30011bb.A0C(A06, this));
            C30011bb.A0S(A06, this, C30011bb.A0B(A05, A06, this));
            C30011bb.A0Q(A06, this);
            C30011bb.A0O(A05, A06, C30011bb.A08(A06, this), this);
            C30011bb.A0M(A05, A06, A07, this, A06.A4p);
            C30011bb.A0R(A06, this);
            A0c(A06, this);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
