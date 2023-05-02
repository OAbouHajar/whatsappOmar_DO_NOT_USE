package X;

import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.1MS  reason: invalid class name */
public final class AnonymousClass1MS {
    public final AnonymousClass1JV A00;
    public final AnonymousClass1K7 A01;
    public final AnonymousClass1MQ A02;
    public final AnonymousClass1MR A03;
    public final C20150za A04;

    public AnonymousClass1MS(AnonymousClass1JV r2, AnonymousClass1K7 r3, AnonymousClass1MQ r4, AnonymousClass1MR r5, C20150za r6) {
        C18450wi.A0H(r6, 2);
        C18450wi.A0H(r3, 3);
        C18450wi.A0H(r2, 4);
        this.A02 = r4;
        this.A04 = r6;
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r5;
    }

    public final void A00(C109015Qj r15, C35001lD r16, String str, String str2, String str3, WeakReference weakReference, boolean z2) {
        WeakReference weakReference2 = weakReference;
        C000900k r7 = (C000900k) weakReference2.get();
        if (r7 == null) {
            r15.AOs(C79243zX.A00);
            return;
        }
        AnonymousClass22A r6 = new AnonymousClass22A(r7, r7.AGM(), this.A00, this.A03, str2, (Map) null, z2);
        this.A02.A00(r7.getApplicationContext(), this.A01, r6);
        this.A04.A01(r16, new AnonymousClass53R(r6, r15, weakReference2), (Boolean) null, str, str3, (String) null);
    }
}
