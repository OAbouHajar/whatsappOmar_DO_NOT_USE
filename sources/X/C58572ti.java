package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2ti  reason: invalid class name and case insensitive filesystem */
public final class C58572ti extends C28541Wm implements C28561Wp {
    public static final C58572ti A04;
    public static volatile C47872Kz A05;
    public double A00;
    public double A01;
    public int A02;
    public String A03 = "";

    static {
        C58572ti r0 = new C58572ti();
        A04 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r15, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r15.ordinal()) {
            case 0:
                return A04;
            case 1:
                AnonymousClass2L6 r7 = (AnonymousClass2L6) obj4;
                C58572ti r1 = (C58572ti) obj3;
                int i2 = this.A02;
                boolean A0T = C28541Wm.A0T(i2);
                double d2 = this.A00;
                int i3 = r1.A02;
                this.A00 = r7.Aho(d2, r1.A00, A0T, C28541Wm.A0T(i3));
                this.A01 = r7.Aho(this.A01, r1.A01, AnonymousClass000.A1R(i2 & 2, 2), AnonymousClass000.A1R(i3 & 2, 2));
                this.A03 = r7.Ahz(this.A03, r1.A03, AnonymousClass000.A1R(i2 & 4, 4), AnonymousClass000.A1R(i3 & 4, 4));
                if (r7 == AnonymousClass2L7.A00) {
                    this.A02 = i2 | i3;
                }
                return this;
            case 2:
                C47852Kx r72 = (C47852Kx) obj4;
                while (true) {
                    try {
                        int A032 = r72.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 9) {
                            this.A02 |= 1;
                            this.A00 = Double.longBitsToDouble(r72.A05());
                        } else if (A032 == 17) {
                            this.A02 |= 2;
                            this.A01 = Double.longBitsToDouble(r72.A05());
                        } else if (A032 == 26) {
                            String A0A = r72.A0A();
                            this.A02 |= 4;
                            this.A03 = A0A;
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
                return new C58572ti();
            case 5:
                return new C68513dY();
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C58572ti.class) {
                        if (A05 == null) {
                            A05 = C28541Wm.A09(A04);
                        }
                    }
                }
                return A05;
            default:
                throw C13680ns.A0m();
        }
        return A04;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A02;
        if ((i4 & 1) == 1) {
            i3 = 9;
        }
        if ((i4 & 2) == 2) {
            i3 += 9;
        }
        if ((i4 & 4) == 4) {
            i3 = C28541Wm.A07(this.A03, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A02 & 1) == 1) {
            codedOutputStream.A0B(1, Double.doubleToRawLongBits(this.A00));
        }
        if ((this.A02 & 2) == 2) {
            codedOutputStream.A0B(2, Double.doubleToRawLongBits(this.A01));
        }
        if ((this.A02 & 4) == 4) {
            codedOutputStream.A0D(3, this.A03);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
