package X;

import java.io.File;

/* renamed from: X.13p  reason: invalid class name and case insensitive filesystem */
public final class C213113p {
    public final AnonymousClass01Z A00;
    public final C16980tz A01;
    public final C14710pd A02;
    public final C212813m A03;
    public final C213013o A04;
    public final C212913n A05;

    public C213113p(AnonymousClass01Z r2, C16980tz r3, C14710pd r4, C212813m r5, C213013o r6, C212913n r7) {
        C18450wi.A0H(r4, 1);
        C18450wi.A0H(r3, 2);
        C18450wi.A0H(r7, 4);
        C18450wi.A0H(r6, 5);
        C18450wi.A0H(r2, 6);
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        this.A05 = r7;
        this.A04 = r6;
        this.A00 = r2;
    }

    public final File A00(String str) {
        File A0B = this.A00.A00.A0B();
        if (A0B.exists() || A0B.mkdirs()) {
            return new File(A0B, C18450wi.A06(str, ".png"));
        }
        return null;
    }
}
