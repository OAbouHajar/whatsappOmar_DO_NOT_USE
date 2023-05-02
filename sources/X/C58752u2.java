package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2u2  reason: invalid class name and case insensitive filesystem */
public final class C58752u2 extends C28541Wm implements C28561Wp {
    public static final C58752u2 A05;
    public static volatile C47872Kz A06;
    public int A00;
    public int A01;
    public C28631Ww A02 = C28631Ww.A01;
    public String A03 = "";
    public String A04 = "";

    static {
        C58752u2 r0 = new C58752u2();
        A05 = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r7, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r7.ordinal()) {
            case 0:
                return A05;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj;
                C58752u2 r9 = (C58752u2) obj2;
                int i2 = this.A00;
                boolean A0T = C28541Wm.A0T(i2);
                String str = this.A03;
                int i3 = r9.A00;
                this.A03 = r8.Ahz(str, r9.A03, A0T, C28541Wm.A0T(i3));
                this.A01 = r8.Ahq(this.A01, r9.A01, AnonymousClass000.A1R(i2 & 2, 2), AnonymousClass000.A1R(i3 & 2, 2));
                this.A02 = r8.Ahn(this.A02, r9.A02, AnonymousClass000.A1R(i2 & 4, 4), AnonymousClass000.A1R(i3 & 4, 4));
                int i4 = this.A00;
                boolean A1R = AnonymousClass000.A1R(i4 & 8, 8);
                String str2 = this.A04;
                int i5 = r9.A00;
                this.A04 = r8.Ahz(str2, r9.A04, A1R, AnonymousClass000.A1R(i5 & 8, 8));
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 = i4 | i5;
                }
                return this;
            case 2:
                C47852Kx r82 = (C47852Kx) obj;
                while (true) {
                    try {
                        int A032 = r82.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 10) {
                            String A0A = r82.A0A();
                            this.A00 = 1 | this.A00;
                            this.A03 = A0A;
                        } else if (A032 == 16) {
                            int A022 = r82.A02();
                            if (A022 == 0 || A022 == 1 || A022 == 2) {
                                this.A00 |= 2;
                                this.A01 = A022;
                            } else {
                                super.A0X(2, A022);
                            }
                        } else if (A032 == 130) {
                            this.A00 |= 4;
                            this.A02 = r82.A08();
                        } else if (A032 == 138) {
                            String A0A2 = r82.A0A();
                            this.A00 |= 8;
                            this.A04 = A0A2;
                        } else if (!A0a(r82, A032)) {
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
                return new C58752u2();
            case 5:
                return new C68433dQ();
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C58752u2.class) {
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
        if ((this.A00 & 1) == 1) {
            i3 = C28541Wm.A08(this.A03, 1, 0);
        }
        int i4 = this.A00;
        if ((i4 & 2) == 2) {
            i3 = C28541Wm.A01(2, this.A01, i3);
        }
        if ((i4 & 4) == 4) {
            i3 = C28541Wm.A03(this.A02, 16, i3);
        }
        if ((i4 & 8) == 8) {
            i3 = C28541Wm.A08(this.A04, 2, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A03);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A09(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A02, 16);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0D(17, this.A04);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
