package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.support.v4.view.MotionEventCompat;

/* renamed from: X.4en  reason: invalid class name and case insensitive filesystem */
public final class C90784en {
    public static final byte[] A07 = {0, 7, 8, 15};
    public static final byte[] A08 = {0, 119, -120, -1};
    public static final byte[] A09 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Bitmap A00;
    public final Canvas A01 = new Canvas();
    public final Paint A02;
    public final Paint A03;
    public final AnonymousClass4LV A04 = new AnonymousClass4LV(new int[]{0, -1, -16777216, -8421505}, A03(), A04(), 0);
    public final C85124Nf A05 = new C85124Nf(719, 575, 0, 719, 0, 575);
    public final C85334Oa A06;

    public C90784en(int i2, int i3) {
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.A03 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.A06 = new C85334Oa(i2, i3);
    }

    public static AnonymousClass4LV A00(C90204dh r19, int i2) {
        int[] iArr;
        int A042;
        int A043;
        int A044;
        int A045;
        int i3 = 8;
        C90204dh r12 = r19;
        int A046 = r12.A04(8);
        r12.A08(8);
        int i4 = 2;
        int i5 = i2 - 2;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] A032 = A03();
        int[] A047 = A04();
        while (i5 > 0) {
            int A048 = r12.A04(i3);
            int A049 = r12.A04(i3);
            int i6 = i5 - 2;
            if ((A049 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = A047;
                if ((A049 & 64) != 0) {
                    iArr = A032;
                }
            }
            if ((A049 & 1) != 0) {
                A042 = r12.A04(i3);
                A043 = r12.A04(i3);
                A044 = r12.A04(i3);
                A045 = r12.A04(i3);
                i5 = i6 - 4;
            } else {
                A042 = r12.A04(6) << i4;
                A043 = r12.A04(4) << 4;
                A044 = r12.A04(4) << 4;
                A045 = r12.A04(i4) << 6;
                i5 = i6 - 2;
            }
            if (A042 == 0) {
                A043 = 0;
                A044 = 0;
                A045 = MotionEventCompat.ACTION_MASK;
            }
            double d2 = (double) A042;
            double d3 = (double) (A043 - 128);
            double d4 = (double) (A044 - 128);
            iArr[A048] = (((byte) (255 - (A045 & MotionEventCompat.ACTION_MASK))) << 24) | (AnonymousClass3K3.A0C((int) (d2 + (1.402d * d3)), MotionEventCompat.ACTION_MASK, 0) << 16) | (AnonymousClass3K3.A0C((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), MotionEventCompat.ACTION_MASK, 0) << 8) | AnonymousClass3K3.A0C((int) (d2 + (d4 * 1.772d)), MotionEventCompat.ACTION_MASK, 0);
            i3 = 8;
            i4 = 2;
        }
        return new AnonymousClass4LV(iArr2, A032, A047, A046);
    }

