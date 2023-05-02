package X;

/* renamed from: X.1Pz  reason: invalid class name and case insensitive filesystem */
public class C26981Pz {
    public final C16040sK A00;
    public final C16000sG A01;
    public final C16440t3 A02;
    public final C15810rt A03;
    public final C16460t6 A04;
    public final AnonymousClass182 A05;
    public final AnonymousClass189 A06;
    public final C16070sO A07;
    public final C16900tq A08;
    public final C26961Px A09;
    public final C26971Py A0A;
    public final C14710pd A0B;
    public final C16490t9 A0C;
    public final C18040w3 A0D;
    public final C217915l A0E;

    public C26981Pz(C16040sK r1, C16000sG r2, C16440t3 r3, C15810rt r4, C16460t6 r5, AnonymousClass182 r6, AnonymousClass189 r7, C16070sO r8, C16900tq r9, C26961Px r10, C26971Py r11, C14710pd r12, C16490t9 r13, C18040w3 r14, C217915l r15) {
        this.A02 = r3;
        this.A0B = r12;
        this.A00 = r1;
        this.A03 = r4;
        this.A0C = r13;
        this.A01 = r2;
        this.A04 = r5;
        this.A0A = r11;
        this.A0E = r15;
        this.A0D = r14;
        this.A08 = r9;
        this.A05 = r6;
        this.A07 = r8;
        this.A09 = r10;
        this.A06 = r7;
    }

    public void A00(C16740tZ r5, C39191s4 r6, Integer num, Integer num2) {
        AnonymousClass23V r3 = new AnonymousClass23V();
        int i2 = 1;
        if (r6.A01 != 1) {
            i2 = 2;
        }
        r3.A01 = Integer.valueOf(i2);
        r3.A02 = num;
        r3.A00 = num2;
        r3.A05 = Long.valueOf(r6.A0I);
        if (r5 != null) {
            r3.A04 = Long.valueOf((long) r5.A04);
            Integer A022 = this.A06.A02(r5);
            if (A022 != null) {
                r3.A04 = Long.valueOf((long) A022.intValue());
            }
        }
        C15830rv r2 = r6.A11.A00;
        if (r2 != null) {
            r3.A06 = this.A0D.A03(r2.getRawString());
            r3.A03 = Long.valueOf((long) this.A03.A01(r2));
        }
        this.A0C.A06(r3);
    }
}
