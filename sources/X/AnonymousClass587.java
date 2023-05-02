package X;

import android.os.HandlerThread;
import java.util.concurrent.Callable;

/* renamed from: X.587  reason: invalid class name */
public final /* synthetic */ class AnonymousClass587 implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass2Qx A02;
    public final /* synthetic */ AnonymousClass4V1 A03;

    public /* synthetic */ AnonymousClass587(AnonymousClass2Qx r1, AnonymousClass4V1 r2, int i2, int i3) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final Object call() {
        short s2;
        AnonymousClass2Qx r5 = this.A02;
        AnonymousClass4V1 r4 = this.A03;
        int i2 = this.A00;
        int i3 = this.A01;
        HandlerThread handlerThread = r5.A07;
        AnonymousClass00B.A03(handlerThread);
        r5.A04 = true;
        if (!r5.A09()) {
            s2 = -6;
        } else {
            boolean A012 = r4.A01(r5.A0C, i2, i3);
            s2 = -7;
            if (A012) {
                AnonymousClass00B.A03(handlerThread);
                r5.A04 = false;
                AnonymousClass00B.A03(handlerThread);
                s2 = C90194dg.A01(r5.A03);
            }
        }
        return Integer.valueOf(s2);
    }
}
