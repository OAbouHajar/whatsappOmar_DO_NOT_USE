package X;

import java.util.concurrent.Callable;

/* renamed from: X.58A  reason: invalid class name */
public final /* synthetic */ class AnonymousClass58A implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ long A05;
    public final /* synthetic */ AnonymousClass2Qx A06;

    public /* synthetic */ AnonymousClass58A(AnonymousClass2Qx r1, int i2, int i3, int i4, int i5, int i6, long j2) {
        this.A06 = r1;
        this.A05 = j2;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A03 = i5;
        this.A04 = i6;
    }

    public final Object call() {
        AnonymousClass2Qx r3 = this.A06;
        long j2 = this.A05;
        int i2 = this.A00;
        int i3 = this.A01;
        int i4 = this.A02;
        int i5 = this.A03;
        int i6 = this.A04;
        int i7 = 0;
        if (!r3.A09()) {
            int i8 = r3.A00 + 1;
            r3.A00 = i8;
            if (i8 >= 8) {
                i7 = -6;
            }
            return Integer.valueOf(i7);
        }
        r3.A0C.renderNativeFrame(j2, i2, i3, i4, i5, i6);
        r3.A00 = 0;
        AnonymousClass00B.A03(r3.A07);
        return Integer.valueOf(C90194dg.A01(r3.A03));
    }
}
