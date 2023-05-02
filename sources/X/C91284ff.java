package X;

import android.content.DialogInterface;

/* renamed from: X.4ff  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91284ff implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass2KS A01;
    public final /* synthetic */ C16010sH A02;

    public /* synthetic */ C91284ff(AnonymousClass2KS r1, C16010sH r2, int i2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        AnonymousClass2KS r6 = this.A01;
        C16010sH r5 = this.A02;
        int i3 = this.A00;
        AnonymousClass01Y r3 = r6.A0B;
        C000900k r2 = r6.A03;
        AnonymousClass00B.A06(r5);
        r3.A0J(r2, r5, "chat", false);
        AnonymousClass29T.A00(r2, i3);
        C20260zl r7 = r6.A0S;
        C16320sq r10 = r6.A0b;
        C42601y5.A01(r6.A0O, r7, r6.A0T, (C15830rv) r5.A08(C15830rv.class), r10, 4, (Integer) null, 2);
    }
}
