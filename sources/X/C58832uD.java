package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2uD  reason: invalid class name and case insensitive filesystem */
public final class C58832uD extends C28541Wm implements C28561Wp {
    public static final C58832uD A06;
    public static volatile C47872Kz A07;
    public int A00;
    public long A01;
    public C28631Ww A02;
    public C28631Ww A03;
    public C28631Ww A04;
    public String A05 = "";

    static {
        C58832uD r0 = new C58832uD();
        A06 = r0;
        r0.A0W();
    }

    public C58832uD() {
        C28631Ww r0 = C28631Ww.A01;
        this.A04 = r0;
        this.A03 = r0;
        this.A02 = r0;
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
                C58832uD r5 = (C58832uD) obj3;
                this.A04 = r7.Ahn(this.A04, r5.A04, C28541Wm.A0T(this.A00), C28541Wm.A0T(r5.A00));
                int i2 = this.A00;
                boolean A1R = AnonymousClass000.A1R(i2 & 2, 2);
                long j2 = this.A01;
                int i3 = r5.A00;
                this.A01 = r7.Aht(j2, r5.A01, A1R, AnonymousClass000.A1R(i3 & 2, 2));
                this.A03 = r7.Ahn(this.A03, r5.A03, AnonymousClass000.A1R(i2 & 4, 4), AnonymousClass000.A1R(i3 & 4, 4));
                this.A02 = r7.Ahn(this.A02, r5.A02, AnonymousClass000.A1R(this.A00 & 8, 8), AnonymousClass000.A1R(r5.A00 & 8, 8));
                int i4 = this.A00;
                boolean A1R2 = AnonymousClass000.A1R(i4 & 16, 16);
                String str = this.A05;
                int i5 = r5.A00;
                this.A05 = r7.Ahz(str, r5.A05, A1R2, AnonymousClass000.A1R(i5 & 16, 16));
                if (r7 == AnonymousClass2L7.A00) {
                    this.A00 = i4 | i5;
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
                            this.A00 |= 1;
                            this.A04 = r72.A08();
                        } else if (A032 == 16) {
                            this.A00 |= 2;
                            this.A01 = r72.A06();
                        } else if (A032 == 26) {
                            this.A00 |= 4;
                            this.A03 = r72.A08();
                        } else if (A032 == 34) {
                            this.A00 |= 8;
                            this.A02 = r72.A08();
                        } else if (A032 == 42) {
                            String A0A = r72.A0A();
                            this.A00 |= 16;
                            this.A05 = A0A;
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
                return new C58832uD();
            case 5:
                return new C69233ei();
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (C58832uD.class) {
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
            i3 = C28541Wm.A03(this.A04, 1, 0);
        }
        if ((i4 & 2) == 2) {
            i3 = C28541Wm.A02(i3, this.A01);
        }
        if ((i4 & 4) == 4) {
            i3 = C28541Wm.A03(this.A03, 3, i3);
        }
        if ((i4 & 8) == 8) {
            i3 = C28541Wm.A03(this.A02, 4, i3);
        }
        if ((i4 & 16) == 16) {
            i3 = C28541Wm.A07(this.A05, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0F(this.A04, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0C(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A03, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0F(this.A02, 4);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0D(5, this.A05);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
