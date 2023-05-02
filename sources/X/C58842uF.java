package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2uF  reason: invalid class name and case insensitive filesystem */
public final class C58842uF extends C28541Wm implements C28561Wp {
    public static final C58842uF A07;
    public static volatile C47872Kz A08;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public C33231iF A05;
    public String A06 = "";

    static {
        C58842uF r0 = new C58842uF();
        A07 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r15, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r15.ordinal()) {
            case 0:
                return A07;
            case 1:
                AnonymousClass2L6 r7 = (AnonymousClass2L6) obj4;
                C58842uF r0 = (C58842uF) obj3;
                int i2 = this.A00;
                boolean A0T = C28541Wm.A0T(i2);
                int i3 = this.A01;
                int i4 = r0.A00;
                this.A01 = r7.Ahq(i3, r0.A01, A0T, C28541Wm.A0T(i4));
                this.A04 = r7.Aht(this.A04, r0.A04, AnonymousClass000.A1R(i2 & 2, 2), AnonymousClass000.A1R(i4 & 2, 2));
                this.A05 = (C33231iF) r7.Ahu(this.A05, r0.A05);
                int i5 = this.A00;
                boolean A1R = AnonymousClass000.A1R(i5 & 8, 8);
                String str = this.A06;
                int i6 = r0.A00;
                this.A06 = r7.Ahz(str, r0.A06, A1R, AnonymousClass000.A1R(i6 & 8, 8));
                this.A02 = r7.Aht(this.A02, r0.A02, AnonymousClass000.A1R(i5 & 16, 16), AnonymousClass000.A1R(i6 & 16, 16));
                this.A03 = r7.Aht(this.A03, r0.A03, AnonymousClass000.A1R(i5 & 32, 32), AnonymousClass000.A1R(i6 & 32, 32));
                if (r7 == AnonymousClass2L7.A00) {
                    this.A00 = i5 | i6;
                }
                return this;
            case 2:
                C47852Kx r72 = (C47852Kx) obj4;
                C47862Ky r02 = (C47862Ky) obj3;
                while (true) {
                    try {
                        int A032 = r72.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 8) {
                            int A022 = r72.A02();
                            if (C802042y.A00(A022) == null) {
                                super.A0X(1, A022);
                            } else {
                                this.A00 = 1 | this.A00;
                                this.A01 = A022;
                            }
                        } else if (A032 == 16) {
                            this.A00 |= 2;
                            this.A04 = r72.A06();
                        } else if (A032 == 26) {
                            C33241iG r2 = (this.A00 & 4) == 4 ? (C33241iG) this.A05.A0U() : null;
                            C33231iF r1 = (C33231iF) C28541Wm.A0H(r72, r02, C33231iF.A05);
                            this.A05 = r1;
                            if (r2 != null) {
                                this.A05 = (C33231iF) C28541Wm.A0C(r2, r1);
                            }
                            this.A00 |= 4;
                        } else if (A032 == 34) {
                            String A0A = r72.A0A();
                            this.A00 |= 8;
                            this.A06 = A0A;
                        } else if (A032 == 40) {
                            this.A00 |= 16;
                            this.A02 = r72.A06();
                        } else if (A032 == 48) {
                            this.A00 |= 32;
                            this.A03 = r72.A06();
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
                return new C58842uF();
            case 5:
                return new C69463f5();
            case 6:
                break;
            case 7:
                if (A08 == null) {
                    synchronized (C58842uF.class) {
                        if (A08 == null) {
                            A08 = C28541Wm.A09(A07);
                        }
                    }
                }
                return A08;
            default:
                throw C13680ns.A0m();
        }
        return A07;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = C28541Wm.A01(1, this.A01, 0);
        }
        if ((i4 & 2) == 2) {
            i3 = C28541Wm.A02(i3, this.A04);
        }
        if ((i4 & 4) == 4) {
            C33231iF r0 = this.A05;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            i3 = C28541Wm.A06(r0, 3, i3);
        }
        if ((this.A00 & 8) == 8) {
            i3 = C28541Wm.A07(this.A06, i3);
        }
        int i5 = this.A00;
        if ((i5 & 16) == 16) {
            i3 = C28541Wm.A02(i3, this.A02);
        }
        if ((i5 & 32) == 32) {
            i3 = C28541Wm.A02(i3, this.A03);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A09(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0C(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            C33231iF r0 = this.A05;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            codedOutputStream.A0G(r0, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0D(4, this.A06);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0C(5, this.A02);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0C(6, this.A03);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
