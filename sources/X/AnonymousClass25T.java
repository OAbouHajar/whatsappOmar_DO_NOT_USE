package X;

import java.lang.ref.SoftReference;

/* renamed from: X.25T  reason: invalid class name */
public final /* synthetic */ class AnonymousClass25T implements C37681pY {
    public final /* synthetic */ C25791Ld A00;

    public /* synthetic */ AnonymousClass25T(C25791Ld r1) {
        this.A00 = r1;
    }

    public final void AQO(Object obj, Object obj2, Object obj3, boolean z2) {
        C25791Ld r0 = this.A00;
        if (z2) {
            r0.A05.put(obj, new SoftReference(obj2));
        }
    }
}
