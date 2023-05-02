package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2tz  reason: invalid class name and case insensitive filesystem */
public final class C58742tz extends C28541Wm implements C28561Wp {
    public static final C58742tz A04;
    public static volatile C47872Kz A05;
    public int A00;
    public int A01;
    public long A02;
    public String A03 = "";

    static {
        C58742tz r0 = new C58742tz();
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
                C58742tz r6 = (C58742tz) obj3;
                int i2 = this.A00;
                boolean A0T = C28541Wm.A0T(i2);
                long j2 = this.A02;
                int i3 = r6.A00;
                this.A02 = r7.Aht(j2, r6.A02, A0T, C28541Wm.A0T(i3));
                this.A01 = r7.Ahq(this.A01, r6.A01, AnonymousClass000.A1R(i2 & 2, 2), AnonymousClass000.A1R(i3 & 2, 2));
                this.A03 = r7.Ahz(this.A03, r6.A03, AnonymousClass000.A1R(i2 & 4, 4), AnonymousClass000.A1R(i3 & 4, 4));
                if (r7 == AnonymousClass2L7.A00) {
                    this.A00 = i2 | i3;
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
                            this.A02 = r72.A06();
                        } else if (A032 == 16) {
                            this.A00 |= 2;
                            this.A01 = r72.A02();
                        } else if (A032 == 26) {
                            String A0A = r72.A0A();
                            this.A00 |= 4;
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
                return new C58742tz();
            case 5:
                return new C69643fN();
            case 6:
                break;
            case 7:
                if (A05 == null) {
                    synchronized (C58742tz.class) {
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
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A03(this.A02) + 1;
        }
        if ((i4 & 2) == 2) {
            i3 = C28541Wm.A00(2, this.A01, i3);
        }
        if ((i4 & 4) == 4) {
            i3 = C28541Wm.A08(this.A03, 1, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0C(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0A(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0D(3, this.A03);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
