package X;

/* renamed from: X.1Cf  reason: invalid class name and case insensitive filesystem */
public class C23501Cf {
    public final C15900s5 A00;
    public final C17130ua A01;
    public final C14730pf A02;
    public final C14710pd A03;
    public final AnonymousClass12X A04;
    public final C20330zs A05;
    public final C19040xf A06;

    public C23501Cf(C15900s5 r1, C17130ua r2, C14730pf r3, C14710pd r4, AnonymousClass12X r5, C20330zs r6, C19040xf r7) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A06 = r7;
        this.A05 = r6;
        this.A04 = r5;
    }

    public static final void A00(AnonymousClass257 r4, String str, boolean z2) {
        int i2 = r4.A01().A00.A01;
        if (i2 != 0) {
            if (r4.A01.delete()) {
                r4.A00.delete();
            }
            boolean z3 = true;
            if (C31701et.A01(i2)) {
                if (i2 != 16) {
                    z3 = false;
                }
                StringBuilder sb = new StringBuilder("Transient error during downloading external mutations, status: ");
                sb.append(i2);
                throw new AnonymousClass259(sb.toString(), z3);
            } else if (i2 != 5) {
                StringBuilder sb2 = new StringBuilder("Failed to download external mutation with status: ");
                sb2.append(i2);
                throw new AnonymousClass259(sb2.toString(), true);
            } else if (z2) {
                throw new AnonymousClass1X9(58, str);
            } else {
                throw new AnonymousClass1X9(4, str);
            }
        }
    }
}
