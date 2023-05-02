package X;

import com.google.protobuf.CodedOutputStream;
import com.mod.bomfab.R$styleable;
import java.io.IOException;

/* renamed from: X.2uQ  reason: invalid class name and case insensitive filesystem */
public final class C58952uQ extends C28541Wm implements C28561Wp {
    public static final C58952uQ A0C;
    public static volatile C47872Kz A0D;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C445224k A04;
    public String A05 = "";
    public String A06 = "";
    public String A07 = "";
    public String A08 = "";
    public String A09 = "";
    public String A0A = "";
    public String A0B = "";

    static {
        C58952uQ r0 = new C58952uQ();
        A0C = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r15, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r15.ordinal()) {
            case 0:
                return A0C;
            case 1:
                AnonymousClass2L6 r7 = (AnonymousClass2L6) obj4;
                C58952uQ r2 = (C58952uQ) obj3;
                this.A04 = (C445224k) r7.Ahu(this.A04, r2.A04);
                int i2 = this.A00;
                boolean A1R = AnonymousClass000.A1R(i2 & 2, 2);
                String str = this.A08;
                int i3 = r2.A00;
                this.A08 = r7.Ahz(str, r2.A08, A1R, AnonymousClass000.A1R(i3 & 2, 2));
                this.A0A = r7.Ahz(this.A0A, r2.A0A, AnonymousClass000.A1R(i2 & 4, 4), AnonymousClass000.A1R(i3 & 4, 4));
                this.A06 = r7.Ahz(this.A06, r2.A06, AnonymousClass000.A1R(i2 & 8, 8), AnonymousClass000.A1R(i3 & 8, 8));
                this.A05 = r7.Ahz(this.A05, r2.A05, AnonymousClass000.A1R(i2 & 16, 16), AnonymousClass000.A1R(i3 & 16, 16));
                this.A02 = r7.Aht(this.A02, r2.A02, AnonymousClass000.A1R(i2 & 32, 32), AnonymousClass000.A1R(i3 & 32, 32));
                this.A09 = r7.Ahz(this.A09, r2.A09, AnonymousClass000.A1R(i2 & 64, 64), AnonymousClass000.A1R(i3 & 64, 64));
                this.A0B = r7.Ahz(this.A0B, r2.A0B, AnonymousClass000.A1R(i2 & 128, 128), AnonymousClass000.A1R(i3 & 128, 128));
                this.A01 = r7.Ahq(this.A01, r2.A01, AnonymousClass000.A1R(i2 & 256, 256), AnonymousClass000.A1R(i3 & 256, 256));
                this.A07 = r7.Ahz(this.A07, r2.A07, AnonymousClass000.A1R(i2 & 512, 512), AnonymousClass000.A1R(i3 & 512, 512));
                this.A03 = r7.Aht(this.A03, r2.A03, AnonymousClass000.A1R(i2 & 1024, 1024), AnonymousClass000.A1R(i3 & 1024, 1024));
                if (r7 == AnonymousClass2L7.A00) {
                    this.A00 = i2 | i3;
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
                                C68803e1 r1 = (this.A00 & 1) == 1 ? (C68803e1) this.A04.A0U() : null;
                                C445224k r0 = (C445224k) C28541Wm.A0H(r72, r22, C445224k.A0R);
                                this.A04 = r0;
                                if (r1 != null) {
                                    this.A04 = (C445224k) C28541Wm.A0C(r1, r0);
                                }
                                this.A00 |= 1;
                                continue;
                            case 18:
                                String A0A2 = r72.A0A();
                                this.A00 |= 2;
                                this.A08 = A0A2;
                                continue;
                            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                                String A0A3 = r72.A0A();
                                this.A00 |= 4;
                                this.A0A = A0A3;
                                continue;
                            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                                String A0A4 = r72.A0A();
                                this.A00 |= 8;
                                this.A06 = A0A4;
                                continue;
                            case 42:
                                String A0A5 = r72.A0A();
                                this.A00 |= 16;
                                this.A05 = A0A5;
                                continue;
                            case 48:
                                this.A00 |= 32;
                                this.A02 = r72.A06();
                                continue;
                            case 58:
                                String A0A6 = r72.A0A();
                                this.A00 |= 64;
                                this.A09 = A0A6;
                                continue;
                            case 66:
                                String A0A7 = r72.A0A();
                                this.A00 |= 128;
                                this.A0B = A0A7;
                                continue;
                            case AnonymousClass2EA.A02:
                                this.A00 |= 256;
                                this.A01 = r72.A02();
                                continue;
                            case 90:
                                String A0A8 = r72.A0A();
                                this.A00 |= 512;
                                this.A07 = A0A8;
                                continue;
                            case 96:
                                this.A00 |= 1024;
                                this.A03 = r72.A06();
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
                return new C58952uQ();
            case 5:
                return new C69163eb();
            case 6:
                break;
            case 7:
                if (A0D == null) {
                    synchronized (C58952uQ.class) {
                        if (A0D == null) {
                            A0D = C28541Wm.A09(A0C);
                        }
                    }
                }
                return A0D;
            default:
                throw C13680ns.A0m();
        }
        return A0C;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            C445224k r0 = this.A04;
            if (r0 == null) {
                r0 = C445224k.A0R;
            }
            i3 = C28541Wm.A06(r0, 1, 0);
        }
        if ((this.A00 & 2) == 2) {
            i3 = C28541Wm.A07(this.A08, i3);
        }
        if ((this.A00 & 4) == 4) {
            i3 = C28541Wm.A07(this.A0A, i3);
        }
        if ((this.A00 & 8) == 8) {
            i3 = C28541Wm.A07(this.A06, i3);
        }
        if ((this.A00 & 16) == 16) {
            i3 = C28541Wm.A07(this.A05, i3);
        }
        int i4 = this.A00;
        if ((i4 & 32) == 32) {
            i3 = C28541Wm.A02(i3, this.A02);
        }
        if ((i4 & 64) == 64) {
            i3 = C28541Wm.A07(this.A09, i3);
        }
        if ((this.A00 & 128) == 128) {
            i3 = C28541Wm.A07(this.A0B, i3);
        }
        int i5 = this.A00;
        if ((i5 & 256) == 256) {
            i3 = C28541Wm.A00(9, this.A01, i3);
        }
        if ((i5 & 512) == 512) {
            i3 = C28541Wm.A07(this.A07, i3);
        }
        if ((this.A00 & 1024) == 1024) {
            i3 = C28541Wm.A02(i3, this.A03);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            C445224k r0 = this.A04;
            if (r0 == null) {
                r0 = C445224k.A0R;
            }
            codedOutputStream.A0G(r0, 1);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A08);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0D(3, this.A0A);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0D(4, this.A06);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0D(5, this.A05);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0C(6, this.A02);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0D(7, this.A09);
        }
        if ((this.A00 & 128) == 128) {
            codedOutputStream.A0D(8, this.A0B);
        }
        if ((this.A00 & 256) == 256) {
            codedOutputStream.A0A(9, this.A01);
        }
        if ((this.A00 & 512) == 512) {
            codedOutputStream.A0D(11, this.A07);
        }
        if ((this.A00 & 1024) == 1024) {
            codedOutputStream.A0C(12, this.A03);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
