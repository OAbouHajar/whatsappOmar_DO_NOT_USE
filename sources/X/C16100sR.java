package X;

/* renamed from: X.0sR  reason: invalid class name and case insensitive filesystem */
public class C16100sR {
    public final C16000sG A00;
    public final AnonymousClass10U A01;

    public C16100sR(C16000sG r1, AnonymousClass10U r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public C16010sH A00(C15880s3 r3, String str) {
        try {
            C16010sH A08 = this.A00.A08(C15830rv.A01(this.A01.A02(r3, str)));
            if (A08 != null) {
                return A08;
            }
            throw new SecurityException("Invalid contact ID");
        } catch (AnonymousClass1W4 e2) {
            throw new SecurityException(e2);
        }
    }
}
