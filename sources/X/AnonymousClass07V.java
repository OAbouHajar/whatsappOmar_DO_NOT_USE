package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.07V  reason: invalid class name */
public class AnonymousClass07V extends AnonymousClass07W {
    public static final PorterDuff.Mode A09 = PorterDuff.Mode.SRC_IN;
    public ColorFilter A00;
    public PorterDuffColorFilter A01;
    public Drawable.ConstantState A02;
    public AnonymousClass07Y A03;
    public boolean A04;
    public boolean A05;
    public final Matrix A06;
    public final Rect A07;
    public final float[] A08;

    public AnonymousClass07V() {
        this.A04 = true;
        this.A08 = new float[9];
        this.A06 = new Matrix();
        this.A07 = new Rect();
        this.A03 = new AnonymousClass07Y();
    }

    public AnonymousClass07V(AnonymousClass07Y r3) {
        this.A04 = true;
        this.A08 = new float[9];
        this.A06 = new Matrix();
        this.A07 = new Rect();
        this.A03 = r3;
        this.A01 = A02(r3.A03, r3.A07);
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r21v4, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r19v4, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01f4, code lost:
        r26 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01f7, code lost:
        r26 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01fa, code lost:
        r3 = new android.graphics.SweepGradient(r19, r18, r9.A01, r9.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x020a, code lost:
        if (r24 <= 0.0f) goto L_0x0242;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x020c, code lost:
        r2 = r9.A01;
        r1 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0210, code lost:
        if (r5 == 1) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0213, code lost:
        if (r5 == 2) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0216, code lost:
        r27 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0219, code lost:
        r27 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x021c, code lost:
        r27 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x021e, code lost:
        r21 = new android.graphics.RadialGradient(r19, r18, r24, r2, r1, r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x022e, code lost:
        r26 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0230, code lost:
        r19 = new android.graphics.LinearGradient(r20, r21, r22, r23, r1, r0, r26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0242, code lost:
        r1 = new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0292, code lost:
        return new X.AnonymousClass07i((android.content.res.ColorStateList) null, r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01cf, code lost:
        if (r1.size() <= 0) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d1, code lost:
        r9 = new X.AnonymousClass0Vy((java.util.List) r1, (java.util.List) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d7, code lost:
        if (r17 == false) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d9, code lost:
        r9 = new X.AnonymousClass0Vy(r6, r16, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e1, code lost:
        r9 = new X.AnonymousClass0Vy(r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01e6, code lost:
        if (r7 == 1) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e9, code lost:
        if (r7 == 2) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01eb, code lost:
        r1 = r9.A01;
        r0 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ef, code lost:
        if (r5 == 1) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f1, code lost:
        if (r5 == 2) goto L_0x01f4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass07i A00(android.content.res.Resources.Theme r23, android.content.res.TypedArray r24, java.lang.String r25, org.xmlpull.v1.XmlPullParser r26, int r27) {
        /*
            r1 = r25
            r0 = r26
            boolean r0 = X.C014907d.A02(r1, r0)
            if (r0 == 0) goto L_0x028e
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r4 = r24
            r3 = r27
            r4.getValue(r3, r2)
            int r1 = r2.type
            r0 = 28
            if (r1 < r0) goto L_0x0029
            r0 = 31
            if (r1 > r0) goto L_0x0029
            int r1 = r2.data
        L_0x0022:
            r0 = 0
            X.07i r4 = new X.07i
            r4.<init>(r0, r0, r1)
            return r4
        L_0x0029:
            android.content.res.Resources r10 = r4.getResources()
            r8 = 0
            int r0 = r4.getResourceId(r3, r8)
            android.content.res.XmlResourceParser r9 = r10.getXml(r0)     // Catch:{ Exception -> 0x0286 }
            android.util.AttributeSet r11 = android.util.Xml.asAttributeSet(r9)     // Catch:{ Exception -> 0x0286 }
        L_0x003a:
            int r1 = r9.next()     // Catch:{ Exception -> 0x0286 }
            r0 = 2
            if (r1 == r0) goto L_0x004d
            r0 = 1
            if (r1 != r0) goto L_0x003a
            java.lang.String r0 = "No start tag found"
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0286 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0286 }
            goto L_0x0285
        L_0x004d:
            java.lang.String r2 = r9.getName()     // Catch:{ Exception -> 0x0286 }
            java.lang.String r1 = "gradient"
            boolean r0 = r2.equals(r1)     // Catch:{ Exception -> 0x0286 }
            r25 = r23
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "selector"
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x0286 }
            if (r0 == 0) goto L_0x0268
            r0 = r25
            android.content.res.ColorStateList r2 = X.AnonymousClass08G.A00(r0, r10, r11, r9)     // Catch:{ Exception -> 0x0286 }
            int r1 = r2.getDefaultColor()     // Catch:{ Exception -> 0x0286 }
            r0 = 0
            X.07i r4 = new X.07i     // Catch:{ Exception -> 0x0286 }
            r4.<init>(r2, r0, r1)     // Catch:{ Exception -> 0x0286 }
            goto L_0x0291
        L_0x0075:
            java.lang.String r2 = r9.getName()     // Catch:{ Exception -> 0x0286 }
            boolean r0 = r2.equals(r1)     // Catch:{ Exception -> 0x0286 }
            if (r0 == 0) goto L_0x024a
            int[] r1 = X.C017908k.A03     // Catch:{ Exception -> 0x0286 }
            r0 = r25
            android.content.res.TypedArray r2 = X.C014907d.A01(r0, r10, r11, r1)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r0 = "startX"
            r1 = 8
            r3 = 0
            boolean r0 = X.C014907d.A02(r0, r9)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x0095
            r20 = 0
            goto L_0x0099
        L_0x0095:
            float r20 = r2.getFloat(r1, r3)     // Catch:{ Exception -> 0x0286 }
        L_0x0099:
            java.lang.String r0 = "startY"
            r1 = 9
            boolean r0 = X.C014907d.A02(r0, r9)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x00a6
            r21 = 0
            goto L_0x00aa
        L_0x00a6:
            float r21 = r2.getFloat(r1, r3)     // Catch:{ Exception -> 0x0286 }
        L_0x00aa:
            java.lang.String r0 = "endX"
            r1 = 10
            boolean r0 = X.C014907d.A02(r0, r9)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x00b7
            r22 = 0
            goto L_0x00bb
        L_0x00b7:
            float r22 = r2.getFloat(r1, r3)     // Catch:{ Exception -> 0x0286 }
        L_0x00bb:
            java.lang.String r0 = "endY"
            r1 = 11
            boolean r0 = X.C014907d.A02(r0, r9)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x00c8
            r23 = 0
            goto L_0x00cc
        L_0x00c8:
            float r23 = r2.getFloat(r1, r3)     // Catch:{ Exception -> 0x0286 }
        L_0x00cc:
            java.lang.String r0 = "centerX"
            r1 = 3
            boolean r0 = X.C014907d.A02(r0, r9)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x00d8
            r19 = 0
            goto L_0x00dc
        L_0x00d8:
            float r19 = r2.getFloat(r1, r3)     // Catch:{ Exception -> 0x0286 }
        L_0x00dc:
            java.lang.String r0 = "centerY"
            r1 = 4
            boolean r0 = X.C014907d.A02(r0, r9)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x00e8
            r18 = 0
            goto L_0x00ec
        L_0x00e8:
            float r18 = r2.getFloat(r1, r3)     // Catch:{ Exception -> 0x0286 }
        L_0x00ec:
            java.lang.String r0 = "type"
            r1 = 2
            boolean r0 = X.C014907d.A02(r0, r9)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x00f7
            r7 = 0
            goto L_0x00fb
        L_0x00f7:
            int r7 = r2.getInt(r1, r8)     // Catch:{ Exception -> 0x0286 }
        L_0x00fb:
            java.lang.String r0 = "startColor"
            boolean r0 = X.C014907d.A02(r0, r9)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x0105
            r6 = 0
            goto L_0x0109
        L_0x0105:
            int r6 = r2.getColor(r8, r8)     // Catch:{ Exception -> 0x0286 }
        L_0x0109:
            java.lang.String r0 = "centerColor"
            boolean r17 = X.C014907d.A02(r0, r9)     // Catch:{ Exception -> 0x0286 }
            r1 = 7
            boolean r0 = X.C014907d.A02(r0, r9)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x0119
            r16 = 0
            goto L_0x011d
        L_0x0119:
            int r16 = r2.getColor(r1, r8)     // Catch:{ Exception -> 0x0286 }
        L_0x011d:
            java.lang.String r0 = "endColor"
            r1 = 1
            r5 = 0
            boolean r0 = X.C014907d.A02(r0, r9)     // Catch:{ Exception -> 0x0286 }
            if (r0 != 0) goto L_0x0129
            r4 = 0
            goto L_0x012d
        L_0x0129:
            int r4 = r2.getColor(r1, r8)     // Catch:{ Exception -> 0x0286 }
        L_0x012d:
            java.lang.String r0 = "tileMode"
            r1 = 6
            boolean r0 = X.C014907d.A02(r0, r9)     // Catch:{ Exception -> 0x0286 }
            if (r0 == 0) goto L_0x013a
            int r5 = r2.getInt(r1, r8)     // Catch:{ Exception -> 0x0286 }
        L_0x013a:
            java.lang.String r1 = "gradientRadius"
            r15 = 0
            r0 = 5
            boolean r1 = X.C014907d.A02(r1, r9)     // Catch:{ Exception -> 0x0286 }
            if (r1 != 0) goto L_0x0147
            r24 = 0
            goto L_0x014b
        L_0x0147:
            float r24 = r2.getFloat(r0, r3)     // Catch:{ Exception -> 0x0286 }
        L_0x014b:
            r2.recycle()     // Catch:{ Exception -> 0x0286 }
            int r0 = r9.getDepth()     // Catch:{ Exception -> 0x0286 }
            r3 = 1
            int r13 = r0 + 1
            r0 = 20
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0286 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0286 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0286 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0286 }
        L_0x0161:
            int r0 = r9.next()     // Catch:{ Exception -> 0x0286 }
            if (r0 == r3) goto L_0x01cb
            int r12 = r9.getDepth()     // Catch:{ Exception -> 0x0286 }
            if (r12 >= r13) goto L_0x0170
            r14 = 3
            if (r0 == r14) goto L_0x01cb
        L_0x0170:
            r14 = 2
            if (r0 != r14) goto L_0x0161
            if (r12 > r13) goto L_0x0161
            java.lang.String r12 = r9.getName()     // Catch:{ Exception -> 0x0286 }
            java.lang.String r0 = "item"
            boolean r0 = r12.equals(r0)     // Catch:{ Exception -> 0x0286 }
            if (r0 == 0) goto L_0x0161
            int[] r12 = X.C017908k.A04     // Catch:{ Exception -> 0x0286 }
            r0 = r25
            android.content.res.TypedArray r0 = X.C014907d.A01(r0, r10, r11, r12)     // Catch:{ Exception -> 0x0286 }
            boolean r14 = r0.hasValue(r8)     // Catch:{ Exception -> 0x0286 }
            boolean r12 = r0.hasValue(r3)     // Catch:{ Exception -> 0x0286 }
            if (r14 == 0) goto L_0x01af
            if (r12 == 0) goto L_0x01af
            int r14 = r0.getColor(r8, r8)     // Catch:{ Exception -> 0x0286 }
            float r12 = r0.getFloat(r3, r15)     // Catch:{ Exception -> 0x0286 }
            r0.recycle()     // Catch:{ Exception -> 0x0286 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)     // Catch:{ Exception -> 0x0286 }
            r1.add(r0)     // Catch:{ Exception -> 0x0286 }
            java.lang.Float r0 = java.lang.Float.valueOf(r12)     // Catch:{ Exception -> 0x0286 }
            r2.add(r0)     // Catch:{ Exception -> 0x0286 }
            goto L_0x0161
        L_0x01af:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0286 }
            r1.<init>()     // Catch:{ Exception -> 0x0286 }
            java.lang.String r0 = r9.getPositionDescription()     // Catch:{ Exception -> 0x0286 }
            r1.append(r0)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r0 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r1.append(r0)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0286 }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0286 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0286 }
            goto L_0x0285
        L_0x01cb:
            int r0 = r1.size()     // Catch:{ Exception -> 0x0286 }
            if (r0 <= 0) goto L_0x01d7
            X.0Vy r9 = new X.0Vy     // Catch:{ Exception -> 0x0286 }
            r9.<init>((java.util.List) r1, (java.util.List) r2)     // Catch:{ Exception -> 0x0286 }
            goto L_0x01e6
        L_0x01d7:
            if (r17 == 0) goto L_0x01e1
            X.0Vy r9 = new X.0Vy     // Catch:{ Exception -> 0x0286 }
            r0 = r16
            r9.<init>(r6, r0, r4)     // Catch:{ Exception -> 0x0286 }
            goto L_0x01e6
        L_0x01e1:
            X.0Vy r9 = new X.0Vy     // Catch:{ Exception -> 0x0286 }
            r9.<init>((int) r6, (int) r4)     // Catch:{ Exception -> 0x0286 }
        L_0x01e6:
            if (r7 == r3) goto L_0x0208
            r2 = 2
            if (r7 == r2) goto L_0x01fa
            int[] r1 = r9.A01     // Catch:{ Exception -> 0x0286 }
            float[] r0 = r9.A00     // Catch:{ Exception -> 0x0286 }
            if (r5 == r3) goto L_0x01f7
            if (r5 == r2) goto L_0x01f4
            goto L_0x022e
        L_0x01f4:
            android.graphics.Shader$TileMode r26 = android.graphics.Shader.TileMode.MIRROR     // Catch:{ Exception -> 0x0286 }
            goto L_0x0230
        L_0x01f7:
            android.graphics.Shader$TileMode r26 = android.graphics.Shader.TileMode.REPEAT     // Catch:{ Exception -> 0x0286 }
            goto L_0x0230
        L_0x01fa:
            int[] r4 = r9.A01     // Catch:{ Exception -> 0x0286 }
            float[] r2 = r9.A00     // Catch:{ Exception -> 0x0286 }
            android.graphics.SweepGradient r3 = new android.graphics.SweepGradient     // Catch:{ Exception -> 0x0286 }
            r1 = r19
            r0 = r18
            r3.<init>(r1, r0, r4, r2)     // Catch:{ Exception -> 0x0286 }
            goto L_0x023b
        L_0x0208:
            int r0 = (r24 > r15 ? 1 : (r24 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0242
            int[] r2 = r9.A01     // Catch:{ Exception -> 0x0286 }
            float[] r1 = r9.A00     // Catch:{ Exception -> 0x0286 }
            if (r5 == r3) goto L_0x0219
            r0 = 2
            if (r5 == r0) goto L_0x0216
            goto L_0x021c
        L_0x0216:
            android.graphics.Shader$TileMode r27 = android.graphics.Shader.TileMode.MIRROR     // Catch:{ Exception -> 0x0286 }
            goto L_0x021e
        L_0x0219:
            android.graphics.Shader$TileMode r27 = android.graphics.Shader.TileMode.REPEAT     // Catch:{ Exception -> 0x0286 }
            goto L_0x021e
        L_0x021c:
            android.graphics.Shader$TileMode r27 = android.graphics.Shader.TileMode.CLAMP     // Catch:{ Exception -> 0x0286 }
        L_0x021e:
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient     // Catch:{ Exception -> 0x0286 }
            r21 = r3
            r22 = r19
            r23 = r18
            r25 = r2
            r26 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x0286 }
            goto L_0x023b
        L_0x022e:
            android.graphics.Shader$TileMode r26 = android.graphics.Shader.TileMode.CLAMP     // Catch:{ Exception -> 0x0286 }
        L_0x0230:
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient     // Catch:{ Exception -> 0x0286 }
            r19 = r3
            r24 = r1
            r25 = r0
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ Exception -> 0x0286 }
        L_0x023b:
            r0 = 0
            X.07i r4 = new X.07i     // Catch:{ Exception -> 0x0286 }
            r4.<init>(r0, r3, r8)     // Catch:{ Exception -> 0x0286 }
            goto L_0x0292
        L_0x0242:
            java.lang.String r0 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0286 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0286 }
            goto L_0x0285
        L_0x024a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0286 }
            r1.<init>()     // Catch:{ Exception -> 0x0286 }
            java.lang.String r0 = r9.getPositionDescription()     // Catch:{ Exception -> 0x0286 }
            r1.append(r0)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r0 = ": invalid gradient color tag "
            r1.append(r0)     // Catch:{ Exception -> 0x0286 }
            r1.append(r2)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0286 }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0286 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0286 }
            goto L_0x0285
        L_0x0268:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0286 }
            r1.<init>()     // Catch:{ Exception -> 0x0286 }
            java.lang.String r0 = r9.getPositionDescription()     // Catch:{ Exception -> 0x0286 }
            r1.append(r0)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r0 = ": unsupported complex color tag "
            r1.append(r0)     // Catch:{ Exception -> 0x0286 }
            r1.append(r2)     // Catch:{ Exception -> 0x0286 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0286 }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0286 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0286 }
        L_0x0285:
            throw r1     // Catch:{ Exception -> 0x0286 }
        L_0x0286:
            r2 = move-exception
            java.lang.String r1 = "ComplexColorCompat"
            java.lang.String r0 = "Failed to inflate ComplexColor."
            android.util.Log.e(r1, r0, r2)
        L_0x028e:
            r1 = 0
            goto L_0x0022
        L_0x0291:
            return r4
        L_0x0292:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass07V.A00(android.content.res.Resources$Theme, android.content.res.TypedArray, java.lang.String, org.xmlpull.v1.XmlPullParser, int):X.07i");
    }

    public static AnonymousClass07V A01(Resources.Theme theme, Resources resources, int i2) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            AnonymousClass07V r2 = new AnonymousClass07V();
            Drawable A042 = AnonymousClass00X.A04(theme, resources, i2);
            r2.A00 = A042;
            r2.A02 = new AnonymousClass0AW(A042.getConstantState());
            return r2;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    AnonymousClass07V r0 = new AnonymousClass07V();
                    r0.inflate(resources, xml, asAttributeSet, theme);
                    return r0;
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    public PorterDuffColorFilter A02(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.A00;
        if (drawable == null) {
            return false;
        }
        C018208n.A0E(drawable);
        return false;
    }

    public void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.A07;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.A00;
            if (colorFilter == null) {
                colorFilter = this.A01;
            }
            Matrix matrix = this.A06;
            canvas.getMatrix(matrix);
            float[] fArr = this.A08;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) rect.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) rect.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) rect.left, (float) rect.top);
                if (Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && C018208n.A01(this) == 1) {
                    canvas.translate((float) rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                AnonymousClass07Y r1 = this.A03;
                Bitmap bitmap = r1.A04;
                if (!(bitmap != null && min == bitmap.getWidth() && min2 == r1.A04.getHeight())) {
                    r1.A04 = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    r1.A0A = true;
                }
                boolean z2 = this.A04;
                AnonymousClass07Y r8 = this.A03;
                if (!z2) {
                    r8.A00(min, min2);
                } else if (!(!r8.A0A && r8.A02 == r8.A03 && r8.A06 == r8.A07 && r8.A0B == r8.A09 && r8.A00 == r8.A08.A05)) {
                    r8.A00(min, min2);
                    AnonymousClass07Y r12 = this.A03;
                    r12.A02 = r12.A03;
                    r12.A06 = r12.A07;
                    r12.A00 = r12.A08.A05;
                    r12.A0B = r12.A09;
                    r12.A0A = false;
                }
                AnonymousClass07Y r6 = this.A03;
                if (r6.A08.A05 < 255 || colorFilter != null) {
                    if (r6.A05 == null) {
                        Paint paint2 = new Paint();
                        r6.A05 = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    r6.A05.setAlpha(r6.A08.A05);
                    r6.A05.setColorFilter(colorFilter);
                    paint = r6.A05;
                } else {
                    paint = null;
                }
                canvas.drawBitmap(r6.A04, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.A00;
        return drawable != null ? C018208n.A00(drawable) : this.A03.A08.A05;
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.A00;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.A03.A01;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.A00;
        return drawable != null ? C018208n.A02(drawable) : this.A00;
    }

    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.A00;
        if (drawable != null && Build.VERSION.SDK_INT >= 24) {
            return new AnonymousClass0AW(drawable.getConstantState());
        }
        this.A03.A01 = getChangingConfigurations();
        return this.A03;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.A00;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.A03.A08.A00;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.A00;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.A03.A08.A01;
    }

    public int getOpacity() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i2;
        int i3;
        ColorStateList A012;
        Drawable drawable = this.A00;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Resources resources2 = resources;
        if (drawable != null) {
            C018208n.A05(theme2, resources2, drawable, attributeSet2, xmlPullParser2);
            return;
        }
        AnonymousClass07Y r4 = this.A03;
        r4.A08 = new AnonymousClass07Z();
        TypedArray A013 = C014907d.A01(theme2, resources2, attributeSet2, C014807c.A0B);
        AnonymousClass07Y r12 = this.A03;
        AnonymousClass07Z r11 = r12.A08;
        int i4 = !C014907d.A02("tintMode", xmlPullParser2) ? -1 : A013.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i4 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i4 != 5) {
            if (i4 != 9) {
                switch (i4) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        r12.A07 = mode;
        if (C014907d.A02("tint", xmlPullParser2)) {
            TypedValue typedValue = new TypedValue();
            A013.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 != 2) {
                if (i5 < 28 || i5 > 31) {
                    Resources resources3 = A013.getResources();
                    try {
                        A012 = AnonymousClass08G.A01(theme2, resources3, resources3.getXml(A013.getResourceId(1, 0)));
                    } catch (Exception e2) {
                        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                    }
                } else {
                    A012 = ColorStateList.valueOf(typedValue.data);
                }
                if (A012 != null) {
                    r12.A03 = A012;
                }
            } else {
                StringBuilder sb = new StringBuilder("Failed to resolve attribute at index ");
                sb.append(1);
                sb.append(": ");
                sb.append(typedValue);
                throw new UnsupportedOperationException(sb.toString());
            }
        }
        boolean z2 = r12.A09;
        if (C014907d.A02("autoMirrored", xmlPullParser2)) {
            z2 = A013.getBoolean(5, z2);
        }
        r12.A09 = z2;
        float f2 = r11.A03;
        if (C014907d.A02("viewportWidth", xmlPullParser2)) {
            f2 = A013.getFloat(7, f2);
        }
        r11.A03 = f2;
        float f3 = r11.A02;
        if (C014907d.A02("viewportHeight", xmlPullParser2)) {
            f3 = A013.getFloat(8, f3);
        }
        r11.A02 = f3;
        if (r11.A03 <= 0.0f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(A013.getPositionDescription());
            sb2.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb2.toString());
        } else if (f3 > 0.0f) {
            r11.A01 = A013.getDimension(3, r11.A01);
            float dimension = A013.getDimension(2, r11.A00);
            r11.A00 = dimension;
            if (r11.A01 <= 0.0f) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(A013.getPositionDescription());
                sb3.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb3.toString());
            } else if (dimension > 0.0f) {
                float alpha = r11.getAlpha();
                if (C014907d.A02("alpha", xmlPullParser2)) {
                    alpha = A013.getFloat(4, alpha);
                }
                r11.setAlpha(alpha);
                String string = A013.getString(0);
                if (string != null) {
                    r11.A0A = string;
                    r11.A0E.put(string, r11);
                }
                A013.recycle();
                r4.A01 = getChangingConfigurations();
                r4.A0A = true;
                AnonymousClass07Y r3 = this.A03;
                AnonymousClass07Z r1 = r3.A08;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(r1.A0F);
                int eventType = xmlPullParser2.getEventType();
                int depth = xmlPullParser2.getDepth() + 1;
                boolean z3 = true;
                while (eventType != 1 && (xmlPullParser2.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser2.getName();
                        C014607a r122 = (C014607a) arrayDeque.peek();
                        if ("path".equals(name)) {
                            C015007e r13 = new C015007e();
                            TypedArray A014 = C014907d.A01(theme2, resources2, attributeSet2, C014807c.A0A);
                            r13.A0B = null;
                            if (C014907d.A02("pathData", xmlPullParser2)) {
                                String string2 = A014.getString(0);
                                if (string2 != null) {
                                    r13.A02 = string2;
                                }
                                String string3 = A014.getString(2);
                                if (string3 != null) {
                                    r13.A03 = C015107g.A02(string3);
                                }
                                r13.A09 = A00(theme2, A014, "fillColor", xmlPullParser2, 1);
                                float f4 = r13.A00;
                                if (C014907d.A02("fillAlpha", xmlPullParser2)) {
                                    f4 = A014.getFloat(12, f4);
                                }
                                r13.A00 = f4;
                                int i6 = -1;
                                int i7 = !C014907d.A02("strokeLineCap", xmlPullParser2) ? -1 : A014.getInt(8, -1);
                                Paint.Cap cap = r13.A07;
                                if (i7 == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (i7 == 1) {
                                    cap = Paint.Cap.ROUND;
                                } else if (i7 == 2) {
                                    cap = Paint.Cap.SQUARE;
                                }
                                r13.A07 = cap;
                                if (C014907d.A02("strokeLineJoin", xmlPullParser2)) {
                                    i6 = A014.getInt(9, -1);
                                }
                                Paint.Join join = r13.A08;
                                if (i6 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (i6 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (i6 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                r13.A08 = join;
                                float f5 = r13.A02;
                                if (C014907d.A02("strokeMiterLimit", xmlPullParser2)) {
                                    f5 = A014.getFloat(10, f5);
                                }
                                r13.A02 = f5;
                                r13.A0A = A00(theme2, A014, "strokeColor", xmlPullParser2, 3);
                                float f6 = r13.A01;
                                if (C014907d.A02("strokeAlpha", xmlPullParser2)) {
                                    f6 = A014.getFloat(11, f6);
                                }
                                r13.A01 = f6;
                                float f7 = r13.A03;
                                if (C014907d.A02("strokeWidth", xmlPullParser2)) {
                                    f7 = A014.getFloat(4, f7);
                                }
                                r13.A03 = f7;
                                float f8 = r13.A04;
                                if (C014907d.A02("trimPathEnd", xmlPullParser2)) {
                                    f8 = A014.getFloat(6, f8);
                                }
                                r13.A04 = f8;
                                float f9 = r13.A05;
                                if (C014907d.A02("trimPathOffset", xmlPullParser2)) {
                                    f9 = A014.getFloat(7, f9);
                                }
                                r13.A05 = f9;
                                float f10 = r13.A06;
                                if (C014907d.A02("trimPathStart", xmlPullParser2)) {
                                    f10 = A014.getFloat(5, f10);
                                }
                                r13.A06 = f10;
                                int i8 = r13.A01;
                                if (C014907d.A02("fillType", xmlPullParser2)) {
                                    i8 = A014.getInt(13, i8);
                                }
                                r13.A01 = i8;
                            }
                            A014.recycle();
                            r122.A0C.add(r13);
                            String str = r13.A02;
                            if (str != null) {
                                r1.A0E.put(str, r13);
                            }
                            z3 = false;
                            i2 = r3.A01;
                            i3 = r13.A00;
                        } else if ("clip-path".equals(name)) {
                            AnonymousClass0GV r132 = new AnonymousClass0GV();
                            if (C014907d.A02("pathData", xmlPullParser2)) {
                                TypedArray A015 = C014907d.A01(theme2, resources2, attributeSet2, C014807c.A08);
                                String string4 = A015.getString(0);
                                if (string4 != null) {
                                    r132.A02 = string4;
                                }
                                String string5 = A015.getString(1);
                                if (string5 != null) {
                                    r132.A03 = C015107g.A02(string5);
                                }
                                r132.A01 = !C014907d.A02("fillType", xmlPullParser2) ? 0 : A015.getInt(2, 0);
                                A015.recycle();
                            }
                            r122.A0C.add(r132);
                            String str2 = r132.A02;
                            if (str2 != null) {
                                r1.A0E.put(str2, r132);
                            }
                            i2 = r3.A01;
                            i3 = r132.A00;
                        } else if ("group".equals(name)) {
                            C014607a r112 = new C014607a();
                            TypedArray A016 = C014907d.A01(theme2, resources2, attributeSet2, C014807c.A09);
                            r112.A09 = null;
                            float f11 = r112.A02;
                            if (C014907d.A02("rotation", xmlPullParser2)) {
                                f11 = A016.getFloat(5, f11);
                            }
                            r112.A02 = f11;
                            r112.A00 = A016.getFloat(1, r112.A00);
                            r112.A01 = A016.getFloat(2, r112.A01);
                            float f12 = r112.A03;
                            if (C014907d.A02("scaleX", xmlPullParser2)) {
                                f12 = A016.getFloat(3, f12);
                            }
                            r112.A03 = f12;
                            float f13 = r112.A04;
                            if (C014907d.A02("scaleY", xmlPullParser2)) {
                                f13 = A016.getFloat(4, f13);
                            }
                            r112.A04 = f13;
                            float f14 = r112.A05;
                            if (C014907d.A02("translateX", xmlPullParser2)) {
                                f14 = A016.getFloat(6, f14);
                            }
                            r112.A05 = f14;
                            float f15 = r112.A06;
                            if (C014907d.A02("translateY", xmlPullParser2)) {
                                f15 = A016.getFloat(7, f15);
                            }
                            r112.A06 = f15;
                            String string6 = A016.getString(0);
                            if (string6 != null) {
                                r112.A08 = string6;
                            }
                            r112.A02();
                            A016.recycle();
                            r122.A0C.add(r112);
                            arrayDeque.push(r112);
                            String str3 = r112.A08;
                            if (str3 != null) {
                                r1.A0E.put(str3, r112);
                            }
                            i2 = r3.A01;
                            i3 = r112.A07;
                        }
                        r3.A01 = i3 | i2;
                    } else if (eventType == 3 && "group".equals(xmlPullParser2.getName())) {
                        arrayDeque.pop();
                    }
                    eventType = xmlPullParser2.next();
                }
                if (!z3) {
                    this.A01 = A02(r4.A03, r4.A07);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(A013.getPositionDescription());
                sb4.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(A013.getPositionDescription());
            sb5.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb5.toString());
        }
    }

    public void invalidateSelf() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.A00;
        return drawable != null ? C018208n.A0F(drawable) : this.A03.A09;
    }

    public boolean isStateful() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        AnonymousClass07Y r0 = this.A03;
        if (r0 == null) {
            return false;
        }
        AnonymousClass07Z r1 = r0.A08;
        Boolean bool = r1.A09;
        if (bool == null) {
            bool = Boolean.valueOf(r1.A0F.A00());
            r1.A09 = bool;
        }
        if (bool.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.A03.A03;
        return colorStateList != null && colorStateList.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.mutate();
        } else if (!this.A05 && super.mutate() == this) {
            this.A03 = new AnonymousClass07Y(this.A03);
            this.A05 = true;
            return this;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z2 = false;
        AnonymousClass07Y r3 = this.A03;
        ColorStateList colorStateList = r3.A03;
        if (!(colorStateList == null || (mode = r3.A07) == null)) {
            this.A01 = A02(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        AnonymousClass07Z r1 = r3.A08;
        Boolean bool = r1.A09;
        if (bool == null) {
            bool = Boolean.valueOf(r1.A0F.A00());
            r1.A09 = bool;
        }
        if (bool.booleanValue()) {
            boolean A012 = r3.A08.A0F.A01(iArr);
            r3.A0A |= A012;
            if (A012) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i2);
            return;
        }
        AnonymousClass07Z r1 = this.A03.A08;
        if (r1.A05 != i2) {
            r1.A05 = i2;
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C018208n.A0C(drawable, z2);
        } else {
            this.A03.A09 = z2;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.A00 = colorFilter;
        invalidateSelf();
    }

    public void setTint(int i2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C018208n.A0A(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C018208n.A04(colorStateList, drawable);
            return;
        }
        AnonymousClass07Y r1 = this.A03;
        if (r1.A03 != colorStateList) {
            r1.A03 = colorStateList;
            this.A01 = A02(colorStateList, r1.A07);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            C018208n.A07(mode, drawable);
            return;
        }
        AnonymousClass07Y r1 = this.A03;
        if (r1.A07 != mode) {
            r1.A07 = mode;
            this.A01 = A02(r1.A03, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.A00;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
