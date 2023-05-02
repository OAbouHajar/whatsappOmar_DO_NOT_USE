package X;

import android.content.Context;

/* renamed from: X.3zG  reason: invalid class name and case insensitive filesystem */
public class C79143zG extends C97584qE {
    public final C16980tz A00;
    public final AnonymousClass2JK A01;
    public final AnonymousClass1XP A02;

    public C79143zG(C16980tz r2, AnonymousClass1HE r3, C38731rK r4) {
        this.A00 = r2;
        this.A02 = r3.A01(r4);
        this.A01 = null;
    }

    public C79143zG(C16980tz r2, AnonymousClass2JK r3, AnonymousClass1HE r4, C38731rK r5) {
        this.A00 = r2;
        this.A02 = r4.A01(r5);
        this.A01 = r3;
    }

    public C48612Oe A7I() {
        AnonymousClass1XP r3 = this.A02;
        Context context = this.A00.A00;
        return r3 != null ? new C74123pt(context, this.A01, r3) : new C57872s4(context);
    }
}
