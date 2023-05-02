package X;

import com.google.protobuf.CodedOutputStream;
import com.mod.bomfab.R$styleable;
import java.io.IOException;

/* renamed from: X.2uO  reason: invalid class name and case insensitive filesystem */
public final class C58932uO extends C28541Wm implements C28561Wp {
    public static final C58932uO A0B;
    public static volatile C47872Kz A0C;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public C58832uD A08;
    public String A09 = "";
    public String A0A = "";

    static {
        C58932uO r0 = new C58932uO();
        A0B = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r15, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r15.ordinal()) {
            case 0:
                return A0B;
            case 1:
                AnonymousClass2L6 r7 = (AnonymousClass2L6) obj4;
                C58932uO r2 = (C58932uO) obj3;
                int i2 = this.A00;
                boolean A0T = C28541Wm.A0T(i2);
                String str = this.A09;
                int i3 = r2.A00;
                this.A09 = r7.Ahz(str, r2.A09, A0T, C28541Wm.A0T(i3));
                this.A07 = r7.Aht(this.A07, r2.A07, AnonymousClass000.A1R(i2 & 2, 2), AnonymousClass000.A1R(i3 & 2, 2));
                this.A06 = r7.Ahq(this.A06, r2.A06, AnonymousClass000.A1R(i2 & 4, 4), AnonymousClass000.A1R(i3 & 4, 4));
                this.A01 = r7.Ahq(this.A01, r2.A01, AnonymousClass000.A1R(i2 & 8, 8), AnonymousClass000.A1R(i3 & 8, 8));
                this.A0A = r7.Ahz(this.A0A, r2.A0A, AnonymousClass000.A1R(i2 & 16, 16), AnonymousClass000.A1R(i3 & 16, 16));
                this.A02 = r7.Ahq(this.A02, r2.A02, AnonymousClass000.A1R(i2 & 32, 32), AnonymousClass000.A1R(i3 & 32, 32));
                this.A04 = r7.Ahq(this.A04, r2.A04, AnonymousClass000.A1R(i2 & 64, 64), AnonymousClass000.A1R(i3 & 64, 64));
                this.A03 = r7.Ahq(this.A03, r2.A03, AnonymousClass000.A1R(i2 & 128, 128), AnonymousClass000.A1R(i3 & 128, 128));
                this.A08 = (C58832uD) r7.Ahu(this.A08, r2.A08);
                int i4 = this.A00;
                boolean A1R = AnonymousClass000.A1R(i4 & 512, 512);
                int i5 = this.A05;
                int i6 = r2.A00;
                this.A05 = r7.Ahq(i5, r2.A05, A1R, AnonymousClass000.A1R(i6 & 512, 512));
                if (r7 == AnonymousClass2L7.A00) {
                    this.A00 = i4 | i6;
                }
                return this;
            case 2:
                C47852Kx r72 = (C47852Kx) obj4;
                C47862Ky r22 = (C47862Ky) obj3;
                while (true) {
                    try {
                        int A032 = r72.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 10:
                                String A0A2 = r72.A0A();
                                this.A00 = 1 | this.A00;
                                this.A09 = A0A2;
                                continue;
                            case 16:
                                this.A00 |= 2;
                                this.A07 = r72.A06();
                                continue;
                            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                                this.A00 |= 4;
                                this.A06 = r72.A02();
                                continue;
                            case 32:
                                this.A00 |= 8;
                                this.A01 = r72.A02();
                                continue;
                            case 42:
                                String A0A3 = r72.A0A();
                                this.A00 |= 16;
                                this.A0A = A0A3;
                                continue;
                            case 53:
                                this.A00 |= 32;
                                this.A02 = r72.A01();
                                continue;
                            case 61:
                                this.A00 |= 64;
                                this.A04 = r72.A01();
                                continue;
                            case 69:
                                this.A00 |= 128;
                                this.A03 = r72.A01();
                                continue;
                            case 74:
                                C69233ei r1 = (this.A00 & 256) == 256 ? (C69233ei) this.A08.A0U() : null;
                                C58832uD r0 = (C58832uD) C28541Wm.A0H(r72, r22, C58832uD.A06);
                                this.A08 = r0;
                                if (r1 != null) {
                                    this.A08 = (C58832uD) C28541Wm.A0C(r1, r0);
                                }
                                this.A00 |= 256;
                                continue;
                            case 80:
                                int A022 = r72.A02();
                                if (A022 == 0 || A022 == 1) {
                                    this.A00 |= 512;
                                    this.A05 = A022;
                                    break;
                                } else {
                                    super.A0X(10, A022);
                                    continue;
                                }
                            default:
                                if (!A0a(r72, A032)) {
                                    break;
                                } else {
                                    continue;
                                }
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
                return new C58932uO();
            case 5:
                return new C69223eh();
            case 6:
                break;
            case 7:
                if (A0C == null) {
                    synchronized (C58932uO.class) {
                        if (A0C == null) {
                            A0C = C28541Wm.A09(A0B);
                        }
                    }
                }
                return A0C;
            default:
                throw C13680ns.A0m();
        }
        return A0B;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            i3 = C28541Wm.A08(this.A09, 1, 0);
        }
        int i4 = this.A00;
        if ((i4 & 2) == 2) {
            i3 = C28541Wm.A02(i3, this.A07);
        }
        if ((i4 & 4) == 4) {
            i3 = C28541Wm.A00(3, this.A06, i3);
        }
        if ((i4 & 8) == 8) {
            i3 = C28541Wm.A00(4, this.A01, i3);
        }
        if ((i4 & 16) == 16) {
            i3 = C28541Wm.A07(this.A0A, i3);
        }
        int i5 = this.A00;
        if ((i5 & 32) == 32) {
            i3 += 5;
        }
        if ((i5 & 64) == 64) {
            i3 += 5;
        }
        if ((i5 & 128) == 128) {
            i3 += 5;
        }
        if ((i5 & 256) == 256) {
            C58832uD r0 = this.A08;
            if (r0 == null) {
                r0 = C58832uD.A06;
            }
            i3 = C28541Wm.A06(r0, 9, i3);
        }
        if ((this.A00 & 512) == 512) {
            i3 = C28541Wm.A01(10, this.A05, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A09);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0C(2, this.A07);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0A(3, this.A06);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0A(4, this.A01);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0D(5, this.A0A);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A08(6, this.A02);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A08(7, this.A04);
        }
        if ((this.A00 & 128) == 128) {
            codedOutputStream.A08(8, this.A03);
        }
        if ((this.A00 & 256) == 256) {
            C58832uD r0 = this.A08;
            if (r0 == null) {
                r0 = C58832uD.A06;
            }
            codedOutputStream.A0G(r0, 9);
        }
        if ((this.A00 & 512) == 512) {
            codedOutputStream.A09(10, this.A05);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
