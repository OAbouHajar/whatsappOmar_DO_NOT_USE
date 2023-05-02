package X;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.protobuf.CodedOutputStream;
import com.mod.bomfab.R$styleable;
import java.io.IOException;

/* renamed from: X.2uS  reason: invalid class name and case insensitive filesystem */
public final class C58972uS extends C28541Wm implements C28561Wp {
    public static final C58972uS A0C;
    public static volatile C47872Kz A0D;
    public int A00;
    public C28631Ww A01 = C28631Ww.A01;
    public String A02 = "";
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    static {
        C58972uS r0 = new C58972uS();
        A0C = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r7, Object obj, Object obj2) {
        RuntimeException runtimeException;
        switch (r7.ordinal()) {
            case 0:
                return A0C;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj;
                C58972uS r9 = (C58972uS) obj2;
                int i2 = this.A00;
                boolean A0T = C28541Wm.A0T(i2);
                boolean z2 = this.A0B;
                int i3 = r9.A00;
                this.A0B = r8.Ahm(A0T, z2, C28541Wm.A0T(i3), r9.A0B);
                this.A09 = r8.Ahm(AnonymousClass000.A1R(i2 & 2, 2), this.A09, AnonymousClass000.A1R(i3 & 2, 2), r9.A09);
                this.A03 = r8.Ahm(AnonymousClass000.A1R(i2 & 4, 4), this.A03, AnonymousClass000.A1R(i3 & 4, 4), r9.A03);
                this.A0A = r8.Ahm(AnonymousClass000.A1R(i2 & 8, 8), this.A0A, AnonymousClass000.A1R(i3 & 8, 8), r9.A0A);
                this.A08 = r8.Ahm(AnonymousClass000.A1R(i2 & 16, 16), this.A08, AnonymousClass000.A1R(i3 & 16, 16), r9.A08);
                this.A06 = r8.Ahm(AnonymousClass000.A1R(i2 & 32, 32), this.A06, AnonymousClass000.A1R(i3 & 32, 32), r9.A06);
                this.A07 = r8.Ahm(AnonymousClass000.A1R(i2 & 64, 64), this.A07, AnonymousClass000.A1R(i3 & 64, 64), r9.A07);
                this.A04 = r8.Ahm(AnonymousClass000.A1R(i2 & 128, 128), this.A04, AnonymousClass000.A1R(i3 & 128, 128), r9.A04);
                this.A05 = r8.Ahm(AnonymousClass000.A1R(i2 & 256, 256), this.A05, AnonymousClass000.A1R(i3 & 256, 256), r9.A05);
                this.A02 = r8.Ahz(this.A02, r9.A02, AnonymousClass000.A1R(i2 & 512, 512), AnonymousClass000.A1R(i3 & 512, 512));
                this.A01 = r8.Ahn(this.A01, r9.A01, AnonymousClass000.A1R(i2 & 1024, 1024), AnonymousClass000.A1R(i3 & 1024, 1024));
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 |= r9.A00;
                }
                return this;
            case 2:
                C47852Kx r82 = (C47852Kx) obj;
                while (true) {
                    try {
                        int A032 = r82.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 8:
                                this.A00 |= 1;
                                this.A0B = r82.A0F();
                                continue;
                            case 16:
                                this.A00 |= 2;
                                this.A09 = r82.A0F();
                                continue;
                            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                                this.A00 |= 4;
                                this.A03 = r82.A0F();
                                continue;
                            case 32:
                                this.A00 |= 8;
                                this.A0A = r82.A0F();
                                continue;
                            case 40:
                                this.A00 |= 16;
                                this.A08 = r82.A0F();
                                continue;
                            case 48:
                                this.A00 |= 32;
                                this.A06 = r82.A0F();
                                continue;
                            case 56:
                                this.A00 |= 64;
                                this.A07 = r82.A0F();
                                continue;
                            case AccessibilityNodeInfoCompat.ACTION_ACCESSIBILITY_FOCUS /*64*/:
                                this.A00 |= 128;
                                this.A04 = r82.A0F();
                                continue;
                            case AnonymousClass2EA.A02:
                                this.A00 |= 256;
                                this.A05 = r82.A0F();
                                continue;
                            case 82:
                                String A0A2 = r82.A0A();
                                this.A00 |= 512;
                                this.A02 = A0A2;
                                continue;
                            case 90:
                                this.A00 |= 1024;
                                this.A01 = r82.A08();
                                continue;
                            default:
                                if (!A0a(r82, A032)) {
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
                return new C58972uS();
            case 5:
                return new C69453f4();
            case 6:
                break;
            case 7:
                if (A0D == null) {
                    synchronized (C58972uS.class) {
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
        if ((i4 & 16) == 16) {
            i3 += 2;
        }
        if ((i4 & 32) == 32) {
            i3 += 2;
        }
        if ((i4 & 64) == 64) {
            i3 += 2;
        }
        if ((i4 & 128) == 128) {
            i3 += 2;
        }
        if ((i4 & 256) == 256) {
            i3 += 2;
        }
        if ((i4 & 512) == 512) {
            i3 = C28541Wm.A07(this.A02, i3);
        }
        if ((this.A00 & 1024) == 1024) {
            i3 = C28541Wm.A03(this.A01, 11, i3);
        }
        return C28541Wm.A05(this, i3);
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0E(1, this.A0B);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0E(2, this.A09);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0E(3, this.A03);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0E(4, this.A0A);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0E(5, this.A08);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0E(6, this.A06);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0E(7, this.A07);
        }
        if ((this.A00 & 128) == 128) {
            codedOutputStream.A0E(8, this.A04);
        }
        if ((this.A00 & 256) == 256) {
            codedOutputStream.A0E(9, this.A05);
        }
        if ((this.A00 & 512) == 512) {
            codedOutputStream.A0D(10, this.A02);
        }
        if ((this.A00 & 1024) == 1024) {
            codedOutputStream.A0F(this.A01, 11);
        }
        C28541Wm.A0N(codedOutputStream, this);
    }
}
