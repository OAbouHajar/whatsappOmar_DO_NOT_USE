package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2tR  reason: invalid class name and case insensitive filesystem */
public final class C58402tR extends C28541Wm implements C28561Wp {
    public static final C58402tR A03;
    public static volatile C47872Kz A04;
    public int A00;
    public long A01;
    public String A02 = "";

    static {
        C58402tR r0 = new C58402tR();
        A03 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r15, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r15.ordinal()) {
            case 0:
                return A03;
            case 1:
                AnonymousClass2L6 r7 = (AnonymousClass2L6) obj4;
                C58402tR r5 = (C58402tR) obj3;
                int i2 = this.A00;
                boolean A0T = C28541Wm.A0T(i2);
                String str = this.A02;
                int i3 = r5.A00;
                this.A02 = r7.Ahz(str, r5.A02, A0T, C28541Wm.A0T(i3));
                this.A01 = r7.Aht(this.A01, r5.A01, AnonymousClass000.A1R(i2 & 2, 2), AnonymousClass000.A1R(i3 & 2, 2));
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
                        } else if (A032 == 10) {
                            String A0A = r72.A0A();
                            this.A00 = 1 | this.A00;
                            this.A02 = A0A;
                        } else if (A032 == 16) {
                            this.A00 |= 2;
                            this.A01 = r72.A06();
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
                return new C58402tR();
            case 5:
                return new C68753dw();
            case 6:
                break;
            case 7:
                if (A04 == null) {
                    synchronized (C58402tR.class) {
                        if (A04 == null) {
                            A04 = C28541Wm.A09(A03);
                        }
                    }
                }
                return A04;
            default:
                throw C13680ns.A0m();
        }
        return A03;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            i3 = C28541Wm.A08(this.A02, 1, 0);
        }
        if ((this.A00 & 2) == 2) {
            i3 = C28541Wm.A02(i3, this.A01);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A02);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0C(2, this.A01);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
