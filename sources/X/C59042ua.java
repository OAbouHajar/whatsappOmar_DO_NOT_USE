package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2ua  reason: invalid class name and case insensitive filesystem */
public final class C59042ua extends C28541Wm implements C28561Wp {
    public static final C59042ua A09;
    public static volatile C47872Kz A0A;
    public int A00;
    public int A01;
    public AnonymousClass1XE A02 = AnonymousClass2NE.A01;
    public AnonymousClass21S A03;
    public C58672ts A04;
    public String A05 = "";
    public String A06 = "";
    public String A07 = "";
    public String A08 = "";

    static {
        C59042ua r0 = new C59042ua();
        A09 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r7, Object obj, Object obj2) {
        RuntimeException runtimeException;
        int i2;
        switch (r7.ordinal()) {
            case 0:
                return A09;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj;
                C59042ua r9 = (C59042ua) obj2;
                int i3 = this.A00;
                boolean A0T = C28541Wm.A0T(i3);
                String str = this.A08;
                int i4 = r9.A00;
                this.A08 = r8.Ahz(str, r9.A08, A0T, C28541Wm.A0T(i4));
                this.A06 = r8.Ahz(this.A06, r9.A06, AnonymousClass000.A1R(i3 & 2, 2), AnonymousClass000.A1R(i4 & 2, 2));
                this.A05 = r8.Ahz(this.A05, r9.A05, AnonymousClass000.A1R(i3 & 4, 4), AnonymousClass000.A1R(i4 & 4, 4));
                this.A01 = r8.Ahq(this.A01, r9.A01, AnonymousClass000.A1R(i3 & 8, 8), AnonymousClass000.A1R(i4 & 8, 8));
                this.A02 = r8.Ahs(this.A02, r9.A02);
                this.A04 = (C58672ts) r8.Ahu(this.A04, r9.A04);
                this.A07 = r8.Ahz(this.A07, r9.A07, AnonymousClass000.A1R(this.A00 & 32, 32), AnonymousClass000.A1R(r9.A00 & 32, 32));
                this.A03 = (AnonymousClass21S) r8.Ahu(this.A03, r9.A03);
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 |= r9.A00;
                }
                return this;
            case 2:
                C47852Kx r82 = (C47852Kx) obj;
                C47862Ky r92 = (C47862Ky) obj2;
                while (true) {
                    try {
                        int A032 = r82.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 10) {
                            String A0A2 = r82.A0A();
                            this.A00 = 1 | this.A00;
                            this.A08 = A0A2;
                        } else if (A032 == 18) {
                            String A0A3 = r82.A0A();
                            this.A00 |= 2;
                            this.A06 = A0A3;
                        } else if (A032 == 26) {
                            String A0A4 = r82.A0A();
                            this.A00 |= 4;
                            this.A05 = A0A4;
                        } else if (A032 == 32) {
                            int A022 = r82.A02();
                            if (A022 == 0 || A022 == 1 || A022 == 2) {
                                this.A00 |= 8;
                                this.A01 = A022;
                            } else {
                                super.A0X(4, A022);
                            }
                        } else if (A032 != 42) {
                            if (A032 == 50) {
                                C68953eG r1 = (this.A00 & 16) == 16 ? (C68953eG) this.A04.A0U() : null;
                                C58672ts r0 = (C58672ts) C28541Wm.A0H(r82, r92, C58672ts.A04);
                                this.A04 = r0;
                                if (r1 != null) {
                                    this.A04 = (C58672ts) C28541Wm.A0C(r1, r0);
                                }
                                i2 = this.A00 | 16;
                            } else if (A032 == 58) {
                                String A0A5 = r82.A0A();
                                this.A00 |= 32;
                                this.A07 = A0A5;
                            } else if (A032 == 66) {
                                AnonymousClass21T r12 = (this.A00 & 64) == 64 ? (AnonymousClass21T) this.A03.A0U() : null;
                                AnonymousClass21S r02 = (AnonymousClass21S) C28541Wm.A0H(r82, r92, AnonymousClass21S.A0R);
                                this.A03 = r02;
                                if (r12 != null) {
                                    this.A03 = (AnonymousClass21S) C28541Wm.A0C(r12, r02);
                                }
                                i2 = this.A00 | 64;
                            } else if (!A0a(r82, A032)) {
                                break;
                            }
                            this.A00 = i2;
                        } else {
                            AnonymousClass1XE r13 = this.A02;
                            if (!((AnonymousClass1XF) r13).A00) {
                                r13 = C28541Wm.A0G(r13);
                                this.A02 = r13;
                            }
                            r13.add((C58442tV) C28541Wm.A0H(r82, r92, C58442tV.A03));
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
                C28541Wm.A0R(this.A02);
                return null;
            case 4:
                return new C59042ua();
            case 5:
                return new C68923eD();
            case 6:
                break;
            case 7:
                if (A0A == null) {
                    synchronized (C59042ua.class) {
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

    public AnonymousClass42U A0c() {
        int i2 = this.A01;
        if (i2 != 0) {
            if (i2 == 1) {
                return AnonymousClass42U.A02;
            }
            if (i2 == 2) {
                return AnonymousClass42U.A01;
            }
        }
        return AnonymousClass42U.A03;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int A062 = (this.A00 & 1) == 1 ? 1 + CodedOutputStream.A06(this.A08) : 0;
        if ((this.A00 & 2) == 2) {
            A062 = C28541Wm.A07(this.A06, A062);
        }
        if ((this.A00 & 4) == 4) {
            A062 = C28541Wm.A07(this.A05, A062);
        }
        if ((this.A00 & 8) == 8) {
            A062 = C28541Wm.A01(4, this.A01, A062);
        }
        for (int i3 = 0; i3 < this.A02.size(); i3++) {
            A062 = C28541Wm.A06((AnonymousClass1Wo) this.A02.get(i3), 5, A062);
        }
        if ((this.A00 & 16) == 16) {
            C58672ts r0 = this.A04;
            if (r0 == null) {
                r0 = C58672ts.A04;
            }
            A062 = C28541Wm.A06(r0, 6, A062);
        }
        if ((this.A00 & 32) == 32) {
            A062 = C28541Wm.A07(this.A07, A062);
        }
        if ((this.A00 & 64) == 64) {
            AnonymousClass21S r02 = this.A03;
            if (r02 == null) {
                r02 = AnonymousClass21S.A0R;
            }
            A062 = C28541Wm.A06(r02, 8, A062);
        }
        return C28541Wm.A05(this, A062);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A08);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A06);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0D(3, this.A05);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A09(4, this.A01);
        }
        int i2 = 0;
        while (i2 < this.A02.size()) {
            i2 = C28541Wm.A04(codedOutputStream, this.A02, i2, 5);
        }
        if ((this.A00 & 16) == 16) {
            C58672ts r0 = this.A04;
            if (r0 == null) {
                r0 = C58672ts.A04;
            }
            codedOutputStream.A0G(r0, 6);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0D(7, this.A07);
        }
        if ((this.A00 & 64) == 64) {
            AnonymousClass21S r02 = this.A03;
            if (r02 == null) {
                r02 = AnonymousClass21S.A0R;
            }
            codedOutputStream.A0G(r02, 8);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
