package X;

import android.util.SparseIntArray;

/* renamed from: X.3B2  reason: invalid class name */
public class AnonymousClass3B2 {
    public static final SparseIntArray A00 = new SparseIntArray();
    public static final SparseIntArray A01 = new SparseIntArray();

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01b5, code lost:
        return r3.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01be, code lost:
        if (r5 == r1.AJb(r12, 0, r12.length())) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c9, code lost:
        if (r5 == r1.AJb(r12, 0, r12.length())) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01d4, code lost:
        if (r1.AJb(r12, 0, r12.length()) != false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01df, code lost:
        if (r1.AJb(r12, 0, r12.length()) != false) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01e1, code lost:
        r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a6, code lost:
        r1 = android.text.Layout.Alignment.ALIGN_NORMAL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01aa, code lost:
        if (r2.A0E == r1) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ac, code lost:
        r2.A0E = r1;
        r3.A04 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.Layout A00(android.content.Context r10, X.AnonymousClass3HU r11, java.lang.CharSequence r12, int r13) {
        /*
            X.0Wx r3 = new X.0Wx
            r3.<init>()
            r4 = 0
            r3.A05 = r4
            int r1 = android.view.View.MeasureSpec.getMode(r13)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = 1
            if (r1 == r0) goto L_0x0215
            if (r1 == 0) goto L_0x0212
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 != r0) goto L_0x0218
            r6 = 1
        L_0x0018:
            android.text.TextUtils$TruncateAt r7 = r11.A0S
            if (r7 != 0) goto L_0x0025
            int r1 = r11.A0H
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L_0x0025
            android.text.TextUtils$TruncateAt r7 = android.text.TextUtils.TruncateAt.END
        L_0x0025:
            boolean r0 = r11.A0X
            if (r0 == 0) goto L_0x0033
            int r0 = r11.A0F
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x0034
            int r0 = r11.A0E
            if (r0 == r1) goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            float r1 = X.C13680ns.A01(r10)
            X.0Qg r2 = r3.A06
            android.text.TextPaint r0 = r2.A0F
            float r0 = r0.density
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x004c
            r2.A00()
            android.text.TextPaint r0 = r2.A0F
            r0.density = r1
            r0 = 0
            r3.A04 = r0
        L_0x004c:
            android.text.TextUtils$TruncateAt r0 = r2.A0G
            if (r0 == r7) goto L_0x0055
            r2.A0G = r7
            r0 = 0
            r3.A04 = r0
        L_0x0055:
            int r1 = r11.A0H
            int r0 = r2.A0A
            if (r0 == r1) goto L_0x0060
            r2.A0A = r1
            r0 = 0
            r3.A04 = r0
        L_0x0060:
            float r9 = r11.A07
            float r8 = r11.A05
            float r7 = r11.A06
            int r1 = r11.A0M
            r2.A00()
            r2.A03 = r9
            r2.A01 = r8
            r2.A02 = r7
            r2.A09 = r1
            android.text.TextPaint r0 = r2.A0F
            r0.setShadowLayer(r9, r8, r7, r1)
            r0 = 0
            r3.A04 = r0
            boolean r1 = r11.A0Y
            boolean r0 = r2.A0M
            if (r0 == r1) goto L_0x0086
            r2.A0M = r1
            r0 = 0
            r3.A04 = r0
        L_0x0086:
            r3.A06(r12)
            int r1 = r11.A0O
            android.text.TextPaint r0 = r2.A0F
            float r0 = r0.getTextSize()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00a1
            r2.A00()
            android.text.TextPaint r0 = r2.A0F
            r0.setTextSize(r1)
            r0 = 0
            r3.A04 = r0
        L_0x00a1:
            int r1 = android.view.View.MeasureSpec.getSize(r13)
            int r0 = r2.A0C
            if (r0 != r1) goto L_0x00ad
            int r0 = r2.A0B
            if (r0 == r6) goto L_0x00b4
        L_0x00ad:
            r2.A0C = r1
            r2.A0B = r6
            r0 = 0
            r3.A04 = r0
        L_0x00b4:
            boolean r0 = r2.A0J
            if (r0 == r5) goto L_0x00bd
            r2.A0J = r5
            r0 = 0
            r3.A04 = r0
        L_0x00bd:
            float r1 = r11.A04
            float r6 = r2.A00
            r5 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00d3
            float r0 = r2.A04
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d3
            r2.A04 = r1
            r0 = 0
            r3.A04 = r0
        L_0x00d3:
            float r1 = r11.A03
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00e4
            float r0 = r2.A05
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00e4
            r2.A05 = r1
            r0 = 0
            r3.A04 = r0
        L_0x00e4:
            int r1 = r11.A0D
            android.text.TextPaint r0 = r2.A0F
            int r0 = r0.linkColor
            if (r0 == r1) goto L_0x00f6
            r2.A00()
            android.text.TextPaint r0 = r2.A0F
            r0.linkColor = r1
            r0 = 0
            r3.A04 = r0
        L_0x00f6:
            int r0 = r11.A0C
            r3.A05(r0)
            int r1 = r11.A08
            int r0 = r2.A06
            if (r0 == r1) goto L_0x0106
            r2.A06 = r1
            r0 = 0
            r3.A04 = r0
        L_0x0106:
            int r0 = r11.A0B
            r3.A04(r0)
            boolean r1 = r11.A0a
            boolean r0 = r2.A0L
            if (r0 == r1) goto L_0x011e
            r2.A0L = r1
            java.lang.CharSequence r0 = r2.A0I
            int r0 = r0.length()
            if (r0 != 0) goto L_0x011e
            r0 = 0
            r3.A04 = r0
        L_0x011e:
            float r5 = r11.A02
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x013f
            float r0 = r2.A00
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x013f
            r2.A00 = r5
            android.text.TextPaint r0 = r2.A0F
            r1 = 0
            float r0 = r0.getFontMetrics(r1)
            float r5 = r5 - r0
            r2.A04 = r5
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.A05 = r0
            r3.A04 = r1
        L_0x013f:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0148
            r3.A03()
        L_0x0148:
            int r0 = r11.A0J
            r1 = -1
            if (r0 == r1) goto L_0x020b
            r3.A02 = r0
            r0 = 1
        L_0x0150:
            r3.A03 = r0
            int r0 = r11.A0G
            if (r0 == r1) goto L_0x0204
            r3.A00 = r0
            r0 = 1
        L_0x0159:
            r3.A01 = r0
            int r5 = r11.A0N
            if (r5 == 0) goto L_0x01ea
            r2.A00()
            r1 = 0
            r2.A0D = r1
            android.text.TextPaint r0 = r2.A0F
            r0.setColor(r5)
            r3.A04 = r1
        L_0x016c:
            android.graphics.Typeface r1 = r11.A0R
            if (r1 != 0) goto L_0x0176
            int r0 = r11.A0P
            android.graphics.Typeface r1 = android.graphics.Typeface.defaultFromStyle(r0)
        L_0x0176:
            android.text.TextPaint r0 = r2.A0F
            android.graphics.Typeface r0 = r0.getTypeface()
            if (r0 == r1) goto L_0x0186
            r2.A00()
            android.text.TextPaint r0 = r2.A0F
            r0 = 0
            r3.A04 = r0
        L_0x0186:
            boolean r5 = X.AnonymousClass44u.A00(r10)
            X.02F r1 = r11.A0T
            if (r1 != 0) goto L_0x0194
            if (r5 == 0) goto L_0x01e7
            X.02F r1 = X.AnonymousClass02G.A02
        L_0x0192:
            r11.A0T = r1
        L_0x0194:
            X.02F r0 = r2.A0H
            if (r0 == r1) goto L_0x019d
            r2.A0H = r1
            r0 = 0
            r3.A04 = r0
        L_0x019d:
            X.422 r0 = r11.A0U
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x01e1;
                case 2: goto L_0x01e4;
                case 3: goto L_0x01c1;
                case 4: goto L_0x01b6;
                case 5: goto L_0x01d7;
                case 6: goto L_0x01cc;
                default: goto L_0x01a6;
            }
        L_0x01a6:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x01a8:
            android.text.Layout$Alignment r0 = r2.A0E
            if (r0 == r1) goto L_0x01b1
            r2.A0E = r1
            r0 = 0
            r3.A04 = r0
        L_0x01b1:
            android.text.Layout r0 = r3.A02()
            return r0
        L_0x01b6:
            int r0 = r12.length()
            boolean r0 = r1.AJb(r12, r4, r0)
            if (r5 != r0) goto L_0x01a6
            goto L_0x01e1
        L_0x01c1:
            int r0 = r12.length()
            boolean r0 = r1.AJb(r12, r4, r0)
            if (r5 != r0) goto L_0x01e1
            goto L_0x01a6
        L_0x01cc:
            int r0 = r12.length()
            boolean r0 = r1.AJb(r12, r4, r0)
            if (r0 == 0) goto L_0x01e1
            goto L_0x01a6
        L_0x01d7:
            int r0 = r12.length()
            boolean r0 = r1.AJb(r12, r4, r0)
            if (r0 == 0) goto L_0x01a6
        L_0x01e1:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x01a8
        L_0x01e4:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x01a8
        L_0x01e7:
            X.02F r1 = X.AnonymousClass02G.A01
            goto L_0x0192
        L_0x01ea:
            android.content.res.ColorStateList r0 = r11.A0Q
            r2.A00()
            r2.A0D = r0
            android.text.TextPaint r1 = r2.A0F
            if (r0 == 0) goto L_0x0201
            int r0 = r0.getDefaultColor()
        L_0x01f9:
            r1.setColor(r0)
            r0 = 0
            r3.A04 = r0
            goto L_0x016c
        L_0x0201:
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x01f9
        L_0x0204:
            int r0 = r11.A0I
            r3.A00 = r0
            r0 = 2
            goto L_0x0159
        L_0x020b:
            int r0 = r11.A0L
            r3.A02 = r0
            r0 = 2
            goto L_0x0150
        L_0x0212:
            r6 = 0
            goto L_0x0018
        L_0x0215:
            r6 = 2
            goto L_0x0018
        L_0x0218:
            java.lang.String r0 = "Unexpected size mode: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            int r0 = android.view.View.MeasureSpec.getMode(r13)
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3B2.A00(android.content.Context, X.3HU, java.lang.CharSequence, int):android.text.Layout");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009c, code lost:
        if (r11.A0E == Integer.MIN_VALUE) goto L_0x009e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x023a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C95824nL A01(X.C86794Ue r21, X.C65263Ty r22, X.AnonymousClass3HU r23, java.lang.CharSequence r24, int r25, int r26) {
        /*
            r0 = r21
            r10 = r24
            android.content.Context r0 = r0.A02
            r21 = r0
            X.4OP r7 = new X.4OP
            r7.<init>()
            r11 = r23
            r7.A03 = r11
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r20 = r22
            r22 = r25
            r23 = r26
            if (r0 == 0) goto L_0x002f
            boolean r0 = r11.A0a
            if (r0 != 0) goto L_0x002f
            r7.A04 = r10
            r24 = 0
            r25 = 0
            X.4nL r19 = new X.4nL
            r21 = r7
            r19.<init>(r20, r21, r22, r23, r24, r25)
            return r19
        L_0x002f:
            r1 = r21
            r0 = r22
            android.text.Layout r9 = A00(r1, r11, r10, r0)
            int r2 = r9.getWidth()
            float r1 = r11.A00
            float r0 = r11.A01
            float r1 = r1 + r0
            int r0 = java.lang.Math.round(r1)
            int r2 = r2 + r0
            r0 = r22
            int r19 = android.view.View.resolveSize(r2, r0)
            int r8 = X.C04330Mc.A00(r9)
            float r0 = r11.A03
            r6 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ce
            boolean r0 = r11.A0Z
            if (r0 == 0) goto L_0x00ce
            android.text.TextPaint r0 = r9.getPaint()
            int r0 = r0.getFontMetricsInt(r6)
            float r1 = (float) r0
            float r0 = r11.A03
            float r0 = r0 - r2
            float r1 = r1 * r0
            int r4 = (int) r1
            int r8 = r8 + r4
        L_0x006c:
            int r2 = r9.getLineCount()
            int r0 = r11.A0K
            if (r2 >= r0) goto L_0x008c
            android.text.TextPaint r0 = r9.getPaint()
            int r0 = r0.getFontMetricsInt(r6)
            float r1 = (float) r0
            float r0 = r11.A03
            float r1 = r1 * r0
            float r0 = r11.A04
            float r1 = r1 + r0
            int r1 = java.lang.Math.round(r1)
            int r0 = r11.A0K
            int r0 = r0 - r2
            int r1 = r1 * r0
            int r8 = r8 + r1
        L_0x008c:
            int r0 = X.C04330Mc.A00(r9)
            float r0 = (float) r0
            r18 = r0
            int r0 = r11.A0F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L_0x009e
            int r1 = r11.A0E
            r0 = 1
            if (r1 != r2) goto L_0x009f
        L_0x009e:
            r0 = 0
        L_0x009f:
            r3 = 1
            if (r0 == 0) goto L_0x0192
            android.text.TextPaint r17 = r9.getPaint()
            android.text.TextPaint r12 = new android.text.TextPaint
            r0 = r17
            r12.<init>(r0)
            boolean r14 = r10 instanceof android.text.Spanned
            if (r14 == 0) goto L_0x00d0
            int r0 = r10.length()
            if (r0 <= 0) goto L_0x00d0
            r1 = r10
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<android.text.style.MetricAffectingSpan> r0 = android.text.style.MetricAffectingSpan.class
            java.lang.Object[] r2 = r1.getSpans(r5, r5, r0)
            android.text.style.MetricAffectingSpan[] r2 = (android.text.style.MetricAffectingSpan[]) r2
            r1 = 0
        L_0x00c3:
            int r0 = r2.length
            if (r1 >= r0) goto L_0x00d0
            r0 = r2[r1]
            r0.updateMeasureState(r12)
            int r1 = r1 + 1
            goto L_0x00c3
        L_0x00ce:
            r4 = 0
            goto L_0x006c
        L_0x00d0:
            float r0 = r12.getTextSize()
            android.graphics.Typeface r1 = r12.getTypeface()
            int r0 = (int) r0
            int r15 = r0 * 31
            int r0 = r1.hashCode()
            int r15 = r15 + r0
            android.util.SparseIntArray r1 = A01
            monitor-enter(r1)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = r1.get(r15, r13)     // Catch:{ all -> 0x018f }
            monitor-exit(r1)     // Catch:{ all -> 0x018f }
            if (r2 != r13) goto L_0x0110
            android.graphics.Rect r16 = X.AnonymousClass000.A0J()
            android.graphics.Paint$FontMetricsInt r6 = new android.graphics.Paint$FontMetricsInt
            r6.<init>()
            r12.getFontMetricsInt(r6)
            java.lang.String r0 = "T"
            r2 = r16
            r12.getTextBounds(r0, r5, r3, r2)
            int r0 = r6.ascent
            int r2 = -r0
            int r0 = r16.height()
            int r2 = r2 - r0
            monitor-enter(r1)
            r1.put(r15, r2)     // Catch:{ all -> 0x010d }
            monitor-exit(r1)     // Catch:{ all -> 0x010d }
            goto L_0x0110
        L_0x010d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x010d }
            throw r0
        L_0x0110:
            android.text.TextPaint r16 = new android.text.TextPaint
            r1 = r16
            r0 = r17
            r1.<init>(r0)
            if (r14 == 0) goto L_0x0145
            int r0 = r10.length()
            if (r0 <= 0) goto L_0x0145
            r0 = r10
            android.text.Spanned r0 = (android.text.Spanned) r0
            r1 = r0
            int r15 = r10.length()
            int r15 = r15 - r3
            int r14 = r10.length()
            int r14 = r14 - r3
            java.lang.Class<android.text.style.MetricAffectingSpan> r0 = android.text.style.MetricAffectingSpan.class
            java.lang.Object[] r15 = r1.getSpans(r15, r14, r0)
            android.text.style.MetricAffectingSpan[] r15 = (android.text.style.MetricAffectingSpan[]) r15
            r14 = 0
        L_0x0138:
            int r0 = r15.length
            if (r14 >= r0) goto L_0x0145
            r1 = r15[r14]
            r0 = r16
            r1.updateMeasureState(r0)
            int r14 = r14 + 1
            goto L_0x0138
        L_0x0145:
            float r0 = r16.getTextSize()
            android.graphics.Typeface r1 = r16.getTypeface()
            int r0 = (int) r0
            int r15 = r0 * 31
            int r0 = r1.hashCode()
            int r15 = r15 + r0
            android.util.SparseIntArray r14 = A00
            monitor-enter(r14)
            int r1 = r14.get(r15, r13)     // Catch:{ all -> 0x018c }
            monitor-exit(r14)     // Catch:{ all -> 0x018c }
            if (r1 != r13) goto L_0x0194
            if (r6 == 0) goto L_0x0177
            float r1 = r12.getTextSize()
            float r0 = r16.getTextSize()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0177
            android.graphics.Typeface r1 = r12.getTypeface()
            android.graphics.Typeface r0 = r16.getTypeface()
            if (r1 == r0) goto L_0x0181
        L_0x0177:
            android.graphics.Paint$FontMetricsInt r6 = new android.graphics.Paint$FontMetricsInt
            r6.<init>()
            r0 = r16
            r0.getFontMetricsInt(r6)
        L_0x0181:
            int r1 = r6.descent
            monitor-enter(r14)
            r14.put(r15, r1)     // Catch:{ all -> 0x0189 }
            monitor-exit(r14)     // Catch:{ all -> 0x0189 }
            goto L_0x0194
        L_0x0189:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0189 }
            throw r0
        L_0x018c:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x018c }
            throw r0
        L_0x018f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x018f }
            throw r0
        L_0x0192:
            r6 = 0
            goto L_0x01a5
        L_0x0194:
            r0 = 2
            int[] r0 = new int[r0]
            r0[r5] = r2
            r0[r3] = r1
            r6 = r0[r5]
            int r0 = r11.A0F
            int r6 = r6 - r0
            int r1 = r1 + r6
            int r8 = r8 - r1
            int r0 = r11.A0E
            int r8 = r8 + r0
        L_0x01a5:
            r0 = r23
            int r2 = android.view.View.resolveSize(r8, r0)
            X.41S r0 = r11.A0V
            int r0 = r0.ordinal()
            switch(r0) {
                case 1: goto L_0x0275;
                case 2: goto L_0x027c;
                default: goto L_0x01b4;
            }
        L_0x01b4:
            int r4 = r4 - r6
            float r1 = (float) r4
        L_0x01b6:
            java.lang.CharSequence r4 = r11.A0W
            if (r4 == 0) goto L_0x0226
            java.lang.String r0 = ""
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0226
            r12 = 0
        L_0x01c3:
            int r0 = r9.getLineCount()
            if (r12 >= r0) goto L_0x0226
            int r0 = r9.getEllipsisCount(r12)
            if (r0 <= 0) goto L_0x0271
            r0 = -1
            if (r12 == r0) goto L_0x0226
            java.lang.CharSequence r6 = r11.A0W
            r0 = r19
            float r8 = (float) r0
            float r0 = r11.A00
            float r8 = r8 - r0
            float r0 = r11.A01
            float r8 = r8 - r0
            int r4 = r6.length()
            android.text.TextPaint r0 = r9.getPaint()
            float r0 = android.text.BoringLayout.getDesiredWidth(r6, r5, r4, r0)
            float r8 = r8 - r0
            float r0 = r9.getLineLeft(r12)
            float r8 = r8 + r0
            int r0 = r9.getOffsetForHorizontal(r12, r8)
            if (r0 <= 0) goto L_0x0218
            int r8 = r0 + -1
            int r0 = r9.getEllipsisCount(r12)
            if (r0 <= 0) goto L_0x0209
            int r4 = r9.getLineStart(r12)
            int r0 = r9.getEllipsisStart(r12)
            int r4 = r4 + r0
            if (r8 <= r4) goto L_0x0209
            r8 = r4
        L_0x0209:
            r0 = 2
            java.lang.CharSequence[] r4 = new java.lang.CharSequence[r0]
            java.lang.CharSequence r0 = r10.subSequence(r5, r8)
            r4[r5] = r0
            r4[r3] = r6
            java.lang.CharSequence r10 = android.text.TextUtils.concat(r4)
        L_0x0218:
            r3 = 1073741824(0x40000000, float:2.0)
            r0 = r19
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r0 = r21
            android.text.Layout r9 = A00(r0, r11, r10, r3)
        L_0x0226:
            r7.A04 = r10
            r7.A02 = r9
            X.422 r3 = r11.A0U
            X.422 r0 = X.AnonymousClass422.TEXT_START
            if (r3 != r0) goto L_0x0269
            float r0 = r11.A00
        L_0x0232:
            r7.A00 = r0
        L_0x0234:
            r7.A01 = r1
            boolean r0 = r10 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0259
            r3 = r10
            android.text.Spanned r3 = (android.text.Spanned) r3
            int r1 = r10.length()
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r0 = r3.getSpans(r5, r1, r0)
            android.text.style.ClickableSpan[] r0 = (android.text.style.ClickableSpan[]) r0
            r7.A06 = r0
            int r1 = r10.length()
            java.lang.Class<android.text.style.ImageSpan> r0 = android.text.style.ImageSpan.class
            java.lang.Object[] r0 = r3.getSpans(r5, r1, r0)
            android.text.style.ImageSpan[] r0 = (android.text.style.ImageSpan[]) r0
            r7.A07 = r0
        L_0x0259:
            X.4nL r1 = new X.4nL
            r3 = r7
            r4 = r22
            r5 = r23
            r6 = r19
            r7 = r2
            r2 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L_0x0269:
            X.422 r0 = X.AnonymousClass422.TEXT_END
            if (r3 != r0) goto L_0x0234
            float r0 = r11.A01
            float r0 = -r0
            goto L_0x0232
        L_0x0271:
            int r12 = r12 + 1
            goto L_0x01c3
        L_0x0275:
            float r1 = (float) r2
            float r1 = r1 - r18
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            goto L_0x027f
        L_0x027c:
            float r1 = (float) r2
            float r1 = r1 - r18
        L_0x027f:
            float r0 = (float) r4
            float r1 = r1 + r0
            float r0 = (float) r6
            float r1 = r1 - r0
            goto L_0x01b6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3B2.A01(X.4Ue, X.3Ty, X.3HU, java.lang.CharSequence, int, int):X.4nL");
    }
}
