package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2uK  reason: invalid class name and case insensitive filesystem */
public final class C58892uK extends C28541Wm implements C28561Wp {
    public static final C58892uK A09;
    public static volatile C47872Kz A0A;
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public long A03;
    public long A04;
    public C28631Ww A05;
    public C28631Ww A06;
    public AnonymousClass27P A07;
    public AnonymousClass27P A08;

    static {
        C58892uK r0 = new C58892uK();
        A09 = r0;
        r0.A0W();
    }

    public C58892uK() {
        C28631Ww r1 = C28631Ww.A01;
        this.A06 = r1;
        C58132sw r0 = C58132sw.A02;
        this.A08 = r0;
        this.A05 = r1;
        this.A07 = r0;
    }

    public static int A0U(int i2) {
        if (i2 < 0) {
            return 10;
        }
        if ((i2 & -128) == 0) {
            return 1;
        }
        if ((i2 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i2) != 0) {
            return (i2 & -268435456) == 0 ? 4 : 5;
        }
        return 3;
    }

    public static int A0V(Object obj, int i2) {
        C58132sw r1 = (C58132sw) obj;
        r1.A01(i2);
        int i3 = r1.A01[i2];
        if ((i3 & -128) == 0) {
            return 1;
        }
        if ((i3 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i3) != 0) {
            return (i3 & -268435456) == 0 ? 4 : 5;
        }
        return 3;
    }

