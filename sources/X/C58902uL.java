package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2uL  reason: invalid class name and case insensitive filesystem */
public final class C58902uL extends C28541Wm implements C28561Wp {
    public static final C58902uL A09;
    public static volatile C47872Kz A0A;
    public int A00;
    public int A01;
    public long A02;
    public C28631Ww A03 = C28631Ww.A01;
    public AnonymousClass21S A04;
    public String A05 = "";
    public String A06 = "";
    public String A07 = "";
    public String A08 = "";

    static {
        C58902uL r0 = new C58902uL();
        A09 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r15, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r15.ordinal()) {
            case 0:
                return A09;
            case 1:
                AnonymousClass2L6 r7 = (AnonymousClass2L6) obj4;
                C58902uL r2 = (C58902uL) obj3;
                int i2 = this.A00;
                boolean A0T = C28541Wm.A0T(i2);
                String str = this.A06;
                int i3 = r2.A00;
                this.A06 = r7.Ahz(str, r2.A06, A0T, C28541Wm.A0T(i3));
                this.A08 = r7.Ahz(this.A08, r2.A08, AnonymousClass000.A1R(i2 & 2, 2), AnonymousClass000.A1R(i3 & 2, 2));
                this.A02 = r7.Aht(this.A02, r2.A02, AnonymousClass000.A1R(i2 & 4, 4), AnonymousClass000.A1R(i3 & 4, 4));
                this.A07 = r7.Ahz(this.A07, r2.A07, AnonymousClass000.A1R(i2 & 8, 8), AnonymousClass000.A1R(i3 & 8, 8));
                this.A03 = r7.Ahn(this.A03, r2.A03, AnonymousClass000.A1R(i2 & 16, 16), AnonymousClass000.A1R(i3 & 16, 16));
                this.A05 = r7.Ahz(this.A05, r2.A05, AnonymousClass000.A1R(this.A00 & 32, 32), AnonymousClass000.A1R(r2.A00 & 32, 32));
                this.A04 = (AnonymousClass21S) r7.Ahu(this.A04, r2.A04);
                int i4 = this.A00;
                boolean A1R = AnonymousClass000.A1R(i4 & 128, 128);
                int i5 = this.A01;
                int i6 = r2.A00;
                this.A01 = r7.Ahq(i5, r2.A01, A1R, AnonymousClass000.A1R(i6 & 128, 128));
                if (r7 == AnonymousClass2L7.A00) {
                    this.A00 = i4 | i6;
                }
                return this;
            case 2:
                C47852Kx r72 = (C47852Kx) obj4;
                C47862Ky r22 = (C47862Ky) obj3;
                while (true) {
                    try {
                        int A032 = r72.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 10) {
                            String A0A2 = r72.A0A();
                            this.A00 = 1 | this.A00;
                            this.A06 = A0A2;
                        } else if (A032 == 18) {
                            String A0A3 = r72.A0A();
                            this.A00 |= 2;
                            this.A08 = A0A3;
                        } else if (A032 == 24) {
                            this.A00 |= 4;
                            this.A02 = r72.A06();
                        } else if (A032 == 34) {
                            String A0A4 = r72.A0A();
                            this.A00 |= 8;
                            this.A07 = A0A4;
                        } else if (A032 == 42) {
                            this.A00 |= 16;
                            this.A03 = r72.A08();
                        } else if (A032 == 50) {
                            String A0A5 = r72.A0A();
                            this.A00 |= 32;
                            this.A05 = A0A5;
                        } else if (A032 == 58) {
                            AnonymousClass21T r1 = (this.A00 & 64) == 64 ? (AnonymousClass21T) this.A04.A0U() : null;
                            AnonymousClass21S r0 = (AnonymousClass21S) C28541Wm.A0H(r72, r22, AnonymousClass21S.A0R);
                            this.A04 = r0;
                            if (r1 != null) {
                                this.A04 = (AnonymousClass21S) C28541Wm.A0C(r1, r0);
                            }
                            this.A00 |= 64;
                        } else if (A032 == 64) {
                            int A022 = r72.A02();
                            if (A022 == 0 || A022 == 1) {
                                this.A00 |= 128;
                                this.A01 = A022;
                            } else {
                                super.A0X(8, A022);
                            }
                        } else if (!A0a(r72, A032)) {
                            break;
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
                return null;
            case 4:
                return new C58902uL();
            case 5:
                return new C68723dt();
            case 6:
                break;
            case 7:
                if (A0A == null) {
                    synchronized (C58902uL.class) {
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
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            i3 = C28541Wm.A08(this.A06, 1, 0);
        }
        if ((this.A00 & 2) == 2) {
            i3 = C28541Wm.A07(this.A08, i3);
        }
        int i4 = this.A00;
        if ((i4 & 4) == 4) {
            i3 = C28541Wm.A02(i3, this.A02);
        }
        if ((i4 & 8) == 8) {
            i3 = C28541Wm.A07(this.A07, i3);
        }
        int i5 = this.A00;
        if ((i5 & 16) == 16) {
            i3 = C28541Wm.A03(this.A03, 5, i3);
        }
        if ((i5 & 32) == 32) {
            i3 = C28541Wm.A07(this.A05, i3);
        }
        if ((this.A00 & 64) == 64) {
            AnonymousClass21S r0 = this.A04;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            i3 = C28541Wm.A06(r0, 7, i3);
        }
        if ((this.A00 & 128) == 128) {
            i3 = C28541Wm.A01(8, this.A01, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A06);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A08);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0C(3, this.A02);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0D(4, this.A07);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0F(this.A03, 5);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0D(6, this.A05);
        }
        if ((this.A00 & 64) == 64) {
            AnonymousClass21S r0 = this.A04;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            codedOutputStream.A0G(r0, 7);
        }
        if ((this.A00 & 128) == 128) {
            codedOutputStream.A09(8, this.A01);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
