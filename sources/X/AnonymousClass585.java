package X;

import com.whatsapp.util.Log;
import java.util.concurrent.Callable;

/* renamed from: X.585  reason: invalid class name */
public final /* synthetic */ class AnonymousClass585 implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass53K A02;

    public /* synthetic */ AnonymousClass585(AnonymousClass53K r1, int i2, int i3) {
        this.A02 = r1;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final Object call() {
        int i2;
        AnonymousClass53K r6 = this.A02;
        int i3 = this.A00;
        int i4 = this.A01;
        C90194dg r0 = r6.A03;
        if (r0 == null || !r0.A0B()) {
            i2 = -6;
        } else {
            r6.A01 = i3;
            r6.A00 = i4;
            boolean z2 = r6.A0A;
            if (!z2) {
                int i5 = 0;
                while (true) {
                    if (r6.A03.A04() == i3 && r6.A03.A03() == i4) {
                        break;
                    }
                    i5++;
                    if (i5 > 3) {
                        Log.w("failed to flush buffer to update window size, drop frame");
                        i2 = -4;
                        break;
                    }
                    r6.A00();
                }
            }
            r6.A08.setWindow(0, 0, i3, i4);
            if (!z2) {
                r6.A00();
            }
            return 0;
        }
        return Integer.valueOf(i2);
    }
}
