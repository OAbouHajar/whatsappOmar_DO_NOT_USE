package X;

import android.app.Activity;

/* renamed from: X.1B5  reason: invalid class name */
public class AnonymousClass1B5 {
    public final C16300so A00;
    public final C14870pt A01;
    public final AnonymousClass1B3 A02;
    public final C19610yi A03;
    public final AnonymousClass01V A04;
    public final C16980tz A05;
    public final C16260sj A06;
    public final C15860rz A07;
    public final C19150xq A08;
    public final C14710pd A09;
    public final AnonymousClass1B4 A0A;
    public final AnonymousClass1B1 A0B;
    public final AnonymousClass15M A0C;
    public final AnonymousClass15O A0D;
    public final C23231Az A0E;
    public final AnonymousClass1B0 A0F;
    public final AnonymousClass1B2 A0G;
    public final AnonymousClass01D A0H;

    public AnonymousClass1B5(C16300so r2, C14870pt r3, AnonymousClass1B3 r4, C19610yi r5, AnonymousClass01V r6, C16980tz r7, C16260sj r8, C15860rz r9, C19150xq r10, C14710pd r11, AnonymousClass1B4 r12, AnonymousClass1B1 r13, AnonymousClass15M r14, AnonymousClass15O r15, C23231Az r16, AnonymousClass1B0 r17, AnonymousClass1B2 r18, AnonymousClass01D r19) {
        this.A05 = r7;
        this.A09 = r11;
        this.A01 = r3;
        this.A00 = r2;
        this.A0E = r16;
        this.A04 = r6;
        this.A0D = r15;
        this.A08 = r10;
        this.A0F = r17;
        this.A0B = r13;
        this.A0C = r14;
        this.A0G = r18;
        this.A06 = r8;
        this.A07 = r9;
        this.A02 = r4;
        this.A0A = r12;
        this.A03 = r5;
        this.A0H = r19;
    }

    public AnonymousClass2DT A00(Activity activity, C38701rH r6, boolean z2) {
        C19610yi r1 = this.A03;
        if (r1.A0D(r6)) {
            AnonymousClass2DT A002 = r1.A00();
            AnonymousClass00B.A06(A002);
            return A002;
        }
        boolean z3 = true;
        AnonymousClass2DT A012 = A01(activity, true, z2);
        A012.A0O = r6;
        if (!r6.A11.A02) {
            int i2 = r6.A0C;
            if (!(i2 == 9 || i2 == 10)) {
                z3 = false;
            }
            A012.A0T = z3;
        }
        return A012;
    }

    public AnonymousClass2DT A01(Activity activity, boolean z2, boolean z3) {
        C16980tz r19 = this.A05;
        C14710pd r18 = this.A09;
        C14870pt r15 = this.A01;
        C16300so r14 = this.A00;
        C23231Az r13 = this.A0E;
        AnonymousClass01V r12 = this.A04;
        AnonymousClass15O r11 = this.A0D;
        C19150xq r10 = this.A08;
        AnonymousClass1B0 r9 = this.A0F;
        AnonymousClass1B2 r8 = this.A0G;
        C16260sj r7 = this.A06;
        C15860rz r6 = this.A07;
        AnonymousClass1B3 r5 = this.A02;
        AnonymousClass1B1 r4 = this.A0B;
        AnonymousClass1B4 r3 = this.A0A;
        AnonymousClass15M r2 = this.A0C;
        AnonymousClass1B4 r28 = r3;
        AnonymousClass1B1 r29 = r4;
        AnonymousClass15M r30 = r2;
        AnonymousClass15O r31 = r11;
        C16260sj r24 = r7;
        C15860rz r25 = r6;
        C19150xq r26 = r10;
        C14710pd r27 = r18;
        C16980tz r23 = r19;
        return new AnonymousClass2DT(activity, r14, r15, r5, this.A03, r12, r23, r24, r25, r26, r27, r28, r29, r30, r31, r13, r9, r8, this.A0H, z2, z3);
    }
}
