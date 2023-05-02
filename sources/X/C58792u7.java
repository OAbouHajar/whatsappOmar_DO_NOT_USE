package X;

import com.google.protobuf.CodedOutputStream;
import java.io.IOException;

/* renamed from: X.2u7  reason: invalid class name and case insensitive filesystem */
public final class C58792u7 extends C28541Wm implements C28561Wp {
    public static final C58792u7 A05;
    public static volatile C47872Kz A06;
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    static {
        C58792u7 r0 = new C58792u7();
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
                C58792u7 r9 = (C58792u7) obj2;
                int i2 = this.A00;
                boolean A0T = C28541Wm.A0T(i2);
                boolean z2 = this.A03;
                int i3 = r9.A00;
                this.A03 = r8.Ahm(A0T, z2, C28541Wm.A0T(i3), r9.A03);
                this.A01 = r8.Ahm(AnonymousClass000.A1R(i2 & 2, 2), this.A01, AnonymousClass000.A1R(i3 & 2, 2), r9.A01);
                this.A04 = r8.Ahm(AnonymousClass000.A1R(i2 & 4, 4), this.A04, AnonymousClass000.A1R(i3 & 4, 4), r9.A04);
                this.A02 = r8.Ahm(AnonymousClass000.A1R(i2 & 8, 8), this.A02, AnonymousClass000.A1R(i3 & 8, 8), r9.A02);
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 = i2 | i3;
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
                            this.A03 = r82.A0F();
                        } else if (A032 == 16) {
                            this.A00 |= 2;
                            this.A01 = r82.A0F();
                        } else if (A032 == 24) {
                            this.A00 |= 4;
                            this.A04 = r82.A0F();
                        } else if (A032 == 32) {
                            this.A00 |= 8;
                            this.A02 = r82.A0F();
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
                return new C58792u7();
            case 5:
                return new C69293eo();
            case 6:
                break;
            case 7:
                if (A06 == null) {
                    synchronized (C58792u7.class) {
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
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = 2;
        }
        if ((i4 & 2) == 2) {
            i3 += 2;
        }
        if ((i4 & 4) == 4) {
            i3 += 2;
        }
        if ((i4 & 8) == 8) {
            i3 += 2;
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0E(1, this.A03);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0E(2, this.A01);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0E(3, this.A04);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0E(4, this.A02);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
