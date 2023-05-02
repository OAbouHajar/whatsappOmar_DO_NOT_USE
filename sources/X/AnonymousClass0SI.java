package X;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0SI  reason: invalid class name */
public abstract class AnonymousClass0SI {
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = 0.0f;
    public AnonymousClass0UV A03;
    public Object A04 = null;
    public boolean A05 = false;
    public final C13310lp A06;
    public final List A07 = new ArrayList(1);

    public AnonymousClass0SI(List list) {
        this.A06 = list.isEmpty() ? new C08370dW() : list.size() == 1 ? new AnonymousClass0dX(list) : new C08380dY(list);
    }

    public static float A02(AnonymousClass0SI r0) {
        return ((Number) r0.A08()).floatValue();
    }

    public static PointF A03(AnonymousClass0SI r0) {
        return (PointF) r0.A08();
    }

    public static void A04(AnonymousClass0SI r0, Object obj) {
        r0.A07.add(obj);
    }

    public float A05() {
        float f2 = this.A00;
        if (f2 != -1.0f) {
            return f2;
        }
        float ABz = this.A06.ABz();
        this.A00 = ABz;
        return ABz;
    }

    public float A06() {
        C06520Wl A002 = AnonymousClass0NI.A00(this);
        if (A002.A03()) {
            return 0.0f;
        }
        return A002.A0B.getInterpolation(A07());
    }

    public float A07() {
        if (this.A05) {
            return 0.0f;
        }
        C06520Wl A002 = AnonymousClass0NI.A00(this);
        if (!A002.A03()) {
            return (this.A02 - A002.A02()) / (A002.A01() - A002.A02());
        }
        return 0.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r0 = r2.A0D;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A08() {
        /*
            r4 = this;
            float r3 = r4.A07()
            X.0UV r0 = r4.A03
            if (r0 != 0) goto L_0x0013
            X.0lp r0 = r4.A06
            boolean r0 = r0.AIe(r3)
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r4.A04
            return r0
        L_0x0013:
            X.0Wl r2 = X.AnonymousClass0NI.A00(r4)
            android.view.animation.Interpolator r1 = r2.A0C
            if (r1 == 0) goto L_0x002e
            android.view.animation.Interpolator r0 = r2.A0D
            if (r0 == 0) goto L_0x002e
            float r1 = r1.getInterpolation(r3)
            float r0 = r0.getInterpolation(r3)
            java.lang.Object r0 = r4.A0A(r2, r3, r1, r0)
        L_0x002b:
            r4.A04 = r0
            return r0
        L_0x002e:
            float r0 = r4.A06()
            java.lang.Object r0 = r4.A09(r2, r0)
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0SI.A08():java.lang.Object");
    }

    public abstract Object A09(C06520Wl r1, float f2);

    public Object A0A(C06520Wl r3, float f2, float f3, float f4) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void A0B() {
        int i2 = 0;
        while (true) {
            List list = this.A07;
            if (i2 < list.size()) {
                ((C12650kk) list.get(i2)).AZV();
                i2++;
            } else {
                return;
            }
        }
    }

    public void A0C(float f2) {
        C13310lp r3 = this.A06;
        if (!r3.isEmpty()) {
            float f3 = this.A01;
            if (f3 == -1.0f) {
                f3 = r3.AGE();
                this.A01 = f3;
            }
            if (f2 < f3) {
                if (f3 == -1.0f) {
                    f3 = r3.AGE();
                    this.A01 = f3;
                }
                f2 = f3;
            } else if (f2 > A05()) {
                f2 = A05();
            }
            if (f2 != this.A02) {
                this.A02 = f2;
                if (r3.AJu(f2)) {
                    A0B();
                }
            }
        }
    }

    public void A0D(AnonymousClass0UV r3) {
        AnonymousClass0UV r1 = this.A03;
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A03 = r3;
        if (r3 != null) {
            r3.A00 = this;
        }
    }
}
