package X;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.google.protobuf.CodedOutputStream;
import com.mod.bomfab.R$styleable;
import java.io.IOException;

/* renamed from: X.21Z  reason: invalid class name */
public final class AnonymousClass21Z extends C28541Wm implements C28561Wp {
    public static final AnonymousClass21Z A0E;
    public static volatile C47872Kz A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public C58742tz A07;
    public C58742tz A08;
    public C33231iF A09;
    public String A0A = "";
    public String A0B = "";
    public boolean A0C;
    public boolean A0D;

    static {
        AnonymousClass21Z r0 = new AnonymousClass21Z();
        A0E = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r16, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r16.ordinal()) {
            case 0:
                return A0E;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj4;
                AnonymousClass21Z r0 = (AnonymousClass21Z) obj3;
                int i2 = this.A00;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                int i3 = this.A01;
                int i4 = r0.A00;
                boolean z3 = true;
                if ((i4 & 1) != 1) {
                    z3 = false;
                }
                this.A01 = r8.Ahq(i3, r0.A01, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                long j2 = this.A04;
                boolean z5 = false;
                if ((i4 & 2) == 2) {
                    z5 = true;
                }
                this.A04 = r8.Aht(j2, r0.A04, z4, z5);
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                String str = this.A0B;
                boolean z7 = false;
                if ((i4 & 4) == 4) {
                    z7 = true;
                }
                this.A0B = r8.Ahz(str, r0.A0B, z6, z7);
                boolean z8 = false;
                if ((i2 & 8) == 8) {
                    z8 = true;
                }
                int i5 = this.A02;
                boolean z9 = false;
                if ((i4 & 8) == 8) {
                    z9 = true;
                }
                this.A02 = r8.Ahq(i5, r0.A02, z8, z9);
                boolean z10 = false;
                if ((i2 & 16) == 16) {
                    z10 = true;
                }
                long j3 = this.A06;
                boolean z11 = false;
                if ((i4 & 16) == 16) {
                    z11 = true;
                }
                this.A06 = r8.Aht(j3, r0.A06, z10, z11);
                this.A09 = (C33231iF) r8.Ahu(this.A09, r0.A09);
                int i6 = this.A00;
                boolean z12 = false;
                if ((i6 & 64) == 64) {
                    z12 = true;
                }
                long j4 = this.A05;
                int i7 = r0.A00;
                boolean z13 = false;
                if ((i7 & 64) == 64) {
                    z13 = true;
                }
                this.A05 = r8.Aht(j4, r0.A05, z12, z13);
                boolean z14 = false;
                if ((i6 & 128) == 128) {
                    z14 = true;
                }
                boolean z15 = this.A0C;
                boolean z16 = false;
                if ((i7 & 128) == 128) {
                    z16 = true;
                }
                this.A0C = r8.Ahm(z14, z15, z16, r0.A0C);
                boolean z17 = false;
                if ((i6 & 256) == 256) {
                    z17 = true;
                }
                String str2 = this.A0A;
                boolean z18 = false;
                if ((i7 & 256) == 256) {
                    z18 = true;
                }
                this.A0A = r8.Ahz(str2, r0.A0A, z17, z18);
                boolean z19 = false;
                if ((i6 & 512) == 512) {
                    z19 = true;
                }
                int i8 = this.A03;
                boolean z20 = false;
                if ((i7 & 512) == 512) {
                    z20 = true;
                }
                this.A03 = r8.Ahq(i8, r0.A03, z19, z20);
                boolean z21 = false;
                if ((i6 & 1024) == 1024) {
                    z21 = true;
                }
                boolean z22 = this.A0D;
                boolean z23 = false;
                if ((i7 & 1024) == 1024) {
                    z23 = true;
                }
                this.A0D = r8.Ahm(z21, z22, z23, r0.A0D);
                this.A08 = (C58742tz) r8.Ahu(this.A08, r0.A08);
                this.A07 = (C58742tz) r8.Ahu(this.A07, r0.A07);
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 |= r0.A00;
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
                            case 8:
                                int A022 = r82.A02();
                                if (A022 == 0 || A022 == 1) {
                                    this.A00 |= 1;
                                    this.A01 = A022;
                                    break;
                                } else {
                                    super.A0X(1, A022);
                                    continue;
                                }
                            case 16:
                                this.A00 |= 2;
                                this.A04 = r82.A06();
                                continue;
                            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                                String A0A2 = r82.A0A();
                                this.A00 = 4 | this.A00;
                                this.A0B = A0A2;
                                continue;
                            case 32:
                                int A023 = r82.A02();
                                switch (A023) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                        this.A00 |= 8;
                                        this.A02 = A023;
                                        break;
                                    default:
                                        super.A0X(4, A023);
                                        continue;
                                }
                            case 40:
                                this.A00 |= 16;
                                this.A06 = r82.A06();
                                continue;
                            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*50*/:
                                C33241iG r2 = (this.A00 & 32) == 32 ? (C33241iG) this.A09.A0U() : null;
                                C33231iF r1 = (C33231iF) r82.A09(r02, C33231iF.A05.A0V());
                                this.A09 = r1;
                                if (r2 != null) {
                                    r2.A04(r1);
                                    this.A09 = (C33231iF) r2.A01();
                                }
                                this.A00 |= 32;
                                continue;
                            case 56:
                                this.A00 |= 64;
                                this.A05 = r82.A06();
                                continue;
                            case AccessibilityNodeInfoCompat.ACTION_ACCESSIBILITY_FOCUS /*64*/:
                                this.A00 |= 128;
                                this.A0C = r82.A0F();
                                continue;
                            case 74:
                                String A0A3 = r82.A0A();
                                this.A00 |= 256;
                                this.A0A = A0A3;
                                continue;
                            case 80:
                                int A024 = r82.A02();
                                switch (A024) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                                    case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                                    case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                                    case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                                    case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                                    case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                                    case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                                    case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                                    case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                                    case 30:
                                    case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                                        this.A00 |= 512;
                                        this.A03 = A024;
                                        break;
                                    default:
                                        super.A0X(10, A024);
                                        continue;
                                }
                            case 88:
                                this.A00 |= 1024;
                                this.A0D = r82.A0F();
                                continue;
                            case 98:
                                C69643fN r22 = (this.A00 & 2048) == 2048 ? (C69643fN) this.A08.A0U() : null;
                                C58742tz r12 = (C58742tz) r82.A09(r02, C58742tz.A04.A0V());
                                this.A08 = r12;
                                if (r22 != null) {
                                    r22.A04(r12);
                                    this.A08 = (C58742tz) r22.A01();
                                }
                                this.A00 |= 2048;
                                continue;
                            case 106:
                                C69643fN r23 = (this.A00 & 4096) == 4096 ? (C69643fN) this.A07.A0U() : null;
                                C58742tz r13 = (C58742tz) r82.A09(r02, C58742tz.A04.A0V());
                                this.A07 = r13;
                                if (r23 != null) {
                                    r23.A04(r13);
                                    this.A07 = (C58742tz) r23.A01();
                                }
                                this.A00 |= 4096;
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
                return new AnonymousClass21Z();
            case 5:
                return new C69473f6();
            case 6:
                break;
            case 7:
                if (A0F == null) {
                    synchronized (AnonymousClass21Z.class) {
                        if (A0F == null) {
                            A0F = new C47872Kz(A0E);
                        }
                    }
                }
                return A0F;
            default:
                throw new UnsupportedOperationException();
        }
        return A0E;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        int i4 = this.A00;
        if ((i4 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A00(1, this.A01);
        }
        if ((i4 & 2) == 2) {
            i3 += 1 + CodedOutputStream.A03(this.A04);
        }
        if ((i4 & 4) == 4) {
            i3 += 1 + CodedOutputStream.A06(this.A0B);
        }
        int i5 = this.A00;
        if ((i5 & 8) == 8) {
            i3 += CodedOutputStream.A00(4, this.A02);
        }
        if ((i5 & 16) == 16) {
            i3 += 1 + CodedOutputStream.A03(this.A06);
        }
        if ((i5 & 32) == 32) {
            C33231iF r0 = this.A09;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            i3 += CodedOutputStream.A05(r0, 6);
        }
        int i6 = this.A00;
        if ((i6 & 64) == 64) {
            i3 += 1 + CodedOutputStream.A03(this.A05);
        }
        if ((i6 & 128) == 128) {
            i3 += 2;
        }
        if ((i6 & 256) == 256) {
            i3 += 1 + CodedOutputStream.A06(this.A0A);
        }
        int i7 = this.A00;
        if ((i7 & 512) == 512) {
            i3 += CodedOutputStream.A00(10, this.A03);
        }
        if ((i7 & 1024) == 1024) {
            i3 += 2;
        }
        if ((i7 & 2048) == 2048) {
            C58742tz r02 = this.A08;
            if (r02 == null) {
                r02 = C58742tz.A04;
            }
            i3 += CodedOutputStream.A05(r02, 12);
        }
        if ((this.A00 & 4096) == 4096) {
            C58742tz r03 = this.A07;
            if (r03 == null) {
                r03 = C58742tz.A04;
            }
            i3 += CodedOutputStream.A05(r03, 13);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A09(1, this.A01);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0C(2, this.A04);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0D(3, this.A0B);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A09(4, this.A02);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0C(5, this.A06);
        }
        if ((this.A00 & 32) == 32) {
            C33231iF r0 = this.A09;
            if (r0 == null) {
                r0 = C33231iF.A05;
            }
            codedOutputStream.A0G(r0, 6);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0C(7, this.A05);
        }
        if ((this.A00 & 128) == 128) {
            codedOutputStream.A0E(8, this.A0C);
        }
        if ((this.A00 & 256) == 256) {
            codedOutputStream.A0D(9, this.A0A);
        }
        if ((this.A00 & 512) == 512) {
            codedOutputStream.A09(10, this.A03);
        }
        if ((this.A00 & 1024) == 1024) {
            codedOutputStream.A0E(11, this.A0D);
        }
        if ((this.A00 & 2048) == 2048) {
            C58742tz r02 = this.A08;
            if (r02 == null) {
                r02 = C58742tz.A04;
            }
            codedOutputStream.A0G(r02, 12);
        }
        if ((this.A00 & 4096) == 4096) {
            C58742tz r03 = this.A07;
            if (r03 == null) {
                r03 = C58742tz.A04;
            }
            codedOutputStream.A0G(r03, 13);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
