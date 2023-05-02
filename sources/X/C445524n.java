package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.google.protobuf.CodedOutputStream;
import com.mod.bomfab.R$styleable;
import java.io.IOException;

/* renamed from: X.24n  reason: invalid class name and case insensitive filesystem */
public final class C445524n extends C28541Wm implements C28561Wp {
    public static final C445524n A0O;
    public static volatile C47872Kz A0P;
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
    public AnonymousClass1XE A0E;
    public AnonymousClass21S A0F;
    public String A0G;
    public String A0H;
    public String A0I = "";
    public String A0J;
    public String A0K;
    public String A0L = "";
    public boolean A0M;
    public boolean A0N;

    static {
        C445524n r0 = new C445524n();
        A0O = r0;
        r0.A0W();
    }

    public C445524n() {
        C28631Ww r1 = C28631Ww.A01;
        this.A08 = r1;
        this.A0A = r1;
        this.A0G = "";
        this.A07 = r1;
        this.A0E = AnonymousClass2NE.A01;
        this.A0H = "";
        this.A09 = r1;
        this.A0B = r1;
        this.A0K = "";
        this.A0D = r1;
        this.A0C = r1;
        this.A0J = "";
    }

    public final Object A0b(AnonymousClass2L5 r16, Object obj, Object obj2) {
        RuntimeException runtimeException;
        Object obj3 = obj2;
        Object obj4 = obj;
        switch (r16.ordinal()) {
            case 0:
                return A0O;
            case 1:
                AnonymousClass2L6 r8 = (AnonymousClass2L6) obj4;
                C445524n r1 = (C445524n) obj3;
                int i2 = this.A00;
                boolean z2 = true;
                if ((i2 & 1) != 1) {
                    z2 = false;
                }
                String str = this.A0L;
                int i3 = r1.A00;
                boolean z3 = true;
                if ((i3 & 1) != 1) {
                    z3 = false;
                }
                this.A0L = r8.Ahz(str, r1.A0L, z2, z3);
                boolean z4 = false;
                if ((i2 & 2) == 2) {
                    z4 = true;
                }
                String str2 = this.A0I;
                boolean z5 = false;
                if ((i3 & 2) == 2) {
                    z5 = true;
                }
                this.A0I = r8.Ahz(str2, r1.A0I, z4, z5);
                boolean z6 = false;
                if ((i2 & 4) == 4) {
                    z6 = true;
                }
                C28631Ww r4 = this.A08;
                boolean z7 = false;
                if ((i3 & 4) == 4) {
                    z7 = true;
                }
                this.A08 = r8.Ahn(r4, r1.A08, z6, z7);
                int i4 = this.A00;
                boolean z8 = false;
                if ((i4 & 8) == 8) {
                    z8 = true;
                }
                long j2 = this.A05;
                int i5 = r1.A00;
                boolean z9 = false;
                if ((i5 & 8) == 8) {
                    z9 = true;
                }
                this.A05 = r8.Aht(j2, r1.A05, z8, z9);
                boolean z10 = false;
                if ((i4 & 16) == 16) {
                    z10 = true;
                }
                int i6 = this.A03;
                boolean z11 = false;
                if ((i5 & 16) == 16) {
                    z11 = true;
                }
                this.A03 = r8.Ahq(i6, r1.A03, z10, z11);
                boolean z12 = false;
                if ((i4 & 32) == 32) {
                    z12 = true;
                }
                C28631Ww r42 = this.A0A;
                boolean z13 = false;
                if ((i5 & 32) == 32) {
                    z13 = true;
                }
                this.A0A = r8.Ahn(r42, r1.A0A, z12, z13);
                int i7 = this.A00;
                boolean z14 = false;
                if ((i7 & 64) == 64) {
                    z14 = true;
                }
                String str3 = this.A0G;
                int i8 = r1.A00;
                boolean z15 = false;
                if ((i8 & 64) == 64) {
                    z15 = true;
                }
                this.A0G = r8.Ahz(str3, r1.A0G, z14, z15);
                boolean z16 = false;
                if ((i7 & 128) == 128) {
                    z16 = true;
                }
                boolean z17 = this.A0M;
                boolean z18 = false;
                if ((i8 & 128) == 128) {
                    z18 = true;
                }
                this.A0M = r8.Ahm(z16, z17, z18, r1.A0M);
                boolean z19 = false;
                if ((i7 & 256) == 256) {
                    z19 = true;
                }
                int i9 = this.A02;
                boolean z20 = false;
                if ((i8 & 256) == 256) {
                    z20 = true;
                }
                this.A02 = r8.Ahq(i9, r1.A02, z19, z20);
                boolean z21 = false;
                if ((i7 & 512) == 512) {
                    z21 = true;
                }
                int i10 = this.A04;
                boolean z22 = false;
                if ((i8 & 512) == 512) {
                    z22 = true;
                }
                this.A04 = r8.Ahq(i10, r1.A04, z21, z22);
                boolean z23 = false;
                if ((i7 & 1024) == 1024) {
                    z23 = true;
                }
                C28631Ww r3 = this.A07;
                boolean z24 = false;
                if ((i8 & 1024) == 1024) {
                    z24 = true;
                }
                this.A07 = r8.Ahn(r3, r1.A07, z23, z24);
                this.A0E = r8.Ahs(this.A0E, r1.A0E);
                int i11 = this.A00;
                boolean z25 = false;
                if ((i11 & 2048) == 2048) {
                    z25 = true;
                }
                String str4 = this.A0H;
                int i12 = r1.A00;
                boolean z26 = false;
                if ((i12 & 2048) == 2048) {
                    z26 = true;
                }
                this.A0H = r8.Ahz(str4, r1.A0H, z25, z26);
                boolean z27 = false;
                if ((i11 & 4096) == 4096) {
                    z27 = true;
                }
                long j3 = this.A06;
                boolean z28 = false;
                if ((i12 & 4096) == 4096) {
                    z28 = true;
                }
                this.A06 = r8.Aht(j3, r1.A06, z27, z28);
                boolean z29 = false;
                if ((i11 & 8192) == 8192) {
                    z29 = true;
                }
                C28631Ww r32 = this.A09;
                boolean z30 = false;
                if ((i12 & 8192) == 8192) {
                    z30 = true;
                }
                this.A09 = r8.Ahn(r32, r1.A09, z29, z30);
                this.A0F = (AnonymousClass21S) r8.Ahu(this.A0F, r1.A0F);
                boolean z31 = false;
                if ((this.A00 & 32768) == 32768) {
                    z31 = true;
                }
                C28631Ww r43 = this.A0B;
                boolean z32 = false;
                if ((r1.A00 & 32768) == 32768) {
                    z32 = true;
                }
                this.A0B = r8.Ahn(r43, r1.A0B, z31, z32);
                int i13 = this.A00;
                boolean z33 = false;
                if ((i13 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
                    z33 = true;
                }
                int i14 = this.A01;
                int i15 = r1.A00;
                boolean z34 = false;
                if ((i15 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
                    z34 = true;
                }
                this.A01 = r8.Ahq(i14, r1.A01, z33, z34);
                boolean z35 = false;
                if ((i13 & 131072) == 131072) {
                    z35 = true;
                }
                boolean z36 = this.A0N;
                boolean z37 = false;
                if ((i15 & 131072) == 131072) {
                    z37 = true;
                }
                this.A0N = r8.Ahm(z35, z36, z37, r1.A0N);
                boolean z38 = false;
                if ((i13 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
                    z38 = true;
                }
                String str5 = this.A0K;
                boolean z39 = false;
                if ((i15 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
                    z39 = true;
                }
                this.A0K = r8.Ahz(str5, r1.A0K, z38, z39);
                boolean z40 = false;
                if ((i13 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
                    z40 = true;
                }
                C28631Ww r33 = this.A0D;
                boolean z41 = false;
                if ((i15 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
                    z41 = true;
                }
                this.A0D = r8.Ahn(r33, r1.A0D, z40, z41);
                boolean z42 = false;
                if ((this.A00 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
                    z42 = true;
                }
                C28631Ww r44 = this.A0C;
                boolean z43 = false;
                if ((r1.A00 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
                    z43 = true;
                }
                this.A0C = r8.Ahn(r44, r1.A0C, z42, z43);
                int i16 = this.A00;
                boolean z44 = false;
                if ((i16 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
                    z44 = true;
                }
                String str6 = this.A0J;
                int i17 = r1.A00;
                boolean z45 = false;
                if ((i17 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
                    z45 = true;
                }
                this.A0J = r8.Ahz(str6, r1.A0J, z44, z45);
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
                                this.A0L = A0A2;
                                continue;
                            case 18:
                                String A0A3 = r82.A0A();
                                this.A00 |= 2;
                                this.A0I = A0A3;
                                continue;
                            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                                this.A00 |= 4;
                                this.A08 = r82.A08();
                                continue;
                            case 32:
                                this.A00 |= 8;
                                this.A05 = r82.A06();
                                continue;
                            case 40:
                                this.A00 |= 16;
                                this.A03 = r82.A02();
                                continue;
                            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*50*/:
                                this.A00 |= 32;
                                this.A0A = r82.A08();
                                continue;
                            case 58:
                                String A0A4 = r82.A0A();
                                this.A00 |= 64;
                                this.A0G = A0A4;
                                continue;
                            case AccessibilityNodeInfoCompat.ACTION_ACCESSIBILITY_FOCUS /*64*/:
                                this.A00 |= 128;
                                this.A0M = r82.A0F();
                                continue;
                            case AnonymousClass2EA.A02 /*72*/:
                                this.A00 |= 256;
                                this.A02 = r82.A02();
                                continue;
                            case 80:
                                this.A00 |= 512;
                                this.A04 = r82.A02();
                                continue;
                            case 90:
                                this.A00 |= 1024;
                                this.A07 = r82.A08();
                                continue;
                            case 98:
                                AnonymousClass1XE r2 = this.A0E;
                                if (!((AnonymousClass1XF) r2).A00) {
                                    r2 = C28541Wm.A0G(r2);
                                    this.A0E = r2;
                                }
                                r2.add((C58562th) r82.A09(r12, C58562th.A04.A0V()));
                                continue;
                            case 106:
                                String A0A5 = r82.A0A();
                                this.A00 |= 2048;
                                this.A0H = A0A5;
                                continue;
                            case 112:
                                this.A00 |= 4096;
                                this.A06 = r82.A06();
                                continue;
                            case 130:
                                this.A00 |= 8192;
                                this.A09 = r82.A08();
                                continue;
                            case 138:
                                AnonymousClass21T r22 = (this.A00 & 16384) == 16384 ? (AnonymousClass21T) this.A0F.A0U() : null;
                                AnonymousClass21S r0 = (AnonymousClass21S) r82.A09(r12, AnonymousClass21S.A0R.A0V());
                                this.A0F = r0;
                                if (r22 != null) {
                                    r22.A04(r0);
                                    this.A0F = (AnonymousClass21S) r22.A01();
                                }
                                this.A00 |= 16384;
                                continue;
                            case 146:
                                this.A00 |= 32768;
                                this.A0B = r82.A08();
                                continue;
                            case 152:
                                int A022 = r82.A02();
                                if (A022 == 0 || A022 == 1 || A022 == 2) {
                                    this.A00 |= AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
                                    this.A01 = A022;
                                    break;
                                } else {
                                    super.A0X(19, A022);
                                    continue;
                                }
                            case 160:
                                this.A00 |= 131072;
                                this.A0N = r82.A0F();
                                continue;
                            case 170:
                                String A0A6 = r82.A0A();
                                this.A00 |= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START;
                                this.A0K = A0A6;
                                continue;
                            case 178:
                                this.A00 |= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END;
                                this.A0D = r82.A08();
                                continue;
                            case 186:
                                this.A00 |= AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START;
                                this.A0C = r82.A08();
                                continue;
                            case 194:
                                String A0A7 = r82.A0A();
                                this.A00 |= AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END;
                                this.A0J = A0A7;
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
                ((AnonymousClass1XF) this.A0E).A00 = false;
                return null;
            case 4:
                return new C445524n();
            case 5:
                return new C69593fI();
            case 6:
                break;
            case 7:
                if (A0P == null) {
                    synchronized (C445524n.class) {
                        if (A0P == null) {
                            A0P = new C47872Kz(A0O);
                        }
                    }
                }
                return A0P;
            default:
                throw new UnsupportedOperationException();
        }
        return A0O;
    }

    public int AFw() {
        int i2 = this.A00;
        if (i2 != -1) {
            return i2;
        }
        int A062 = (this.A00 & 1) == 1 ? 1 + CodedOutputStream.A06(this.A0L) : 0;
        if ((this.A00 & 2) == 2) {
            A062 += 1 + CodedOutputStream.A06(this.A0I);
        }
        int i3 = this.A00;
        if ((i3 & 4) == 4) {
            A062 += CodedOutputStream.A04(this.A08, 3);
        }
        if ((i3 & 8) == 8) {
            A062 += 1 + CodedOutputStream.A03(this.A05);
        }
        if ((i3 & 16) == 16) {
            A062 += CodedOutputStream.A02(5, this.A03);
        }
        if ((i3 & 32) == 32) {
            A062 += CodedOutputStream.A04(this.A0A, 6);
        }
        if ((i3 & 64) == 64) {
            A062 += 1 + CodedOutputStream.A06(this.A0G);
        }
        int i4 = this.A00;
        if ((i4 & 128) == 128) {
            A062 += 2;
        }
        if ((i4 & 256) == 256) {
            A062 += CodedOutputStream.A02(9, this.A02);
        }
        if ((i4 & 512) == 512) {
            A062 += CodedOutputStream.A02(10, this.A04);
        }
        if ((i4 & 1024) == 1024) {
            A062 += CodedOutputStream.A04(this.A07, 11);
        }
        for (int i5 = 0; i5 < this.A0E.size(); i5++) {
            A062 += CodedOutputStream.A05((AnonymousClass1Wo) this.A0E.get(i5), 12);
        }
        if ((this.A00 & 2048) == 2048) {
            A062 += 1 + CodedOutputStream.A06(this.A0H);
        }
        int i6 = this.A00;
        if ((i6 & 4096) == 4096) {
            A062 += 1 + CodedOutputStream.A03(this.A06);
        }
        if ((i6 & 8192) == 8192) {
            A062 += CodedOutputStream.A04(this.A09, 16);
        }
        if ((i6 & 16384) == 16384) {
            AnonymousClass21S r0 = this.A0F;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            A062 += CodedOutputStream.A05(r0, 17);
        }
        int i7 = this.A00;
        if ((i7 & 32768) == 32768) {
            A062 += CodedOutputStream.A04(this.A0B, 18);
        }
        if ((i7 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            A062 += CodedOutputStream.A00(19, this.A01);
        }
        if ((i7 & 131072) == 131072) {
            A062 += 3;
        }
        if ((i7 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
            A062 += 2 + CodedOutputStream.A06(this.A0K);
        }
        int i8 = this.A00;
        if ((i8 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
            A062 += CodedOutputStream.A04(this.A0D, 22);
        }
        if ((i8 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
            A062 += CodedOutputStream.A04(this.A0C, 23);
        }
        if ((i8 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
            A062 += 2 + CodedOutputStream.A06(this.A0J);
        }
        int A002 = A062 + this.unknownFields.A00();
        this.A00 = A002;
        return A002;
    }

    public void AiJ(CodedOutputStream codedOutputStream) {
        if ((this.A00 & 1) == 1) {
            codedOutputStream.A0D(1, this.A0L);
        }
        if ((this.A00 & 2) == 2) {
            codedOutputStream.A0D(2, this.A0I);
        }
        if ((this.A00 & 4) == 4) {
            codedOutputStream.A0F(this.A08, 3);
        }
        if ((this.A00 & 8) == 8) {
            codedOutputStream.A0C(4, this.A05);
        }
        if ((this.A00 & 16) == 16) {
            codedOutputStream.A0A(5, this.A03);
        }
        if ((this.A00 & 32) == 32) {
            codedOutputStream.A0F(this.A0A, 6);
        }
        if ((this.A00 & 64) == 64) {
            codedOutputStream.A0D(7, this.A0G);
        }
        if ((this.A00 & 128) == 128) {
            codedOutputStream.A0E(8, this.A0M);
        }
        if ((this.A00 & 256) == 256) {
            codedOutputStream.A0A(9, this.A02);
        }
        if ((this.A00 & 512) == 512) {
            codedOutputStream.A0A(10, this.A04);
        }
        if ((this.A00 & 1024) == 1024) {
            codedOutputStream.A0F(this.A07, 11);
        }
        for (int i2 = 0; i2 < this.A0E.size(); i2++) {
            codedOutputStream.A0G((AnonymousClass1Wo) this.A0E.get(i2), 12);
        }
        if ((this.A00 & 2048) == 2048) {
            codedOutputStream.A0D(13, this.A0H);
        }
        if ((this.A00 & 4096) == 4096) {
            codedOutputStream.A0C(14, this.A06);
        }
        if ((this.A00 & 8192) == 8192) {
            codedOutputStream.A0F(this.A09, 16);
        }
        if ((this.A00 & 16384) == 16384) {
            AnonymousClass21S r0 = this.A0F;
            if (r0 == null) {
                r0 = AnonymousClass21S.A0R;
            }
            codedOutputStream.A0G(r0, 17);
        }
        if ((this.A00 & 32768) == 32768) {
            codedOutputStream.A0F(this.A0B, 18);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
            codedOutputStream.A09(19, this.A01);
        }
        if ((this.A00 & 131072) == 131072) {
            codedOutputStream.A0E(20, this.A0N);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
            codedOutputStream.A0D(21, this.A0K);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END) == 524288) {
            codedOutputStream.A0F(this.A0D, 22);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START) == 1048576) {
            codedOutputStream.A0F(this.A0C, 23);
        }
        if ((this.A00 & AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END) == 2097152) {
            codedOutputStream.A0D(24, this.A0J);
        }
        this.unknownFields.A02(codedOutputStream);
    }
}
