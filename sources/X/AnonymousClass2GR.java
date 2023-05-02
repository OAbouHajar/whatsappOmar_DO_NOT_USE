package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2GR  reason: invalid class name */
public class AnonymousClass2GR extends AnonymousClass2GJ {
    public final /* synthetic */ AnonymousClass12U A00;

    public AnonymousClass2GR(AnonymousClass12U r1) {
        this.A00 = r1;
    }

    public boolean A05() {
        AnonymousClass12U r4 = this.A00;
        C19670yo r3 = r4.A07;
        AtomicBoolean atomicBoolean = r3.A0e;
        if (atomicBoolean.get()) {
            return r3.A0F(r4.A09.A01(), r4.A00()) && atomicBoolean.get();
        }
    }

    public String toString() {
        return "media-restore-condition";
    }
}
