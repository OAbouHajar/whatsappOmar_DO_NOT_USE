package X;

import android.support.v4.view.GravityCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.protobuf.CodedOutputStream;
import com.mod.bomfab.R$styleable;
import java.io.IOException;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.2G7  reason: invalid class name */
public final class AnonymousClass2G7 extends C28541Wm implements C28561Wp {
    public static final AnonymousClass2G7 A0f;
    public static volatile C47872Kz A0g;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public String A04 = "";
    public String A05 = "";
    public String A06 = "";
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;

    static {
        AnonymousClass2G7 r0 = new AnonymousClass2G7();
        A0f = r0;
        r0.A0W();
    }

    public final Object A0b(AnonymousClass2L5 r23, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r23.ordinal()) {
            case 0:
                return A0f;
            case 1:
                AnonymousClass2L6 r15 = (AnonymousClass2L6) obj4;
                AnonymousClass2G7 r9 = (AnonymousClass2G7) obj3;
                int i2 = this.A01;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                String str = this.A04;
                int i3 = r9.A01;
                boolean z3 = true;
                if ((i3 & 1) != 1) {
                    z3 = false;
                }
                this.A04 = r15.Ahz(str, r9.A04, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A05;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A05 = r15.Ahz(str2, r9.A05, z4, z5);
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                String str3 = this.A06;
                boolean z7 = false;
                if ((i3 & 4) == 4) {
                    z7 = true;
                }
                this.A06 = r15.Ahz(str3, r9.A06, z6, z7);
                boolean z8 = false;
                if ((i2 & 8) == 8) {
                    z8 = true;
                }
                int i4 = this.A00;
                boolean z9 = false;
                if ((i3 & 8) == 8) {
                    z9 = true;
                }
                this.A00 = r15.Ahq(i4, r9.A00, z8, z9);
                boolean z10 = false;
                if ((i2 & 16) == 16) {
                    z10 = true;
                }
                boolean z11 = this.A0B;
                boolean z12 = false;
                if ((i3 & 16) == 16) {
                    z12 = true;
                }
                this.A0B = r15.Ahm(z10, z11, z12, r9.A0B);
                boolean z13 = false;
                if ((i2 & 32) == 32) {
                    z13 = true;
                }
                boolean z14 = this.A0D;
                boolean z15 = false;
                if ((i3 & 32) == 32) {
                    z15 = true;
                }
                this.A0D = r15.Ahm(z13, z14, z15, r9.A0D);
                boolean z16 = false;
                if ((i2 & 64) == 64) {
                    z16 = true;
                }
                boolean z17 = this.A0G;
                boolean z18 = false;
                if ((i3 & 64) == 64) {
                    z18 = true;
                }
                this.A0G = r15.Ahm(z16, z17, z18, r9.A0G);
                boolean z19 = false;
                if ((i2 & 128) == 128) {
                    z19 = true;
                }
                boolean z20 = this.A09;
                boolean z21 = false;
                if ((i3 & 128) == 128) {
                    z21 = true;
                }
                this.A09 = r15.Ahm(z19, z20, z21, r9.A09);
                boolean z22 = false;
                if ((i2 & 256) == 256) {
                    z22 = true;
                }
                boolean z23 = this.A0I;
                boolean z24 = false;
                if ((i3 & 256) == 256) {
                    z24 = true;
                }
                this.A0I = r15.Ahm(z22, z23, z24, r9.A0I);
                boolean z25 = false;
                if ((i2 & 512) == 512) {
                    z25 = true;
                }
                boolean z26 = this.A0K;
                boolean z27 = false;
                if ((i3 & 512) == 512) {
                    z27 = true;
                }
                this.A0K = r15.Ahm(z25, z26, z27, r9.A0K);
                boolean z28 = false;
                if ((i2 & 1024) == 1024) {
                    z28 = true;
                }
                boolean z29 = this.A0S;
                boolean z30 = false;
                if ((i3 & 1024) == 1024) {
                    z30 = true;
                }
                this.A0S = r15.Ahm(z28, z29, z30, r9.A0S);
                boolean z31 = false;
                if ((i2 & 2048) == 2048) {
                    z31 = true;
                }
                boolean z32 = this.A0X;
                boolean z33 = false;
                if ((i3 & 2048) == 2048) {
                    z33 = true;
                }
                this.A0X = r15.Ahm(z31, z32, z33, r9.A0X);
                boolean z34 = false;
                if ((i2 & 4096) == 4096) {
                    z34 = true;
                }
                boolean z35 = this.A0e;
                boolean z36 = false;
                if ((i3 & 4096) == 4096) {
                    z36 = true;
                }
                this.A0e = r15.Ahm(z34, z35, z36, r9.A0e);
                boolean z37 = false;
                if ((i2 & 8192) == 8192) {
                    z37 = true;
                }
                boolean z38 = this.A0M;
                boolean z39 = false;
                if ((i3 & 8192) == 8192) {
                    z39 = true;
                }
                this.A0M = r15.Ahm(z37, z38, z39, r9.A0M);
                boolean z40 = false;
                if ((i2 & 16384) == 16384) {
                    z40 = true;
                }
                boolean z41 = this.A0U;
                boolean z42 = false;
                if ((i3 & 16384) == 16384) {
                    z42 = true;
                }
                this.A0U = r15.Ahm(z40, z41, z42, r9.A0U);
                boolean z43 = false;
                if ((i2 & 32768) == 32768) {
                    z43 = true;
                }
                boolean z44 = this.A0H;
                boolean z45 = false;
                if ((i3 & 32768) == 32768) {
                    z45 = true;
                }
                this.A0H = r15.Ahm(z43, z44, z45, r9.A0H);
                boolean z46 = false;
                if ((i2 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
                    z46 = true;
                }
                boolean z47 = this.A0O;
                boolean z48 = false;
                if ((i3 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
                    z48 = true;
                }
                this.A0O = r15.Ahm(z46, z47, z48, r9.A0O);
                boolean z49 = false;
                if ((i2 & 131072) == 131072) {
                    z49 = true;
                }
                boolean z50 = this.A0R;
                boolean z51 = false;
                if ((i3 & 131072) == 131072) {
                    z51 = true;
                }
                this.A0R = r15.Ahm(z49, z50, z51, r9.A0R);
                boolean z52 = false;
                if ((i2 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
                    z52 = true;
                }
                boolean z53 = this.A0d;
                boolean z54 = false;
                if ((i3 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
                    z54 = true;
                }
                this.A0d = r15.Ahm(z52, z53, z54, r9.A0d);
                boolean z55 = false;
                if ((i2 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
                    z55 = true;
                }
                boolean z56 = this.A0N;
                boolean z57 = false;
                if ((i3 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
                    z57 = true;
                }
                this.A0N = r15.Ahm(z55, z56, z57, r9.A0N);
                boolean z58 = false;
                if ((i2 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
                    z58 = true;
                }
                boolean z59 = this.A0P;
                boolean z60 = false;
                if ((i3 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
                    z60 = true;
                }
                this.A0P = r15.Ahm(z58, z59, z60, r9.A0P);
                boolean z61 = false;
                if ((i2 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
                    z61 = true;
                }
                boolean z62 = this.A0A;
                boolean z63 = false;
                if ((i3 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
                    z63 = true;
                }
                this.A0A = r15.Ahm(z61, z62, z63, r9.A0A);
                boolean z64 = false;
                if ((i2 & 4194304) == 4194304) {
                    z64 = true;
                }
                boolean z65 = this.A0F;
                boolean z66 = false;
                if ((i3 & 4194304) == 4194304) {
                    z66 = true;
                }
                this.A0F = r15.Ahm(z64, z65, z66, r9.A0F);
                boolean z67 = false;
                if ((i2 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) == 8388608) {
                    z67 = true;
                }
                boolean z68 = this.A0J;
                boolean z69 = false;
                if ((i3 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) == 8388608) {
                    z69 = true;
                }
                this.A0J = r15.Ahm(z67, z68, z69, r9.A0J);
                boolean z70 = false;
                if ((i2 & 16777216) == 16777216) {
                    z70 = true;
                }
                boolean z71 = this.A0Y;
                boolean z72 = false;
                if ((i3 & 16777216) == 16777216) {
                    z72 = true;
                }
                this.A0Y = r15.Ahm(z70, z71, z72, r9.A0Y);
                boolean z73 = false;
                if ((i2 & 33554432) == 33554432) {
                    z73 = true;
                }
                boolean z74 = this.A0T;
                boolean z75 = false;
                if ((i3 & 33554432) == 33554432) {
                    z75 = true;
                }
                this.A0T = r15.Ahm(z73, z74, z75, r9.A0T);
                boolean z76 = false;
                if ((i2 & 67108864) == 67108864) {
                    z76 = true;
                }
                boolean z77 = this.A0Q;
                boolean z78 = false;
                if ((i3 & 67108864) == 67108864) {
                    z78 = true;
                }
                this.A0Q = r15.Ahm(z76, z77, z78, r9.A0Q);
                boolean z79 = false;
                if ((i2 & 134217728) == 134217728) {
                    z79 = true;
                }
                boolean z80 = this.A0W;
                boolean z81 = false;
                if ((i3 & 134217728) == 134217728) {
                    z81 = true;
                }
                this.A0W = r15.Ahm(z79, z80, z81, r9.A0W);
                boolean z82 = false;
                if ((i2 & 268435456) == 268435456) {
                    z82 = true;
                }
                boolean z83 = this.A0Z;
                boolean z84 = false;
                if ((i3 & 268435456) == 268435456) {
                    z84 = true;
                }
                this.A0Z = r15.Ahm(z82, z83, z84, r9.A0Z);
                boolean z85 = false;
                if ((i2 & 536870912) == 536870912) {
                    z85 = true;
                }
                boolean z86 = this.A0V;
                boolean z87 = false;
                if ((i3 & 536870912) == 536870912) {
                    z87 = true;
                }
                this.A0V = r15.Ahm(z85, z86, z87, r9.A0V);
                boolean z88 = false;
                if ((i2 & 1073741824) == 1073741824) {
                    z88 = true;
                }
                boolean z89 = this.A0a;
                boolean z90 = false;
                if ((i3 & 1073741824) == 1073741824) {
                    z90 = true;
                }
                this.A0a = r15.Ahm(z88, z89, z90, r9.A0a);
                boolean z91 = false;
                if ((i2 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                    z91 = true;
                }
                boolean z92 = this.A0E;
                boolean z93 = false;
                if ((i3 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                    z93 = true;
                }
                this.A0E = r15.Ahm(z91, z92, z93, r9.A0E);
                int i5 = this.A02;
                boolean z94 = true;
                if ((i5 & 1) != 1) {
                    z94 = false;
                }
                boolean z95 = this.A0b;
                int i6 = r9.A02;
                boolean z96 = true;
                if ((i6 & 1) != 1) {
                    z96 = false;
                }
                this.A0b = r15.Ahm(z94, z95, z96, r9.A0b);
                boolean z97 = false;
                if ((i5 & 2) == 2) {
                    z97 = true;
                }
                boolean z98 = this.A0L;
                boolean z99 = false;
                if ((i6 & 2) == 2) {
                    z99 = true;
                }
                this.A0L = r15.Ahm(z97, z98, z99, r9.A0L);
                boolean z100 = false;
                if ((i5 & 4) == 4) {
                    z100 = true;
                }
                boolean z101 = this.A0c;
                boolean z102 = false;
                if ((i6 & 4) == 4) {
                    z102 = true;
                }
                this.A0c = r15.Ahm(z100, z101, z102, r9.A0c);
                boolean z103 = false;
                if ((i5 & 8) == 8) {
                    z103 = true;
                }
                boolean z104 = this.A08;
                boolean z105 = false;
                if ((i6 & 8) == 8) {
                    z105 = true;
                }
                this.A08 = r15.Ahm(z103, z104, z105, r9.A08);
                boolean z106 = false;
                if ((i5 & 16) == 16) {
                    z106 = true;
                }
                boolean z107 = this.A07;
                boolean z108 = false;
                if ((i6 & 16) == 16) {
                    z108 = true;
                }
                this.A07 = r15.Ahm(z106, z107, z108, r9.A07);
                boolean z109 = false;
                if ((i5 & 32) == 32) {
                    z109 = true;
                }
                long j2 = this.A03;
                boolean z110 = false;
                if ((i6 & 32) == 32) {
                    z110 = true;
                }
                this.A03 = r15.Aht(j2, r9.A03, z109, z110);
                boolean z111 = false;
                if ((i5 & 64) == 64) {
                    z111 = true;
                }
                boolean z112 = this.A0C;
                boolean z113 = false;
                if ((i6 & 64) == 64) {
                    z113 = true;
                }
                this.A0C = r15.Ahm(z111, z112, z113, r9.A0C);
                if (r15 == AnonymousClass2L7.A00) {
                    this.A01 = i2 | i3;
                    this.A02 = i5 | i6;
                }
                return this;
            case 2:
                C47852Kx r152 = (C47852Kx) obj4;
                while (true) {
                    try {
                        int A032 = r152.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 10:
                                String A0A2 = r152.A0A();
                                this.A01 = 1 | this.A01;
                                this.A04 = A0A2;
                                continue;
                            case 18:
                                String A0A3 = r152.A0A();
                                this.A01 |= 2;
                                this.A05 = A0A3;
                                continue;
                            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                                String A0A4 = r152.A0A();
                                this.A01 |= 4;
                                this.A06 = A0A4;
                                continue;
                            case 32:
                                this.A01 |= 8;
                                this.A00 = r152.A02();
                                continue;
                            case 40:
                                this.A01 |= 16;
                                this.A0B = r152.A0F();
                                continue;
                            case 48:
                                this.A01 |= 32;
                                this.A0D = r152.A0F();
                                continue;
                            case 56:
                                this.A01 |= 64;
                                this.A0G = r152.A0F();
                                continue;
                            case AccessibilityNodeInfoCompat.ACTION_ACCESSIBILITY_FOCUS /*64*/:
                                this.A01 |= 128;
                                this.A09 = r152.A0F();
                                continue;
                            case AnonymousClass2EA.A02:
                                this.A01 |= 256;
                                this.A0I = r152.A0F();
                                continue;
                            case 80:
                                this.A01 |= 512;
                                this.A0K = r152.A0F();
                                continue;
                            case 88:
                                this.A01 |= 1024;
                                this.A0S = r152.A0F();
                                continue;
                            case 96:
                                this.A01 |= 2048;
                                this.A0X = r152.A0F();
                                continue;
                            case 104:
                                this.A01 |= 4096;
                                this.A0e = r152.A0F();
                                continue;
                            case 112:
                                this.A01 |= 8192;
                                this.A0M = r152.A0F();
                                continue;
                            case 120:
                                this.A01 |= 16384;
                                this.A0U = r152.A0F();
                                continue;
                            case 128:
                                this.A01 |= 32768;
                                this.A0H = r152.A0F();
                                continue;
                            case 136:
                                this.A01 |= AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
                                this.A0O = r152.A0F();
                                continue;
                            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*144*/:
                                this.A01 |= 131072;
                                this.A0R = r152.A0F();
                                continue;
                            case 152:
                                this.A01 |= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START;
                                this.A0d = r152.A0F();
                                continue;
                            case 160:
                                this.A01 |= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END;
                                this.A0N = r152.A0F();
                                continue;
                            case 168:
                                this.A01 |= AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START;
                                this.A0P = r152.A0F();
                                continue;
                            case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /*176*/:
                                this.A01 |= AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END;
                                this.A0A = r152.A0F();
                                continue;
                            case 184:
                                this.A01 |= 4194304;
                                this.A0F = r152.A0F();
                                continue;
                            case 192:
                                this.A01 |= GravityCompat.RELATIVE_LAYOUT_DIRECTION;
                                this.A0J = r152.A0F();
                                continue;
                            case 200:
                                this.A01 |= 16777216;
                                this.A0Y = r152.A0F();
                                continue;
                            case 208:
                                this.A01 |= 33554432;
                                this.A0T = r152.A0F();
                                continue;
                            case 216:
                                this.A01 |= 67108864;
                                this.A0Q = r152.A0F();
                                continue;
                            case 224:
                                this.A01 |= 134217728;
                                this.A0W = r152.A0F();
                                continue;
                            case 232:
                                this.A01 |= 268435456;
                                this.A0Z = r152.A0F();
                                continue;
                            case 240:
                                this.A01 |= 536870912;
                                this.A0V = r152.A0F();
                                continue;
                            case 248:
                                this.A01 |= 1073741824;
                                this.A0a = r152.A0F();
                                continue;
                            case 256:
                                this.A01 |= Integer.MIN_VALUE;
                                this.A0E = r152.A0F();
                                continue;
                            case 264:
                                this.A02 |= 1;
                                this.A0b = r152.A0F();
                                continue;
                            case 272:
                                this.A02 |= 2;
                                this.A0L = r152.A0F();
                                continue;
                            case 280:
                                this.A02 |= 4;
                                this.A0c = r152.A0F();
                                continue;
                            case 288:
                                this.A02 |= 8;
                                this.A08 = r152.A0F();
                                continue;
                            case 296:
                                this.A02 |= 16;
                                this.A07 = r152.A0F();
                                continue;
                            case 304:
                                this.A02 |= 32;
                                this.A03 = r152.A06();
                                continue;
                            case 312:
                                this.A02 |= 64;
                                this.A0C = r152.A0F();
                                continue;
                            default:
                                if (!A0a(r152, A032)) {
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
                return new AnonymousClass2G7();
            case 5:
                return new C68273dA();
            case 6:
                break;
            case 7:
                if (A0g == null) {
                    synchronized (AnonymousClass2G7.class) {
                        if (A0g == null) {
                            A0g = new C47872Kz(A0f);
                        }
                    }
                }
                return A0g;
            default:
                throw new UnsupportedOperationException();
        }
        return A0f;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        if ((this.A01 & 1) == 1) {
            i3 = 0 + CodedOutputStream.A06(this.A04) + 1;
        }
        if ((this.A01 & 2) == 2) {
            i3 += CodedOutputStream.A06(this.A05) + 1;
        }
        if ((this.A01 & 4) == 4) {
            i3 += CodedOutputStream.A06(this.A06) + 1;
        }
        int i4 = this.A01;
        if ((i4 & 8) == 8) {
            i3 += CodedOutputStream.A01(4, this.A00);
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
            i3 += 2;
        }
        if ((i4 & 1024) == 1024) {
            i3 += 2;
        }
        if ((i4 & 2048) == 2048) {
            i3 += 2;
        }
        if ((i4 & 4096) == 4096) {
            i3 += 2;
        }
        if ((i4 & 8192) == 8192) {
            i3 += 2;
        }
        if ((i4 & 16384) == 16384) {
            i3 += 2;
        }
        if ((i4 & 32768) == 32768) {
            i3 += 3;
        }
        if ((i4 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            i3 += 3;
        }
        if ((i4 & 131072) == 131072) {
            i3 += 3;
        }
        if ((i4 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
            i3 += 3;
        }
        if ((i4 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
            i3 += 3;
        }
        if ((i4 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
            i3 += 3;
        }
        if ((i4 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
            i3 += 3;
        }
        if ((i4 & 4194304) == 4194304) {
            i3 += 3;
        }
        if ((i4 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) == 8388608) {
            i3 += 3;
        }
        if ((i4 & 16777216) == 16777216) {
            i3 += 3;
        }
        if ((i4 & 33554432) == 33554432) {
            i3 += 3;
        }
        if ((i4 & 67108864) == 67108864) {
            i3 += 3;
        }
        if ((i4 & 134217728) == 134217728) {
            i3 += 3;
        }
        if ((i4 & 268435456) == 268435456) {
            i3 += 3;
        }
        if ((i4 & 536870912) == 536870912) {
            i3 += 3;
        }
        if ((i4 & 1073741824) == 1073741824) {
            i3 += 3;
        }
        if ((i4 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            i3 += 3;
        }
        int i5 = this.A02;
        if ((i5 & 1) == 1) {
            i3 += 3;
        }
        if ((i5 & 2) == 2) {
            i3 += 3;
        }
        if ((i5 & 4) == 4) {
            i3 += 3;
        }
        if ((i5 & 8) == 8) {
            i3 += 3;
        }
        if ((i5 & 16) == 16) {
            i3 += 3;
        }
        if ((i5 & 32) == 32) {
            i3 += 2 + CodedOutputStream.A03(this.A03);
        }
        if ((i5 & 64) == 64) {
            i3 += 3;
        }
        int A002 = i3 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A01 & 1) == 1) {
            codedOutputStream.A0D(1, this.A04);
        }
        if ((this.A01 & 2) == 2) {
            codedOutputStream.A0D(2, this.A05);
        }
        if ((this.A01 & 4) == 4) {
            codedOutputStream.A0D(3, this.A06);
        }
        if ((this.A01 & 8) == 8) {
            codedOutputStream.A09(4, this.A00);
        }
        if ((this.A01 & 16) == 16) {
            codedOutputStream.A0E(5, this.A0B);
        }
        if ((this.A01 & 32) == 32) {
            codedOutputStream.A0E(6, this.A0D);
        }
        if ((this.A01 & 64) == 64) {
            codedOutputStream.A0E(7, this.A0G);
        }
        if ((this.A01 & 128) == 128) {
            codedOutputStream.A0E(8, this.A09);
        }
        if ((this.A01 & 256) == 256) {
            codedOutputStream.A0E(9, this.A0I);
        }
        if ((this.A01 & 512) == 512) {
            codedOutputStream.A0E(10, this.A0K);
        }
        if ((this.A01 & 1024) == 1024) {
            codedOutputStream.A0E(11, this.A0S);
        }
        if ((this.A01 & 2048) == 2048) {
            codedOutputStream.A0E(12, this.A0X);
        }
        if ((this.A01 & 4096) == 4096) {
            codedOutputStream.A0E(13, this.A0e);
        }
        if ((this.A01 & 8192) == 8192) {
            codedOutputStream.A0E(14, this.A0M);
        }
        if ((this.A01 & 16384) == 16384) {
            codedOutputStream.A0E(15, this.A0U);
        }
        if ((this.A01 & 32768) == 32768) {
            codedOutputStream.A0E(16, this.A0H);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            codedOutputStream.A0E(17, this.A0O);
        }
        if ((this.A01 & 131072) == 131072) {
            codedOutputStream.A0E(18, this.A0R);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
            codedOutputStream.A0E(19, this.A0d);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
            codedOutputStream.A0E(20, this.A0N);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
            codedOutputStream.A0E(21, this.A0P);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
            codedOutputStream.A0E(22, this.A0A);
        }
        if ((this.A01 & 4194304) == 4194304) {
            codedOutputStream.A0E(23, this.A0F);
        }
        if ((this.A01 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) == 8388608) {
            codedOutputStream.A0E(24, this.A0J);
        }
        if ((this.A01 & 16777216) == 16777216) {
            codedOutputStream.A0E(25, this.A0Y);
        }
        if ((this.A01 & 33554432) == 33554432) {
            codedOutputStream.A0E(26, this.A0T);
        }
        if ((this.A01 & 67108864) == 67108864) {
            codedOutputStream.A0E(27, this.A0Q);
        }
        if ((this.A01 & 134217728) == 134217728) {
            codedOutputStream.A0E(28, this.A0W);
        }
        if ((this.A01 & 268435456) == 268435456) {
            codedOutputStream.A0E(29, this.A0Z);
        }
        if ((this.A01 & 536870912) == 536870912) {
            codedOutputStream.A0E(30, this.A0V);
        }
        if ((this.A01 & 1073741824) == 1073741824) {
            codedOutputStream.A0E(31, this.A0a);
        }
        if ((this.A01 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            codedOutputStream.A0E(32, this.A0E);
        }
        if ((this.A02 & 1) == 1) {
            codedOutputStream.A0E(33, this.A0b);
        }
        if ((this.A02 & 2) == 2) {
            codedOutputStream.A0E(34, this.A0L);
        }
        if ((this.A02 & 4) == 4) {
            codedOutputStream.A0E(35, this.A0c);
        }
        if ((this.A02 & 8) == 8) {
            codedOutputStream.A0E(36, this.A08);
        }
        if ((this.A02 & 16) == 16) {
            codedOutputStream.A0E(37, this.A07);
        }
        if ((this.A02 & 32) == 32) {
            codedOutputStream.A0C(38, this.A03);
        }
        if ((this.A02 & 64) == 64) {
            codedOutputStream.A0E(39, this.A0C);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
