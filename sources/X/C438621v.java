package X;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.google.protobuf.CodedOutputStream;
import com.mod.bomfab.R$styleable;
import java.io.IOException;

/* renamed from: X.21v  reason: invalid class name and case insensitive filesystem */
public final class C438621v extends C28541Wm implements C28561Wp {
    public static final C438621v A0B;
    public static volatile C47872Kz A0C;
    public double A00;
    public double A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public C28631Ww A08 = C28631Ww.A01;
    public AnonymousClass21S A09;
    public String A0A = "";

    static {
        C438621v r0 = new C438621v();
        A0B = r0;
        r0.A0W();
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
                C438621v r0 = (C438621v) obj3;
                int i2 = this.A04;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                double d2 = this.A00;
                int i3 = r0.A04;
                boolean z3 = true;
                if ((i3 & 1) != 1) {
                    z3 = false;
                }
                this.A00 = r8.Aho(d2, r0.A00, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                double d3 = this.A01;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A01 = r8.Aho(d3, r0.A01, z4, z5);
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                int i4 = this.A03;
                boolean z7 = false;
                if ((i3 & 4) == 4) {
                    z7 = true;
                }
                this.A03 = r8.Ahq(i4, r0.A03, z6, z7);
                boolean z8 = false;
                if ((i2 & 8) == 8) {
                    z8 = true;
                }
                float f2 = this.A02;
                boolean z9 = false;
                if ((i3 & 8) == 8) {
                    z9 = true;
                }
                this.A02 = r8.Ahp(f2, r0.A02, z8, z9);
                boolean z10 = false;
                if ((i2 & 16) == 16) {
                    z10 = true;
                }
                int i5 = this.A05;
                boolean z11 = false;
                if ((i3 & 16) == 16) {
                    z11 = true;
                }
                this.A05 = r8.Ahq(i5, r0.A05, z10, z11);
                boolean z12 = false;
                if ((i2 & 32) == 32) {
                    z12 = true;
                }
                String str = this.A0A;
                boolean z13 = false;
                if ((i3 & 32) == 32) {
                    z13 = true;
                }
                this.A0A = r8.Ahz(str, r0.A0A, z12, z13);
                boolean z14 = false;
                if ((i2 & 64) == 64) {
                    z14 = true;
                }
                long j2 = this.A07;
                boolean z15 = false;
                if ((i3 & 64) == 64) {
                    z15 = true;
                }
                this.A07 = r8.Aht(j2, r0.A07, z14, z15);
                boolean z16 = false;
                if ((i2 & 128) == 128) {
                    z16 = true;
                }
                int i6 = this.A06;
                boolean z17 = false;
                if ((i3 & 128) == 128) {
                    z17 = true;
                }
                this.A06 = r8.Ahq(i6, r0.A06, z16, z17);
                boolean z18 = false;
                if ((i2 & 256) == 256) {
                    z18 = true;
                }
                C28631Ww r4 = this.A08;
                boolean z19 = false;
                if ((i3 & 256) == 256) {
                    z19 = true;
                }
                this.A08 = r8.Ahn(r4, r0.A08, z18, z19);
                this.A09 = (AnonymousClass21S) r8.Ahu(this.A09, r0.A09);
                if (r8 == AnonymousClass2L7.A00) {
                    this.A04 |= r0.A04;
                }
                return this;
            case 2:
                C47852Kx r82 = (C47852Kx) obj4;
                C47862Ky r02 = (C47862Ky) obj3;
                while (true) {
                    try {
                        int A032 = r82.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 9:
                                this.A04 |= 1;
                                this.A00 = Double.longBitsToDouble(r82.A05());
                                continue;
                            case 17:
                                this.A04 |= 2;
                                this.A01 = Double.longBitsToDouble(r82.A05());
                                continue;
                            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                                this.A04 |= 4;
                                this.A03 = r82.A02();
                                continue;
                            case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
                                this.A04 |= 8;
                                this.A02 = Float.intBitsToFloat(r82.A01());
                                continue;
                            case 40:
                                this.A04 |= 16;
                                this.A05 = r82.A02();
                                continue;
                            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*50*/:
                                String A0A2 = r82.A0A();
                                this.A04 |= 32;
                                this.A0A = A0A2;
                                continue;
                            case 56:
                                this.A04 |= 64;
                                this.A07 = r82.A06();
                                continue;
                            case AccessibilityNodeInfoCompat.ACTION_ACCESSIBILITY_FOCUS /*64*/:
                                this.A04 |= 128;
                                this.A06 = r82.A02();
                                continue;
                            case 130:
                                this.A04 |= 256;
                                this.A08 = r82.A08();
                                continue;
                            case 138:
                                AnonymousClass21T r2 = (this.A04 & 512) == 512 ? (AnonymousClass21T) this.A09.A0U() : null;
                                AnonymousClass21S r1 = (AnonymousClass21S) r82.A09(r02, AnonymousClass21S.A0R.A0V());
                                this.A09 = r1;
                                if (r2 != null) {
                                    r2.A04(r1);
                                    this.A09 = (AnonymousClass21S) r2.A01();
                                }
                                this.A04 |= 512;
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
                        C29791bD r03 = new C29791bD(e3.getMessage());
                        r03.unfinishedMessage = this;
                        runtimeException = new RuntimeException(r03);
                        throw runtimeException;
                    }
                }
            case 3:
                return null;
            case 4:
                return new C438621v();
            case 5:
                return new C438521u();
            case 6:
                break;
            case 7:
                if (A0C == null) {
                    synchronized (C438621v.class) {
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
        int i4 = this.A04;
        if ((i4 & 1) == 1) {
            i3 = 9;
        }
        if ((i4 & 2) == 2) {
            i3 += 9;
        }
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A02(3, this.A03);
        }
        if ((i4 & 8) == 8) {
            i3 += 5;
        }
        if ((i4 & 16) == 16) {
            i3 += CodedOutputStream.A02(5, this.A05);
        }
        if ((i4 & 32) == 32) {
            i3 += 1 + CodedOutputStream.A06(this.A0A);
        }
        int i5 = this.A04;
        if ((i5 & 64) == 64) {
            i3 += 1 + CodedOutputStream.A03(this.A07);
        }
        if ((i5 & 128) == 128) {
            i3 += CodedOutputStream.A02(8, this.A06);
        }
        if ((i5 & 256) == 256) {
            i3 += CodedOutputStream.A04(this.A08, 16);
        }
        if ((i5 & 512) == 512) {
            AnonymousClass21S r0 = this.A09;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            i3 += CodedOutputStream.A05(r0, 17);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A04 & 1) == 1) {
            codedOutputStream.A0B(1, Double.doubleToRawLongBits(this.A00));
        }
        if ((this.A04 & 2) == 2) {
            codedOutputStream.A0B(2, Double.doubleToRawLongBits(this.A01));
        }
        if ((this.A04 & 4) == 4) {
            codedOutputStream.A0A(3, this.A03);
        }
        if ((this.A04 & 8) == 8) {
            codedOutputStream.A08(4, Float.floatToRawIntBits(this.A02));
        }
        if ((this.A04 & 16) == 16) {
            codedOutputStream.A0A(5, this.A05);
        }
        if ((this.A04 & 32) == 32) {
            codedOutputStream.A0D(6, this.A0A);
        }
        if ((this.A04 & 64) == 64) {
            codedOutputStream.A0C(7, this.A07);
        }
        if ((this.A04 & 128) == 128) {
            codedOutputStream.A0A(8, this.A06);
        }
        if ((this.A04 & 256) == 256) {
            codedOutputStream.A0F(this.A08, 16);
        }
        if ((this.A04 & 512) == 512) {
            AnonymousClass21S r0 = this.A09;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            codedOutputStream.A0G(r0, 17);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
