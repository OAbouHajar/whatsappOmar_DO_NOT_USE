package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0Cf  reason: invalid class name */
public class AnonymousClass0Cf extends C011105i {
    public final /* synthetic */ AnonymousClass05h A00;
    public final /* synthetic */ AnonymousClass01A A01;
    public final /* synthetic */ AtomicReference A02;

    public AnonymousClass0Cf(AnonymousClass05h r1, AnonymousClass01A r2, AtomicReference atomicReference) {
        this.A01 = r2;
        this.A02 = atomicReference;
        this.A00 = r1;
    }

    public void A00(AnonymousClass09N r3, Object obj) {
        C011105i r0 = (C011105i) this.A02.get();
        if (r0 != null) {
            r0.A00((AnonymousClass09N) null, obj);
            return;
        }
        throw AnonymousClass000.A0V("Operation cannot be started before fragment is in created state");
    }
}
