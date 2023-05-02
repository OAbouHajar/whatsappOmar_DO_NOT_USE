package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2u6  reason: invalid class name and case insensitive filesystem */
public final class C58782u6 extends C28541Wm implements C28561Wp {
    public static final C58782u6 A05;
    public static volatile C47872Kz A06;
    public double A00;
    public double A01;
    public int A02;
    public int A03;
    public int A04;

    static {
        C58782u6 r0 = new C58782u6();
        A05 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r15, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r15.ordinal()) {
            case 0:
                return A05;
            case 1:
                AnonymousClass2L6 r7 = (AnonymousClass2L6) obj4;
                C58782u6 r3 = (C58782u6) obj3;
                int i2 = this.A02;
                boolean A0T = C28541Wm.A0T(i2);
                int i3 = this.A03;
                int i4 = r3.A02;
                this.A03 = r7.Ahq(i3, r3.A03, A0T, C28541Wm.A0T(i4));
                this.A04 = r7.Ahq(this.A04, r3.A04, AnonymousClass000.A1R(i2 & 2, 2), AnonymousClass000.A1R(i4 & 2, 2));
                this.A00 = r7.Aho(this.A00, r3.A00, AnonymousClass000.A1R(i2 & 4, 4), AnonymousClass000.A1R(i4 & 4, 4));
                this.A01 = r7.Aho(this.A01, r3.A01, AnonymousClass000.A1R(i2 & 8, 8), AnonymousClass000.A1R(i4 & 8, 8));
                if (r7 == AnonymousClass2L7.A00) {
                    this.A02 = i2 | i4;
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
                            this.A02 |= 1;
                            this.A03 = r72.A02();
                        } else if (A032 == 16) {
                            this.A02 |= 2;
                            this.A04 = r72.A02();
                        } else if (A032 == 25) {
                            this.A02 |= 4;
                            this.A00 = Double.longBitsToDouble(r72.A05());
                        } else if (A032 == 33) {
                            this.A02 |= 8;
                            this.A01 = Double.longBitsToDouble(r72.A05());
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
                return new C58782u6();
            case 5:
                return new C69243ej();
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C58782u6.class) {
                        if (A06 == null) {
                            A06 = C28541Wm.A09(A05);
                        }
                    }
                }
                return A06;
            default:
                throw C13680ns.A0m();
        }
        return A05;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A02;
        if ((i4 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A01(1, this.A03);
        }
        if ((i4 & 2) == 2) {
            i3 += CodedOutputStream.A01(2, this.A04);
        }
        if ((i4 & 4) == 4) {
            i3 += 9;
        }
        if ((i4 & 8) == 8) {
            i3 += 9;
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A02 & 1) == 1) {
            codedOutputStream.A09(1, this.A03);
        }
        if ((this.A02 & 2) == 2) {
            codedOutputStream.A09(2, this.A04);
        }
        if ((this.A02 & 4) == 4) {
            codedOutputStream.A0B(3, Double.doubleToRawLongBits(this.A00));
        }
        if ((this.A02 & 8) == 8) {
            codedOutputStream.A0B(4, Double.doubleToRawLongBits(this.A01));
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
