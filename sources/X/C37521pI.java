package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.google.protobuf.CodedOutputStream;
import com.mod.bomfab.R$styleable;
import java.io.IOException;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.1pI  reason: invalid class name and case insensitive filesystem */
public final class C37521pI extends C28541Wm implements C28561Wp {
    public static final C37521pI A0I;
    public static volatile C47872Kz A0J;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public C28631Ww A07;
    public C28631Ww A08;
    public C28631Ww A09;
    public C28631Ww A0A;
    public C28631Ww A0B;
    public AnonymousClass21S A0C;
    public String A0D;
    public String A0E;
    public String A0F = "";
    public boolean A0G;
    public boolean A0H;

    static {
        C37521pI r0 = new C37521pI();
        A0I = r0;
        r0.A0W();
    }

    public C37521pI() {
        C28631Ww r0 = C28631Ww.A01;
        this.A08 = r0;
        this.A07 = r0;
        this.A0A = r0;
        this.A0E = "";
        this.A0D = "";
        this.A09 = r0;
        this.A0B = r0;
    }

    public final Object A0b(AnonymousClass2L5 r16, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r16.ordinal()) {
            case 0:
                return A0I;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj4;
                C37521pI r0 = (C37521pI) obj3;
                int i2 = this.A00;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                String str = this.A0F;
                int i3 = r0.A00;
                boolean z3 = true;
                if ((i3 & 1) != 1) {
                    z3 = false;
                }
                this.A0F = r8.Ahz(str, r0.A0F, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                C28631Ww r4 = this.A08;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A08 = r8.Ahn(r4, r0.A08, z4, z5);
                boolean z6 = false;
                if ((this.A00 & 4) == 4) {
                    z6 = true;
                }
                C28631Ww r42 = this.A07;
                boolean z7 = false;
                if ((r0.A00 & 4) == 4) {
                    z7 = true;
                }
                this.A07 = r8.Ahn(r42, r0.A07, z6, z7);
                boolean z8 = false;
                if ((this.A00 & 8) == 8) {
                    z8 = true;
                }
                C28631Ww r43 = this.A0A;
                boolean z9 = false;
                if ((r0.A00 & 8) == 8) {
                    z9 = true;
                }
                this.A0A = r8.Ahn(r43, r0.A0A, z8, z9);
                int i4 = this.A00;
                boolean z10 = false;
                if ((i4 & 16) == 16) {
                    z10 = true;
                }
                String str2 = this.A0E;
                int i5 = r0.A00;
                boolean z11 = false;
                if ((i5 & 16) == 16) {
                    z11 = true;
                }
                this.A0E = r8.Ahz(str2, r0.A0E, z10, z11);
                boolean z12 = false;
                if ((i4 & 32) == 32) {
                    z12 = true;
                }
                int i6 = this.A02;
                boolean z13 = false;
                if ((i5 & 32) == 32) {
                    z13 = true;
                }
                this.A02 = r8.Ahq(i6, r0.A02, z12, z13);
                boolean z14 = false;
                if ((i4 & 64) == 64) {
                    z14 = true;
                }
                int i7 = this.A03;
                boolean z15 = false;
                if ((i5 & 64) == 64) {
                    z15 = true;
                }
                this.A03 = r8.Ahq(i7, r0.A03, z14, z15);
                boolean z16 = false;
                if ((i4 & 128) == 128) {
                    z16 = true;
                }
                String str3 = this.A0D;
                boolean z17 = false;
                if ((i5 & 128) == 128) {
                    z17 = true;
                }
                this.A0D = r8.Ahz(str3, r0.A0D, z16, z17);
                boolean z18 = false;
                if ((i4 & 256) == 256) {
                    z18 = true;
                }
                long j2 = this.A04;
                boolean z19 = false;
                if ((i5 & 256) == 256) {
                    z19 = true;
                }
                this.A04 = r8.Aht(j2, r0.A04, z18, z19);
                boolean z20 = false;
                if ((i4 & 512) == 512) {
                    z20 = true;
                }
                long j3 = this.A05;
                boolean z21 = false;
                if ((i5 & 512) == 512) {
                    z21 = true;
                }
                this.A05 = r8.Aht(j3, r0.A05, z20, z21);
                boolean z22 = false;
                if ((i4 & 1024) == 1024) {
                    z22 = true;
                }
                int i8 = this.A01;
                boolean z23 = false;
                if ((i5 & 1024) == 1024) {
                    z23 = true;
                }
                this.A01 = r8.Ahq(i8, r0.A01, z22, z23);
                boolean z24 = false;
                if ((i4 & 2048) == 2048) {
                    z24 = true;
                }
                C28631Ww r44 = this.A09;
                boolean z25 = false;
                if ((i5 & 2048) == 2048) {
                    z25 = true;
                }
                this.A09 = r8.Ahn(r44, r0.A09, z24, z25);
                int i9 = this.A00;
                boolean z26 = false;
                if ((i9 & 4096) == 4096) {
                    z26 = true;
                }
                boolean z27 = this.A0G;
                int i10 = r0.A00;
                boolean z28 = false;
                if ((i10 & 4096) == 4096) {
                    z28 = true;
                }
                this.A0G = r8.Ahm(z26, z27, z28, r0.A0G);
                boolean z29 = false;
                if ((i9 & 8192) == 8192) {
                    z29 = true;
                }
                C28631Ww r3 = this.A0B;
                boolean z30 = false;
                if ((i10 & 8192) == 8192) {
                    z30 = true;
                }
                this.A0B = r8.Ahn(r3, r0.A0B, z29, z30);
                this.A0C = (AnonymousClass21S) r8.Ahu(this.A0C, r0.A0C);
                int i11 = this.A00;
                boolean z31 = false;
                if ((i11 & 32768) == 32768) {
                    z31 = true;
                }
                long j4 = this.A06;
                int i12 = r0.A00;
                boolean z32 = false;
                if ((i12 & 32768) == 32768) {
                    z32 = true;
                }
                this.A06 = r8.Aht(j4, r0.A06, z31, z32);
                boolean z33 = false;
                if ((i11 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
                    z33 = true;
                }
                boolean z34 = this.A0H;
                boolean z35 = false;
                if ((i12 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
                    z35 = true;
                }
                this.A0H = r8.Ahm(z33, z34, z35, r0.A0H);
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 = i11 | i12;
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
                            case 10:
                                String A0A2 = r82.A0A();
                                this.A00 = 1 | this.A00;
                                this.A0F = A0A2;
                                continue;
                            case 18:
                                this.A00 |= 2;
                                this.A08 = r82.A08();
                                continue;
                            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                                this.A00 |= 4;
                                this.A07 = r82.A08();
                                continue;
                            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                                this.A00 |= 8;
                                this.A0A = r82.A08();
                                continue;
                            case 42:
                                String A0A3 = r82.A0A();
                                this.A00 |= 16;
                                this.A0E = A0A3;
                                continue;
                            case 48:
                                this.A00 |= 32;
                                this.A02 = r82.A02();
                                continue;
                            case 56:
                                this.A00 |= 64;
                                this.A03 = r82.A02();
                                continue;
                            case 66:
                                String A0A4 = r82.A0A();
                                this.A00 |= 128;
                                this.A0D = A0A4;
                                continue;
                            case AnonymousClass2EA.A02 /*72*/:
                                this.A00 |= 256;
                                this.A04 = r82.A06();
                                continue;
                            case 80:
                                this.A00 |= 512;
                                this.A05 = r82.A06();
                                continue;
                            case 88:
                                this.A00 |= 1024;
                                this.A01 = r82.A02();
                                continue;
                            case 98:
                                this.A00 |= 2048;
                                this.A09 = r82.A08();
                                continue;
                            case 104:
                                this.A00 |= 4096;
                                this.A0G = r82.A0F();
                                continue;
                            case 130:
                                this.A00 |= 8192;
                                this.A0B = r82.A08();
                                continue;
                            case 138:
                                AnonymousClass21T r2 = (this.A00 & 16384) == 16384 ? (AnonymousClass21T) this.A0C.A0U() : null;
                                AnonymousClass21S r1 = (AnonymousClass21S) r82.A09(r02, AnonymousClass21S.A0R.A0V());
                                this.A0C = r1;
                                if (r2 != null) {
                                    r2.A04(r1);
                                    this.A0C = (AnonymousClass21S) r2.A01();
                                }
                                this.A00 |= 16384;
                                continue;
                            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*144*/:
                                this.A00 |= 32768;
                                this.A06 = r82.A06();
                                continue;
                            case 152:
                                this.A00 |= AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
                                this.A0H = r82.A0F();
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
                return new C37521pI();
            case 5:
                return new C69573fG();
            case 6:
                break;
            case 7:
                if (A0J == null) {
                    synchronized (C37521pI.class) {
                        if (A0J == null) {
                            A0J = new C47872Kz(A0I);
                        }
                    }
                }
                return A0J;
            default:
                throw new UnsupportedOperationException();
        }
        return A0I;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            i3 = 0 + 1 + CodedOutputStream.A06(this.A0F);
        }
        int i4 = this.A00;
        if ((i4 & 2) == 2) {
            i3 += CodedOutputStream.A04(this.A08, 2);
        }
        if ((i4 & 4) == 4) {
            i3 += CodedOutputStream.A04(this.A07, 3);
        }
        if ((i4 & 8) == 8) {
            i3 += CodedOutputStream.A04(this.A0A, 4);
        }
        if ((i4 & 16) == 16) {
            i3 += 1 + CodedOutputStream.A06(this.A0E);
        }
        int i5 = this.A00;
        if ((i5 & 32) == 32) {
            i3 += CodedOutputStream.A02(6, this.A02);
        }
        if ((i5 & 64) == 64) {
            i3 += CodedOutputStream.A02(7, this.A03);
        }
        if ((i5 & 128) == 128) {
            i3 += 1 + CodedOutputStream.A06(this.A0D);
        }
        int i6 = this.A00;
        if ((i6 & 256) == 256) {
            i3 += 1 + CodedOutputStream.A03(this.A04);
        }
        if ((i6 & 512) == 512) {
            i3 += 1 + CodedOutputStream.A03(this.A05);
        }
        if ((i6 & 1024) == 1024) {
            i3 += CodedOutputStream.A02(11, this.A01);
        }
        if ((i6 & 2048) == 2048) {
            i3 += CodedOutputStream.A04(this.A09, 12);
        }
        if ((i6 & 4096) == 4096) {
            i3 += 2;
        }
        if ((i6 & 8192) == 8192) {
            i3 += CodedOutputStream.A04(this.A0B, 16);
        }
        if ((i6 & 16384) == 16384) {
            AnonymousClass21S r0 = this.A0C;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            i3 += CodedOutputStream.A05(r0, 17);
        }
        int i7 = this.A00;
        if ((i7 & 32768) == 32768) {
            i3 += 2 + CodedOutputStream.A03(this.A06);
        }
        if ((i7 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            i3 += 3;
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A0F);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0F(this.A08, 2);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A07, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0F(this.A0A, 4);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0D(5, this.A0E);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0A(6, this.A02);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0A(7, this.A03);
        }
        if ((this.A00 & 128) == 128) {
            codedOutputStream.A0D(8, this.A0D);
        }
        if ((this.A00 & 256) == 256) {
            codedOutputStream.A0C(9, this.A04);
        }
        if ((this.A00 & 512) == 512) {
            codedOutputStream.A0C(10, this.A05);
        }
        if ((this.A00 & 1024) == 1024) {
            codedOutputStream.A0A(11, this.A01);
        }
        if ((this.A00 & 2048) == 2048) {
            codedOutputStream.A0F(this.A09, 12);
        }
        if ((this.A00 & 4096) == 4096) {
            codedOutputStream.A0E(13, this.A0G);
        }
        if ((this.A00 & 8192) == 8192) {
            codedOutputStream.A0F(this.A0B, 16);
        }
        if ((this.A00 & 16384) == 16384) {
            AnonymousClass21S r0 = this.A0C;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            codedOutputStream.A0G(r0, 17);
        }
        if ((this.A00 & 32768) == 32768) {
            codedOutputStream.A0C(18, this.A06);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            codedOutputStream.A0E(19, this.A0H);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
