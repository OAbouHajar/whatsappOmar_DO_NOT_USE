package X;

import android.support.v4.view.GravityCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.google.protobuf.CodedOutputStream;
import com.mod.bomfab.R$styleable;
import java.io.IOException;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.24k  reason: invalid class name and case insensitive filesystem */
public final class C445224k extends C28541Wm implements C28561Wp {
    public static final C445224k A0R;
    public static volatile C47872Kz A0S;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public C28631Ww A07;
    public C28631Ww A08;
    public C28631Ww A09;
    public C28631Ww A0A;
    public C28631Ww A0B;
    public C28631Ww A0C;
    public C28631Ww A0D;
    public C28631Ww A0E;
    public C28631Ww A0F;
    public C28631Ww A0G;
    public AnonymousClass27P A0H;
    public AnonymousClass1XE A0I;
    public AnonymousClass21S A0J;
    public String A0K = "";
    public String A0L;
    public String A0M = "";
    public String A0N;
    public String A0O;
    public String A0P = "";
    public boolean A0Q;

    static {
        C445224k r0 = new C445224k();
        A0R = r0;
        r0.A0W();
    }

    public C445224k() {
        C28631Ww r1 = C28631Ww.A01;
        this.A08 = r1;
        this.A0B = r1;
        this.A07 = r1;
        this.A0I = AnonymousClass2NE.A01;
        this.A0L = "";
        this.A0A = r1;
        this.A09 = r1;
        this.A0E = r1;
        this.A0H = C58132sw.A02;
        this.A0D = r1;
        this.A0C = r1;
        this.A0O = "";
        this.A0G = r1;
        this.A0F = r1;
        this.A0N = "";
    }