    public static AnonymousClass4LW A01(C90204dh r6) {
        byte[] bArr;
        int A042 = r6.A04(16);
        r6.A08(4);
        int A043 = r6.A04(2);
        boolean A0C = r6.A0C();
        r6.A08(1);
        byte[] bArr2 = AnonymousClass3C1.A0A;
        if (A043 == 1) {
            r6.A08(r6.A04(8) << 4);
        } else if (A043 == 0) {
            int A044 = r6.A04(16);
            int A045 = r6.A04(16);
            if (A044 > 0) {
                bArr2 = new byte[A044];
                r6.A0B(bArr2, A044);
            }
            if (A045 > 0) {
                bArr = new byte[A045];
                r6.A0B(bArr, A045);
                return new AnonymousClass4LW(bArr2, bArr, A042, A0C);
            }
        }
        bArr = bArr2;
        return new AnonymousClass4LW(bArr2, bArr, A042, A0C);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0010, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        if (r0 == 0) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        r13 = false;
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        if (r22 == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        r10.setColor(r24[r0]);
        r15.drawRect((float) r7, (float) r9, (float) (r7 + r12), (float) (r9 + 1), r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0080, code lost:
        r7 = r7 + r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0084, code lost:
        r1 = r8.A0C();
        r12 = r8.A04(7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        if (r1 != false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        if (r12 == 0) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0091, code lost:
        r13 = false;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0094, code lost:
        r13 = true;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0097, code lost:
        r0 = r8.A04(8);
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (r12 == 0) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e6, code lost:
        if (r11 != 0) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x017d, code lost:
        if (r11 != 0) goto L_0x0136;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v26, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v45, types: [byte] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(android.graphics.Canvas r21, android.graphics.Paint r22, byte[] r23, int[] r24, int r25, int r26, int r27) {
        /*
            r1 = r23
            r9 = r27
            int r0 = r1.length
            X.4dh r8 = new X.4dh
            r8.<init>(r1, r0)
            r14 = 0
            r7 = r26
            r6 = r14
            r5 = r14
            r4 = r14
        L_0x0010:
            int r0 = X.C90204dh.A00(r8)
            if (r0 == 0) goto L_0x01c0
            r3 = 8
            int r1 = r8.A04(r3)
            r0 = 240(0xf0, float:3.36E-43)
            if (r1 == r0) goto L_0x01ba
            r0 = 3
            r15 = r21
            r10 = r22
            r2 = r25
            switch(r1) {
                case 16: goto L_0x009f;
                case 17: goto L_0x0126;
                case 18: goto L_0x005c;
                default: goto L_0x002a;
            }
        L_0x002a:
            switch(r1) {
                case 32: goto L_0x003e;
                case 33: goto L_0x004d;
                case 34: goto L_0x002e;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0010
        L_0x002e:
            r2 = 16
            byte[] r5 = new byte[r2]
            r1 = 0
        L_0x0033:
            int r0 = r8.A04(r3)
            int r1 = X.AnonymousClass3K4.A0C(r5, r0, r1)
            if (r1 >= r2) goto L_0x0010
            goto L_0x0033
        L_0x003e:
            r2 = 4
            byte[] r4 = new byte[r2]
            r1 = 0
        L_0x0042:
            int r0 = r8.A04(r2)
            int r1 = X.AnonymousClass3K4.A0C(r4, r0, r1)
            if (r1 >= r2) goto L_0x0010
            goto L_0x0042
        L_0x004d:
            r2 = 4
            byte[] r6 = new byte[r2]
            r1 = 0
        L_0x0051:
            int r0 = r8.A04(r3)
            int r1 = X.AnonymousClass3K4.A0C(r6, r0, r1)
            if (r1 >= r2) goto L_0x0010
            goto L_0x0051
        L_0x005c:
            int r0 = r8.A04(r3)
            if (r0 == 0) goto L_0x0084
            r13 = 0
            r12 = 1
        L_0x0064:
            if (r22 == 0) goto L_0x0080
            r0 = r24[r0]
            r10.setColor(r0)
            float r11 = (float) r7
            float r2 = (float) r9
            int r0 = r7 + r12
            float r1 = (float) r0
            int r0 = r9 + 1
            float r0 = (float) r0
            r20 = r10
            r18 = r1
            r19 = r0
            r16 = r11
            r17 = r2
            r15.drawRect(r16, r17, r18, r19, r20)
        L_0x0080:
            int r7 = r7 + r12
            if (r13 == 0) goto L_0x005c
            goto L_0x0010
        L_0x0084:
            boolean r1 = r8.A0C()
            r0 = 7
            int r12 = r8.A04(r0)
            if (r1 != 0) goto L_0x0097
            if (r12 == 0) goto L_0x0094
            r13 = 0
            r0 = 0
            goto L_0x0064
        L_0x0094:
            r13 = 1
            r12 = 0
            goto L_0x0080
        L_0x0097:
            int r0 = r8.A04(r3)
            r13 = 0
            if (r12 == 0) goto L_0x0080
            goto L_0x0064
        L_0x009f:
            if (r2 != r0) goto L_0x011a
            if (r6 != 0) goto L_0x0118
            byte[] r13 = A08
        L_0x00a5:
            r1 = 2
            int r0 = r8.A04(r1)
            r3 = 1
            if (r0 == 0) goto L_0x00d4
            r12 = 0
        L_0x00ae:
            r11 = 1
        L_0x00af:
            if (r22 == 0) goto L_0x00cf
            if (r13 == 0) goto L_0x00b5
            byte r0 = r13[r0]
        L_0x00b5:
            r0 = r24[r0]
            r10.setColor(r0)
            float r3 = (float) r7
            float r2 = (float) r9
            int r0 = r7 + r11
            float r1 = (float) r0
            int r0 = r9 + 1
            float r0 = (float) r0
            r20 = r10
            r18 = r1
            r19 = r0
            r16 = r3
            r17 = r2
            r15.drawRect(r16, r17, r18, r19, r20)
        L_0x00cf:
            int r7 = r7 + r11
            if (r12 == 0) goto L_0x00a5
            goto L_0x0159
        L_0x00d4:
            boolean r0 = r8.A0C()
            r2 = 3
            if (r0 == 0) goto L_0x00e9
            int r0 = r8.A04(r2)
            int r11 = r0 + 3
        L_0x00e1:
            int r0 = r8.A04(r1)
            r12 = 0
            if (r11 == 0) goto L_0x00cf
            goto L_0x00af
        L_0x00e9:
            boolean r0 = r8.A0C()
            if (r0 == 0) goto L_0x00f2
            r12 = 0
            r0 = 0
            goto L_0x00ae
        L_0x00f2:
            int r0 = r8.A04(r1)
            if (r0 == 0) goto L_0x0101
            if (r0 == r3) goto L_0x0114
            if (r0 == r1) goto L_0x010c
            if (r0 == r2) goto L_0x0103
            r12 = 0
        L_0x00ff:
            r11 = 0
            goto L_0x00cf
        L_0x0101:
            r12 = 1
            goto L_0x00ff
        L_0x0103:
            r0 = 8
            int r0 = r8.A04(r0)
            int r11 = r0 + 29
            goto L_0x00e1
        L_0x010c:
            r0 = 4
            int r0 = r8.A04(r0)
            int r11 = r0 + 12
            goto L_0x00e1
        L_0x0114:
            r12 = 0
            r0 = 0
            r11 = 2
            goto L_0x00af
        L_0x0118:
            r13 = r6
            goto L_0x00a5
        L_0x011a:
            r0 = 2
            if (r2 != r0) goto L_0x0124
            if (r4 != 0) goto L_0x0122
            byte[] r13 = A07
            goto L_0x00a5
        L_0x0122:
            r13 = r4
            goto L_0x00a5
        L_0x0124:
            r13 = r14
            goto L_0x00a5
        L_0x0126:
            if (r2 != r0) goto L_0x01b7
            if (r5 != 0) goto L_0x01b4
            byte[] r13 = A09
        L_0x012c:
            r3 = 4
            int r0 = r8.A04(r3)
            r12 = 2
            r11 = 1
            if (r0 == 0) goto L_0x016b
            r12 = 0
        L_0x0136:
            if (r22 == 0) goto L_0x0156
            if (r13 == 0) goto L_0x013c
            byte r0 = r13[r0]
        L_0x013c:
            r0 = r24[r0]
            r10.setColor(r0)
            float r3 = (float) r7
            float r2 = (float) r9
            int r0 = r7 + r11
            float r1 = (float) r0
            int r0 = r9 + 1
            float r0 = (float) r0
            r20 = r10
            r18 = r1
            r19 = r0
            r16 = r3
            r17 = r2
            r15.drawRect(r16, r17, r18, r19, r20)
        L_0x0156:
            int r7 = r7 + r11
            if (r12 == 0) goto L_0x012c
        L_0x0159:
            int r0 = r8.A00
            if (r0 == 0) goto L_0x0010
            r0 = 0
            r8.A00 = r0
            int r0 = r8.A02
            int r0 = r0 + 1
            r8.A02 = r0
            r8.A06()
            goto L_0x0010
        L_0x016b:
            boolean r0 = r8.A0C()
            r2 = 3
            if (r0 != 0) goto L_0x0180
            int r0 = r8.A04(r2)
            r12 = 1
            if (r0 == 0) goto L_0x019b
            int r11 = r0 + 2
            r12 = 0
            r0 = 0
        L_0x017d:
            if (r11 == 0) goto L_0x0156
            goto L_0x0136
        L_0x0180:
            boolean r1 = r8.A0C()
            int r0 = r8.A04(r12)
            if (r1 != 0) goto L_0x0192
            int r11 = r0 + 4
        L_0x018c:
            int r0 = r8.A04(r3)
            r12 = 0
            goto L_0x017d
        L_0x0192:
            if (r0 == 0) goto L_0x01b1
            if (r0 == r11) goto L_0x01ad
            if (r0 == r12) goto L_0x01a6
            if (r0 == r2) goto L_0x019d
            r12 = 0
        L_0x019b:
            r11 = 0
            goto L_0x0156
        L_0x019d:
            r0 = 8
            int r0 = r8.A04(r0)
            int r11 = r0 + 25
            goto L_0x018c
        L_0x01a6:
            int r0 = r8.A04(r3)
            int r11 = r0 + 9
            goto L_0x018c
        L_0x01ad:
            r12 = 0
            r0 = 0
            r11 = 2
            goto L_0x0136
        L_0x01b1:
            r12 = 0
            r0 = 0
            goto L_0x0136
        L_0x01b4:
            r13 = r5
            goto L_0x012c
        L_0x01b7:
            r13 = r14
            goto L_0x012c
        L_0x01ba:
            int r9 = r9 + 2
            r7 = r26
            goto L_0x0010
        L_0x01c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90784en.A02(android.graphics.Canvas, android.graphics.Paint, byte[], int[], int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r4 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] A03() {
        /*
            r7 = 16
            int[] r6 = new int[r7]
            r0 = 0
            r6[r0] = r0
            r5 = 1
        L_0x0008:
            r4 = 255(0xff, float:3.57E-43)
        L_0x000a:
            r0 = r5 & 2
            r3 = 0
            if (r0 == 0) goto L_0x0011
            r3 = 255(0xff, float:3.57E-43)
        L_0x0011:
            r0 = r5 & 4
            r2 = 0
            if (r0 == 0) goto L_0x0018
            r2 = 255(0xff, float:3.57E-43)
        L_0x0018:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = r4 << 16
            r1 = r1 | r0
            int r0 = r3 << 8
            r1 = r1 | r0
            r1 = r1 | r2
        L_0x0021:
            r6[r5] = r1
            int r5 = r5 + 1
            if (r5 >= r7) goto L_0x004e
            r1 = 8
            r0 = r5 & 1
            if (r5 >= r1) goto L_0x0031
            r4 = 0
            if (r0 == 0) goto L_0x000a
            goto L_0x0008
        L_0x0031:
            r4 = 127(0x7f, float:1.78E-43)
            r3 = 0
            if (r0 == 0) goto L_0x0038
            r3 = 127(0x7f, float:1.78E-43)
        L_0x0038:
            r0 = r5 & 2
            r2 = 0
            if (r0 == 0) goto L_0x003f
            r2 = 127(0x7f, float:1.78E-43)
        L_0x003f:
            r0 = r5 & 4
            if (r0 != 0) goto L_0x0044
            r4 = 0
        L_0x0044:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r0 = r3 << 16
            r1 = r1 | r0
            int r0 = r2 << 8
            r1 = r1 | r0
            r1 = r1 | r4
            goto L_0x0021
        L_0x004e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90784en.A03():int[]");
    }

    public static int[] A04() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int[] iArr = new int[256];
        iArr[0] = 0;
        int i8 = 0;
        do {
            int i9 = MotionEventCompat.ACTION_MASK;
            if (i8 < 8) {
                i5 = 0;
                if ((i8 & 1) != 0) {
                    i5 = MotionEventCompat.ACTION_MASK;
                }
                i6 = 0;
                if ((i8 & 2) != 0) {
                    i6 = MotionEventCompat.ACTION_MASK;
                }
                if ((i8 & 4) == 0) {
                    i9 = 0;
                }
                i7 = 1056964608;
            } else {
                int i10 = i8 & 136;
                int i11 = 170;
                int i12 = 85;
                if (i10 == 0) {
                    int i13 = 0;
                    if ((i8 & 1) != 0) {
                        i13 = 85;
                    }
                    int i14 = 0;
                    if ((i8 & 16) != 0) {
                        i14 = 170;
                    }
                    i2 = i13 + i14;
                    int i15 = 0;
                    if ((i8 & 2) != 0) {
                        i15 = 85;
                    }
                    int i16 = 0;
                    if ((i8 & 32) != 0) {
                        i16 = 170;
                    }
                    i3 = i15 + i16;
                    if ((i8 & 4) == 0) {
                        i12 = 0;
                    }
                    if ((i8 & 64) == 0) {
                        i11 = 0;
                    }
                } else if (i10 != 8) {
                    i11 = 43;
                    if (i10 != 128) {
                        if (i10 == 136) {
                            int i17 = 0;
                            if ((i8 & 1) != 0) {
                                i17 = 43;
                            }
                            int i18 = 0;
                            if ((i8 & 16) != 0) {
                                i18 = 85;
                            }
                            i2 = i17 + i18;
                            int i19 = 0;
                            if ((i8 & 2) != 0) {
                                i19 = 43;
                            }
                            int i20 = 0;
                            if ((i8 & 32) != 0) {
                                i20 = 85;
                            }
                            i3 = i19 + i20;
                            if ((i8 & 4) == 0) {
                                i11 = 0;
                            }
                        }
                        i8++;
                    } else {
                        int i21 = 0;
                        if ((i8 & 1) != 0) {
                            i21 = 43;
                        }
                        int i22 = i21 + 127;
                        int i23 = 0;
                        if ((i8 & 16) != 0) {
                            i23 = 85;
                        }
                        i2 = i22 + i23;
                        int i24 = 0;
                        if ((i8 & 2) != 0) {
                            i24 = 43;
                        }
                        int i25 = i24 + 127;
                        int i26 = 0;
                        if ((i8 & 32) != 0) {
                            i26 = 85;
                        }
                        i3 = i25 + i26;
                        if ((i8 & 4) == 0) {
                            i11 = 0;
                        }
                        i11 += 127;
                    }
                    if ((i8 & 64) == 0) {
                        i12 = 0;
                    }
                } else {
                    int i27 = 0;
                    if ((i8 & 1) != 0) {
                        i27 = 85;
                    }
                    int i28 = 0;
                    if ((i8 & 16) != 0) {
                        i28 = 170;
                    }
                    i5 = i27 + i28;
                    int i29 = 0;
                    if ((i8 & 2) != 0) {
                        i29 = 85;
                    }
                    int i30 = 0;
                    if ((i8 & 32) != 0) {
                        i30 = 170;
                    }
                    i6 = i29 + i30;
                    if ((i8 & 4) == 0) {
                        i12 = 0;
                    }
                    if ((i8 & 64) == 0) {
                        i11 = 0;
                    }
                    i9 = i12 + i11;
                    i7 = 2130706432;
                }
                i4 = -16777216 | (i2 << 16) | (i3 << 8) | (i11 + i12);
                iArr[i8] = i4;
                i8++;
            }
            i4 = i7 | (i5 << 16) | (i6 << 8) | i9;
            iArr[i8] = i4;
            i8++;
        } while (i8 < 256);
        return iArr;
    }
}