    public final Object A0b(AnonymousClass2L5 r12, Object obj, Object obj2) {
        RuntimeException runtimeException;
        AnonymousClass27P r2;
        int i2;
        int i3;
        Object obj3 = obj;
        switch (r12.ordinal()) {
            case 0:
                return A09;
            case 1:
                AnonymousClass2L6 r4 = (AnonymousClass2L6) obj3;
                C58892uK r14 = (C58892uK) obj2;
                this.A06 = r4.Ahn(this.A06, r14.A06, C28541Wm.A0T(this.A00), C28541Wm.A0T(r14.A00));
                this.A04 = r4.Aht(this.A04, r14.A04, AnonymousClass000.A1R(this.A00 & 2, 2), AnonymousClass000.A1R(r14.A00 & 2, 2));
                this.A08 = r4.Ahr(this.A08, r14.A08);
                this.A05 = r4.Ahn(this.A05, r14.A05, AnonymousClass000.A1R(this.A00 & 4, 4), AnonymousClass000.A1R(r14.A00 & 4, 4));
                this.A03 = r4.Aht(this.A03, r14.A03, AnonymousClass000.A1R(this.A00 & 8, 8), AnonymousClass000.A1R(r14.A00 & 8, 8));
                this.A07 = r4.Ahr(this.A07, r14.A07);
                if (r4 == AnonymousClass2L7.A00) {
                    this.A00 |= r14.A00;
                }
                return this;
            case 2:
                C47852Kx r42 = (C47852Kx) obj3;
                while (true) {
                    try {
                        int A032 = r42.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 10) {
                            this.A00 |= 1;
                            this.A06 = r42.A08();
                        } else if (A032 != 16) {
                            if (A032 != 24) {
                                if (A032 == 26) {
                                    i3 = r42.A04(r42.A02());
                                    AnonymousClass27P r1 = this.A08;
                                    if (!((AnonymousClass1XF) r1).A00 && r42.A00() > 0) {
                                        this.A08 = C28541Wm.A0F(r1);
                                    }
                                    while (r42.A00() > 0) {
                                        C58132sw r22 = (C58132sw) this.A08;
                                        r22.A02(r22.A00, r42.A02());
                                    }
                                } else if (A032 == 66) {
                                    this.A00 |= 4;
                                    this.A05 = r42.A08();
                                } else if (A032 == 72) {
                                    this.A00 |= 8;
                                    this.A03 = r42.A06();
                                } else if (A032 == 80) {
                                    r2 = this.A07;
                                    if (!((AnonymousClass1XF) r2).A00) {
                                        r2 = C28541Wm.A0F(r2);
                                        this.A07 = r2;
                                    }
                                    i2 = r42.A02();
                                } else if (A032 == 82) {
                                    i3 = r42.A04(r42.A02());
                                    AnonymousClass27P r13 = this.A07;
                                    if (!((AnonymousClass1XF) r13).A00 && r42.A00() > 0) {
                                        this.A07 = C28541Wm.A0F(r13);
                                    }
                                    while (r42.A00() > 0) {
                                        C58132sw r23 = (C58132sw) this.A07;
                                        r23.A02(r23.A00, r42.A02());
                                    }
                                } else if (!A0a(r42, A032)) {
                                    break;
                                }
                                r42.A03 = i3;
                                r42.A0B();
                            } else {
                                AnonymousClass27P r24 = this.A08;
                                if (!((AnonymousClass1XF) r24).A00) {
                                    r24 = C28541Wm.A0F(r24);
                                    this.A08 = r24;
                                }
                                i2 = r42.A02();
                            }
                            C58132sw r25 = (C58132sw) r2;
                            r25.A02(r25.A00, i2);
                        } else {
                            this.A00 |= 2;
                            this.A04 = r42.A06();
                        }
                    } catch (C29791bD e2) {
                        runtimeException = C28541Wm.A0J(e2, this);
                        throw runtimeException;
                    } catch (IOException e3) {
                        runtimeException = C28541Wm.A0K(this, e3);
                        throw runtimeException;
                    }
                }
            case 3:
                ((AnonymousClass1XF) this.A08).A00 = false;
                ((AnonymousClass1XF) this.A07).A00 = false;
                return null;
            case 4:
                return new C58892uK();
            case 5:
                return new C68453dS();
            case 6:
                break;
            case 7:
                if (A0A == null) {
                    synchronized (C58892uK.class) {
                        if (A0A == null) {
                            A0A = C28541Wm.A09(A09);
                        }
                    }
                }
                return A0A;
            default:
                throw C13680ns.A0m();
        }
        return A09;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.A00;
        int A042 = (i3 & 1) == 1 ? CodedOutputStream.A04(this.A06, 1) : 0;
        if ((i3 & 2) == 2) {
            A042 = C28541Wm.A02(A042, this.A04);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.A08.size(); i5++) {
            i4 += A0V(this.A08, i5);
        }
        int i6 = A042 + i4;
        if (!this.A08.isEmpty()) {
            i6 = i6 + 1 + A0U(i4);
        }
        this.A02 = i4;
        int i7 = this.A00;
        if ((i7 & 4) == 4) {
            i6 = C28541Wm.A03(this.A05, 8, i6);
        }
        if ((i7 & 8) == 8) {
            i6 = C28541Wm.A02(i6, this.A03);
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.A07.size(); i9++) {
            i8 += A0V(this.A07, i9);
        }
        int i10 = i6 + i8;
        if (!this.A07.isEmpty()) {
            i10 = i10 + 1 + A0U(i8);
        }
        this.A01 = i8;
        return C28541Wm.A05(this, i10);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        AFw();
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0F(this.A06, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0C(2, this.A04);
        }
        if (this.A08.size() > 0) {
            codedOutputStream.A07(26);
            codedOutputStream.A07(this.A02);
        }
        for (int i2 = 0; i2 < this.A08.size(); i2++) {
            C58132sw r0 = (C58132sw) this.A08;
            r0.A01(i2);
            codedOutputStream.A07(r0.A01[i2]);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A05, 8);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0C(9, this.A03);
        }
        if (this.A07.size() > 0) {
            codedOutputStream.A07(82);
            codedOutputStream.A07(this.A01);
        }
        for (int i3 = 0; i3 < this.A07.size(); i3++) {
            C58132sw r02 = (C58132sw) this.A07;
            r02.A01(i3);
            codedOutputStream.A07(r02.A01[i3]);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
