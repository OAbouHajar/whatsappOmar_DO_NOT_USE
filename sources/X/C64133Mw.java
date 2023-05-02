package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3Mw  reason: invalid class name and case insensitive filesystem */
public final class C64133Mw extends View implements C108345Np {
    public float A00 = 0.08f;
    public float A01 = 0.0533f;
    public C90464eB A02 = C90464eB.A06;
    public List A03 = Collections.emptyList();
    public final List A04 = AnonymousClass000.A0u();

    public C64133Mw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void AhL(C90464eB r4, List list, float f2, float f3, int i2) {
        this.A03 = list;
        this.A02 = r4;
        this.A01 = f2;
        this.A00 = f3;
        while (true) {
            List list2 = this.A04;
            if (list2.size() < list.size()) {
                list2.add(new AnonymousClass4PJ(getContext()));
            } else {
                invalidate();
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009d, code lost:
        if (r3 != 2) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017c, code lost:
        if (r16 == false) goto L_0x0489;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01f7  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchDraw(android.graphics.Canvas r41) {
        /*
            r40 = this;
            r38 = r40
            r0 = r38
            java.util.List r0 = r0.A03
            r37 = r0
            boolean r0 = r37.isEmpty()
            if (r0 != 0) goto L_0x04b7
            int r23 = r38.getHeight()
            int r9 = r38.getPaddingLeft()
            int r8 = r38.getPaddingTop()
            int r7 = r38.getWidth()
            int r0 = r38.getPaddingRight()
            int r7 = r7 - r0
            int r0 = r38.getPaddingBottom()
            int r25 = r23 - r0
            r0 = r25
            if (r0 <= r8) goto L_0x04b7
            if (r7 <= r9) goto L_0x04b7
            int r1 = r25 - r8
            r0 = r38
            float r6 = r0.A01
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x04b7
            float r0 = (float) r1
            r24 = r0
            float r6 = r6 * r0
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x04b7
            int r26 = r37.size()
            r5 = 0
        L_0x004a:
            r0 = r26
            if (r5 >= r0) goto L_0x04b7
            r0 = r37
            java.lang.Object r2 = r0.get(r5)
            X.4aV r2 = (X.C88444aV) r2
            int r0 = r2.A0A
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x0087
            X.4b6 r3 = new X.4b6
            r3.<init>(r2)
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3.A02 = r0
            r3.A08 = r1
            r0 = 0
            r3.A0D = r0
            int r1 = r2.A07
            r4 = 1065353216(0x3f800000, float:1.0)
            float r0 = r2.A01
            if (r1 != 0) goto L_0x04b0
            float r4 = r4 - r0
            r1 = 0
            r3.A01 = r4
        L_0x0077:
            r3.A07 = r1
            int r1 = r2.A06
            r0 = 2
            if (r1 == 0) goto L_0x0081
            if (r1 != r0) goto L_0x0083
            r0 = 0
        L_0x0081:
            r3.A06 = r0
        L_0x0083:
            X.4aV r2 = r3.A00()
        L_0x0087:
            int r3 = r2.A09
            float r10 = r2.A05
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x009f
            r0 = r24
            if (r3 == 0) goto L_0x04ad
            r1 = 1
            r0 = r23
            float r0 = (float) r0
            if (r3 == r1) goto L_0x04ad
            r0 = 2
            if (r3 == r0) goto L_0x00a2
        L_0x009f:
            r10 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x00a2:
            r0 = r38
            java.util.List r0 = r0.A04
            java.lang.Object r4 = r0.get(r5)
            X.4PJ r4 = (X.AnonymousClass4PJ) r4
            r0 = r38
            X.4eB r13 = r0.A02
            float r14 = r0.A00
            android.graphics.Bitmap r12 = r2.A0C
            if (r12 != 0) goto L_0x04a7
            r16 = 1
            java.lang.CharSequence r0 = r2.A0E
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01f3
            boolean r0 = r2.A0F
            if (r0 == 0) goto L_0x04a3
            int r11 = r2.A0B
        L_0x00c6:
            java.lang.CharSequence r0 = r4.A0R
            java.lang.CharSequence r15 = r2.A0E
            r39 = r41
            if (r0 == r15) goto L_0x00d6
            if (r0 == 0) goto L_0x0229
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L_0x0229
        L_0x00d6:
            android.text.Layout$Alignment r1 = r4.A0O
            android.text.Layout$Alignment r0 = r2.A0D
            boolean r0 = X.AnonymousClass3C1.A0F(r1, r0)
            if (r0 == 0) goto L_0x0229
            android.graphics.Bitmap r0 = r4.A0M
            if (r0 != r12) goto L_0x0229
            float r1 = r4.A02
            float r0 = r2.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0229
            int r1 = r4.A09
            int r0 = r2.A07
            if (r1 != r0) goto L_0x0229
            int r0 = r4.A08
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r2.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.AnonymousClass3C1.A0F(r1, r0)
            if (r0 == 0) goto L_0x0229
            float r1 = r4.A03
            float r0 = r2.A02
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0229
            int r0 = r4.A0A
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r2.A08
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.AnonymousClass3C1.A0F(r1, r0)
            if (r0 == 0) goto L_0x0229
            float r1 = r4.A04
            float r0 = r2.A04
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0229
            float r1 = r4.A01
            float r0 = r2.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0229
            int r1 = r4.A0D
            int r0 = r13.A03
            if (r1 != r0) goto L_0x0229
            int r1 = r4.A07
            int r0 = r13.A00
            if (r1 != r0) goto L_0x0229
            int r0 = r4.A0L
            if (r0 != r11) goto L_0x0229
            int r1 = r4.A0C
            int r0 = r13.A02
            if (r1 != r0) goto L_0x0229
            int r1 = r4.A0B
            int r0 = r13.A01
            if (r1 != r0) goto L_0x0229
            android.text.TextPaint r3 = r4.A0Z
            android.graphics.Typeface r1 = r3.getTypeface()
            android.graphics.Typeface r0 = r13.A05
            boolean r0 = X.AnonymousClass3C1.A0F(r1, r0)
            if (r0 == 0) goto L_0x0229
            float r0 = r4.A06
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0229
            float r0 = r4.A05
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0229
            float r0 = r4.A00
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0229
            int r0 = r4.A0F
            if (r0 != r9) goto L_0x0229
            int r0 = r4.A0H
            if (r0 != r8) goto L_0x0229
            int r0 = r4.A0G
            if (r0 != r7) goto L_0x0229
            int r1 = r4.A0E
            r0 = r25
            if (r1 != r0) goto L_0x0229
            if (r16 == 0) goto L_0x0489
        L_0x017e:
            android.text.StaticLayout r2 = r4.A0Q
            android.text.StaticLayout r10 = r4.A0P
            if (r2 == 0) goto L_0x01f3
            if (r10 == 0) goto L_0x01f3
            int r1 = r39.save()
            int r0 = r4.A0I
            float r12 = (float) r0
            int r0 = r4.A0K
            float r11 = (float) r0
            r0 = r39
            r0.translate(r12, r11)
            int r0 = r4.A0L
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 <= 0) goto L_0x01c1
            android.graphics.Paint r12 = r4.A0Y
            int r0 = r4.A0L
            r12.setColor(r0)
            int r0 = r4.A0J
            int r0 = -r0
            float r14 = (float) r0
            r15 = 0
            int r11 = r2.getWidth()
            int r0 = r4.A0J
            int r11 = r11 + r0
            float r11 = (float) r11
            int r0 = r2.getHeight()
            float r0 = (float) r0
            r13 = r39
            r16 = r11
            r17 = r0
            r18 = r12
            r13.drawRect(r14, r15, r16, r17, r18)
        L_0x01c1:
            int r11 = r4.A0C
            r12 = 0
            r0 = 1
            if (r11 != r0) goto L_0x01f7
            android.graphics.Paint$Join r0 = android.graphics.Paint.Join.ROUND
            r3.setStrokeJoin(r0)
            float r0 = r4.A0S
            r3.setStrokeWidth(r0)
            int r0 = r4.A0B
            r3.setColor(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL_AND_STROKE
            r3.setStyle(r0)
            r0 = r39
            r10.draw(r0)
        L_0x01e0:
            int r0 = r4.A0D
            X.C13690nt.A0n(r0, r3)
            r0 = r39
            r2.draw(r0)
            r0 = 0
            r3.setShadowLayer(r0, r0, r0, r12)
            r0 = r39
            r0.restoreToCount(r1)
        L_0x01f3:
            int r5 = r5 + 1
            goto L_0x004a
        L_0x01f7:
            r0 = 2
            if (r11 != r0) goto L_0x0204
            float r11 = r4.A0U
            float r10 = r4.A0T
            int r0 = r4.A0B
            r3.setShadowLayer(r11, r10, r10, r0)
            goto L_0x01e0
        L_0x0204:
            r0 = 3
            if (r11 == r0) goto L_0x0225
            r0 = 4
            if (r11 != r0) goto L_0x01e0
            r14 = -1
            int r15 = r4.A0B
        L_0x020d:
            float r13 = r4.A0U
            r0 = 1073741824(0x40000000, float:2.0)
            float r11 = r13 / r0
            int r0 = r4.A0D
            X.C13690nt.A0n(r0, r3)
            float r0 = -r11
            r3.setShadowLayer(r13, r0, r0, r15)
            r0 = r39
            r10.draw(r0)
            r3.setShadowLayer(r13, r11, r11, r14)
            goto L_0x01e0
        L_0x0225:
            r15 = -1
            int r14 = r4.A0B
            goto L_0x020d
        L_0x0229:
            r4.A0R = r15
            android.text.Layout$Alignment r0 = r2.A0D
            r4.A0O = r0
            r4.A0M = r12
            float r0 = r2.A01
            r4.A02 = r0
            int r0 = r2.A07
            r4.A09 = r0
            int r0 = r2.A06
            r4.A08 = r0
            float r0 = r2.A02
            r4.A03 = r0
            int r0 = r2.A08
            r4.A0A = r0
            float r0 = r2.A04
            r4.A04 = r0
            float r0 = r2.A00
            r4.A01 = r0
            int r0 = r13.A03
            r4.A0D = r0
            int r0 = r13.A00
            r4.A07 = r0
            r4.A0L = r11
            int r0 = r13.A02
            r4.A0C = r0
            int r0 = r13.A01
            r4.A0B = r0
            android.text.TextPaint r3 = r4.A0Z
            android.graphics.Typeface r0 = r13.A05
            r4.A06 = r6
            r4.A05 = r10
            r4.A00 = r14
            r4.A0F = r9
            r4.A0H = r8
            r4.A0G = r7
            r0 = r25
            r4.A0E = r0
            if (r16 == 0) goto L_0x0437
            java.lang.CharSequence r1 = r4.A0R
            boolean r0 = r1 instanceof android.text.SpannableStringBuilder
            if (r0 == 0) goto L_0x03ad
            r12 = r1
            android.text.SpannableStringBuilder r12 = (android.text.SpannableStringBuilder) r12
        L_0x027e:
            int r11 = r4.A0G
            int r0 = r4.A0F
            int r11 = r11 - r0
            int r13 = r4.A0E
            int r0 = r4.A0H
            int r13 = r13 - r0
            float r0 = r4.A06
            r3.setTextSize(r0)
            float r1 = r4.A06
            r0 = 1040187392(0x3e000000, float:0.125)
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            r28 = r0
            int r27 = r0 << 1
            int r14 = r11 - r27
            float r1 = r4.A04
            r22 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 == 0) goto L_0x02a8
            float r0 = (float) r14
            float r0 = r0 * r1
            int r14 = (int) r0
        L_0x02a8:
            java.lang.String r21 = "SubtitlePainter"
            if (r14 > 0) goto L_0x02b5
            java.lang.String r1 = "Skipped drawing subtitle cue (insufficient space)"
        L_0x02ae:
            r0 = r21
            android.util.Log.w(r0, r1)
            goto L_0x017e
        L_0x02b5:
            float r1 = r4.A05
            r20 = 0
            r10 = 0
            int r0 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x02cd
            int r0 = (int) r1
            android.text.style.AbsoluteSizeSpan r2 = new android.text.style.AbsoluteSizeSpan
            r2.<init>(r0)
            int r1 = r12.length()
            r0 = 16711680(0xff0000, float:2.3418052E-38)
            r12.setSpan(r2, r10, r1, r0)
        L_0x02cd:
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
            r2.<init>(r12)
            int r1 = r4.A0C
            r0 = 1
            if (r1 != r0) goto L_0x02f3
            int r1 = r2.length()
            java.lang.Class<android.text.style.ForegroundColorSpan> r0 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r1 = r2.getSpans(r10, r1, r0)
            android.text.style.ForegroundColorSpan[] r1 = (android.text.style.ForegroundColorSpan[]) r1
            int r0 = r1.length
            r16 = r0
            r15 = 0
        L_0x02e7:
            r0 = r16
            if (r15 >= r0) goto L_0x02f3
            r0 = r1[r15]
            r2.removeSpan(r0)
            int r15 = r15 + 1
            goto L_0x02e7
        L_0x02f3:
            int r0 = r4.A07
            int r0 = android.graphics.Color.alpha(r0)
            r1 = 2
            if (r0 <= 0) goto L_0x0312
            int r0 = r4.A0C
            if (r0 == 0) goto L_0x0357
            if (r0 == r1) goto L_0x0357
            int r0 = r4.A07
            android.text.style.BackgroundColorSpan r15 = new android.text.style.BackgroundColorSpan
            r15.<init>(r0)
            int r1 = r2.length()
            r0 = 16711680(0xff0000, float:2.3418052E-38)
            r2.setSpan(r15, r10, r1, r0)
        L_0x0312:
            android.text.Layout$Alignment r0 = r4.A0O
            r19 = r0
            if (r0 != 0) goto L_0x031a
            android.text.Layout$Alignment r19 = android.text.Layout.Alignment.ALIGN_CENTER
        L_0x031a:
            float r0 = r4.A0W
            r34 = r0
            float r0 = r4.A0V
            r35 = r0
            android.text.StaticLayout r0 = new android.text.StaticLayout
            r36 = 1
            r29 = r0
            r30 = r12
            r31 = r3
            r32 = r14
            r33 = r19
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            r4.A0Q = r0
            int r18 = r0.getHeight()
            android.text.StaticLayout r0 = r4.A0Q
            int r17 = r0.getLineCount()
            r1 = 0
        L_0x0340:
            r0 = r17
            if (r10 >= r0) goto L_0x0368
            android.text.StaticLayout r0 = r4.A0Q
            float r0 = r0.getLineWidth(r10)
            double r15 = (double) r0
            double r15 = java.lang.Math.ceil(r15)
            int r0 = (int) r15
            int r1 = java.lang.Math.max(r0, r1)
            int r10 = r10 + 1
            goto L_0x0340
        L_0x0357:
            int r0 = r4.A07
            android.text.style.BackgroundColorSpan r15 = new android.text.style.BackgroundColorSpan
            r15.<init>(r0)
            int r1 = r12.length()
            r0 = 16711680(0xff0000, float:2.3418052E-38)
            r12.setSpan(r15, r10, r1, r0)
            goto L_0x0312
        L_0x0368:
            float r0 = r4.A04
            int r0 = (r0 > r22 ? 1 : (r0 == r22 ? 0 : -1))
            if (r0 == 0) goto L_0x03ab
            if (r1 >= r14) goto L_0x03ab
        L_0x0370:
            int r14 = r14 + r27
            float r1 = r4.A03
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 == 0) goto L_0x03a2
            float r0 = (float) r11
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r15 = r4.A0F
            int r0 = r0 + r15
            int r11 = r4.A0A
            r10 = 2
            r1 = 1
            if (r11 == r1) goto L_0x039d
            if (r11 != r10) goto L_0x038a
            int r0 = r0 - r14
        L_0x038a:
            int r11 = java.lang.Math.max(r0, r15)
            int r14 = r14 + r11
            int r0 = r4.A0G
            int r32 = java.lang.Math.min(r14, r0)
        L_0x0395:
            int r32 = r32 - r11
            if (r32 > 0) goto L_0x03b4
            java.lang.String r1 = "Skipped drawing subtitle cue (invalid horizontal positioning)"
            goto L_0x02ae
        L_0x039d:
            int r0 = r0 << 1
            int r0 = r0 - r14
            int r0 = r0 / r10
            goto L_0x038a
        L_0x03a2:
            r10 = 2
            int r11 = r11 - r14
            int r11 = r11 / r10
            int r0 = r4.A0F
            int r11 = r11 + r0
            int r32 = r11 + r14
            goto L_0x0395
        L_0x03ab:
            r14 = r1
            goto L_0x0370
        L_0x03ad:
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            r12.<init>(r1)
            goto L_0x027e
        L_0x03b4:
            float r1 = r4.A02
            int r0 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r0 == 0) goto L_0x042c
            int r0 = r4.A09
            if (r0 != 0) goto L_0x03ff
            float r0 = (float) r13
            float r0 = r0 * r1
            int r1 = java.lang.Math.round(r0)
            int r0 = r4.A0H
            int r1 = r1 + r0
            int r13 = r4.A08
            if (r13 == r10) goto L_0x0429
            r0 = 1
            if (r13 != r0) goto L_0x03d3
            int r1 = r1 << 1
            int r1 = r1 - r18
            int r1 = r1 / r10
        L_0x03d3:
            int r10 = r1 + r18
            int r0 = r4.A0E
            if (r10 <= r0) goto L_0x03f9
            int r1 = r0 - r18
        L_0x03db:
            android.text.StaticLayout r0 = new android.text.StaticLayout
            r29 = r0
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            r4.A0Q = r0
            android.text.StaticLayout r0 = new android.text.StaticLayout
            r29 = r0
            r30 = r2
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            r4.A0P = r0
            r4.A0I = r11
            r4.A0K = r1
            r0 = r28
            r4.A0J = r0
            goto L_0x017e
        L_0x03f9:
            int r0 = r4.A0H
            if (r1 >= r0) goto L_0x03db
            r1 = r0
            goto L_0x03db
        L_0x03ff:
            android.text.StaticLayout r0 = r4.A0Q
            r1 = 0
            int r10 = r0.getLineBottom(r1)
            android.text.StaticLayout r0 = r4.A0Q
            int r0 = r0.getLineTop(r1)
            int r10 = r10 - r0
            float r1 = r4.A02
            int r0 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r0 < 0) goto L_0x041d
            float r0 = (float) r10
            float r1 = r1 * r0
            int r1 = java.lang.Math.round(r1)
            int r0 = r4.A0H
            int r1 = r1 + r0
            goto L_0x03d3
        L_0x041d:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            float r0 = (float) r10
            float r1 = r1 * r0
            int r1 = java.lang.Math.round(r1)
            int r0 = r4.A0E
            int r1 = r1 + r0
        L_0x0429:
            int r1 = r1 - r18
            goto L_0x03d3
        L_0x042c:
            int r1 = r4.A0E
            int r1 = r1 - r18
            float r10 = (float) r13
            float r0 = r4.A00
            float r10 = r10 * r0
            int r0 = (int) r10
            int r1 = r1 - r0
            goto L_0x03db
        L_0x0437:
            android.graphics.Bitmap r12 = r4.A0M
            int r0 = r7 - r9
            float r10 = (float) r9
            float r1 = (float) r0
            float r0 = r4.A03
            float r0 = r0 * r1
            float r10 = r10 + r0
            float r3 = (float) r8
            r11 = r24
            float r0 = r4.A02
            float r0 = r0 * r24
            float r3 = r3 + r0
            float r0 = r4.A04
            float r1 = r1 * r0
            int r2 = java.lang.Math.round(r1)
            float r1 = r4.A01
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0465
            float r11 = (float) r2
            int r0 = r12.getHeight()
            float r1 = (float) r0
            int r0 = r12.getWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
        L_0x0465:
            float r11 = r11 * r1
            int r11 = java.lang.Math.round(r11)
            int r0 = r4.A0A
            r12 = 1
            r1 = 2
            if (r0 != r1) goto L_0x049d
            float r0 = (float) r2
        L_0x0471:
            float r10 = r10 - r0
        L_0x0472:
            int r10 = java.lang.Math.round(r10)
            int r0 = r4.A08
            if (r0 != r1) goto L_0x0497
            float r0 = (float) r11
        L_0x047b:
            float r3 = r3 - r0
        L_0x047c:
            int r1 = java.lang.Math.round(r3)
            int r2 = r2 + r10
            int r11 = r11 + r1
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r10, r1, r2, r11)
            r4.A0N = r0
        L_0x0489:
            android.graphics.Bitmap r10 = r4.A0M
            android.graphics.Rect r3 = r4.A0N
            android.graphics.Paint r2 = r4.A0X
            r1 = 0
            r0 = r39
            r0.drawBitmap(r10, r1, r3, r2)
            goto L_0x01f3
        L_0x0497:
            if (r0 != r12) goto L_0x047c
            int r0 = r11 >> 1
            float r0 = (float) r0
            goto L_0x047b
        L_0x049d:
            if (r0 != r12) goto L_0x0472
            int r0 = r2 >> 1
            float r0 = (float) r0
            goto L_0x0471
        L_0x04a3:
            int r11 = r13.A04
            goto L_0x00c6
        L_0x04a7:
            r16 = 0
            r11 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x00c6
        L_0x04ad:
            float r10 = r10 * r0
            goto L_0x00a2
        L_0x04b0:
            float r0 = -r0
            float r0 = r0 - r4
            r1 = 1
            r3.A01 = r0
            goto L_0x0077
        L_0x04b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64133Mw.dispatchDraw(android.graphics.Canvas):void");
    }
}
