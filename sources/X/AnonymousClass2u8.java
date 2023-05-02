package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2u8  reason: invalid class name */
public final class AnonymousClass2u8 extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2u8 A06;
    public static volatile C47872Kz A07;
    public int A00;
    public C28631Ww A01;
    public C28631Ww A02;
    public C28631Ww A03;
    public C28631Ww A04;
    public String A05 = "";

    static {
        AnonymousClass2u8 r0 = new AnonymousClass2u8();
        A06 = r0;
        r0.A0W();
    }

    public AnonymousClass2u8() {
        C28631Ww r1 = C28631Ww.A01;
        this.A01 = r1;
        this.A04 = r1;
        this.A03 = r1;
        this.A02 = r1;
    }

    public final Object A0b(AnonymousClass2L5 r7, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r7.ordinal()) {
            case 0:
                return A06;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj;
                AnonymousClass2u8 r9 = (AnonymousClass2u8) obj2;
                this.A01 = r8.Ahn(this.A01, r9.A01, C28541Wm.A0T(this.A00), C28541Wm.A0T(r9.A00));
                int i2 = this.A00;
                boolean A1R = AnonymousClass000.A1R(i2 & 2, 2);
                String str = this.A05;
                int i3 = r9.A00;
                this.A05 = r8.Ahz(str, r9.A05, A1R, AnonymousClass000.A1R(i3 & 2, 2));
                this.A04 = r8.Ahn(this.A04, r9.A04, AnonymousClass000.A1R(i2 & 4, 4), AnonymousClass000.A1R(i3 & 4, 4));
                this.A03 = r8.Ahn(this.A03, r9.A03, AnonymousClass000.A1R(this.A00 & 8, 8), AnonymousClass000.A1R(r9.A00 & 8, 8));
                this.A02 = r8.Ahn(this.A02, r9.A02, AnonymousClass000.A1R(this.A00 & 16, 16), AnonymousClass000.A1R(r9.A00 & 16, 16));
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
                        } else if (A032 == 10) {
                            this.A00 |= 1;
                            this.A01 = r82.A08();
                        } else if (A032 == 18) {
                            String A0A = r82.A0A();
                            this.A00 |= 2;
                            this.A05 = A0A;
                        } else if (A032 == 26) {
                            this.A00 |= 4;
                            this.A04 = r82.A08();
                        } else if (A032 == 34) {
                            this.A00 |= 8;
                            this.A03 = r82.A08();
                        } else if (A032 == 42) {
                            this.A00 |= 16;
                            this.A02 = r82.A08();
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
                return new AnonymousClass2u8();
            case 5:
                return new C68303dD();
            case 6:
                break;
            case 7:
                if (A07 == null) {
                    synchronized (AnonymousClass2u8.class) {
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
            i3 = C28541Wm.A03(this.A01, 1, 0);
        }
        if ((i4 & 2) == 2) {
            i3 = C28541Wm.A07(this.A05, i3);
        }
        int i5 = this.A00;
        if ((i5 & 4) == 4) {
            i3 = C28541Wm.A03(this.A04, 3, i3);
        }
        if ((i5 & 8) == 8) {
            i3 = C28541Wm.A03(this.A03, 4, i3);
        }
        if ((i5 & 16) == 16) {
            i3 = C28541Wm.A03(this.A02, 5, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0F(this.A01, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A05);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A04, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0F(this.A03, 4);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0F(this.A02, 5);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
