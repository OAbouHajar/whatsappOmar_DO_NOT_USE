package X;

/* renamed from: X.1Ng  reason: invalid class name and case insensitive filesystem */
public class C26321Ng {
    public final C16180sb A00;
    public final C16440t3 A01;
    public final C24841Hm A02;
    public final C41721wT A03;
    public final C41731wU A04;
    public final C16320sq A05;

    public C26321Ng(C16180sb r8, C16440t3 r9, C16460t6 r10, AnonymousClass17I r11, C16480t8 r12, C16900tq r13, C24841Hm r14, C25791Ld r15, C16320sq r16, AnonymousClass1CW r17) {
        this.A01 = r9;
        this.A05 = r16;
        this.A00 = r8;
        this.A02 = r14;
        C41721wT r5 = new C41721wT(r9, r17);
        this.A03 = r5;
        this.A04 = new C41731wU(r10, r11, r12, r13, r5, r15);
    }

    public final boolean A00(Long l2) {
        return l2 == null || this.A01.A00() - l2.longValue() > 1296000000;
    }
}
