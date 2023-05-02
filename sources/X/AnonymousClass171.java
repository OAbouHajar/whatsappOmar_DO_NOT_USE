package X;

/* renamed from: X.171  reason: invalid class name */
public class AnonymousClass171 {
    public final C16900tq A00;
    public final AnonymousClass11I A01;

    public AnonymousClass171(C16900tq r1, AnonymousClass11I r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public static final void A00(C16740tZ r8) {
        boolean z2 = false;
        boolean z3 = false;
        if (r8.A13 > 0) {
            z3 = true;
        }
        StringBuilder sb = new StringBuilder("SendCountMessageStore/validateMessage/message must have row_id set; key=");
        C28381Vw r2 = r8.A11;
        sb.append(r2);
        AnonymousClass00B.A0C(sb.toString(), z3);
        if (r8.A08() == 1) {
            z2 = true;
        }
        StringBuilder sb2 = new StringBuilder("SendCountMessageStore/validateMessage/message in main storage; key=");
        sb2.append(r2);
        AnonymousClass00B.A0C(sb2.toString(), z2);
    }
}
