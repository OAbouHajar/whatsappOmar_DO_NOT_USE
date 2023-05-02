package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2u9  reason: invalid class name and case insensitive filesystem */
public final class C58802u9 extends C28541Wm implements C28561Wp {
    public static final C58802u9 A06;
    public static volatile C47872Kz A07;
    public int A00;
    public int A01;
    public long A02;
    public C28631Ww A03 = C28631Ww.A01;
    public String A04 = "";
    public String A05 = "";

    static {
        C58802u9 r0 = new C58802u9();
        A06 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r15, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r15.ordinal()) {
            case 0:
                return A06;
            case 1:
                AnonymousClass2L6 r7 = (AnonymousClass2L6) obj4;
                C58802u9 r3 = (C58802u9) obj3;
                int i2 = this.A00;
                boolean A0T = C28541Wm.A0T(i2);
                int i3 = this.A01;
                int i4 = r3.A00;
                this.A01 = r7.Ahq(i3, r3.A01, A0T, C28541Wm.A0T(i4));
                this.A04 = r7.Ahz(this.A04, r3.A04, AnonymousClass000.A1R(i2 & 2, 2), AnonymousClass000.A1R(i4 & 2, 2));
                this.A02 = r7.Aht(this.A02, r3.A02, AnonymousClass000.A1R(i2 & 4, 4), AnonymousClass000.A1R(i4 & 4, 4));
                this.A05 = r7.Ahz(this.A05, r3.A05, AnonymousClass000.A1R(i2 & 8, 8), AnonymousClass000.A1R(i4 & 8, 8));
                this.A03 = r7.Ahn(this.A03, r3.A03, AnonymousClass000.A1R(i2 & 16, 16), AnonymousClass000.A1R(i4 & 16, 16));
                if (r7 == AnonymousClass2L7.A00) {
                    this.A00 |= r3.A00;
                }
                return this;
            case 2:
                C47852Kx r72 = (C47852Kx) obj4;
                while (true) {
                    try {
                        int A032 = r72.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 8) {
                            this.A00 |= 1;
                            this.A01 = r72.A02();
                        } else if (A032 == 18) {
                            String A0A = r72.A0A();
                            this.A00 |= 2;
                            this.A04 = A0A;
                        } else if (A032 == 24) {
                            this.A00 |= 4;
                            this.A02 = r72.A06();
                        } else if (A032 == 34) {
                            String A0A2 = r72.A0A();
                            this.A00 |= 8;
                            this.A05 = A0A2;
                        } else if (A032 == 42) {
                            this.A00 |= 16;
                            this.A03 = r72.A08();
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
                return new C58802u9();
            case 5:
                return new C68403dN();
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (C58802u9.class) {
                        if (A07 == null) {
                            A07 = C28541Wm.A09(A06);
                        }
                    }
                }
                return A07;
            default:
                throw C13680ns.A0m();
        }
        return A06;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = C28541Wm.A00(1, this.A01, 0);
        }
        if ((i4 & 2) == 2) {
            i3 = C28541Wm.A07(this.A04, i3);
        }
        int i5 = this.A00;
        if ((i5 & 4) == 4) {
            i3 = C28541Wm.A02(i3, this.A02);
        }
        if ((i5 & 8) == 8) {
            i3 = C28541Wm.A07(this.A05, i3);
        }
        if ((this.A00 & 16) == 16) {
            i3 = C28541Wm.A03(this.A03, 5, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0A(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0C(3, this.A02);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0D(4, this.A05);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0F(this.A03, 5);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
