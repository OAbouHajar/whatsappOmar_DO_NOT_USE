package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: X.0Wl  reason: invalid class name and case insensitive filesystem */
public class C06520Wl {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public PointF A06;
    public PointF A07;
    public Float A08;
    public Object A09;
    public final float A0A;
    public final Interpolator A0B;
    public final Interpolator A0C;
    public final Interpolator A0D;
    public final AnonymousClass0Rs A0E;
    public final Object A0F;

    public C06520Wl(Interpolator interpolator, AnonymousClass0Rs r3, Float f2, Object obj, Object obj2, float f3) {
        this.A00 = A00(this);
        this.A06 = null;
        this.A07 = null;
        this.A0E = r3;
        this.A0F = obj;
        this.A09 = obj2;
        this.A0B = interpolator;
        this.A0C = null;
        this.A0D = null;
        this.A0A = f3;
        this.A08 = f2;
    }

    public C06520Wl(Interpolator interpolator, Interpolator interpolator2, AnonymousClass0Rs r5, Object obj, Object obj2, float f2) {
        this.A00 = A00(this);
        this.A06 = null;
        this.A07 = null;
        this.A0E = r5;
        this.A0F = obj;
        this.A09 = obj2;
        this.A0B = null;
        this.A0C = interpolator;
        this.A0D = interpolator2;
        this.A0A = f2;
        this.A08 = null;
    }

    public C06520Wl(Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, AnonymousClass0Rs r5, Float f2, Object obj, Object obj2, float f3) {
        this.A00 = A00(this);
        this.A06 = null;
        this.A07 = null;
        this.A0E = r5;
        this.A0F = obj;
        this.A09 = obj2;
        this.A0B = interpolator;
        this.A0C = interpolator2;
        this.A0D = interpolator3;
        this.A0A = f3;
        this.A08 = f2;
    }

    public C06520Wl(Object obj) {
        float A002 = A00(this);
        this.A00 = A002;
        this.A06 = null;
        this.A07 = null;
        this.A0E = null;
        this.A0F = obj;
        this.A09 = obj;
        this.A0B = null;
        this.A0C = null;
        this.A0D = null;
        this.A0A = A002;
        this.A08 = Float.valueOf(Float.MAX_VALUE);
    }

    public static float A00(C06520Wl r1) {
        r1.A03 = -3987645.8f;
        r1.A01 = -3987645.8f;
        r1.A05 = 784923401;
        r1.A04 = 784923401;
        r1.A02 = Float.MIN_VALUE;
        return Float.MIN_VALUE;
    }

    public float A01() {
        AnonymousClass0Rs r4 = this.A0E;
        if (r4 == null) {
            return 1.0f;
        }
        float f2 = this.A00;
        if (f2 != Float.MIN_VALUE) {
            return f2;
        }
        Float f3 = this.A08;
        if (f3 == null) {
            this.A00 = 1.0f;
            return 1.0f;
        }
        float A022 = A02() + ((f3.floatValue() - this.A0A) / (r4.A00 - r4.A02));
        this.A00 = A022;
        return A022;
    }

    public float A02() {
        AnonymousClass0Rs r3 = this.A0E;
        if (r3 == null) {
            return 0.0f;
        }
        float f2 = this.A02;
        if (f2 != Float.MIN_VALUE) {
            return f2;
        }
        float f3 = this.A0A;
        float f4 = r3.A02;
        float f5 = (f3 - f4) / (r3.A00 - f4);
        this.A02 = f5;
        return f5;
    }

    public boolean A03() {
        return this.A0B == null && this.A0C == null && this.A0D == null;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Keyframe{startValue=");
        A0r.append(this.A0F);
        A0r.append(", endValue=");
        A0r.append(this.A09);
        A0r.append(", startFrame=");
        A0r.append(this.A0A);
        A0r.append(", endFrame=");
        A0r.append(this.A08);
        A0r.append(", interpolator=");
        A0r.append(this.A0B);
        return AnonymousClass000.A0k(A0r);
    }
}
