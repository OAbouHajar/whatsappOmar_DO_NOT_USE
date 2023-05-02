package X;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.4p8  reason: invalid class name and case insensitive filesystem */
public final class C96934p8 implements C109595St {
    public long A00;
    public long A01;
    public C32481gS A02;
    public C85574Oz A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final AnonymousClass4WU A07 = new AnonymousClass4WU(8);
    public final AnonymousClass4WU A08 = new AnonymousClass4WU(6);
    public final AnonymousClass4WU A09 = new AnonymousClass4WU(7);
    public final C85814Qb A0A;
    public final C90504eH A0B = new C90504eH();
    public final boolean[] A0C = new boolean[3];

    public C96934p8(C85814Qb r3) {
        this.A0A = r3;
    }

    public void A6b(C90504eH r26) {
        C32481gS r6 = this.A02;
        C90524eJ.A01(r6);
        C90504eH r10 = r26;
        int i2 = r10.A01;
        int i3 = r10.A00;
        byte[] bArr = r10.A02;
        int i4 = i3 - i2;
        this.A01 += (long) i4;
        r6.Acw(r10, i4);
        while (true) {
            int A012 = C90674eb.A01(bArr, this.A0C, i2, i3);
            if (A012 == i3) {
                break;
            }
            int i5 = A012 + 3;
            byte b2 = bArr[i5] & 31;
            int i6 = A012 - i2;
            if (i6 > 0) {
                if (!this.A05) {
                    this.A09.A01(bArr, i2, A012);
                    this.A07.A01(bArr, i2, A012);
                }
                this.A08.A01(bArr, i2, A012);
            }
            int i7 = i3 - A012;
            long j2 = this.A01 - ((long) i7);
            int i8 = -i6;
            if (i6 >= 0) {
                i8 = 0;
            }
            long j3 = this.A00;
            if (!this.A05) {
                AnonymousClass4WU r102 = this.A09;
                r102.A02(i8);
                AnonymousClass4WU r62 = this.A07;
                r62.A02(i8);
                if (r102.A01 && r62.A01) {
                    ArrayList A0u = AnonymousClass000.A0u();
                    A0u.add(Arrays.copyOf(r102.A03, r102.A00));
                    A0u.add(Arrays.copyOf(r62.A03, r62.A00));
                    AnonymousClass4O0 A022 = C90674eb.A02(r102.A03, 3, r102.A00);
                    AnonymousClass4XN r2 = new AnonymousClass4XN(r62.A03, 3, r62.A00);
                    r2.A05(8);
                    int A013 = r2.A01();
                    r2.A01();
                    r2.A03();
                    r2.A03();
                    AnonymousClass4Bz r12 = new AnonymousClass4Bz(A013);
                    int i9 = A022.A04;
                    int i10 = A022.A01;
                    int i11 = A022.A03;
                    Object[] objArr = new Object[3];
                    AnonymousClass000.A1K(objArr, i9);
                    AnonymousClass000.A1L(objArr, i10);
                    AnonymousClass3K2.A1W(objArr, i11);
                    String format = String.format("avc1.%02X%02X%02X", objArr);
                    C32481gS r22 = this.A02;
                    C32471gR A0N = AnonymousClass3K4.A0N();
                    A0N.A0O = this.A04;
                    A0N.A0R = "video/avc";
                    A0N.A0M = format;
                    A0N.A0G = A022.A06;
                    A0N.A07 = A022.A02;
                    A0N.A01 = A022.A00;
                    A0N.A0S = A0u;
                    AnonymousClass3K3.A19(A0N, r22);
                    this.A05 = true;
                    C85574Oz r23 = this.A03;
                    r23.A09.append(A022.A05, A022);
                    r23.A08.append(r12.A00, r12);
                    r102.A02 = false;
                    r102.A01 = false;
                    r62.A02 = false;
                    r62.A01 = false;
                }
            }
            AnonymousClass4WU r63 = this.A08;
            if (r63.A02(i8)) {
                int A002 = C90674eb.A00(r63.A03, r63.A00);
                C90504eH r3 = this.A0B;
                r3.A0U(r63.A03, A002);
                r3.A0S(4);
                C87504Xd.A00(r3, this.A0A.A01, j3);
            }
            C85574Oz r103 = this.A03;
            boolean z2 = this.A05;
            boolean z3 = this.A06;
            boolean z4 = false;
            if (r103.A00 == 9) {
                if (z2 && r103.A05) {
                    long j4 = r103.A01;
                    boolean z5 = r103.A06;
                    int i12 = (int) (j4 - r103.A03);
                    r103.A0A.Ad0((C86824Uh) null, z5 ? 1 : 0, i12, i7 + ((int) (j2 - j4)), r103.A04);
                }
                r103.A03 = r103.A01;
                r103.A04 = r103.A02;
                r103.A06 = false;
                r103.A05 = true;
            }
            boolean z6 = r103.A06;
            int i13 = r103.A00;
            if (i13 == 5 || (z3 && i13 == 1)) {
                z4 = true;
            }
            boolean z7 = z6 | z4;
            r103.A06 = z7;
            if (z7) {
                this.A06 = false;
            }
            long j5 = this.A00;
            if (!this.A05) {
                this.A09.A00(b2);
                this.A07.A00(b2);
            }
            r63.A00(b2);
            C85574Oz r24 = this.A03;
            r24.A00 = b2;
            r24.A02 = j5;
            r24.A01 = j2;
            i2 = i5;
        }
        if (!this.A05) {
            this.A09.A01(bArr, i2, i3);
            this.A07.A01(bArr, i2, i3);
        }
        this.A08.A01(bArr, i2, i3);
    }

    public void A7e(C15060qG r3, AnonymousClass4WV r4) {
        r4.A03();
        this.A04 = r4.A02();
        C32481gS Ah1 = r3.Ah1(r4.A01(), 2);
        this.A02 = Ah1;
        this.A03 = new C85574Oz(Ah1);
        this.A0A.A00(r3, r4);
    }

    public void Aa7() {
    }

    public void Aa8(long j2, int i2) {
        this.A00 = j2;
        this.A06 |= AnonymousClass000.A1O(i2 & 2);
    }

    public void AdB() {
        this.A01 = 0;
        this.A06 = false;
        boolean A1T = AnonymousClass3K3.A1T(this.A0C);
        AnonymousClass4WU r0 = this.A09;
        r0.A02 = A1T;
        r0.A01 = A1T;
        AnonymousClass4WU r02 = this.A07;
        r02.A02 = A1T;
        r02.A01 = A1T;
        AnonymousClass4WU r03 = this.A08;
        r03.A02 = A1T;
        r03.A01 = A1T;
        C85574Oz r04 = this.A03;
        if (r04 != null) {
            r04.A05 = A1T;
        }
    }
}
