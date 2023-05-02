package X;

import android.hardware.camera2.CaptureRequest;

/* renamed from: X.5zH  reason: invalid class name */
public class AnonymousClass5zH implements AnonymousClass689 {
    public final /* synthetic */ CaptureRequest.Builder A00;
    public final /* synthetic */ C119005vl A01;
    public final /* synthetic */ AnonymousClass5zJ A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ float[] A04;

    public AnonymousClass5zH(CaptureRequest.Builder builder, C119005vl r2, AnonymousClass5zJ r3, float[] fArr, boolean z2) {
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = fArr;
        this.A00 = builder;
        this.A03 = z2;
    }

    public void ARU(boolean z2) {
        C119005vl r6 = this.A01;
        boolean z3 = r6.A09;
        AnonymousClass5zJ r5 = this.A02;
        if (z3) {
            r6.A0A(r5);
        } else {
            r5.A06 = null;
        }
        r6.A09(z2 ? C114875ok.SUCCESS : C114875ok.FAILED, this.A04);
        if (!r6.A0E) {
            CaptureRequest.Builder builder = this.A00;
            Number number = (Number) builder.get(CaptureRequest.CONTROL_AE_MODE);
            long j2 = 4000;
            if (number == null || number.intValue() != 1) {
                if (!this.A03) {
                    j2 = 2000;
                }
                r6.A08(builder, r5, j2);
                return;
            }
            if (!this.A03) {
                j2 = 2000;
            }
            r6.A07(builder, r5, j2);
        }
    }
}