    public final Object A0b(AnonymousClass2L5 r16, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r16.ordinal()) {
            case 0:
                return A0R;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj4;
                C445224k r1 = (C445224k) obj3;
                int i2 = this.A00;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                String str = this.A0P;
                int i3 = r1.A00;
                boolean z3 = true;
                if ((i3 & 1) != 1) {
                    z3 = false;
                }
                this.A0P = r8.Ahz(str, r1.A0P, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A0M;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A0M = r8.Ahz(str2, r1.A0M, z4, z5);
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                String str3 = this.A0K;
                boolean z7 = false;
                if ((i3 & 4) == 4) {
                    z7 = true;
                }
                this.A0K = r8.Ahz(str3, r1.A0K, z6, z7);
                boolean z8 = false;
                if ((i2 & 8) == 8) {
                    z8 = true;
                }
                C28631Ww r4 = this.A08;
                boolean z9 = false;
                if ((i3 & 8) == 8) {
                    z9 = true;
                }
                this.A08 = r8.Ahn(r4, r1.A08, z8, z9);
                int i4 = this.A00;
                boolean z10 = false;
                if ((i4 & 16) == 16) {
                    z10 = true;
                }
                long j2 = this.A05;
                int i5 = r1.A00;
                boolean z11 = false;
                if ((i5 & 16) == 16) {
                    z11 = true;
                }
                this.A05 = r8.Aht(j2, r1.A05, z10, z11);
                boolean z12 = false;
                if ((i4 & 32) == 32) {
                    z12 = true;
                }
                int i6 = this.A03;
                boolean z13 = false;
                if ((i5 & 32) == 32) {
                    z13 = true;
                }
                this.A03 = r8.Ahq(i6, r1.A03, z12, z13);
                boolean z14 = false;
                if ((i4 & 64) == 64) {
                    z14 = true;
                }
                int i7 = this.A04;
                boolean z15 = false;
                if ((i5 & 64) == 64) {
                    z15 = true;
                }
                this.A04 = r8.Ahq(i7, r1.A04, z14, z15);
                boolean z16 = false;
                if ((i4 & 128) == 128) {
                    z16 = true;
                }
                C28631Ww r3 = this.A0B;
                boolean z17 = false;
                if ((i5 & 128) == 128) {
                    z17 = true;
                }
                this.A0B = r8.Ahn(r3, r1.A0B, z16, z17);
                boolean z18 = false;
                if ((this.A00 & 256) == 256) {
                    z18 = true;
                }
                C28631Ww r42 = this.A07;
                boolean z19 = false;
                if ((r1.A00 & 256) == 256) {
                    z19 = true;
                }
                this.A07 = r8.Ahn(r42, r1.A07, z18, z19);
                this.A0I = r8.Ahs(this.A0I, r1.A0I);
                int i8 = this.A00;
                boolean z20 = false;
                if ((i8 & 512) == 512) {
                    z20 = true;
                }
                String str4 = this.A0L;
                int i9 = r1.A00;
                boolean z21 = false;
                if ((i9 & 512) == 512) {
                    z21 = true;
                }
                this.A0L = r8.Ahz(str4, r1.A0L, z20, z21);
                boolean z22 = false;
                if ((i8 & 1024) == 1024) {
                    z22 = true;
                }
                long j3 = this.A06;
                boolean z23 = false;
                if ((i9 & 1024) == 1024) {
                    z23 = true;
                }
                this.A06 = r8.Aht(j3, r1.A06, z22, z23);
                boolean z24 = false;
                if ((i8 & 2048) == 2048) {
                    z24 = true;
                }
                C28631Ww r32 = this.A0A;
                boolean z25 = false;
                if ((i9 & 2048) == 2048) {
                    z25 = true;
                }
                this.A0A = r8.Ahn(r32, r1.A0A, z24, z25);
                this.A0J = (AnonymousClass21S) r8.Ahu(this.A0J, r1.A0J);
                boolean z26 = false;
                if ((this.A00 & 8192) == 8192) {
                    z26 = true;
                }
                C28631Ww r43 = this.A09;
                boolean z27 = false;
                if ((r1.A00 & 8192) == 8192) {
                    z27 = true;
                }
                this.A09 = r8.Ahn(r43, r1.A09, z26, z27);
                int i10 = this.A00;
                boolean z28 = false;
                if ((i10 & 16384) == 16384) {
                    z28 = true;
                }
                int i11 = this.A02;
                int i12 = r1.A00;
                boolean z29 = false;
                if ((i12 & 16384) == 16384) {
                    z29 = true;
                }
                this.A02 = r8.Ahq(i11, r1.A02, z28, z29);
                boolean z30 = false;
                if ((i10 & 32768) == 32768) {
                    z30 = true;
                }
                int i13 = this.A01;
                boolean z31 = false;
                if ((i12 & 32768) == 32768) {
                    z31 = true;
                }
                this.A01 = r8.Ahq(i13, r1.A01, z30, z31);
                boolean z32 = false;
                if ((i10 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
                    z32 = true;
                }
                C28631Ww r33 = this.A0E;
                boolean z33 = false;
                if ((i12 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
                    z33 = true;
                }
                this.A0E = r8.Ahn(r33, r1.A0E, z32, z33);
                this.A0H = r8.Ahr(this.A0H, r1.A0H);
                boolean z34 = false;
                if ((this.A00 & 131072) == 131072) {
                    z34 = true;
                }
                C28631Ww r44 = this.A0D;
                boolean z35 = false;
                if ((r1.A00 & 131072) == 131072) {
                    z35 = true;
                }
                this.A0D = r8.Ahn(r44, r1.A0D, z34, z35);
                boolean z36 = false;
                if ((this.A00 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
                    z36 = true;
                }
                C28631Ww r45 = this.A0C;
                boolean z37 = false;
                if ((r1.A00 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
                    z37 = true;
                }
                this.A0C = r8.Ahn(r45, r1.A0C, z36, z37);
                int i14 = this.A00;
                boolean z38 = false;
                if ((i14 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
                    z38 = true;
                }
                boolean z39 = this.A0Q;
                int i15 = r1.A00;
                boolean z40 = false;
                if ((i15 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
                    z40 = true;
                }
                this.A0Q = r8.Ahm(z38, z39, z40, r1.A0Q);
                boolean z41 = false;
                if ((i14 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
                    z41 = true;
                }
                String str5 = this.A0O;
                boolean z42 = false;
                if ((i15 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
                    z42 = true;
                }
                this.A0O = r8.Ahz(str5, r1.A0O, z41, z42);
                boolean z43 = false;
                if ((i14 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
                    z43 = true;
                }
                C28631Ww r34 = this.A0G;
                boolean z44 = false;
                if ((i15 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
                    z44 = true;
                }
                this.A0G = r8.Ahn(r34, r1.A0G, z43, z44);
                boolean z45 = false;
                if ((this.A00 & 4194304) == 4194304) {
                    z45 = true;
                }
                C28631Ww r46 = this.A0F;
                boolean z46 = false;
                if ((r1.A00 & 4194304) == 4194304) {
                    z46 = true;
                }
                this.A0F = r8.Ahn(r46, r1.A0F, z45, z46);
                int i16 = this.A00;
                boolean z47 = false;
                if ((i16 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) == 8388608) {
                    z47 = true;
                }
                String str6 = this.A0N;
                int i17 = r1.A00;
                boolean z48 = false;
                if ((i17 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) == 8388608) {
                    z48 = true;
                }
                this.A0N = r8.Ahz(str6, r1.A0N, z47, z48);
                if (r8 == AnonymousClass2L7.A00) {
                    this.A00 = i16 | i17;
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
                                this.A0P = A0A2;
                                continue;
                            case 18:
                                String A0A3 = r82.A0A();
                                this.A00 |= 2;
                                this.A0M = A0A3;
                                continue;
                            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                                String A0A4 = r82.A0A();
                                this.A00 |= 4;
                                this.A0K = A0A4;
                                continue;
                            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                                this.A00 |= 8;
                                this.A08 = r82.A08();
                                continue;
                            case 40:
                                this.A00 |= 16;
                                this.A05 = r82.A06();
                                continue;
                            case 48:
                                this.A00 |= 32;
                                this.A03 = r82.A02();
                                continue;
                            case 56:
                                this.A00 |= 64;
                                this.A04 = r82.A02();
                                continue;
                            case 66:
                                this.A00 |= 128;
                                this.A0B = r82.A08();
                                continue;
                            case 74:
                                this.A00 |= 256;
                                this.A07 = r82.A08();
                                continue;
                            case 82:
                                AnonymousClass1XE r2 = this.A0I;
                                if (!((AnonymousClass1XF) r2).A00) {
                                    r2 = C28541Wm.A0G(r2);
                                    this.A0I = r2;
                                }
                                r2.add((C58562th) r82.A09(r12, C58562th.A04.A0V()));
                                continue;
                            case 90:
                                String A0A5 = r82.A0A();
                                this.A00 |= 512;
                                this.A0L = A0A5;
                                continue;
                            case 96:
                                this.A00 |= 1024;
                                this.A06 = r82.A06();
                                continue;
                            case 130:
                                this.A00 |= 2048;
                                this.A0A = r82.A08();
                                continue;
                            case 138:
                                AnonymousClass21T r22 = (this.A00 & 4096) == 4096 ? (AnonymousClass21T) this.A0J.A0U() : null;
                                AnonymousClass21S r0 = (AnonymousClass21S) r82.A09(r12, AnonymousClass21S.A0R.A0V());
                                this.A0J = r0;
                                if (r22 != null) {
                                    r22.A04(r0);
                                    this.A0J = (AnonymousClass21S) r22.A01();
                                }
                                this.A00 |= 4096;
                                continue;
                            case 146:
                                this.A00 |= 8192;
                                this.A09 = r82.A08();
                                continue;
                            case 152:
                                this.A00 |= 16384;
                                this.A02 = r82.A02();
                                continue;
                            case 160:
                                this.A00 |= 32768;
                                this.A01 = r82.A02();
                                continue;
                            case 170:
                                this.A00 |= AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
                                this.A0E = r82.A08();
                                continue;
                            case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /*176*/:
                                AnonymousClass27P r35 = this.A0H;
                                if (!((AnonymousClass1XF) r35).A00) {
                                    r35 = C28541Wm.A0F(r35);
                                    this.A0H = r35;
                                }
                                C58132sw r36 = (C58132sw) r35;
                                r36.A02(r36.A00, r82.A02());
                                continue;
                            case 178:
                                int A042 = r82.A04(r82.A02());
                                AnonymousClass27P r23 = this.A0H;
                                if (!((AnonymousClass1XF) r23).A00 && r82.A00() > 0) {
                                    this.A0H = C28541Wm.A0F(r23);
                                }
                                while (r82.A00() > 0) {
                                    C58132sw r37 = (C58132sw) this.A0H;
                                    r37.A02(r37.A00, r82.A02());
                                }
                                r82.A03 = A042;
                                r82.A0B();
                                continue;
                            case 186:
                                this.A00 |= 131072;
                                this.A0D = r82.A08();
                                continue;
                            case 194:
                                this.A00 |= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START;
                                this.A0C = r82.A08();
                                continue;
                            case 200:
                                this.A00 |= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END;
                                this.A0Q = r82.A0F();
                                continue;
                            case 210:
                                String A0A6 = r82.A0A();
                                this.A00 |= AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START;
                                this.A0O = A0A6;
                                continue;
                            case 218:
                                this.A00 |= AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END;
                                this.A0G = r82.A08();
                                continue;
                            case 226:
                                this.A00 |= 4194304;
                                this.A0F = r82.A08();
                                continue;
                            case 234:
                                String A0A7 = r82.A0A();
                                this.A00 |= GravityCompat.RELATIVE_LAYOUT_DIRECTION;
                                this.A0N = A0A7;
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
                ((AnonymousClass1XF) this.A0I).A00 = false;
                ((AnonymousClass1XF) this.A0H).A00 = false;
                return null;
            case 4:
                return new C445224k();
            case 5:
                return new C68803e1();
            case 6:
                break;
            case 7:
                if (A0S == null) {
                    synchronized (C445224k.class) {
                        if (A0S == null) {
                            A0S = new C47872Kz(A0R);
                        }
                    }
                }
                return A0S;
            default:
                throw new UnsupportedOperationException();
        }
        return A0R;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int A062 = (this.A00 & 1) == 1 ? 1 + CodedOutputStream.A06(this.A0P) : 0;
        if ((this.A00 & 2) == 2) {
            A062 += 1 + CodedOutputStream.A06(this.A0M);
        }
        if ((this.A00 & 4) == 4) {
            A062 += 1 + CodedOutputStream.A06(this.A0K);
        }
        int i3 = this.A00;
        if ((i3 & 8) == 8) {
            A062 += CodedOutputStream.A04(this.A08, 4);
        }
        if ((i3 & 16) == 16) {
            A062 += 1 + CodedOutputStream.A03(this.A05);
        }
        if ((i3 & 32) == 32) {
            A062 += CodedOutputStream.A02(6, this.A03);
        }
        if ((i3 & 64) == 64) {
            A062 += CodedOutputStream.A02(7, this.A04);
        }
        if ((i3 & 128) == 128) {
            A062 += CodedOutputStream.A04(this.A0B, 8);
        }
        if ((i3 & 256) == 256) {
            A062 += CodedOutputStream.A04(this.A07, 9);
        }
        for (int i4 = 0; i4 < this.A0I.size(); i4++) {
            A062 += CodedOutputStream.A05((AnonymousClass1Wo) this.A0I.get(i4), 10);
        }
        if ((this.A00 & 512) == 512) {
            A062 += 1 + CodedOutputStream.A06(this.A0L);
        }
        int i5 = this.A00;
        if ((i5 & 1024) == 1024) {
            A062 += 1 + CodedOutputStream.A03(this.A06);
        }
        if ((i5 & 2048) == 2048) {
            A062 += CodedOutputStream.A04(this.A0A, 16);
        }
        if ((i5 & 4096) == 4096) {
            AnonymousClass21S r0 = this.A0J;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            A062 += CodedOutputStream.A05(r0, 17);
        }
        int i6 = this.A00;
        if ((i6 & 8192) == 8192) {
            A062 += CodedOutputStream.A04(this.A09, 18);
        }
        if ((i6 & 16384) == 16384) {
            A062 += CodedOutputStream.A02(19, this.A02);
        }
        if ((i6 & 32768) == 32768) {
            A062 += CodedOutputStream.A02(20, this.A01);
        }
        if ((i6 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            A062 += CodedOutputStream.A04(this.A0E, 21);
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.A0H.size(); i8++) {
            C58132sw r02 = (C58132sw) this.A0H;
            r02.A01(i8);
            int i9 = r02.A01[i8];
            int i10 = 1;
            if ((i9 & -128) != 0) {
                i10 = 2;
                if ((i9 & -16384) != 0) {
                    i10 = 3;
                    if ((-2097152 & i9) != 0) {
                        i10 = 5;
                        if ((i9 & -268435456) == 0) {
                            i10 = 4;
                        }
                    }
                }
            }
            i7 += i10;
        }
        int size = A062 + i7 + (this.A0H.size() << 1);
        int i11 = this.A00;
        if ((i11 & 131072) == 131072) {
            size += CodedOutputStream.A04(this.A0D, 23);
        }
        if ((i11 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
            size += CodedOutputStream.A04(this.A0C, 24);
        }
        if ((i11 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
            size += 3;
        }
        if ((i11 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
            size += 2 + CodedOutputStream.A06(this.A0O);
        }
        int i12 = this.A00;
        if ((i12 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
            size += CodedOutputStream.A04(this.A0G, 27);
        }
        if ((i12 & 4194304) == 4194304) {
            size += CodedOutputStream.A04(this.A0F, 28);
        }
        if ((i12 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) == 8388608) {
            size += 2 + CodedOutputStream.A06(this.A0N);
        }
        int A002 = size + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A0P);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A0M);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0D(3, this.A0K);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0F(this.A08, 4);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0C(5, this.A05);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0A(6, this.A03);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0A(7, this.A04);
        }
        if ((this.A00 & 128) == 128) {
            codedOutputStream.A0F(this.A0B, 8);
        }
        if ((this.A00 & 256) == 256) {
            codedOutputStream.A0F(this.A07, 9);
        }
        for (int i2 = 0; i2 < this.A0I.size(); i2++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A0I.get(i2), 10);
        }
        if ((this.A00 & 512) == 512) {
            codedOutputStream.A0D(11, this.A0L);
        }
        if ((this.A00 & 1024) == 1024) {
            codedOutputStream.A0C(12, this.A06);
        }
        if ((this.A00 & 2048) == 2048) {
            codedOutputStream.A0F(this.A0A, 16);
        }
        if ((this.A00 & 4096) == 4096) {
            AnonymousClass21S r0 = this.A0J;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            codedOutputStream.A0G(r0, 17);
        }
        if ((this.A00 & 8192) == 8192) {
            codedOutputStream.A0F(this.A09, 18);
        }
        if ((this.A00 & 16384) == 16384) {
            codedOutputStream.A0A(19, this.A02);
        }
        if ((this.A00 & 32768) == 32768) {
            codedOutputStream.A0A(20, this.A01);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            codedOutputStream.A0F(this.A0E, 21);
        }
        for (int i3 = 0; i3 < this.A0H.size(); i3++) {
            C58132sw r02 = (C58132sw) this.A0H;
            r02.A01(i3);
            codedOutputStream.A0A(22, r02.A01[i3]);
        }
        if ((this.A00 & 131072) == 131072) {
            codedOutputStream.A0F(this.A0D, 23);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
            codedOutputStream.A0F(this.A0C, 24);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
            codedOutputStream.A0E(25, this.A0Q);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
            codedOutputStream.A0D(26, this.A0O);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
            codedOutputStream.A0F(this.A0G, 27);
        }
        if ((this.A00 & 4194304) == 4194304) {
            codedOutputStream.A0F(this.A0F, 28);
        }
        if ((this.A00 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) == 8388608) {
            codedOutputStream.A0D(29, this.A0N);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
