package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2uI  reason: invalid class name and case insensitive filesystem */
public final class C58872uI extends C28541Wm implements C28561Wp {
    public static final C58872uI A08;
    public static volatile C47872Kz A09;
    public int A00;
    public long A01;
    public long A02;
    public C33211iD A03;
    public C58742tz A04;
    public C58932uO A05;
    public String A06 = "";
    public String A07 = "";

    static {
        C58872uI r0 = new C58872uI();
        A08 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r15, Object obj, Object obj2) {
        RuntimeException runtimeException;
        int i2;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r15.ordinal()) {
            case 0:
                return A08;
            case 1:
                AnonymousClass2L6 r7 = (AnonymousClass2L6) obj4;
                C58872uI r1 = (C58872uI) obj3;
                this.A03 = (C33211iD) r7.Ahu(this.A03, r1.A03);
                int i3 = this.A00;
                boolean A1R = AnonymousClass000.A1R(i3 & 2, 2);
                String str = this.A06;
                int i4 = r1.A00;
                this.A06 = r7.Ahz(str, r1.A06, A1R, AnonymousClass000.A1R(i4 & 2, 2));
                this.A01 = r7.Aht(this.A01, r1.A01, AnonymousClass000.A1R(i3 & 4, 4), AnonymousClass000.A1R(i4 & 4, 4));
                this.A07 = r7.Ahz(this.A07, r1.A07, AnonymousClass000.A1R(i3 & 8, 8), AnonymousClass000.A1R(i4 & 8, 8));
                this.A02 = r7.Aht(this.A02, r1.A02, AnonymousClass000.A1R(i3 & 16, 16), AnonymousClass000.A1R(i4 & 16, 16));
                this.A04 = (C58742tz) r7.Ahu(this.A04, r1.A04);
                this.A05 = (C58932uO) r7.Ahu(this.A05, r1.A05);
                if (r7 == AnonymousClass2L7.A00) {
                    this.A00 |= r1.A00;
                }
                return this;
            case 2:
                C47852Kx r72 = (C47852Kx) obj4;
                C47862Ky r12 = (C47862Ky) obj3;
                while (true) {
                    try {
                        int A032 = r72.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 10) {
                            String A0A = r72.A0A();
                            this.A00 |= 2;
                            this.A06 = A0A;
                        } else if (A032 == 16) {
                            this.A00 |= 4;
                            this.A01 = r72.A06();
                        } else if (A032 != 26) {
                            if (A032 == 34) {
                                C33221iE r2 = (this.A00 & 1) == 1 ? (C33221iE) this.A03.A0U() : null;
                                C33211iD r0 = (C33211iD) C28541Wm.A0H(r72, r12, C33211iD.A0o);
                                this.A03 = r0;
                                if (r2 != null) {
                                    this.A03 = (C33211iD) C28541Wm.A0C(r2, r0);
                                }
                                i2 = this.A00 | 1;
                            } else if (A032 == 40) {
                                this.A00 |= 16;
                                this.A02 = r72.A06();
                            } else if (A032 == 50) {
                                C69643fN r22 = (this.A00 & 32) == 32 ? (C69643fN) this.A04.A0U() : null;
                                C58742tz r02 = (C58742tz) C28541Wm.A0H(r72, r12, C58742tz.A04);
                                this.A04 = r02;
                                if (r22 != null) {
                                    this.A04 = (C58742tz) C28541Wm.A0C(r22, r02);
                                }
                                i2 = this.A00 | 32;
                            } else if (A032 == 58) {
                                C69223eh r23 = (this.A00 & 64) == 64 ? (C69223eh) this.A05.A0U() : null;
                                C58932uO r03 = (C58932uO) C28541Wm.A0H(r72, r12, C58932uO.A0B);
                                this.A05 = r03;
                                if (r23 != null) {
                                    this.A05 = (C58932uO) C28541Wm.A0C(r23, r03);
                                }
                                i2 = this.A00 | 64;
                            } else if (!A0a(r72, A032)) {
                                break;
                            }
                            this.A00 = i2;
                        } else {
                            String A0A2 = r72.A0A();
                            this.A00 |= 8;
                            this.A07 = A0A2;
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
                return new C58872uI();
            case 5:
                return new C69553fE();
            case 6:
                break;
            case 7:
                if (A09 == null) {
                    synchronized (C58872uI.class) {
                        if (A09 == null) {
                            A09 = C28541Wm.A09(A08);
                        }
                    }
                }
                return A09;
            default:
                throw C13680ns.A0m();
        }
        return A08;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 2) == 2) {
            i3 = 0 + CodedOutputStream.A06(this.A06) + 1;
        }
        int i4 = this.A00;
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A03(this.A01) + 1;
        }
        if ((i4 & 8) == 8) {
            i3 += CodedOutputStream.A06(this.A07) + 1;
        }
        if ((this.A00 & 1) == 1) {
            C33211iD r0 = this.A03;
            if (r0 == null) {
                r0 = C33211iD.A0o;
            }
            i3 = C28541Wm.A06(r0, 4, i3);
        }
        int i5 = this.A00;
        if ((i5 & 16) == 16) {
            i3 += 1 + CodedOutputStream.A03(this.A02);
        }
        if ((i5 & 32) == 32) {
            C58742tz r02 = this.A04;
            if (r02 == null) {
                r02 = C58742tz.A04;
            }
            i3 = C28541Wm.A06(r02, 6, i3);
        }
        if ((this.A00 & 64) == 64) {
            C58932uO r03 = this.A05;
            if (r03 == null) {
                r03 = C58932uO.A0B;
            }
            i3 = C28541Wm.A06(r03, 7, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(1, this.A06);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0C(2, this.A01);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0D(3, this.A07);
        }
        if ((this.A00 & 1) == 1) {
            C33211iD r0 = this.A03;
            if (r0 == null) {
                r0 = C33211iD.A0o;
            }
            codedOutputStream.A0G(r0, 4);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0C(5, this.A02);
        }
        if ((this.A00 & 32) == 32) {
            C58742tz r02 = this.A04;
            if (r02 == null) {
                r02 = C58742tz.A04;
            }
            codedOutputStream.A0G(r02, 6);
        }
        if ((this.A00 & 64) == 64) {
            C58932uO r03 = this.A05;
            if (r03 == null) {
                r03 = C58932uO.A0B;
            }
            codedOutputStream.A0G(r03, 7);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
