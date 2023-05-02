package X;

import android.content.Context;

/* renamed from: X.1RW  reason: invalid class name */
public class AnonymousClass1RW extends AnonymousClass1RX {
    public final C16180sb A00;
    public final AnonymousClass013 A01;
    public final C17250um A02;
    public final AnonymousClass1MF A03;

    public AnonymousClass1RW(C16180sb r3, AnonymousClass013 r4, C17250um r5, AnonymousClass1MF r6, C16320sq r7) {
        super(new AnonymousClass1V1(r7, "ProcessDoodleQueue"));
        this.A00 = r3;
        this.A02 = r5;
        this.A01 = r4;
        this.A03 = r6;
    }

    public void A06(Context context, AnonymousClass218 r12, AnonymousClass1XQ r13, String str) {
        AnonymousClass218 r6 = r12;
        String str2 = str;
        if (str == null) {
            r12.ASr((C62033Bj) null);
            return;
        }
        Context context2 = context;
        C76723ua r1 = new C76723ua(context2, this.A00, this.A01, this.A02, r6, r13, this.A03, str2);
        A01(r1.A03, r1);
    }

    public void A07(Context context, AnonymousClass1XQ r9, String str) {
        String str2 = str;
        if (str != null) {
            C76713uZ r1 = new C76713uZ(context, this.A00, this.A02, r9, str2);
            A01(r1.A03, r1);
        }
    }
}
