package X;

import android.support.v4.view.GravityCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.protobuf.CodedOutputStream;
import com.mod.bomfab.R$styleable;
import java.io.IOException;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.1bT  reason: invalid class name and case insensitive filesystem */
public final class C29941bT extends C28541Wm implements C28561Wp {
    public static final C29941bT A0j;
    public static volatile C47872Kz A0k;
    public byte A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public C28631Ww A0G;
    public C28631Ww A0H;
    public AnonymousClass1XE A0I;
    public AnonymousClass1XE A0J;
    public C30391cH A0K;
    public C58522td A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P = "";
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;

    static {
        C29941bT r0 = new C29941bT();
        A0j = r0;
        r0.A0W();
    }

    public C29941bT() {
        AnonymousClass2NE r0 = AnonymousClass2NE.A01;
        this.A0I = r0;
        this.A0S = "";
        this.A0T = "";
        this.A0R = "";
        this.A0U = "";
        this.A0J = r0;
        C28631Ww r02 = C28631Ww.A01;
        this.A0H = r02;
        this.A0G = r02;
        this.A0M = "";
        this.A0N = "";
        this.A0V = "";
        this.A0O = "";
        this.A0W = "";
        this.A0Q = "";
    }

    public final Object A0b(AnonymousClass2L5 r23, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r23.ordinal()) {
            case 0:
                byte b2 = this.A00;
                if (b2 != 1) {
                    if (b2 != 0) {
                        boolean booleanValue = ((Boolean) obj4).booleanValue();
                        if ((this.A01 & 1) == 1) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= this.A0I.size()) {
                                    int i3 = 0;
                                    while (i3 < this.A0J.size()) {
                                        if (((C28541Wm) this.A0J.get(i3)).A0Z()) {
                                            i3++;
                                        }
                                    }
                                    if (booleanValue) {
                                        this.A00 = 1;
                                        break;
                                    }
                                } else if (((C28541Wm) this.A0I.get(i2)).A0Z()) {
                                    i2++;
                                }
                            }
                        }
                        if (booleanValue) {
                            this.A00 = 0;
                        }
                    }
                    return null;
                }
                break;
            case 1:
                AnonymousClass2L6 r15 = (AnonymousClass2L6) obj4;
                C29941bT r1 = (C29941bT) obj3;
                boolean z2 = true;
                if ((this.A01 & 1) != 1) {
                    z2 = false;
                }
                String str = this.A0P;
                boolean z3 = true;
                if ((r1.A01 & 1) != 1) {
                    z3 = false;
                }
                this.A0P = r15.Ahz(str, r1.A0P, z2, z3);
                this.A0I = r15.Ahs(this.A0I, r1.A0I);
                int i4 = this.A01;
                boolean z4 = false;
                if ((i4 & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A0S;
                int i5 = r1.A01;
                boolean z5 = false;
                if ((i5 & 2) == 2) {
                    z5 = true;
                }
                this.A0S = r15.Ahz(str2, r1.A0S, z4, z5);
                boolean z6 = false;
                if ((i4 & 4) == 4) {
                    z6 = true;
                }
                String str3 = this.A0T;
                boolean z7 = false;
                if ((i5 & 4) == 4) {
                    z7 = true;
                }
                this.A0T = r15.Ahz(str3, r1.A0T, z6, z7);
                boolean z8 = false;
                if ((i4 & 8) == 8) {
                    z8 = true;
                }
                long j2 = this.A0C;
                boolean z9 = false;
                if ((i5 & 8) == 8) {
                    z9 = true;
                }
                this.A0C = r15.Aht(j2, r1.A0C, z8, z9);
                boolean z10 = false;
                if ((i4 & 16) == 16) {
                    z10 = true;
                }
                int i6 = this.A07;
                boolean z11 = false;
                if ((i5 & 16) == 16) {
                    z11 = true;
                }
                this.A07 = r15.Ahq(i6, r1.A07, z10, z11);
                boolean z12 = false;
                if ((i4 & 32) == 32) {
                    z12 = true;
                }
                boolean z13 = this.A0e;
                boolean z14 = false;
                if ((i5 & 32) == 32) {
                    z14 = true;
                }
                this.A0e = r15.Ahm(z12, z13, z14, r1.A0e);
                boolean z15 = false;
                if ((i4 & 64) == 64) {
                    z15 = true;
                }
                boolean z16 = this.A0Y;
                boolean z17 = false;
                if ((i5 & 64) == 64) {
                    z17 = true;
                }
                this.A0Y = r15.Ahm(z15, z16, z17, r1.A0Y);
                boolean z18 = false;
                if ((i4 & 128) == 128) {
                    z18 = true;
                }
                int i7 = this.A04;
                boolean z19 = false;
                if ((i5 & 128) == 128) {
                    z19 = true;
                }
                this.A04 = r15.Ahq(i7, r1.A04, z18, z19);
                boolean z20 = false;
                if ((i4 & 256) == 256) {
                    z20 = true;
                }
                long j3 = this.A0B;
                boolean z21 = false;
                if ((i5 & 256) == 256) {
                    z21 = true;
                }
                this.A0B = r15.Aht(j3, r1.A0B, z20, z21);
                boolean z22 = false;
                if ((i4 & 512) == 512) {
                    z22 = true;
                }
                int i8 = this.A03;
                boolean z23 = false;
                if ((i5 & 512) == 512) {
                    z23 = true;
                }
                this.A03 = r15.Ahq(i8, r1.A03, z22, z23);
                boolean z24 = false;
                if ((i4 & 1024) == 1024) {
                    z24 = true;
                }
                long j4 = this.A09;
                boolean z25 = false;
                if ((i5 & 1024) == 1024) {
                    z25 = true;
                }
                this.A09 = r15.Aht(j4, r1.A09, z24, z25);
                boolean z26 = false;
                if ((i4 & 2048) == 2048) {
                    z26 = true;
                }
                String str4 = this.A0R;
                boolean z27 = false;
                if ((i5 & 2048) == 2048) {
                    z27 = true;
                }
                this.A0R = r15.Ahz(str4, r1.A0R, z26, z27);
                boolean z28 = false;
                if ((i4 & 4096) == 4096) {
                    z28 = true;
                }
                String str5 = this.A0U;
                boolean z29 = false;
                if ((i5 & 4096) == 4096) {
                    z29 = true;
                }
                this.A0U = r15.Ahz(str5, r1.A0U, z28, z29);
                boolean z30 = false;
                if ((i4 & 8192) == 8192) {
                    z30 = true;
                }
                boolean z31 = this.A0c;
                boolean z32 = false;
                if ((i5 & 8192) == 8192) {
                    z32 = true;
                }
                this.A0c = r15.Ahm(z30, z31, z32, r1.A0c);
                boolean z33 = false;
                if ((i4 & 16384) == 16384) {
                    z33 = true;
                }
                boolean z34 = this.A0X;
                boolean z35 = false;
                if ((i5 & 16384) == 16384) {
                    z35 = true;
                }
                this.A0X = r15.Ahm(z33, z34, z35, r1.A0X);
                this.A0K = (C30391cH) r15.Ahu(this.A0K, r1.A0K);
                int i9 = this.A01;
                boolean z36 = false;
                if ((i9 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
                    z36 = true;
                }
                int i10 = this.A08;
                int i11 = r1.A01;
                boolean z37 = false;
                if ((i11 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
                    z37 = true;
                }
                this.A08 = r15.Ahq(i10, r1.A08, z36, z37);
                boolean z38 = false;
                if ((i9 & 131072) == 131072) {
                    z38 = true;
                }
                boolean z39 = this.A0b;
                boolean z40 = false;
                if ((i11 & 131072) == 131072) {
                    z40 = true;
                }
                this.A0b = r15.Ahm(z38, z39, z40, r1.A0b);
                this.A0J = r15.Ahs(this.A0J, r1.A0J);
                boolean z41 = false;
                if ((this.A01 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
                    z41 = true;
                }
                C28631Ww r6 = this.A0H;
                boolean z42 = false;
                if ((r1.A01 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
                    z42 = true;
                }
                this.A0H = r15.Ahn(r6, r1.A0H, z41, z42);
                int i12 = this.A01;
                boolean z43 = false;
                if ((i12 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
                    z43 = true;
                }
                long j5 = this.A0F;
                int i13 = r1.A01;
                boolean z44 = false;
                if ((i13 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
                    z44 = true;
                }
                this.A0F = r15.Aht(j5, r1.A0F, z43, z44);
                boolean z45 = false;
                if ((i12 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
                    z45 = true;
                }
                C28631Ww r5 = this.A0G;
                boolean z46 = false;
                if ((i13 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
                    z46 = true;
                }
                this.A0G = r15.Ahn(r5, r1.A0G, z45, z46);
                int i14 = this.A01;
                boolean z47 = false;
                if ((i14 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
                    z47 = true;
                }
                int i15 = this.A06;
                int i16 = r1.A01;
                boolean z48 = false;
                if ((i16 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
                    z48 = true;
                }
                this.A06 = r15.Ahq(i15, r1.A06, z47, z48);
                boolean z49 = false;
                if ((i14 & 4194304) == 4194304) {
                    z49 = true;
                }
                long j6 = this.A0D;
                boolean z50 = false;
                if ((i16 & 4194304) == 4194304) {
                    z50 = true;
                }
                this.A0D = r15.Aht(j6, r1.A0D, z49, z50);
                this.A0L = (C58522td) r15.Ahu(this.A0L, r1.A0L);
                int i17 = this.A01;
                boolean z51 = false;
                if ((i17 & 16777216) == 16777216) {
                    z51 = true;
                }
                int i18 = this.A05;
                int i19 = r1.A01;
                boolean z52 = false;
                if ((i19 & 16777216) == 16777216) {
                    z52 = true;
                }
                this.A05 = r15.Ahq(i18, r1.A05, z51, z52);
                boolean z53 = false;
                if ((i17 & 33554432) == 33554432) {
                    z53 = true;
                }
                long j7 = this.A0E;
                boolean z54 = false;
                if ((i19 & 33554432) == 33554432) {
                    z54 = true;
                }
                this.A0E = r15.Aht(j7, r1.A0E, z53, z54);
                boolean z55 = false;
                if ((i17 & 67108864) == 67108864) {
                    z55 = true;
                }
                boolean z56 = this.A0h;
                boolean z57 = false;
                if ((i19 & 67108864) == 67108864) {
                    z57 = true;
                }
                this.A0h = r15.Ahm(z55, z56, z57, r1.A0h);
                boolean z58 = false;
                if ((i17 & 134217728) == 134217728) {
                    z58 = true;
                }
                boolean z59 = this.A0i;
                boolean z60 = false;
                if ((i19 & 134217728) == 134217728) {
                    z60 = true;
                }
                this.A0i = r15.Ahm(z58, z59, z60, r1.A0i);
                boolean z61 = false;
                if ((i17 & 268435456) == 268435456) {
                    z61 = true;
                }
                long j8 = this.A0A;
                boolean z62 = false;
                if ((i19 & 268435456) == 268435456) {
                    z62 = true;
                }
                this.A0A = r15.Aht(j8, r1.A0A, z61, z62);
                boolean z63 = false;
                if ((i17 & 536870912) == 536870912) {
                    z63 = true;
                }
                String str6 = this.A0M;
                boolean z64 = false;
                if ((i19 & 536870912) == 536870912) {
                    z64 = true;
                }
                this.A0M = r15.Ahz(str6, r1.A0M, z63, z64);
                boolean z65 = false;
                if ((i17 & 1073741824) == 1073741824) {
                    z65 = true;
                }
                String str7 = this.A0N;
                boolean z66 = false;
                if ((i19 & 1073741824) == 1073741824) {
                    z66 = true;
                }
                this.A0N = r15.Ahz(str7, r1.A0N, z65, z66);
                boolean z67 = false;
                if ((i17 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                    z67 = true;
                }
                boolean z68 = this.A0g;
                boolean z69 = false;
                if ((i19 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
                    z69 = true;
                }
                this.A0g = r15.Ahm(z67, z68, z69, r1.A0g);
                int i20 = this.A02;
                boolean z70 = true;
                if ((i20 & 1) != 1) {
                    z70 = false;
                }
                boolean z71 = this.A0a;
                int i21 = r1.A02;
                boolean z72 = true;
                if ((i21 & 1) != 1) {
                    z72 = false;
                }
                this.A0a = r15.Ahm(z70, z71, z72, r1.A0a);
                boolean z73 = false;
                if ((i20 & 2) == 2) {
                    z73 = true;
                }
                boolean z74 = this.A0Z;
                boolean z75 = false;
                if ((i21 & 2) == 2) {
                    z75 = true;
                }
                this.A0Z = r15.Ahm(z73, z74, z75, r1.A0Z);
                boolean z76 = false;
                if ((i20 & 4) == 4) {
                    z76 = true;
                }
                String str8 = this.A0V;
                boolean z77 = false;
                if ((i21 & 4) == 4) {
                    z77 = true;
                }
                this.A0V = r15.Ahz(str8, r1.A0V, z76, z77);
                boolean z78 = false;
                if ((i20 & 8) == 8) {
                    z78 = true;
                }
                String str9 = this.A0O;
                boolean z79 = false;
                if ((i21 & 8) == 8) {
                    z79 = true;
                }
                this.A0O = r15.Ahz(str9, r1.A0O, z78, z79);
                boolean z80 = false;
                if ((i20 & 16) == 16) {
                    z80 = true;
                }
                String str10 = this.A0W;
                boolean z81 = false;
                if ((i21 & 16) == 16) {
                    z81 = true;
                }
                this.A0W = r15.Ahz(str10, r1.A0W, z80, z81);
                boolean z82 = false;
                if ((i20 & 32) == 32) {
                    z82 = true;
                }
                boolean z83 = this.A0f;
                boolean z84 = false;
                if ((i21 & 32) == 32) {
                    z84 = true;
                }
                this.A0f = r15.Ahm(z82, z83, z84, r1.A0f);
                boolean z85 = false;
                if ((i20 & 64) == 64) {
                    z85 = true;
                }
                boolean z86 = this.A0d;
                boolean z87 = false;
                if ((i21 & 64) == 64) {
                    z87 = true;
                }
                this.A0d = r15.Ahm(z85, z86, z87, r1.A0d);
                boolean z88 = false;
                if ((i20 & 128) == 128) {
                    z88 = true;
                }
                String str11 = this.A0Q;
                boolean z89 = false;
                if ((i21 & 128) == 128) {
                    z89 = true;
                }
                this.A0Q = r15.Ahz(str11, r1.A0Q, z88, z89);
                if (r15 == AnonymousClass2L7.A00) {
                    this.A01 = i17 | i19;
                    this.A02 = i20 | i21;
                }
                return this;
            case 2:
                C47852Kx r152 = (C47852Kx) obj4;
                C47862Ky r12 = (C47862Ky) obj3;
                while (true) {
                    try {
                        int A032 = r152.A03();
                        switch (A032) {
                            case 0:
                                break;
                            case 10:
                                String A0A2 = r152.A0A();
                                this.A01 |= 1;
                                this.A0P = A0A2;
                                continue;
                            case 18:
                                AnonymousClass1XE r4 = this.A0I;
                                if (!((AnonymousClass1XF) r4).A00) {
                                    r4 = C28541Wm.A0G(r4);
                                    this.A0I = r4;
                                }
                                r4.add((C442223g) r152.A09(r12, C442223g.A04.A0V()));
                                continue;
                            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                                String A0A3 = r152.A0A();
                                this.A01 |= 2;
                                this.A0S = A0A3;
                                continue;
                            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                                String A0A4 = r152.A0A();
                                this.A01 |= 4;
                                this.A0T = A0A4;
                                continue;
                            case 40:
                                this.A01 |= 8;
                                this.A0C = r152.A06();
                                continue;
                            case 48:
                                this.A01 |= 16;
                                this.A07 = r152.A02();
                                continue;
                            case 56:
                                this.A01 |= 32;
                                this.A0e = r152.A0F();
                                continue;
                            case AccessibilityNodeInfoCompat.ACTION_ACCESSIBILITY_FOCUS /*64*/:
                                this.A01 |= 64;
                                this.A0Y = r152.A0F();
                                continue;
                            case AnonymousClass2EA.A02 /*72*/:
                                this.A01 |= 128;
                                this.A04 = r152.A02();
                                continue;
                            case 80:
                                this.A01 |= 256;
                                this.A0B = r152.A06();
                                continue;
                            case 88:
                                int A022 = r152.A02();
                                if (A022 == 0 || A022 == 1) {
                                    this.A01 |= 512;
                                    this.A03 = A022;
                                    break;
                                } else {
                                    super.A0X(11, A022);
                                    continue;
                                }
                            case 96:
                                this.A01 |= 1024;
                                this.A09 = r152.A06();
                                continue;
                            case 106:
                                String A0A5 = r152.A0A();
                                this.A01 |= 2048;
                                this.A0R = A0A5;
                                continue;
                            case 114:
                                String A0A6 = r152.A0A();
                                this.A01 |= 4096;
                                this.A0U = A0A6;
                                continue;
                            case 120:
                                this.A01 |= 8192;
                                this.A0c = r152.A0F();
                                continue;
                            case 128:
                                this.A01 |= 16384;
                                this.A0X = r152.A0F();
                                continue;
                            case 138:
                                C30401cI r42 = (this.A01 & 32768) == 32768 ? (C30401cI) this.A0K.A0U() : null;
                                C30391cH r3 = (C30391cH) r152.A09(r12, C30391cH.A02.A0V());
                                this.A0K = r3;
                                if (r42 != null) {
                                    r42.A04(r3);
                                    this.A0K = (C30391cH) r42.A01();
                                }
                                this.A01 |= 32768;
                                continue;
                            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*144*/:
                                this.A01 |= AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
                                this.A08 = r152.A02();
                                continue;
                            case 152:
                                this.A01 |= 131072;
                                this.A0b = r152.A0F();
                                continue;
                            case 162:
                                AnonymousClass1XE r43 = this.A0J;
                                if (!((AnonymousClass1XF) r43).A00) {
                                    r43 = C28541Wm.A0G(r43);
                                    this.A0J = r43;
                                }
                                r43.add((C445624o) r152.A09(r12, C445624o.A04.A0V()));
                                continue;
                            case 170:
                                this.A01 |= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START;
                                this.A0H = r152.A08();
                                continue;
                            case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /*176*/:
                                this.A01 |= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END;
                                this.A0F = r152.A06();
                                continue;
                            case 186:
                                this.A01 |= AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START;
                                this.A0G = r152.A08();
                                continue;
                            case 192:
                                this.A01 |= AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END;
                                this.A06 = r152.A02();
                                continue;
                            case 200:
                                this.A01 |= 4194304;
                                this.A0D = r152.A06();
                                continue;
                            case 210:
                                C69373ew r44 = (this.A01 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) == 8388608 ? (C69373ew) this.A0L.A0U() : null;
                                C58522td r32 = (C58522td) r152.A09(r12, C58522td.A03.A0V());
                                this.A0L = r32;
                                if (r44 != null) {
                                    r44.A04(r32);
                                    this.A0L = (C58522td) r44.A01();
                                }
                                this.A01 |= GravityCompat.RELATIVE_LAYOUT_DIRECTION;
                                continue;
                            case 216:
                                int A023 = r152.A02();
                                if (AnonymousClass430.A00(A023) != null) {
                                    this.A01 |= 16777216;
                                    this.A05 = A023;
                                    break;
                                } else {
                                    super.A0X(27, A023);
                                    continue;
                                }
                            case 224:
                                this.A01 |= 33554432;
                                this.A0E = r152.A06();
                                continue;
                            case 232:
                                this.A01 |= 67108864;
                                this.A0h = r152.A0F();
                                continue;
                            case 240:
                                this.A01 |= 134217728;
                                this.A0i = r152.A0F();
                                continue;
                            case 248:
                                this.A01 |= 268435456;
                                this.A0A = r152.A06();
                                continue;
                            case 258:
                                String A0A7 = r152.A0A();
                                this.A01 |= 536870912;
                                this.A0M = A0A7;
                                continue;
                            case 266:
                                String A0A8 = r152.A0A();
                                this.A01 |= 1073741824;
                                this.A0N = A0A8;
                                continue;
                            case 272:
                                this.A01 |= Integer.MIN_VALUE;
                                this.A0g = r152.A0F();
                                continue;
                            case 280:
                                this.A02 |= 1;
                                this.A0a = r152.A0F();
                                continue;
                            case 288:
                                this.A02 |= 2;
                                this.A0Z = r152.A0F();
                                continue;
                            case 298:
                                String A0A9 = r152.A0A();
                                this.A02 |= 4;
                                this.A0V = A0A9;
                                continue;
                            case 306:
                                String A0A10 = r152.A0A();
                                this.A02 |= 8;
                                this.A0O = A0A10;
                                continue;
                            case 314:
                                String A0A11 = r152.A0A();
                                this.A02 |= 16;
                                this.A0W = A0A11;
                                continue;
                            case 320:
                                this.A02 |= 32;
                                this.A0f = r152.A0F();
                                continue;
                            case 328:
                                this.A02 |= 64;
                                this.A0d = r152.A0F();
                                continue;
                            case 338:
                                String A0A12 = r152.A0A();
                                this.A02 |= 128;
                                this.A0Q = A0A12;
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
                        C29791bD r13 = new C29791bD(e3.getMessage());
                        r13.unfinishedMessage = this;
                        runtimeException = new RuntimeException(r13);
                        throw runtimeException;
                    }
                }
            case 3:
                ((AnonymousClass1XF) this.A0I).A00 = false;
                ((AnonymousClass1XF) this.A0J).A00 = false;
                return null;
            case 4:
                return new C29941bT();
            case 5:
                return new C29931bS();
            case 6:
                break;
            case 7:
                if (A0k == null) {
                    synchronized (C29941bT.class) {
                        if (A0k == null) {
                            A0k = new C47872Kz(A0j);
                        }
                    }
                }
                return A0k;
            default:
                throw new UnsupportedOperationException();
        }
        return A0j;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int A062 = (this.A01 & 1) == 1 ? CodedOutputStream.A06(this.A0P) + 1 : 0;
        for (int i3 = 0; i3 < this.A0I.size(); i3++) {
            A062 += CodedOutputStream.A05((AnonymousClass1Wo) this.A0I.get(i3), 2);
        }
        if ((this.A01 & 2) == 2) {
            A062 += CodedOutputStream.A06(this.A0S) + 1;
        }
        if ((this.A01 & 4) == 4) {
            A062 += CodedOutputStream.A06(this.A0T) + 1;
        }
        int i4 = this.A01;
        if ((i4 & 8) == 8) {
            A062 += CodedOutputStream.A03(this.A0C) + 1;
        }
        if ((i4 & 16) == 16) {
            A062 += CodedOutputStream.A02(6, this.A07);
        }
        if ((i4 & 32) == 32) {
            A062 += 2;
        }
        if ((i4 & 64) == 64) {
            A062 += 2;
        }
        if ((i4 & 128) == 128) {
            A062 += CodedOutputStream.A02(9, this.A04);
        }
        if ((i4 & 256) == 256) {
            A062 += CodedOutputStream.A03(this.A0B) + 1;
        }
        if ((i4 & 512) == 512) {
            A062 += CodedOutputStream.A00(11, this.A03);
        }
        if ((i4 & 1024) == 1024) {
            A062 += CodedOutputStream.A03(this.A09) + 1;
        }
        if ((i4 & 2048) == 2048) {
            A062 += CodedOutputStream.A06(this.A0R) + 1;
        }
        if ((this.A01 & 4096) == 4096) {
            A062 += CodedOutputStream.A06(this.A0U) + 1;
        }
        int i5 = this.A01;
        if ((i5 & 8192) == 8192) {
            A062 += 2;
        }
        if ((i5 & 16384) == 16384) {
            A062 += 3;
        }
        if ((i5 & 32768) == 32768) {
            C30391cH r0 = this.A0K;
            if (r0 == null) {
                r0 = C30391cH.A02;
            }
            A062 += CodedOutputStream.A05(r0, 17);
        }
        int i6 = this.A01;
        if ((i6 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            A062 += CodedOutputStream.A02(18, this.A08);
        }
        if ((i6 & 131072) == 131072) {
            A062 += 3;
        }
        for (int i7 = 0; i7 < this.A0J.size(); i7++) {
            A062 += CodedOutputStream.A05((AnonymousClass1Wo) this.A0J.get(i7), 20);
        }
        int i8 = this.A01;
        if ((i8 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
            A062 += CodedOutputStream.A04(this.A0H, 21);
        }
        if ((i8 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
            A062 += CodedOutputStream.A03(this.A0F) + 2;
        }
        if ((i8 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
            A062 += CodedOutputStream.A04(this.A0G, 23);
        }
        if ((i8 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
            A062 += CodedOutputStream.A02(24, this.A06);
        }
        if ((i8 & 4194304) == 4194304) {
            A062 += CodedOutputStream.A03(this.A0D) + 2;
        }
        if ((i8 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) == 8388608) {
            C58522td r02 = this.A0L;
            if (r02 == null) {
                r02 = C58522td.A03;
            }
            A062 += CodedOutputStream.A05(r02, 26);
        }
        int i9 = this.A01;
        if ((i9 & 16777216) == 16777216) {
            A062 += CodedOutputStream.A00(27, this.A05);
        }
        if ((i9 & 33554432) == 33554432) {
            A062 += CodedOutputStream.A03(this.A0E) + 2;
        }
        if ((i9 & 67108864) == 67108864) {
            A062 += 3;
        }
        if ((i9 & 134217728) == 134217728) {
            A062 += 3;
        }
        if ((i9 & 268435456) == 268435456) {
            A062 += CodedOutputStream.A03(this.A0A) + 2;
        }
        if ((i9 & 536870912) == 536870912) {
            A062 += CodedOutputStream.A06(this.A0M) + 2;
        }
        if ((this.A01 & 1073741824) == 1073741824) {
            A062 += CodedOutputStream.A06(this.A0N) + 2;
        }
        if ((this.A01 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            A062 += 3;
        }
        int i10 = this.A02;
        if ((i10 & 1) == 1) {
            A062 += 3;
        }
        if ((i10 & 2) == 2) {
            A062 += 3;
        }
        if ((i10 & 4) == 4) {
            A062 += CodedOutputStream.A06(this.A0V) + 2;
        }
        if ((this.A02 & 8) == 8) {
            A062 += CodedOutputStream.A06(this.A0O) + 2;
        }
        if ((this.A02 & 16) == 16) {
            A062 += CodedOutputStream.A06(this.A0W) + 2;
        }
        int i11 = this.A02;
        if ((i11 & 32) == 32) {
            A062 += 3;
        }
        if ((i11 & 64) == 64) {
            A062 += 3;
        }
        if ((i11 & 128) == 128) {
            A062 += 2 + CodedOutputStream.A06(this.A0Q);
        }
        int A002 = A062 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A01 & 1) == 1) {
            codedOutputStream.A0D(1, this.A0P);
        }
        for (int i2 = 0; i2 < this.A0I.size(); i2++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A0I.get(i2), 2);
        }
        if ((this.A01 & 2) == 2) {
            codedOutputStream.A0D(3, this.A0S);
        }
        if ((this.A01 & 4) == 4) {
            codedOutputStream.A0D(4, this.A0T);
        }
        if ((this.A01 & 8) == 8) {
            codedOutputStream.A0C(5, this.A0C);
        }
        if ((this.A01 & 16) == 16) {
            codedOutputStream.A0A(6, this.A07);
        }
        if ((this.A01 & 32) == 32) {
            codedOutputStream.A0E(7, this.A0e);
        }
        if ((this.A01 & 64) == 64) {
            codedOutputStream.A0E(8, this.A0Y);
        }
        if ((this.A01 & 128) == 128) {
            codedOutputStream.A0A(9, this.A04);
        }
        if ((this.A01 & 256) == 256) {
            codedOutputStream.A0C(10, this.A0B);
        }
        if ((this.A01 & 512) == 512) {
            codedOutputStream.A09(11, this.A03);
        }
        if ((this.A01 & 1024) == 1024) {
            codedOutputStream.A0C(12, this.A09);
        }
        if ((this.A01 & 2048) == 2048) {
            codedOutputStream.A0D(13, this.A0R);
        }
        if ((this.A01 & 4096) == 4096) {
            codedOutputStream.A0D(14, this.A0U);
        }
        if ((this.A01 & 8192) == 8192) {
            codedOutputStream.A0E(15, this.A0c);
        }
        if ((this.A01 & 16384) == 16384) {
            codedOutputStream.A0E(16, this.A0X);
        }
        if ((this.A01 & 32768) == 32768) {
            C30391cH r0 = this.A0K;
            if (r0 == null) {
                r0 = C30391cH.A02;
            }
            codedOutputStream.A0G(r0, 17);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            codedOutputStream.A0A(18, this.A08);
        }
        if ((this.A01 & 131072) == 131072) {
            codedOutputStream.A0E(19, this.A0b);
        }
        for (int i3 = 0; i3 < this.A0J.size(); i3++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A0J.get(i3), 20);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
            codedOutputStream.A0F(this.A0H, 21);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
            codedOutputStream.A0C(22, this.A0F);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
            codedOutputStream.A0F(this.A0G, 23);
        }
        if ((this.A01 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
            codedOutputStream.A0A(24, this.A06);
        }
        if ((this.A01 & 4194304) == 4194304) {
            codedOutputStream.A0C(25, this.A0D);
        }
        if ((this.A01 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) == 8388608) {
            C58522td r02 = this.A0L;
            if (r02 == null) {
                r02 = C58522td.A03;
            }
            codedOutputStream.A0G(r02, 26);
        }
        if ((this.A01 & 16777216) == 16777216) {
            codedOutputStream.A09(27, this.A05);
        }
        if ((this.A01 & 33554432) == 33554432) {
            codedOutputStream.A0C(28, this.A0E);
        }
        if ((this.A01 & 67108864) == 67108864) {
            codedOutputStream.A0E(29, this.A0h);
        }
        if ((this.A01 & 134217728) == 134217728) {
            codedOutputStream.A0E(30, this.A0i);
        }
        if ((this.A01 & 268435456) == 268435456) {
            codedOutputStream.A0C(31, this.A0A);
        }
        if ((this.A01 & 536870912) == 536870912) {
            codedOutputStream.A0D(32, this.A0M);
        }
        if ((this.A01 & 1073741824) == 1073741824) {
            codedOutputStream.A0D(33, this.A0N);
        }
        if ((this.A01 & Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            codedOutputStream.A0E(34, this.A0g);
        }
        if ((this.A02 & 1) == 1) {
            codedOutputStream.A0E(35, this.A0a);
        }
        if ((this.A02 & 2) == 2) {
            codedOutputStream.A0E(36, this.A0Z);
        }
        if ((this.A02 & 4) == 4) {
            codedOutputStream.A0D(37, this.A0V);
        }
        if ((this.A02 & 8) == 8) {
            codedOutputStream.A0D(38, this.A0O);
        }
        if ((this.A02 & 16) == 16) {
            codedOutputStream.A0D(39, this.A0W);
        }
        if ((this.A02 & 32) == 32) {
            codedOutputStream.A0E(40, this.A0f);
        }
        if ((this.A02 & 64) == 64) {
            codedOutputStream.A0E(41, this.A0d);
        }
        if ((this.A02 & 128) == 128) {
            codedOutputStream.A0D(42, this.A0Q);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
