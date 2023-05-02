package X;

import java.util.List;

/* renamed from: X.1Ak  reason: invalid class name and case insensitive filesystem */
public final class C23081Ak {
    public int A00;
    public int A01 = Integer.MAX_VALUE;
    public C59472yL A02;
    public final C14870pt A03;
    public final C17130ua A04;
    public final C16980tz A05;
    public final C14710pd A06;
    public final C16490t9 A07;
    public final C20330zs A08;
    public final C19040xf A09;

    public C23081Ak(C14870pt r2, C17130ua r3, C16980tz r4, C14710pd r5, C16490t9 r6, C20330zs r7, C19040xf r8) {
        this.A05 = r4;
        this.A06 = r5;
        this.A03 = r2;
        this.A04 = r3;
        this.A07 = r6;
        this.A09 = r8;
        this.A08 = r7;
    }

    public void A00(C62723Er r3) {
        r3.A03 = true;
        C59472yL r0 = this.A02;
        if (r0 != null) {
            r0.A00(r3);
        }
        List list = r3.A02;
        if (list != null && list.size() > 0) {
            for (C62723Er A002 : r3.A02) {
                A00(A002);
            }
        }
    }
}
