package X;

import android.view.View;

/* renamed from: X.3Ch  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62203Ch implements View.OnClickListener {
    public final /* synthetic */ C55792kN A00;
    public final /* synthetic */ C49952Wu A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C62203Ch(C55792kN r1, C49952Wu r2, boolean z2) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = z2;
    }

    public final void onClick(View view) {
        C49952Wu r1 = this.A01;
        C55792kN r5 = this.A00;
        boolean z2 = this.A02;
        C55782kM r4 = r1.A09;
        if (z2) {
            boolean A002 = r4.A03.A00(r5);
            StringBuilder A0r = AnonymousClass000.A0r("Reaction=");
            A0r.append(r5);
            AnonymousClass00B.A0B(AnonymousClass000.A0h(" was not removed from allTab!", A0r), A002);
            for (AnonymousClass2Wv r3 : C13690nt.A0k(r4.A05)) {
                if (C13690nt.A0k(r3.A02).contains(r5)) {
                    boolean A003 = r3.A00(r5);
                    StringBuilder A0q = AnonymousClass000.A0q("Reaction=");
                    A0q.append(r5);
                    AnonymousClass00B.A0B(AnonymousClass000.A0e(r3, " was not removed from emojiTab=", A0q), A003);
                    C16740tZ A004 = r4.A02.A00(r5.A00);
                    if (A004 != null) {
                        r4.A01.A0X(A004, "", true);
                        return;
                    }
                    return;
                }
            }
            StringBuilder A0r2 = AnonymousClass000.A0r("Could not find emoji tab for reaction=");
            A0r2.append(r5);
            AnonymousClass00B.A08(AnonymousClass000.A0h(". That should not happen.", A0r2));
            return;
        }
        r4.A07.A0B(r5.A04);
    }
}
