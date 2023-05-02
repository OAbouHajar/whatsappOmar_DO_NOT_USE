package X;

import com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.4SA  reason: invalid class name */
public class AnonymousClass4SA {
    public float A00;
    public float A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final CallGridViewModel A08;

    public AnonymousClass4SA(CallGridViewModel callGridViewModel, int i2, int i3, int i4, int i5, int i6, boolean z2) {
        this.A08 = callGridViewModel;
        this.A04 = i2;
        this.A05 = i3;
        this.A06 = i4;
        this.A07 = i5;
        this.A03 = i6;
        this.A02 = z2;
    }

    public void A00() {
        int i2 = this.A05;
        boolean z2 = this.A02;
        int i3 = z2 ? this.A04 : 0;
        float f2 = this.A01;
        if (f2 < 0.0f) {
            i2 = (int) (((float) i2) + (((float) this.A07) * f2));
            if (z2) {
                i3 = (int) (((float) i3) + (((float) this.A06) * f2));
            }
        }
        float f3 = this.A00;
        if (f3 > 0.0f) {
            i3 = (int) (((float) i3) + (((float) this.A03) * f3));
        }
        AnonymousClass027 r1 = this.A08.A0C;
        Object A012 = r1.A01();
        AnonymousClass00B.A06(A012);
        C50032Xj r0 = (C50032Xj) A012;
        r0.A04 = i2;
        r0.A02 = i3;
        r1.A0B(r0);
    }
}
