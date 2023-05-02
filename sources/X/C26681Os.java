package X;

/* renamed from: X.1Os  reason: invalid class name and case insensitive filesystem */
public class C26681Os {
    public C14710pd A00;

    public C26681Os(C14710pd r1) {
        this.A00 = r1;
    }

    public boolean A00(C16740tZ r4) {
        C40531uH r1 = r4.A0N;
        if (r1 == null || !r1.A0B || r1.A08 == null) {
            return false;
        }
        C14710pd r2 = this.A00;
        C16620tM r12 = C16620tM.A02;
        return r2.A0E(r12, 1307) || r2.A0E(r12, 1325);
    }

    public boolean A01(C16740tZ r4) {
        C40531uH r0 = r4.A0N;
        return r0 != null && r0.A0C && this.A00.A0E(C16620tM.A02, 1307);
    }
}
