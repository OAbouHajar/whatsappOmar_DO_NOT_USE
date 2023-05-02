package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.google.protobuf.CodedOutputStream;
import com.mod.bomfab.R$styleable;
import java.io.IOException;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.24l  reason: invalid class name and case insensitive filesystem */
public final class C445324l extends C28541Wm implements C28561Wp {
    public static final C445324l A0L;
    public static volatile C47872Kz A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public C28631Ww A06;
    public C28631Ww A07;
    public C28631Ww A08;
    public C28631Ww A09;
    public C28631Ww A0A;
    public C28631Ww A0B;
    public AnonymousClass21S A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G = "";
    public String A0H;
    public String A0I = "";
    public String A0J = "";
    public boolean A0K;

    static {
        C445324l r0 = new C445324l();
        A0L = r0;
        r0.A0W();
    }

    public C445324l() {
        C28631Ww r0 = C28631Ww.A01;
        this.A07 = r0;
        this.A09 = r0;
        this.A0F = "";
        this.A06 = r0;
        this.A0E = "";
        this.A0H = "";
        this.A0B = r0;
        this.A0A = r0;
        this.A08 = r0;
        this.A0D = "";
    }

    public final Object A0b(AnonymousClass2L5 r16, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r16.ordinal()) {
            case 0:
                return A0L;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj4;
                C445324l r1 = (C445324l) obj3;
                int i2 = this.A00;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                String str = this.A0J;
                int i3 = r1.A00;
                boolean z3 = true;
                if ((i3 & 1) != 1) {
                    z3 = false;
                }
                this.A0J = r8.Ahz(str, r1.A0J, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A0G;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A0G = r8.Ahz(str2, r1.A0G, z4, z5);
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                String str3 = this.A0I;
                boolean z7 = false;
                if ((i3 & 4) == 4) {
                    z7 = true;
                }
                this.A0I = r8.Ahz(str3, r1.A0I, z6, z7);
                boolean z8 = false;
                if ((i2 & 8) == 8) {
                    z8 = true;
                }
                C28631Ww r4 = this.A07;
                boolean z9 = false;
                if ((i3 & 8) == 8) {
                    z9 = true;
                }
                this.A07 = r8.Ahn(r4, r1.A07, z8, z9);
                int i4 = this.A00;
                boolean z10 = false;
                if ((i4 & 16) == 16) {
                    z10 = true;
                }
                long j2 = this.A04;
                int i5 = r1.A00;
                boolean z11 = false;
                if ((i5 & 16) == 16) {
                    z11 = true;
                }
                this.A04 = r8.Aht(j2, r1.A04, z10, z11);
                boolean z12 = false;
                if ((i4 & 32) == 32) {
                    z12 = true;
                }
                int i6 = this.A01;
                boolean z13 = false;
                if ((i5 & 32) == 32) {
                    z13 = true;
                }
                this.A01 = r8.Ahq(i6, r1.A01, z12, z13);
                boolean z14 = false;
                if ((i4 & 64) == 64) {
                    z14 = true;
                }
                C28631Ww r42 = this.A09;
                boolean z15 = false;
                if ((i5 & 64) == 64) {
                    z15 = true;
                }
                this.A09 = r8.Ahn(r42, r1.A09, z14, z15);
                int i7 = this.A00;
                boolean z16 = false;
                if ((i7 & 128) == 128) {
                    z16 = true;
                }
                String str4 = this.A0F;
                int i8 = r1.A00;
                boolean z17 = false;
                if ((i8 & 128) == 128) {
                    z17 = true;
                }
                this.A0F = r8.Ahz(str4, r1.A0F, z16, z17);
                boolean z18 = false;
                if ((i7 & 256) == 256) {
                    z18 = true;
                }
                C28631Ww r3 = this.A06;
                boolean z19 = false;
                if ((i8 & 256) == 256) {
                    z19 = true;
                }
                this.A06 = r8.Ahn(r3, r1.A06, z18, z19);
                int i9 = this.A00;
                boolean z20 = false;
                if ((i9 & 512) == 512) {
                    z20 = true;
                }
                String str5 = this.A0E;
                int i10 = r1.A00;
                boolean z21 = false;
                if ((i10 & 512) == 512) {
                    z21 = true;
                }
                this.A0E = r8.Ahz(str5, r1.A0E, z20, z21);
                boolean z22 = false;
                if ((i9 & 1024) == 1024) {
                    z22 = true;
                }
                long j3 = this.A05;
                boolean z23 = false;
                if ((i10 & 1024) == 1024) {
                    z23 = true;
                }
                this.A05 = r8.Aht(j3, r1.A05, z22, z23);
                boolean z24 = false;
                if ((i9 & 2048) == 2048) {
                    z24 = true;
                }
                boolean z25 = this.A0K;
                boolean z26 = false;
                if ((i10 & 2048) == 2048) {
                    z26 = true;
                }
                this.A0K = r8.Ahm(z24, z25, z26, r1.A0K);
                boolean z27 = false;
                if ((i9 & 4096) == 4096) {
                    z27 = true;
                }
                String str6 = this.A0H;
                boolean z28 = false;
                if ((i10 & 4096) == 4096) {
                    z28 = true;
                }
                this.A0H = r8.Ahz(str6, r1.A0H, z27, z28);
                boolean z29 = false;
                if ((i9 & 8192) == 8192) {
                    z29 = true;
                }
                C28631Ww r32 = this.A0B;
                boolean z30 = false;
                if ((i10 & 8192) == 8192) {
                    z30 = true;
                }
                this.A0B = r8.Ahn(r32, r1.A0B, z29, z30);
                boolean z31 = false;
                if ((this.A00 & 16384) == 16384) {
                    z31 = true;
                }
                C28631Ww r43 = this.A0A;
                boolean z32 = false;
                if ((r1.A00 & 16384) == 16384) {
                    z32 = true;
                }
                this.A0A = r8.Ahn(r43, r1.A0A, z31, z32);
                boolean z33 = false;
                if ((this.A00 & 32768) == 32768) {
                    z33 = true;
                }
                C28631Ww r44 = this.A08;
                boolean z34 = false;
                if ((r1.A00 & 32768) == 32768) {
                    z34 = true;
                }
                this.A08 = r8.Ahn(r44, r1.A08, z33, z34);
                this.A0C = (AnonymousClass21S) r8.Ahu(this.A0C, r1.A0C);
                int i11 = this.A00;
                boolean z35 = false;
                if ((i11 & 131072) == 131072) {
                    z35 = true;
                }
                int i12 = this.A02;
                int i13 = r1.A00;
                boolean z36 = false;
                if ((i13 & 131072) == 131072) {
                    z36 = true;
                }
                this.A02 = r8.Ahq(i12, r1.A02, z35, z36);
                boolean z37 = false;
                if ((i11 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
                    z37 = true;
                }
                int i14 = this.A03;
                boolean z38 = false;
                if ((i13 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
                    z38 = true;
                }
                this.A03 = r8.Ahq(i14, r1.A03, z37, z38);
                boolean z39 = false;
                if ((i11 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
                    z39 = true;
                }
                String str7 = this.A0D;
                boolean z40 = false;
                if ((i13 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
                    z40 = true;
                }
                this.A0D = r8.Ahz(str7, r1.A0D, z39, z40);
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 = i11 | i13;
                }
                return this;
            case 2:
                C47852Kx r82 = (C47852Kx) obj4;
                C47862Ky r12 = (C47862Ky) obj3;
                while (true) {
                    try {
                        int A032 = r82.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 10:
                                String A0A2 = r82.A0A();
                                this.A00 = 1 | this.A00;
                                this.A0J = A0A2;
                                continue;
                            case 18:
                                String A0A3 = r82.A0A();
                                this.A00 |= 2;
                                this.A0G = A0A3;
                                continue;
                            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                                String A0A4 = r82.A0A();
                                this.A00 |= 4;
                                this.A0I = A0A4;
                                continue;
                            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                                this.A00 |= 8;
                                this.A07 = r82.A08();
                                continue;
                            case 40:
                                this.A00 |= 16;
                                this.A04 = r82.A06();
                                continue;
                            case 48:
                                this.A00 |= 32;
                                this.A01 = r82.A02();
                                continue;
                            case 58:
                                this.A00 |= 64;
                                this.A09 = r82.A08();
                                continue;
                            case 66:
                                String A0A5 = r82.A0A();
                                this.A00 |= 128;
                                this.A0F = A0A5;
                                continue;
                            case 74:
                                this.A00 |= 256;
                                this.A06 = r82.A08();
                                continue;
                            case 82:
                                String A0A6 = r82.A0A();
                                this.A00 |= 512;
                                this.A0E = A0A6;
                                continue;
                            case 88:
                                this.A00 |= 1024;
                                this.A05 = r82.A06();
                                continue;
                            case 96:
                                this.A00 |= 2048;
                                this.A0K = r82.A0F();
                                continue;
                            case 106:
                                String A0A7 = r82.A0A();
                                this.A00 |= 4096;
                                this.A0H = A0A7;
                                continue;
                            case 114:
                                this.A00 |= 8192;
                                this.A0B = r82.A08();
                                continue;
                            case 122:
                                this.A00 |= 16384;
                                this.A0A = r82.A08();
                                continue;
                            case 130:
                                this.A00 |= 32768;
                                this.A08 = r82.A08();
                                continue;
                            case 138:
                                AnonymousClass21T r2 = (this.A00 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536 ? (AnonymousClass21T) this.A0C.A0U() : null;
                                AnonymousClass21S r0 = (AnonymousClass21S) r82.A09(r12, AnonymousClass21S.A0R.A0V());
                                this.A0C = r0;
                                if (r2 != null) {
                                    r2.A04(r0);
                                    this.A0C = (AnonymousClass21S) r2.A01();
                                }
                                this.A00 |= AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
                                continue;
                            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*144*/:
                                this.A00 |= 131072;
                                this.A02 = r82.A02();
                                continue;
                            case 152:
                                this.A00 |= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START;
                                this.A03 = r82.A02();
                                continue;
                            case 162:
                                String A0A8 = r82.A0A();
                                this.A00 |= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END;
                                this.A0D = A0A8;
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
                        C29791bD r02 = new C29791bD(e3.getMessage());
                        r02.unfinishedMessage = this;
                        runtimeException = new RuntimeException(r02);
                        throw runtimeException;
                    }
                }
            case 3:
                return null;
            case 4:
                return new C445324l();
            case 5:
                return new C68703dr();
            case 6:
                break;
            case 7:
                if (A0M == null) {
                    synchronized (C445324l.class) {
                        if (A0M == null) {
                            A0M = new C47872Kz(A0L);
                        }
                    }
                }
                return A0M;
            default:
                throw new UnsupportedOperationException();
        }
        return A0L;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A00 & 1) == 1) {
            i3 = 0 + 1 + CodedOutputStream.A06(this.A0J);
        }
        if ((this.A00 & 2) == 2) {
            i3 += 1 + CodedOutputStream.A06(this.A0G);
        }
        if ((this.A00 & 4) == 4) {
            i3 += 1 + CodedOutputStream.A06(this.A0I);
        }
        int i4 = this.A00;
        if ((i4 & 8) == 8) {
            i3 += CodedOutputStream.A04(this.A07, 4);
        }
        if ((i4 & 16) == 16) {
            i3 += 1 + CodedOutputStream.A03(this.A04);
        }
        if ((i4 & 32) == 32) {
            i3 += CodedOutputStream.A02(6, this.A01);
        }
        if ((i4 & 64) == 64) {
            i3 += CodedOutputStream.A04(this.A09, 7);
        }
        if ((i4 & 128) == 128) {
            i3 += 1 + CodedOutputStream.A06(this.A0F);
        }
        int i5 = this.A00;
        if ((i5 & 256) == 256) {
            i3 += CodedOutputStream.A04(this.A06, 9);
        }
        if ((i5 & 512) == 512) {
            i3 += 1 + CodedOutputStream.A06(this.A0E);
        }
        int i6 = this.A00;
        if ((i6 & 1024) == 1024) {
            i3 += 1 + CodedOutputStream.A03(this.A05);
        }
        if ((i6 & 2048) == 2048) {
            i3 += 2;
        }
        if ((i6 & 4096) == 4096) {
            i3 += 1 + CodedOutputStream.A06(this.A0H);
        }
        int i7 = this.A00;
        if ((i7 & 8192) == 8192) {
            i3 += CodedOutputStream.A04(this.A0B, 14);
        }
        if ((i7 & 16384) == 16384) {
            i3 += CodedOutputStream.A04(this.A0A, 15);
        }
        if ((i7 & 32768) == 32768) {
            i3 += CodedOutputStream.A04(this.A08, 16);
        }
        if ((i7 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            AnonymousClass21S r0 = this.A0C;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            i3 += CodedOutputStream.A05(r0, 17);
        }
        int i8 = this.A00;
        if ((i8 & 131072) == 131072) {
            i3 += CodedOutputStream.A02(18, this.A02);
        }
        if ((i8 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
            i3 += CodedOutputStream.A02(19, this.A03);
        }
        if ((i8 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
            i3 += 2 + CodedOutputStream.A06(this.A0D);
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A0J);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A0G);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0D(3, this.A0I);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0F(this.A07, 4);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0C(5, this.A04);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0A(6, this.A01);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0F(this.A09, 7);
        }
        if ((this.A00 & 128) == 128) {
            codedOutputStream.A0D(8, this.A0F);
        }
        if ((this.A00 & 256) == 256) {
            codedOutputStream.A0F(this.A06, 9);
        }
        if ((this.A00 & 512) == 512) {
            codedOutputStream.A0D(10, this.A0E);
        }
        if ((this.A00 & 1024) == 1024) {
            codedOutputStream.A0C(11, this.A05);
        }
        if ((this.A00 & 2048) == 2048) {
            codedOutputStream.A0E(12, this.A0K);
        }
        if ((this.A00 & 4096) == 4096) {
            codedOutputStream.A0D(13, this.A0H);
        }
        if ((this.A00 & 8192) == 8192) {
            codedOutputStream.A0F(this.A0B, 14);
        }
        if ((this.A00 & 16384) == 16384) {
            codedOutputStream.A0F(this.A0A, 15);
        }
        if ((this.A00 & 32768) == 32768) {
            codedOutputStream.A0F(this.A08, 16);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            AnonymousClass21S r0 = this.A0C;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            codedOutputStream.A0G(r0, 17);
        }
        if ((this.A00 & 131072) == 131072) {
            codedOutputStream.A0A(18, this.A02);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
            codedOutputStream.A0A(19, this.A03);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
            codedOutputStream.A0D(20, this.A0D);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
