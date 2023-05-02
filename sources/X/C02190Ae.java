package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;

/* renamed from: X.0Ae  reason: invalid class name and case insensitive filesystem */
public class C02190Ae extends Drawable {
    public static final float[] A0L = {0.0f, 0.317f, 0.453f, 0.542f, 0.85f, 1.0f};
    public static final int[] A0M = {-15173646, -14298266, -668109, -37796, -6278145, -15173646};
    public Path A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final Bitmap A05;
    public final Bitmap A06;
    public final Paint A07;
    public final Paint A08;
    public final RectF A09;
    public final RectF A0A;
    public final AnonymousClass0KS A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final Paint[] A0I;
    public final Paint[] A0J;
    public final Path[] A0K;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0094, code lost:
        if (r1 != false) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C02190Ae(android.content.Context r11, X.AnonymousClass0KS r12, X.C14990q7 r13, int r14, int r15) {
        /*
            r10 = this;
            r10.<init>()
            float r0 = r12.shadowSizeDp
            float r6 = X.AnonymousClass0MV.A00(r11, r0)
            float r0 = r12.cornerRadiusDp
            float r5 = X.AnonymousClass0MV.A00(r11, r0)
            boolean r0 = r12.hasFoaStroke
            if (r0 == 0) goto L_0x001a
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r0 = 1
            if (r2 < r1) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x002f
            float r6 = r6 + r5
            int r2 = (int) r6
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x002d }
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r3, r2, r0)     // Catch:{ all -> 0x002d }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r2, r0)     // Catch:{ all -> 0x002d }
            r4 = r1
            goto L_0x0030
        L_0x002d:
            X.0KS r12 = X.AnonymousClass0KS.PRIMARY_FALLBACK
        L_0x002f:
            r0 = r4
        L_0x0030:
            r10.A06 = r4
            r10.A05 = r0
            r10.A0B = r12
            float r0 = r12.cornerRadiusDp
            float r0 = X.AnonymousClass0MV.A00(r11, r0)
            r1 = 0
            float r0 = java.lang.Math.max(r1, r0)
            r10.A01 = r0
            float r0 = r12.shadowSizeDp
            float r0 = X.AnonymousClass0MV.A00(r11, r0)
            float r0 = java.lang.Math.max(r1, r0)
            r10.A02 = r0
            int r0 = r12.verticalOffsetDp
            float r0 = (float) r0
            float r0 = X.AnonymousClass0MV.A00(r11, r0)
            float r0 = java.lang.Math.max(r1, r0)
            r10.A03 = r0
            boolean r7 = X.C06290Vd.A02(r11, r13)
            r10.A0H = r7
            if (r7 == 0) goto L_0x011a
            int r8 = r12.shadowColorDark
        L_0x0066:
            r10.A04 = r8
            r0 = r15 & 1
            boolean r9 = X.AnonymousClass000.A1R(r0, r3)
            r10.A0G = r9
            r1 = 2
            r0 = r15 & 2
            boolean r4 = X.AnonymousClass000.A1R(r0, r1)
            r10.A0E = r4
            r5 = 4
            r0 = r15 & 4
            boolean r2 = X.AnonymousClass000.A1R(r0, r5)
            r10.A0F = r2
            r1 = 8
            r0 = r15 & 8
            boolean r1 = X.AnonymousClass000.A1R(r0, r1)
            r10.A0D = r1
            r6 = 0
            if (r9 == 0) goto L_0x0096
            if (r4 == 0) goto L_0x0096
            if (r2 == 0) goto L_0x0096
            r0 = 1
            if (r1 != 0) goto L_0x0097
        L_0x0096:
            r0 = 0
        L_0x0097:
            r10.A0C = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r10.A08 = r0
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            r0.setStyle(r4)
            r0.setColor(r14)
            r0.setAntiAlias(r3)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r10.A07 = r2
            r2.setStyle(r4)
            r2.setColor(r8)
            r0 = 1050253722(0x3e99999a, float:0.3)
            if (r7 == 0) goto L_0x0117
            float r1 = r12.colorAlphaMultiplierDark
        L_0x00bf:
            float r1 = r1 * r0
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            r2.setAlpha(r0)
            r2.setAntiAlias(r3)
            boolean r0 = r12.hasFoaStroke
            if (r0 != 0) goto L_0x00d2
            r5 = 1
        L_0x00d2:
            android.graphics.Path[] r0 = new android.graphics.Path[r5]
            r10.A0K = r0
            android.graphics.RectF r0 = X.AnonymousClass000.A0K()
            r10.A09 = r0
            android.graphics.RectF r0 = X.AnonymousClass000.A0K()
            r10.A0A = r0
            android.graphics.Paint[] r0 = new android.graphics.Paint[r5]
            r10.A0I = r0
            android.graphics.Paint[] r0 = new android.graphics.Paint[r5]
            r10.A0J = r0
        L_0x00ea:
            android.graphics.Path[] r1 = r10.A0K
            android.graphics.Path r0 = X.AnonymousClass000.A0I()
            r1[r6] = r0
            android.graphics.Paint[] r1 = r10.A0I
            r2 = 4
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r2)
            r0.setStyle(r4)
            r1[r6] = r0
            android.graphics.Paint[] r0 = r10.A0I
            r0 = r0[r6]
            r0.setAntiAlias(r3)
            android.graphics.Paint[] r1 = r10.A0J
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r2)
            r0.setStyle(r4)
            r1[r6] = r0
            int r6 = r6 + 1
            if (r6 < r5) goto L_0x00ea
            return
        L_0x0117:
            float r1 = r12.colorAlphaMultiplierLight
            goto L_0x00bf
        L_0x011a:
            int r8 = r12.shadowColorLight
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02190Ae.<init>(android.content.Context, X.0KS, X.0q7, int, int):void");
    }

    public static void A00(int[] iArr) {
        int A002 = AnonymousClass0MU.A00(-14931149, 0.2f);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int alpha = Color.alpha(i3);
            int alpha2 = Color.alpha(A002);
            int i4 = (255 - alpha2) * alpha;
            int i5 = i4 + alpha2;
            iArr[i2] = Color.argb(Math.min(MotionEventCompat.ACTION_MASK, i5), ((Color.red(i3) * i4) + (Color.red(A002) * alpha2)) / i5, ((Color.green(i3) * i4) + (Color.green(A002) * alpha2)) / i5, ((i4 * Color.blue(i3)) + (Color.blue(A002) * alpha2)) / i5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0123, code lost:
        if (r0.A0E != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0128, code lost:
        if (r0.A0F != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0228, code lost:
        if (r0.A0E != false) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x022d, code lost:
        if (r0.A0F != false) goto L_0x017e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r20) {
        /*
            r19 = this;
            r0 = r19
            X.0KS r1 = r0.A0B
            boolean r1 = r1.hasFoaStroke
            r13 = r20
            if (r1 == 0) goto L_0x012c
            r3 = 2
            boolean[] r7 = new boolean[r3]
            boolean r6 = r0.A0G
            r10 = 0
            r7[r10] = r6
            boolean r2 = r0.A0D
            r12 = 1
            r7[r12] = r2
            r5 = 0
            r1 = 0
        L_0x0019:
            boolean r4 = r7[r5]
            if (r4 == 0) goto L_0x001f
            int r1 = r1 + 1
        L_0x001f:
            int r5 = r5 + 1
            if (r5 < r3) goto L_0x0019
            r11 = 1073741824(0x40000000, float:2.0)
            if (r6 == 0) goto L_0x0126
            int r7 = r13.save()
            android.graphics.RectF r9 = r0.A09
            float r5 = r9.left
            float r8 = r0.A01
            float r5 = r5 + r8
            float r4 = r9.top
            float r4 = r4 + r8
            r13.translate(r5, r4)
            android.graphics.Path[] r4 = r0.A0K
            r5 = r4[r10]
            android.graphics.Paint[] r4 = r0.A0I
            r4 = r4[r10]
            r13.drawPath(r5, r4)
            r14 = 0
            float r5 = -r8
            float r4 = r0.A02
            float r15 = r5 - r4
            float r16 = r9.width()
            float r8 = r8 * r11
            float r16 = r16 - r8
            android.graphics.Paint[] r4 = r0.A0J
            r18 = r4[r10]
            r17 = r5
            r13.drawRect(r14, r15, r16, r17, r18)
            r13.restoreToCount(r7)
        L_0x005c:
            int r5 = r13.save()
            android.graphics.RectF r8 = r0.A09
            float r10 = r8.right
            float r7 = r0.A01
            float r10 = r10 - r7
            float r9 = r8.top
            boolean r4 = X.AnonymousClass000.A1O(r6)
            float r4 = (float) r4
            float r4 = r4 * r7
            float r9 = r9 + r4
            r13.translate(r10, r9)
            if (r6 == 0) goto L_0x0080
            android.graphics.Path[] r4 = r0.A0K
            r6 = r4[r12]
            android.graphics.Paint[] r4 = r0.A0I
            r4 = r4[r12]
            r13.drawPath(r6, r4)
        L_0x0080:
            boolean r4 = r0.A0F
            if (r4 == 0) goto L_0x0099
            r14 = 0
            float r4 = r0.A02
            float r16 = r7 + r4
            float r17 = r8.height()
            float r4 = (float) r1
            float r4 = r4 * r7
            float r17 = r17 - r4
            android.graphics.Paint[] r4 = r0.A0J
            r18 = r4[r12]
            r15 = 0
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x0099:
            r13.restoreToCount(r5)
        L_0x009c:
            if (r2 == 0) goto L_0x0121
            int r6 = r13.save()
            android.graphics.RectF r8 = r0.A09
            float r7 = r8.right
            float r5 = r0.A01
            float r7 = r7 - r5
            float r4 = r8.bottom
            float r4 = r4 - r5
            r13.translate(r7, r4)
            android.graphics.Path[] r4 = r0.A0K
            r7 = r4[r3]
            android.graphics.Paint[] r4 = r0.A0I
            r4 = r4[r3]
            r13.drawPath(r7, r4)
            float r4 = r8.width()
            float r14 = -r4
            float r11 = r11 * r5
            float r14 = r14 + r11
            r15 = 0
            float r4 = r0.A02
            float r5 = r5 + r4
            android.graphics.Paint[] r4 = r0.A0J
            r18 = r4[r3]
            r16 = 0
            r17 = r5
            r13.drawRect(r14, r15, r16, r17, r18)
            r13.restoreToCount(r6)
        L_0x00d3:
            int r3 = r13.save()
            android.graphics.RectF r7 = r0.A09
            float r8 = r7.left
            float r5 = r0.A01
            float r8 = r8 + r5
            float r6 = r7.bottom
            boolean r4 = X.AnonymousClass000.A1O(r2)
            float r4 = (float) r4
            float r4 = r4 * r5
            float r6 = r6 - r4
            r13.translate(r8, r6)
            r6 = 3
            if (r2 == 0) goto L_0x00f8
            android.graphics.Path[] r2 = r0.A0K
            r4 = r2[r6]
            android.graphics.Paint[] r2 = r0.A0I
            r2 = r2[r6]
            r13.drawPath(r4, r2)
        L_0x00f8:
            boolean r2 = r0.A0E
            if (r2 == 0) goto L_0x0114
            float r14 = -r5
            float r2 = r0.A02
            float r14 = r14 - r2
            r15 = 0
            float r2 = r7.height()
            float r2 = -r2
            float r1 = (float) r1
            float r1 = r1 * r5
            float r2 = r2 + r1
            android.graphics.Paint[] r1 = r0.A0J
            r18 = r1[r6]
            r16 = 0
            r17 = r2
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x0114:
            r13.restoreToCount(r3)
        L_0x0117:
            android.graphics.Path r1 = r0.A00
            if (r1 == 0) goto L_0x0231
            android.graphics.Paint r0 = r0.A08
            r13.drawPath(r1, r0)
            return
        L_0x0121:
            boolean r3 = r0.A0E
            if (r3 == 0) goto L_0x0117
            goto L_0x00d3
        L_0x0126:
            boolean r4 = r0.A0F
            if (r4 == 0) goto L_0x009c
            goto L_0x005c
        L_0x012c:
            android.graphics.Path[] r1 = r0.A0K
            r2 = 0
            r4 = r1[r2]
            android.graphics.Paint[] r1 = r0.A0I
            r3 = r1[r2]
            android.graphics.Paint[] r1 = r0.A0J
            r18 = r1[r2]
            r9 = 2
            boolean[] r8 = new boolean[r9]
            boolean r6 = r0.A0G
            r8[r2] = r6
            boolean r2 = r0.A0D
            r1 = 1
            r8[r1] = r2
            r7 = 0
            r1 = 0
        L_0x0147:
            boolean r5 = r8[r7]
            if (r5 == 0) goto L_0x014d
            int r1 = r1 + 1
        L_0x014d:
            int r7 = r7 + 1
            if (r7 < r9) goto L_0x0147
            r12 = 1073741824(0x40000000, float:2.0)
            if (r6 == 0) goto L_0x022b
            int r9 = r13.save()
            android.graphics.RectF r10 = r0.A09
            float r7 = r10.left
            float r8 = r0.A01
            float r7 = r7 + r8
            float r5 = r10.top
            float r5 = r5 + r8
            r13.translate(r7, r5)
            r13.drawPath(r4, r3)
            r14 = 0
            float r7 = -r8
            float r5 = r0.A02
            float r15 = r7 - r5
            float r16 = r10.width()
            float r8 = r8 * r12
            float r16 = r16 - r8
            r17 = r7
            r13.drawRect(r14, r15, r16, r17, r18)
            r13.restoreToCount(r9)
        L_0x017e:
            int r8 = r13.save()
            android.graphics.RectF r9 = r0.A09
            float r11 = r9.right
            float r7 = r0.A01
            float r11 = r11 - r7
            float r10 = r9.top
            boolean r5 = X.AnonymousClass000.A1O(r6)
            float r5 = (float) r5
            float r5 = r5 * r7
            float r10 = r10 + r5
            r13.translate(r11, r10)
            r5 = 1119092736(0x42b40000, float:90.0)
            r13.rotate(r5)
            if (r6 == 0) goto L_0x019f
            r13.drawPath(r4, r3)
        L_0x019f:
            boolean r5 = r0.A0F
            if (r5 == 0) goto L_0x01b6
            r14 = 0
            float r6 = -r7
            float r5 = r0.A02
            float r15 = r6 - r5
            float r16 = r9.height()
            float r5 = (float) r1
            float r5 = r5 * r7
            float r16 = r16 - r5
            r17 = r6
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x01b6:
            r13.restoreToCount(r8)
        L_0x01b9:
            if (r2 == 0) goto L_0x0226
            int r8 = r13.save()
            android.graphics.RectF r9 = r0.A09
            float r6 = r9.right
            float r7 = r0.A01
            float r6 = r6 - r7
            float r5 = r9.bottom
            float r5 = r5 - r7
            r13.translate(r6, r5)
            r5 = 1127481344(0x43340000, float:180.0)
            r13.rotate(r5)
            r13.drawPath(r4, r3)
            r14 = 0
            float r6 = -r7
            float r5 = r0.A02
            float r15 = r6 - r5
            float r16 = r9.width()
            float r12 = r12 * r7
            float r16 = r16 - r12
            r17 = r6
            r13.drawRect(r14, r15, r16, r17, r18)
            r13.restoreToCount(r8)
        L_0x01e9:
            int r6 = r13.save()
            android.graphics.RectF r8 = r0.A09
            float r10 = r8.left
            float r5 = r0.A01
            float r10 = r10 + r5
            float r9 = r8.bottom
            boolean r7 = X.AnonymousClass000.A1O(r2)
            float r7 = (float) r7
            float r7 = r7 * r5
            float r9 = r9 - r7
            r13.translate(r10, r9)
            r7 = 1132920832(0x43870000, float:270.0)
            r13.rotate(r7)
            if (r2 == 0) goto L_0x020a
            r13.drawPath(r4, r3)
        L_0x020a:
            boolean r2 = r0.A0E
            if (r2 == 0) goto L_0x0221
            r14 = 0
            float r3 = -r5
            float r2 = r0.A02
            float r15 = r3 - r2
            float r16 = r8.height()
            float r1 = (float) r1
            float r1 = r1 * r5
            float r16 = r16 - r1
            r17 = r3
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x0221:
            r13.restoreToCount(r6)
            goto L_0x0117
        L_0x0226:
            boolean r5 = r0.A0E
            if (r5 == 0) goto L_0x0117
            goto L_0x01e9
        L_0x022b:
            boolean r5 = r0.A0F
            if (r5 == 0) goto L_0x01b9
            goto L_0x017e
        L_0x0231:
            float r3 = r0.A01
            r2 = 0
            int r1 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0254
            float r1 = r0.A03
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0251
            boolean r1 = r0.A0C
            if (r1 == 0) goto L_0x0251
            android.graphics.RectF r2 = r0.A09
            android.graphics.Paint r1 = r0.A07
            r13.drawRoundRect(r2, r3, r3, r1)
            android.graphics.RectF r1 = r0.A0A
        L_0x024b:
            android.graphics.Paint r0 = r0.A08
            r13.drawRoundRect(r1, r3, r3, r0)
            return
        L_0x0251:
            android.graphics.RectF r1 = r0.A09
            goto L_0x024b
        L_0x0254:
            android.graphics.RectF r1 = r0.A09
            android.graphics.Paint r0 = r0.A08
            r13.drawRect(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02190Ae.draw(android.graphics.Canvas):void");
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        float f2;
        float f3 = 0.0f;
        float f4 = this.A0E ? this.A02 : 0.0f;
        float f5 = this.A0F ? this.A02 : 0.0f;
        boolean z2 = this.A0G;
        if (z2) {
            f2 = this.A02 + (this.A0C ? 0.0f : this.A01);
        } else {
            f2 = 0.0f;
        }
        if (this.A0D) {
            float f6 = this.A02;
            if (!this.A0C) {
                f3 = this.A01;
            }
            f3 += f6;
            if (z2) {
                float f7 = this.A03;
                f2 -= f7;
                f3 += f7;
            }
        }
        rect.set((int) f4, (int) f2, (int) f5, (int) f3);
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v43, types: [android.graphics.BitmapShader] */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01fc, code lost:
        if (r9 == false) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01fe, code lost:
        r11 = r0.A05;
        r22 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0200, code lost:
        if (r11 == null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0202, code lost:
        r11.eraseColor(0);
        r10 = new android.graphics.Paint();
        r10.setStyle(android.graphics.Paint.Style.FILL);
        r10.setDither(true);
        r10.setShader(r22);
        r25 = 1.0f;
        r22 = new android.graphics.Canvas(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01bb, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01bb, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBoundsChange(android.graphics.Rect r33) {
        /*
            r32 = this;
            r0 = r32
            r2 = r33
            super.onBoundsChange(r2)
            android.graphics.RectF r5 = r0.A09
            int r1 = r2.left
            float r9 = (float) r1
            float r3 = r0.A02
            float r9 = r9 + r3
            boolean r8 = r0.A0G
            int r1 = r2.top
            float r6 = (float) r1
            if (r8 == 0) goto L_0x0017
            float r6 = r6 + r3
        L_0x0017:
            int r1 = r2.right
            float r4 = (float) r1
            float r4 = r4 - r3
            boolean r7 = r0.A0D
            int r1 = r2.bottom
            float r1 = (float) r1
            if (r7 == 0) goto L_0x0023
            float r1 = r1 - r3
        L_0x0023:
            r5.set(r9, r6, r4, r1)
            android.graphics.RectF r10 = r0.A0A
            int r1 = r2.left
            float r9 = (float) r1
            float r9 = r9 + r3
            int r1 = r2.top
            float r6 = (float) r1
            if (r8 == 0) goto L_0x0035
            float r6 = r6 + r3
            float r1 = r0.A03
            float r6 = r6 - r1
        L_0x0035:
            int r1 = r2.right
            float r4 = (float) r1
            float r4 = r4 - r3
            int r1 = r2.bottom
            float r2 = (float) r1
            if (r7 == 0) goto L_0x0042
            float r2 = r2 - r3
            float r1 = r0.A03
            float r2 = r2 - r1
        L_0x0042:
            r10.set(r9, r6, r4, r2)
            boolean r1 = r0.A0E
            if (r1 == 0) goto L_0x0265
            if (r8 == 0) goto L_0x0265
            boolean r1 = r0.A0F
            if (r1 == 0) goto L_0x0265
            if (r7 == 0) goto L_0x0265
            r1 = 0
            r0.A00 = r1
        L_0x0054:
            float r6 = r0.A01
            float r1 = -r6
            r31 = r1
            android.graphics.RectF r21 = new android.graphics.RectF
            r4 = r1
            r1 = r21
            r1.<init>(r4, r4, r6, r6)
            android.graphics.RectF r20 = new android.graphics.RectF
            r2 = r20
            r2.<init>(r1)
            float r12 = -r3
            r2.inset(r12, r12)
            X.0KS r5 = r0.A0B
            boolean r4 = r0.A0H
            if (r4 == 0) goto L_0x0261
            float r10 = r5.colorAlphaMultiplierDark
        L_0x0074:
            int[] r2 = A0M
            int r1 = r2.length
            int[] r27 = java.util.Arrays.copyOf(r2, r1)
            r8 = 3
            int[] r7 = new int[r8]
            r7 = {-15173646, -15173646, -15173646} // fill-array
            if (r4 == 0) goto L_0x008d
            boolean r1 = r5.hasFoaStroke
            if (r1 == 0) goto L_0x008d
            A00(r7)
            A00(r27)
        L_0x008d:
            int[] r1 = new int[r8]
            r30 = r1
            r11 = 0
            r2 = r7[r11]
            r4 = 1050253722(0x3e99999a, float:0.3)
            float r4 = r4 * r10
            X.AnonymousClass0MU.A01(r1, r4, r2, r11)
            r9 = 1
            r13 = r7[r9]
            r2 = 1036831949(0x3dcccccd, float:0.1)
            float r2 = r2 * r10
            X.AnonymousClass0MU.A01(r1, r2, r13, r9)
            r13 = 2
            r7 = r7[r13]
            r14 = 0
            X.AnonymousClass0MU.A01(r1, r14, r7, r13)
            boolean r7 = r5.hasFoaStroke
            if (r7 == 0) goto L_0x0240
            int[] r7 = new int[r8]
            int r1 = r0.A04
            X.AnonymousClass0MU.A01(r7, r4, r1, r11)
            X.AnonymousClass0MU.A01(r7, r2, r1, r9)
            X.AnonymousClass0MU.A01(r7, r14, r1, r13)
            float[] r1 = new float[r8]
            r19 = r1
            r1 = {0, 1056964608, 1065353216} // fill-array
            android.graphics.Rect r1 = r0.getBounds()
            int r1 = r1.width()
            float r2 = (float) r1
            r4 = 1073741824(0x40000000, float:2.0)
            float r1 = r3 + r6
            float r1 = r1 * r4
            float r2 = r2 - r1
            float[] r28 = A0L
            android.graphics.Shader$TileMode r29 = android.graphics.Shader.TileMode.REPEAT
            r1 = 0
            android.graphics.LinearGradient r18 = new android.graphics.LinearGradient
            r23 = 0
            r24 = 0
            r26 = 0
            r22 = r18
            r25 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
        L_0x00e7:
            float r17 = r6 + r3
            boolean r2 = r5.hasFoaStroke
            r26 = r7
            if (r2 == 0) goto L_0x00f1
            r26 = r30
        L_0x00f1:
            android.graphics.Shader$TileMode r29 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.RadialGradient r16 = new android.graphics.RadialGradient
            r23 = 0
            r24 = 0
            r22 = r16
            r25 = r17
            r27 = r19
            r28 = r29
            r22.<init>(r23, r24, r25, r26, r27, r28)
            boolean r2 = r5.hasFoaStroke
            if (r2 == 0) goto L_0x023d
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r4 >= r2) goto L_0x023d
        L_0x010e:
            r8 = 0
            r4 = 0
        L_0x0110:
            android.graphics.Path[] r10 = r0.A0K
            int r2 = r10.length
            if (r8 >= r2) goto L_0x02a7
            r2 = r10[r8]
            r2.reset()
            android.graphics.Path$FillType r10 = android.graphics.Path.FillType.EVEN_ODD
            r2.setFillType(r10)
            android.graphics.Paint[] r10 = r0.A0I
            r11 = r10[r8]
            r10 = r16
            r11.setShader(r10)
            r11 = 180(0xb4, float:2.52E-43)
            r10 = 90
            if (r4 == r10) goto L_0x0222
            if (r4 == r11) goto L_0x01e1
            r10 = 270(0x10e, float:3.78E-43)
            if (r4 == r10) goto L_0x01c9
            r10 = r31
            r2.moveTo(r10, r1)
            r2.rLineTo(r12, r1)
            float r26 = r12 - r6
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            r24 = 0
            r25 = 0
            r22 = r1
            r27 = r7
            r28 = r19
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            boolean r10 = r5.hasFoaStroke
            if (r10 == 0) goto L_0x018c
            if (r9 == 0) goto L_0x018c
            android.graphics.Bitmap r11 = r0.A06
            if (r11 == 0) goto L_0x018c
            r10 = 0
            r11.eraseColor(r10)
            android.graphics.Paint r10 = new android.graphics.Paint
            r10.<init>()
            android.graphics.Paint$Style r13 = android.graphics.Paint.Style.FILL
            r10.setStyle(r13)
            r13 = 1
            r10.setDither(r13)
            r10.setShader(r1)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r11)
            r14 = 0
            r13 = r17
            r1.translate(r14, r13)
            float r13 = -r13
            r25 = 1065353216(0x3f800000, float:1.0)
            r26 = 0
            r22 = r1
            r24 = r13
        L_0x0180:
            r27 = r10
            r22.drawRect(r23, r24, r25, r26, r27)
            android.graphics.Shader$TileMode r10 = android.graphics.Shader.TileMode.REPEAT
            android.graphics.BitmapShader r1 = new android.graphics.BitmapShader
            r1.<init>(r11, r10, r10)
        L_0x018c:
            r14 = 1127481344(0x43340000, float:180.0)
            float r13 = (float) r4
            float r14 = r14 + r13
            r11 = 0
            r15 = 1119092736(0x42b40000, float:90.0)
            r10 = r20
            r2.arcTo(r10, r14, r15, r11)
            r10 = 1132920832(0x43870000, float:270.0)
            float r13 = r13 + r10
            r14 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r10 = r21
            r2.arcTo(r10, r13, r14, r11)
            r2.close()
            boolean r2 = r5.hasFoaStroke
            if (r2 == 0) goto L_0x01bb
            if (r18 == 0) goto L_0x01bb
            r2 = 180(0xb4, float:2.52E-43)
            if (r4 == r2) goto L_0x01b1
            if (r4 != 0) goto L_0x01bb
        L_0x01b1:
            android.graphics.PorterDuff$Mode r11 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.ComposeShader r10 = new android.graphics.ComposeShader
            r2 = r18
            r10.<init>(r1, r2, r11)
            r1 = r10
        L_0x01bb:
            android.graphics.Paint[] r2 = r0.A0J
            r2 = r2[r8]
            r2.setShader(r1)
            int r4 = r4 + 90
            int r8 = r8 + 1
            r1 = 0
            goto L_0x0110
        L_0x01c9:
            r2.moveTo(r1, r6)
            r2.rLineTo(r1, r3)
            float r25 = r12 - r6
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            r24 = 0
            r26 = 0
            r22 = r1
            r27 = r30
            r28 = r19
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            goto L_0x018c
        L_0x01e1:
            r2.moveTo(r6, r1)
            r2.rLineTo(r3, r1)
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            r24 = 0
            r25 = 0
            r22 = r1
            r26 = r17
            r27 = r7
            r28 = r19
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            boolean r10 = r5.hasFoaStroke
            if (r10 == 0) goto L_0x018c
            if (r9 == 0) goto L_0x018c
            android.graphics.Bitmap r11 = r0.A05
            if (r11 == 0) goto L_0x018c
            r10 = 0
            r11.eraseColor(r10)
            android.graphics.Paint r10 = new android.graphics.Paint
            r10.<init>()
            android.graphics.Paint$Style r13 = android.graphics.Paint.Style.FILL
            r10.setStyle(r13)
            r13 = 1
            r10.setDither(r13)
            r10.setShader(r1)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r11)
            r25 = 1065353216(0x3f800000, float:1.0)
            r22 = r1
            goto L_0x0180
        L_0x0222:
            r10 = r31
            r2.moveTo(r1, r10)
            r2.rLineTo(r1, r12)
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            r24 = 0
            r26 = 0
            r22 = r1
            r25 = r17
            r27 = r30
            r28 = r19
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            goto L_0x018c
        L_0x023d:
            r9 = 0
            goto L_0x010e
        L_0x0240:
            r1 = 4
            int[] r7 = new int[r1]
            int r15 = r0.A04
            r1 = 1056964608(0x3f000000, float:0.5)
            float r10 = r10 * r1
            X.AnonymousClass0MU.A01(r7, r10, r15, r11)
            X.AnonymousClass0MU.A01(r7, r4, r15, r9)
            X.AnonymousClass0MU.A01(r7, r2, r15, r13)
            X.AnonymousClass0MU.A01(r7, r14, r15, r8)
            r1 = 4
            float[] r1 = new float[r1]
            r19 = r1
            r1 = {0, 1048576000, 1061158912, 1065353216} // fill-array
            r1 = 0
            r18 = 0
            goto L_0x00e7
        L_0x0261:
            float r10 = r5.colorAlphaMultiplierLight
            goto L_0x0074
        L_0x0265:
            android.graphics.Path r1 = r0.A00
            if (r1 != 0) goto L_0x026f
            android.graphics.Path r1 = X.AnonymousClass000.A0I()
            r0.A00 = r1
        L_0x026f:
            r1.reset()
            r6 = 0
            if (r8 == 0) goto L_0x02a5
            float r2 = r0.A01
        L_0x0277:
            if (r7 == 0) goto L_0x027b
            float r6 = r0.A01
        L_0x027b:
            r1 = 8
            float[] r4 = new float[r1]
            r1 = 0
            r4[r1] = r2
            r1 = 1
            r4[r1] = r2
            r1 = 2
            r4[r1] = r2
            r1 = 3
            r4[r1] = r2
            r1 = 4
            r4[r1] = r6
            r1 = 5
            r4[r1] = r6
            r1 = 6
            r4[r1] = r6
            r1 = 7
            r4[r1] = r6
            android.graphics.Path r2 = r0.A00
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW
            r2.addRoundRect(r5, r4, r1)
            android.graphics.Path r1 = r0.A00
            r1.close()
            goto L_0x0054
        L_0x02a5:
            r2 = 0
            goto L_0x0277
        L_0x02a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02190Ae.onBoundsChange(android.graphics.Rect):void");
    }

    public void setAlpha(int i2) {
        for (Paint alpha : this.A0I) {
            alpha.setAlpha(i2);
        }
        for (Paint alpha2 : this.A0J) {
            alpha2.setAlpha(i2);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        for (Paint colorFilter2 : this.A0I) {
            colorFilter2.setColorFilter(colorFilter);
        }
        for (Paint colorFilter3 : this.A0J) {
            colorFilter3.setColorFilter(colorFilter);
        }
    }
}
