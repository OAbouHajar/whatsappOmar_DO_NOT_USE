package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2uJ  reason: invalid class name and case insensitive filesystem */
public final class C58882uJ extends C28541Wm implements C28561Wp {
    public static final C58882uJ A08;
    public static volatile C47872Kz A09;
    public int A00;
    public int A01;
    public C28631Ww A02;
    public C28631Ww A03;
    public C28631Ww A04;
    public C28631Ww A05;
    public C28631Ww A06;
    public C28631Ww A07;

    static {
        C58882uJ r0 = new C58882uJ();
        A08 = r0;
        r0.A0W();
    }

    public C58882uJ() {
        C28631Ww r0 = C28631Ww.A01;
        this.A03 = r0;
        this.A02 = r0;
        this.A07 = r0;
        this.A06 = r0;
        this.A05 = r0;
        this.A04 = r0;
    }

    public final Object A0b(AnonymousClass2L5 r7, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r7.ordinal()) {
            case 0:
                return A08;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj;
                C58882uJ r9 = (C58882uJ) obj2;
                int i2 = this.A00;
                boolean A0T = C28541Wm.A0T(i2);
                int i3 = this.A01;
                int i4 = r9.A00;
                this.A01 = r8.Ahq(i3, r9.A01, A0T, C28541Wm.A0T(i4));
                this.A03 = r8.Ahn(this.A03, r9.A03, AnonymousClass000.A1R(i2 & 2, 2), AnonymousClass000.A1R(i4 & 2, 2));
                this.A02 = r8.Ahn(this.A02, r9.A02, AnonymousClass000.A1R(this.A00 & 4, 4), AnonymousClass000.A1R(r9.A00 & 4, 4));
                this.A07 = r8.Ahn(this.A07, r9.A07, AnonymousClass000.A1R(this.A00 & 8, 8), AnonymousClass000.A1R(r9.A00 & 8, 8));
                this.A06 = r8.Ahn(this.A06, r9.A06, AnonymousClass000.A1R(this.A00 & 16, 16), AnonymousClass000.A1R(r9.A00 & 16, 16));
                this.A05 = r8.Ahn(this.A05, r9.A05, AnonymousClass000.A1R(this.A00 & 32, 32), AnonymousClass000.A1R(r9.A00 & 32, 32));
                this.A04 = r8.Ahn(this.A04, r9.A04, AnonymousClass000.A1R(this.A00 & 64, 64), AnonymousClass000.A1R(r9.A00 & 64, 64));
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 |= r9.A00;
                }
                return this;
            case 2:
                C47852Kx r82 = (C47852Kx) obj;
                while (true) {
                    try {
                        int A032 = r82.A03();
                        if (A032 == 0) {
                            break;
                        } else if (A032 == 8) {
                            this.A00 |= 1;
                            this.A01 = r82.A02();
                        } else if (A032 == 18) {
                            this.A00 |= 2;
                            this.A03 = r82.A08();
                        } else if (A032 == 26) {
                            this.A00 |= 4;
                            this.A02 = r82.A08();
                        } else if (A032 == 34) {
                            this.A00 |= 8;
                            this.A07 = r82.A08();
                        } else if (A032 == 42) {
                            this.A00 |= 16;
                            this.A06 = r82.A08();
                        } else if (A032 == 58) {
                            this.A00 |= 32;
                            this.A05 = r82.A08();
                        } else if (A032 == 66) {
                            this.A00 |= 64;
                            this.A04 = r82.A08();
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
                return new C58882uJ();
            case 5:
                return new C69493f8();
            case 6:
                break;
            case 7:
                if (A09 == null) {
                    synchronized (C58882uJ.class) {
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
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = C28541Wm.A00(1, this.A01, 0);
        }
        if ((i4 & 2) == 2) {
            i3 = C28541Wm.A03(this.A03, 2, i3);
        }
        if ((i4 & 4) == 4) {
            i3 = C28541Wm.A03(this.A02, 3, i3);
        }
        if ((i4 & 8) == 8) {
            i3 = C28541Wm.A03(this.A07, 4, i3);
        }
        if ((i4 & 16) == 16) {
            i3 = C28541Wm.A03(this.A06, 5, i3);
        }
        if ((i4 & 32) == 32) {
            i3 = C28541Wm.A03(this.A05, 7, i3);
        }
        if ((i4 & 64) == 64) {
            i3 = C28541Wm.A03(this.A04, 8, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0A(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0F(this.A03, 2);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A02, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0F(this.A07, 4);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0F(this.A06, 5);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0F(this.A05, 7);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0F(this.A04, 8);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
