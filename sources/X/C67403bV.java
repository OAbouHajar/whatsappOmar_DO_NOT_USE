package X;

import java.lang.ref.WeakReference;

/* renamed from: X.3bV  reason: invalid class name and case insensitive filesystem */
public final class C67403bV extends C15610rY {
    public final WeakReference A00;

    public C67403bV(C15020qC r2) {
        this.A00 = C13690nt.A0h(r2);
    }

    public final void AiS(AnonymousClass3XU r4) {
        C15020qC r1 = (C15020qC) this.A00.get();
        if (r1 != null) {
            AnonymousClass3EC r0 = r1.A0F;
            C65713Wh r2 = new C65713Wh(r1, r1, r4);
            C66313Yw r12 = r0.A06;
            r12.sendMessage(r12.obtainMessage(1, r2));
        }
    }
}
