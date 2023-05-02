package X;

import com.google.protobuf.CodedOutputStream;
import com.mod.bomfab.R$styleable;
import java.io.IOException;

/* renamed from: X.2uT  reason: invalid class name and case insensitive filesystem */
public final class C58982uT extends C28541Wm implements C28561Wp {
    public static final C58982uT A0D;
    public static volatile C47872Kz A0E;
    public double A00;
    public double A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public C28631Ww A06 = C28631Ww.A01;
    public AnonymousClass21S A07;
    public String A08 = "";
    public String A09 = "";
    public String A0A = "";
    public String A0B = "";
    public boolean A0C;

    static {
        C58982uT r0 = new C58982uT();
        A0D = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r15, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r15.ordinal()) {
            case 0:
                return A0D;
            case 1:
                AnonymousClass2L6 r7 = (AnonymousClass2L6) obj4;
                C58982uT r1 = (C58982uT) obj3;
                int i2 = this.A04;
                boolean A0T = C28541Wm.A0T(i2);
                double d2 = this.A00;
                int i3 = r1.A04;
                this.A00 = r7.Aho(d2, r1.A00, A0T, C28541Wm.A0T(i3));
                this.A01 = r7.Aho(this.A01, r1.A01, AnonymousClass000.A1R(i2 & 2, 2), AnonymousClass000.A1R(i3 & 2, 2));
                this.A0A = r7.Ahz(this.A0A, r1.A0A, AnonymousClass000.A1R(i2 & 4, 4), AnonymousClass000.A1R(i3 & 4, 4));
                this.A08 = r7.Ahz(this.A08, r1.A08, AnonymousClass000.A1R(i2 & 8, 8), AnonymousClass000.A1R(i3 & 8, 8));
                this.A0B = r7.Ahz(this.A0B, r1.A0B, AnonymousClass000.A1R(i2 & 16, 16), AnonymousClass000.A1R(i3 & 16, 16));
                this.A0C = r7.Ahm(AnonymousClass000.A1R(i2 & 32, 32), this.A0C, AnonymousClass000.A1R(i3 & 32, 32), r1.A0C);
                this.A03 = r7.Ahq(this.A03, r1.A03, AnonymousClass000.A1R(i2 & 64, 64), AnonymousClass000.A1R(i3 & 64, 64));
                this.A02 = r7.Ahp(this.A02, r1.A02, AnonymousClass000.A1R(i2 & 128, 128), AnonymousClass000.A1R(i3 & 128, 128));
                this.A05 = r7.Ahq(this.A05, r1.A05, AnonymousClass000.A1R(i2 & 256, 256), AnonymousClass000.A1R(i3 & 256, 256));
                this.A09 = r7.Ahz(this.A09, r1.A09, AnonymousClass000.A1R(i2 & 512, 512), AnonymousClass000.A1R(i3 & 512, 512));
                this.A06 = r7.Ahn(this.A06, r1.A06, AnonymousClass000.A1R(i2 & 1024, 1024), AnonymousClass000.A1R(i3 & 1024, 1024));
                this.A07 = (AnonymousClass21S) r7.Ahu(this.A07, r1.A07);
                if (r7 == AnonymousClass2L7.A00) {
                    this.A04 |= r1.A04;
                }
                return this;
            case 2:
                C47852Kx r72 = (C47852Kx) obj4;
                C47862Ky r12 = (C47862Ky) obj3;
                while (true) {
                    try {
                        int A032 = r72.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 9:
                                this.A04 |= 1;
                                this.A00 = Double.longBitsToDouble(r72.A05());
                                continue;
                            case 17:
                                this.A04 |= 2;
                                this.A01 = Double.longBitsToDouble(r72.A05());
                                continue;
                            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                                String A0A2 = r72.A0A();
                                this.A04 |= 4;
                                this.A0A = A0A2;
                                continue;
                            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                                String A0A3 = r72.A0A();
                                this.A04 |= 8;
                                this.A08 = A0A3;
                                continue;
                            case 42:
                                String A0A4 = r72.A0A();
                                this.A04 |= 16;
                                this.A0B = A0A4;
                                continue;
                            case 48:
                                this.A04 |= 32;
                                this.A0C = r72.A0F();
                                continue;
                            case 56:
                                this.A04 |= 64;
                                this.A03 = r72.A02();
                                continue;
                            case 69:
                                this.A04 |= 128;
                                this.A02 = Float.intBitsToFloat(r72.A01());
                                continue;
                            case AnonymousClass2EA.A02:
                                this.A04 |= 256;
                                this.A05 = r72.A02();
                                continue;
                            case 90:
                                String A0A5 = r72.A0A();
                                this.A04 |= 512;
                                this.A09 = A0A5;
                                continue;
                            case 130:
                                this.A04 |= 1024;
                                this.A06 = r72.A08();
                                continue;
                            case 138:
                                AnonymousClass21T r2 = (this.A04 & 2048) == 2048 ? (AnonymousClass21T) this.A07.A0U() : null;
                                AnonymousClass21S r0 = (AnonymousClass21S) C28541Wm.A0H(r72, r12, AnonymousClass21S.A0R);
                                this.A07 = r0;
                                if (r2 != null) {
                                    this.A07 = (AnonymousClass21S) C28541Wm.A0C(r2, r0);
                                }
                                this.A04 |= 2048;
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
                return new C58982uT();
            case 5:
                return new C69013eM();
            case 6:
                break;
            case 7:
                if (A0E == null) {
                    synchronized (C58982uT.class) {
                        if (A0E == null) {
                            A0E = C28541Wm.A09(A0D);
                        }
                    }
                }
                return A0E;
            default:
                throw C13680ns.A0m();
        }
        return A0D;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A04;
        if ((i4 & 1) == 1) {
            i3 = 9;
        }
        if ((i4 & 2) == 2) {
            i3 += 9;
        }
        if ((i4 & 4) == 4) {
            i3 = C28541Wm.A07(this.A0A, i3);
        }
        if ((this.A04 & 8) == 8) {
            i3 = C28541Wm.A07(this.A08, i3);
        }
        if ((this.A04 & 16) == 16) {
            i3 = C28541Wm.A07(this.A0B, i3);
        }
        int i5 = this.A04;
        if ((i5 & 32) == 32) {
            i3 += 2;
        }
        if ((i5 & 64) == 64) {
            i3 = C28541Wm.A00(7, this.A03, i3);
        }
        if ((i5 & 128) == 128) {
            i3 += 5;
        }
        if ((i5 & 256) == 256) {
            i3 = C28541Wm.A00(9, this.A05, i3);
        }
        if ((i5 & 512) == 512) {
            i3 = C28541Wm.A07(this.A09, i3);
        }
        int i6 = this.A04;
        if ((i6 & 1024) == 1024) {
            i3 = C28541Wm.A03(this.A06, 16, i3);
        }
        if ((i6 & 2048) == 2048) {
            AnonymousClass21S r0 = this.A07;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            i3 = C28541Wm.A06(r0, 17, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A04 & 1) == 1) {
            codedOutputStream.A0B(1, Double.doubleToRawLongBits(this.A00));
        }
        if ((this.A04 & 2) == 2) {
            codedOutputStream.A0B(2, Double.doubleToRawLongBits(this.A01));
        }
        if ((this.A04 & 4) == 4) {
            codedOutputStream.A0D(3, this.A0A);
        }
        if ((this.A04 & 8) == 8) {
            codedOutputStream.A0D(4, this.A08);
        }
        if ((this.A04 & 16) == 16) {
            codedOutputStream.A0D(5, this.A0B);
        }
        if ((this.A04 & 32) == 32) {
            codedOutputStream.A0E(6, this.A0C);
        }
        if ((this.A04 & 64) == 64) {
            codedOutputStream.A0A(7, this.A03);
        }
        if ((this.A04 & 128) == 128) {
            codedOutputStream.A08(8, Float.floatToRawIntBits(this.A02));
        }
        if ((this.A04 & 256) == 256) {
            codedOutputStream.A0A(9, this.A05);
        }
        if ((this.A04 & 512) == 512) {
            codedOutputStream.A0D(11, this.A09);
        }
        if ((this.A04 & 1024) == 1024) {
            codedOutputStream.A0F(this.A06, 16);
        }
        if ((this.A04 & 2048) == 2048) {
            AnonymousClass21S r0 = this.A07;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            codedOutputStream.A0G(r0, 17);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
