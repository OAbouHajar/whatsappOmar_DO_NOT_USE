package X;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.protobuf.CodedOutputStream;
import com.mod.bomfab.R$styleable;
import java.io.IOException;

/* renamed from: X.1oJ  reason: invalid class name and case insensitive filesystem */
public final class C36911oJ extends C28541Wm implements C28561Wp {
    public static final C36911oJ A0B;
    public static volatile C47872Kz A0C;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public C28631Ww A05;
    public C28631Ww A06;
    public String A07;
    public String A08;
    public String A09 = "";
    public boolean A0A;

    static {
        C36911oJ r0 = new C36911oJ();
        A0B = r0;
        r0.A0W();
    }

    public C36911oJ() {
        C28631Ww r0 = C28631Ww.A01;
        this.A05 = r0;
        this.A06 = r0;
        this.A08 = "";
        this.A07 = "";
    }

    public final Object A0b(AnonymousClass2L5 r16, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r16.ordinal()) {
            case 0:
                return A0B;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj4;
                C36911oJ r7 = (C36911oJ) obj3;
                int i2 = this.A00;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                String str = this.A09;
                int i3 = r7.A00;
                boolean z3 = true;
                if ((i3 & 1) != 1) {
                    z3 = false;
                }
                this.A09 = r8.Ahz(str, r7.A09, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                C28631Ww r3 = this.A05;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A05 = r8.Ahn(r3, r7.A05, z4, z5);
                boolean z6 = false;
                if ((this.A00 & 4) == 4) {
                    z6 = true;
                }
                C28631Ww r32 = this.A06;
                boolean z7 = false;
                if ((r7.A00 & 4) == 4) {
                    z7 = true;
                }
                this.A06 = r8.Ahn(r32, r7.A06, z6, z7);
                int i4 = this.A00;
                boolean z8 = false;
                if ((i4 & 8) == 8) {
                    z8 = true;
                }
                String str2 = this.A08;
                int i5 = r7.A00;
                boolean z9 = false;
                if ((i5 & 8) == 8) {
                    z9 = true;
                }
                this.A08 = r8.Ahz(str2, r7.A08, z8, z9);
                boolean z10 = false;
                if ((i4 & 16) == 16) {
                    z10 = true;
                }
                int i6 = this.A02;
                boolean z11 = false;
                if ((i5 & 16) == 16) {
                    z11 = true;
                }
                this.A02 = r8.Ahq(i6, r7.A02, z10, z11);
                boolean z12 = false;
                if ((i4 & 32) == 32) {
                    z12 = true;
                }
                int i7 = this.A03;
                boolean z13 = false;
                if ((i5 & 32) == 32) {
                    z13 = true;
                }
                this.A03 = r8.Ahq(i7, r7.A03, z12, z13);
                boolean z14 = false;
                if ((i4 & 64) == 64) {
                    z14 = true;
                }
                String str3 = this.A07;
                boolean z15 = false;
                if ((i5 & 64) == 64) {
                    z15 = true;
                }
                this.A07 = r8.Ahz(str3, r7.A07, z14, z15);
                boolean z16 = false;
                if ((i4 & 128) == 128) {
                    z16 = true;
                }
                long j2 = this.A04;
                boolean z17 = false;
                if ((i5 & 128) == 128) {
                    z17 = true;
                }
                this.A04 = r8.Aht(j2, r7.A04, z16, z17);
                boolean z18 = false;
                if ((i4 & 256) == 256) {
                    z18 = true;
                }
                boolean z19 = this.A0A;
                boolean z20 = false;
                if ((i5 & 256) == 256) {
                    z20 = true;
                }
                this.A0A = r8.Ahm(z18, z19, z20, r7.A0A);
                boolean z21 = false;
                if ((i4 & 512) == 512) {
                    z21 = true;
                }
                int i8 = this.A01;
                boolean z22 = false;
                if ((i5 & 512) == 512) {
                    z22 = true;
                }
                this.A01 = r8.Ahq(i8, r7.A01, z21, z22);
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 = i4 | i5;
                }
                return this;
            case 2:
                C47852Kx r82 = (C47852Kx) obj4;
                while (true) {
                    try {
                        int A032 = r82.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 10:
                                String A0A2 = r82.A0A();
                                this.A00 = 1 | this.A00;
                                this.A09 = A0A2;
                                continue;
                            case 18:
                                this.A00 |= 2;
                                this.A05 = r82.A08();
                                continue;
                            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                                this.A00 |= 4;
                                this.A06 = r82.A08();
                                continue;
                            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                                String A0A3 = r82.A0A();
                                this.A00 |= 8;
                                this.A08 = A0A3;
                                continue;
                            case 40:
                                this.A00 |= 16;
                                this.A02 = r82.A02();
                                continue;
                            case 48:
                                this.A00 |= 32;
                                this.A03 = r82.A02();
                                continue;
                            case 58:
                                String A0A4 = r82.A0A();
                                this.A00 |= 64;
                                this.A07 = A0A4;
                                continue;
                            case AccessibilityNodeInfoCompat.ACTION_ACCESSIBILITY_FOCUS /*64*/:
                                this.A00 |= 128;
                                this.A04 = r82.A06();
                                continue;
                            case AnonymousClass2EA.A02 /*72*/:
                                this.A00 |= 256;
                                this.A0A = r82.A0F();
                                continue;
                            case 80:
                                this.A00 |= 512;
                                this.A01 = r82.A02();
                                continue;
                            default:
                                if (!A0a(r82, A032)) {
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    } catch (C29791bD e2) {
                        e2.unfinishedMessage = this;
                        runtimeException = new RuntimeException(e2);
                        throw runtimeException;
                    } catch (IOException e3) {
                        C29791bD r0 = new C29791bD(e3.getMessage());
                        r0.unfinishedMessage = this;
                        runtimeException = new RuntimeException(r0);
                        throw runtimeException;
                    }
                }
            case 3:
                return null;
            case 4:
                return new C36911oJ();
            case 5:
                return new C69433f2();
            case 6:
                break;
            case 7:
                if (A0C == null) {
                    synchronized (C36911oJ.class) {
                        if (A0C == null) {
                            A0C = new C47872Kz(A0B);
                        }
                    }
                }
                return A0C;
            default:
                throw new UnsupportedOperationException();
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
            i3 = 0 + 1 + CodedOutputStream.A06(this.A09);
        }
        int i4 = this.A00;
        if ((i4 & 2) == 2) {
            i3 += CodedOutputStream.A04(this.A05, 2);
        }
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A04(this.A06, 3);
        }
        if ((i4 & 8) == 8) {
            i3 += 1 + CodedOutputStream.A06(this.A08);
        }
        int i5 = this.A00;
        if ((i5 & 16) == 16) {
            i3 += CodedOutputStream.A02(5, this.A02);
        }
        if ((i5 & 32) == 32) {
            i3 += CodedOutputStream.A02(6, this.A03);
        }
        if ((i5 & 64) == 64) {
            i3 += 1 + CodedOutputStream.A06(this.A07);
        }
        int i6 = this.A00;
        if ((i6 & 128) == 128) {
            i3 += 1 + CodedOutputStream.A03(this.A04);
        }
        if ((i6 & 256) == 256) {
            i3 += 2;
        }
        if ((i6 & 512) == 512) {
            i3 += CodedOutputStream.A02(10, this.A01);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A09);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0F(this.A05, 2);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A06, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0D(4, this.A08);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0A(5, this.A02);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0A(6, this.A03);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0D(7, this.A07);
        }
        if ((this.A00 & 128) == 128) {
            codedOutputStream.A0C(8, this.A04);
        }
        if ((this.A00 & 256) == 256) {
            codedOutputStream.A0E(9, this.A0A);
        }
        if ((this.A00 & 512) == 512) {
            codedOutputStream.A0A(10, this.A01);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
