package X;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* renamed from: X.1x6  reason: invalid class name and case insensitive filesystem */
public final class C42021x6 {
    public boolean A00;
    public final AnonymousClass4V0 A01;
    public final /* synthetic */ C42001x2 A02;

    public C42021x6(AnonymousClass4V0 r1, C42001x2 r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public OutputStream A00() {
        AnonymousClass404 r0;
        synchronized (this.A02) {
            AnonymousClass4V0 r1 = this.A01;
            if (r1.A01 == this) {
                r0 = new AnonymousClass404(this, new FileOutputStream(r1.A01()));
            } else {
                throw new IllegalStateException();
            }
        }
        return r0;
    }

    public void A01() {
        boolean z2 = this.A00;
        C42001x2 r1 = this.A02;
        if (z2) {
            C42001x2.A02(this, r1, false);
            r1.A0D(this.A01.A03);
            return;
        }
        C42001x2.A02(this, r1, true);
    }
}
