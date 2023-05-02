package X;

import com.google.protobuf.CodedOutputStream;
import com.mod.bomfab.R$styleable;
import java.io.IOException;

/* renamed from: X.2uN  reason: invalid class name and case insensitive filesystem */
public final class C58922uN extends C28541Wm implements C28561Wp {
    public static final C58922uN A0B;
    public static volatile C47872Kz A0C;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public C28631Ww A06;
    public C28631Ww A07;
    public C28631Ww A08;
    public String A09 = "";
    public String A0A = "";

    static {
        C58922uN r0 = new C58922uN();
        A0B = r0;
        r0.A0W();
    }

    public C58922uN() {
        C28631Ww r0 = C28631Ww.A01;
        this.A07 = r0;
        this.A08 = r0;
        this.A06 = r0;
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
                C58922uN r1 = (C58922uN) obj3;
                this.A07 = r7.Ahn(this.A07, r1.A07, C28541Wm.A0T(this.A00), C28541Wm.A0T(r1.A00));
                int i2 = this.A00;
                boolean A1R = AnonymousClass000.A1R(i2 & 2, 2);
                long j2 = this.A04;
                int i3 = r1.A00;
                this.A04 = r7.Aht(j2, r1.A04, A1R, AnonymousClass000.A1R(i3 & 2, 2));
                this.A08 = r7.Ahn(this.A08, r1.A08, AnonymousClass000.A1R(i2 & 4, 4), AnonymousClass000.A1R(i3 & 4, 4));
                this.A06 = r7.Ahn(this.A06, r1.A06, AnonymousClass000.A1R(this.A00 & 8, 8), AnonymousClass000.A1R(r1.A00 & 8, 8));
                int i4 = this.A00;
                boolean A1R2 = AnonymousClass000.A1R(i4 & 16, 16);
                String str = this.A09;
                int i5 = r1.A00;
                this.A09 = r7.Ahz(str, r1.A09, A1R2, AnonymousClass000.A1R(i5 & 16, 16));
                this.A03 = r7.Ahq(this.A03, r1.A03, AnonymousClass000.A1R(i4 & 32, 32), AnonymousClass000.A1R(i5 & 32, 32));
                this.A01 = r7.Ahq(this.A01, r1.A01, AnonymousClass000.A1R(i4 & 64, 64), AnonymousClass000.A1R(i5 & 64, 64));
                this.A0A = r7.Ahz(this.A0A, r1.A0A, AnonymousClass000.A1R(i4 & 128, 128), AnonymousClass000.A1R(i5 & 128, 128));
                this.A02 = r7.Ahq(this.A02, r1.A02, AnonymousClass000.A1R(i4 & 256, 256), AnonymousClass000.A1R(i5 & 256, 256));
                this.A05 = r7.Aht(this.A05, r1.A05, AnonymousClass000.A1R(i4 & 512, 512), AnonymousClass000.A1R(i5 & 512, 512));
                if (r7 == AnonymousClass2L7.A00) {
                    this.A00 = i4 | i5;
                }
                return this;
            case 2:
                C47852Kx r72 = (C47852Kx) obj4;
                while (true) {
                    try {
                        int A032 = r72.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 10:
                                this.A00 |= 1;
                                this.A07 = r72.A08();
                                continue;
                            case 16:
                                this.A00 |= 2;
                                this.A04 = r72.A06();
                                continue;
                            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                                this.A00 |= 4;
                                this.A08 = r72.A08();
                                continue;
                            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                                this.A00 |= 8;
                                this.A06 = r72.A08();
                                continue;
                            case 42:
                                String A0A2 = r72.A0A();
                                this.A00 |= 16;
                                this.A09 = A0A2;
                                continue;
                            case 48:
                                int A022 = r72.A02();
                                if (AnonymousClass436.A00(A022) != null) {
                                    this.A00 |= 32;
                                    this.A03 = A022;
                                    break;
                                } else {
                                    super.A0X(6, A022);
                                    continue;
                                }
                            case 56:
                                this.A00 |= 64;
                                this.A01 = r72.A02();
                                continue;
                            case 66:
                                String A0A3 = r72.A0A();
                                this.A00 |= 128;
                                this.A0A = A0A3;
                                continue;
                            case AnonymousClass2EA.A02:
                                this.A00 |= 256;
                                this.A02 = r72.A02();
                                continue;
                            case 80:
                                this.A00 |= 512;
                                this.A05 = r72.A06();
                                continue;
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
                return new C58922uN();
            case 5:
                return new C68793e0();
            case 6:
                break;
            case 7:
                if (A0C == null) {
                    synchronized (C58922uN.class) {
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
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = C28541Wm.A03(this.A07, 1, 0);
        }
        if ((i4 & 2) == 2) {
            i3 = C28541Wm.A02(i3, this.A04);
        }
        if ((i4 & 4) == 4) {
            i3 = C28541Wm.A03(this.A08, 3, i3);
        }
        if ((i4 & 8) == 8) {
            i3 = C28541Wm.A03(this.A06, 4, i3);
        }
        if ((i4 & 16) == 16) {
            i3 = C28541Wm.A07(this.A09, i3);
        }
        int i5 = this.A00;
        if ((i5 & 32) == 32) {
            i3 = C28541Wm.A01(6, this.A03, i3);
        }
        if ((i5 & 64) == 64) {
            i3 = C28541Wm.A00(7, this.A01, i3);
        }
        if ((i5 & 128) == 128) {
            i3 = C28541Wm.A07(this.A0A, i3);
        }
        int i6 = this.A00;
        if ((i6 & 256) == 256) {
            i3 = C28541Wm.A00(9, this.A02, i3);
        }
        if ((i6 & 512) == 512) {
            i3 = C28541Wm.A02(i3, this.A05);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0F(this.A07, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0C(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A08, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0F(this.A06, 4);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0D(5, this.A09);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A09(6, this.A03);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0A(7, this.A01);
        }
        if ((this.A00 & 128) == 128) {
            codedOutputStream.A0D(8, this.A0A);
        }
        if ((this.A00 & 256) == 256) {
            codedOutputStream.A0A(9, this.A02);
        }
        if ((this.A00 & 512) == 512) {
            codedOutputStream.A0C(10, this.A05);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
