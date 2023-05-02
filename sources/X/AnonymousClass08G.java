package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.08G  reason: invalid class name */
public final class AnonymousClass08G {
    public static final ThreadLocal A00 = new ThreadLocal();

    /* JADX WARNING: type inference failed for: r0v76, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009c, code lost:
        if (r4.hasValue(3) != false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00af, code lost:
        if (r4.hasValue(2) != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0100, code lost:
        if (r27 > 100.0f) goto L_0x0102;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0155  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList A00(android.content.res.Resources.Theme r30, android.content.res.Resources r31, android.util.AttributeSet r32, org.xmlpull.v1.XmlPullParser r33) {
        /*
            java.lang.String r2 = r33.getName()
            java.lang.String r0 = "selector"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0306
            int r0 = r33.getDepth()
            r2 = 1
            int r15 = r0 + 1
            r0 = 20
            int[][] r11 = new int[r0][]
            int[] r10 = new int[r0]
            r9 = 0
        L_0x001a:
            int r3 = r33.next()
            if (r3 == r2) goto L_0x02f5
            int r1 = r33.getDepth()
            if (r1 >= r15) goto L_0x0029
            r0 = 3
            if (r3 == r0) goto L_0x02f5
        L_0x0029:
            r0 = 2
            if (r3 != r0) goto L_0x0141
            if (r1 > r15) goto L_0x0141
            java.lang.String r1 = r33.getName()
            java.lang.String r0 = "item"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0141
            int[] r1 = X.C017908k.A00
            r6 = r30
            r5 = r31
            r7 = r32
            if (r30 != 0) goto L_0x00eb
            android.content.res.TypedArray r4 = r5.obtainAttributes(r7, r1)
        L_0x0048:
            r3 = 0
            r8 = 0
            r0 = -1
            int r13 = r4.getResourceId(r3, r0)
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r13 == r0) goto L_0x0085
            java.lang.ThreadLocal r12 = A00
            java.lang.Object r0 = r12.get()
            android.util.TypedValue r0 = (android.util.TypedValue) r0
            if (r0 != 0) goto L_0x0066
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r12.set(r0)
        L_0x0066:
            r14 = 1
            r5.getValue(r13, r0, r2)
            int r12 = r0.type
            r0 = 28
            if (r12 < r0) goto L_0x0083
            r0 = 31
            if (r12 > r0) goto L_0x0083
        L_0x0074:
            if (r14 != 0) goto L_0x0085
            android.content.res.XmlResourceParser r0 = r5.getXml(r13)     // Catch:{ Exception -> 0x008a }
            android.content.res.ColorStateList r0 = A01(r6, r5, r0)     // Catch:{ Exception -> 0x008a }
            int r13 = r0.getDefaultColor()     // Catch:{ Exception -> 0x008a }
            goto L_0x008e
        L_0x0083:
            r14 = 0
            goto L_0x0074
        L_0x0085:
            int r13 = r4.getColor(r3, r1)
            goto L_0x008e
        L_0x008a:
            int r13 = r4.getColor(r3, r1)
        L_0x008e:
            r3 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            boolean r0 = r4.hasValue(r2)
            if (r0 != 0) goto L_0x009e
            r1 = 3
            boolean r0 = r4.hasValue(r1)
            if (r0 == 0) goto L_0x00a2
        L_0x009e:
            float r3 = r4.getFloat(r1, r3)
        L_0x00a2:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 < r0) goto L_0x00e9
            r1 = 2
            boolean r0 = r4.hasValue(r1)
            if (r0 == 0) goto L_0x00e9
        L_0x00b1:
            float r27 = r4.getFloat(r1, r2)
            r4.recycle()
            int r12 = r7.getAttributeCount()
            int[] r6 = new int[r12]
            r5 = 0
            r4 = 0
        L_0x00c0:
            if (r5 >= r12) goto L_0x00f2
            int r2 = r7.getAttributeNameResource(r5)
            r0 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r2 == r0) goto L_0x00e6
            r0 = 16843551(0x101031f, float:2.3695797E-38)
            if (r2 == r0) goto L_0x00e6
            r0 = 2130968632(0x7f040038, float:1.7545923E38)
            if (r2 == r0) goto L_0x00e6
            r0 = 2130969326(0x7f0402ee, float:1.754733E38)
            if (r2 == r0) goto L_0x00e6
            int r1 = r4 + 1
            boolean r0 = r7.getAttributeBooleanValue(r5, r8)
            if (r0 != 0) goto L_0x00e3
            int r2 = -r2
        L_0x00e3:
            r6[r4] = r2
            r4 = r1
        L_0x00e6:
            int r5 = r5 + 1
            goto L_0x00c0
        L_0x00e9:
            r1 = 4
            goto L_0x00b1
        L_0x00eb:
            r0 = 0
            android.content.res.TypedArray r4 = r6.obtainStyledAttributes(r7, r1, r0, r0)
            goto L_0x0048
        L_0x00f2:
            int[] r29 = android.util.StateSet.trimStateSet(r6, r4)
            r0 = 0
            int r0 = (r27 > r0 ? 1 : (r27 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0102
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r27 > r0 ? 1 : (r27 == r0 ? 0 : -1))
            r2 = 1
            if (r0 <= 0) goto L_0x0103
        L_0x0102:
            r2 = 0
        L_0x0103:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0144
            if (r2 != 0) goto L_0x0144
        L_0x010b:
            int r1 = r9 + 1
            int r0 = r10.length
            if (r1 <= r0) goto L_0x011d
            r1 = 4
            int r0 = r9 << 1
            if (r9 > r1) goto L_0x0117
            r0 = 8
        L_0x0117:
            int[] r0 = new int[r0]
            java.lang.System.arraycopy(r10, r8, r0, r8, r9)
            r10 = r0
        L_0x011d:
            r10[r9] = r13
            int r1 = r9 + 1
            int r0 = r11.length
            if (r1 <= r0) goto L_0x013d
            java.lang.Class r0 = r11.getClass()
            java.lang.Class r2 = r0.getComponentType()
            r1 = 4
            int r0 = r9 << 1
            if (r9 > r1) goto L_0x0133
            r0 = 8
        L_0x0133:
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r2, r0)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.System.arraycopy(r11, r8, r0, r8, r9)
            r11 = r0
        L_0x013d:
            r11[r9] = r29
            int r9 = r9 + 1
        L_0x0141:
            r2 = 1
            goto L_0x001a
        L_0x0144:
            int r0 = android.graphics.Color.alpha(r13)
            float r1 = (float) r0
            float r1 = r1 * r3
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r7 = (int) r1
            r0 = 255(0xff, float:3.57E-43)
            if (r7 >= r8) goto L_0x02ef
            r7 = 0
        L_0x0153:
            if (r2 == 0) goto L_0x0255
            X.0WA r0 = X.AnonymousClass0WA.A01(r13)
            float r2 = r0.A03
            float r0 = r0.A02
            r16 = r0
            r28 = r0
            X.0UH r12 = X.AnonymousClass0UH.A0A
            double r0 = (double) r0
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x029a
            int r0 = java.lang.Math.round(r27)
            double r0 = (double) r0
            r4 = 0
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x029a
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x029a
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0292
            r6 = 0
        L_0x0181:
            r14 = 0
            r26 = 0
            r25 = 1
        L_0x0186:
            float r0 = r26 - r28
            float r1 = java.lang.Math.abs(r0)
            r0 = 1053609165(0x3ecccccd, float:0.4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x028b
            r24 = 1148846080(0x447a0000, float:1000.0)
            r23 = 0
            r5 = 0
            r22 = 1148846080(0x447a0000, float:1000.0)
            r21 = 1120403456(0x42c80000, float:100.0)
            r20 = 0
        L_0x019e:
            float r0 = r20 - r21
            float r1 = java.lang.Math.abs(r0)
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x024b
            float r19 = r21 - r20
            r0 = 1073741824(0x40000000, float:2.0)
            float r19 = r19 / r0
            float r19 = r19 + r20
            r1 = r19
            r0 = r16
            X.0WA r0 = X.AnonymousClass0WA.A00(r1, r0, r6)
            int r18 = r0.A02(r12)
            int r0 = android.graphics.Color.red(r18)
            float r0 = X.C05860Th.A00(r0)
            int r1 = android.graphics.Color.green(r18)
            float r13 = X.C05860Th.A00(r1)
            int r1 = android.graphics.Color.blue(r18)
            float r4 = X.C05860Th.A00(r1)
            float[][] r1 = X.C05860Th.A02
            r3 = 1
            r2 = r1[r3]
            r1 = r2[r8]
            float r0 = r0 * r1
            r1 = r2[r3]
            float r13 = r13 * r1
            float r0 = r0 + r13
            r1 = 2
            r1 = r2[r1]
            float r4 = r4 * r1
            float r0 = r0 + r4
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 / r1
            r1 = 1007753895(0x3c111aa7, float:0.008856452)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x027d
            r1 = 1147261687(0x4461d2f7, float:903.2963)
            float r0 = r0 * r1
        L_0x01f6:
            float r1 = r27 - r0
            float r17 = java.lang.Math.abs(r1)
            r1 = 1045220557(0x3e4ccccd, float:0.2)
            int r1 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x0243
            X.0WA r13 = X.AnonymousClass0WA.A01(r18)
            float r2 = r13.A04
            float r1 = r13.A02
            X.0WA r1 = X.AnonymousClass0WA.A00(r2, r1, r6)
            float r4 = r13.A05
            float r2 = r1.A05
            float r4 = r4 - r2
            float r3 = r13.A00
            float r2 = r1.A00
            float r3 = r3 - r2
            float r2 = r13.A01
            float r1 = r1.A01
            float r2 = r2 - r1
            float r4 = r4 * r4
            float r3 = r3 * r3
            float r4 = r4 + r3
            float r2 = r2 * r2
            float r4 = r4 + r2
            double r1 = (double) r4
            double r3 = java.lang.Math.sqrt(r1)
            r1 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r1 = java.lang.Math.pow(r3, r1)
            r3 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            double r1 = r1 * r3
            float r3 = (float) r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0243
            r5 = r13
            r24 = r17
            r22 = r3
        L_0x0243:
            int r1 = (r24 > r23 ? 1 : (r24 == r23 ? 0 : -1))
            if (r1 != 0) goto L_0x0271
            int r1 = (r22 > r23 ? 1 : (r22 == r23 ? 0 : -1))
            if (r1 != 0) goto L_0x0271
        L_0x024b:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r25 == 0) goto L_0x0261
            if (r5 == 0) goto L_0x025e
            int r13 = r5.A02(r12)
        L_0x0255:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r13 = r13 & r0
            int r0 = r7 << 24
            r13 = r13 | r0
            goto L_0x010b
        L_0x025e:
            r25 = 0
            goto L_0x0265
        L_0x0261:
            if (r5 != 0) goto L_0x026d
            r28 = r16
        L_0x0265:
            float r16 = r28 - r26
            float r16 = r16 / r0
            float r16 = r16 + r26
            goto L_0x0186
        L_0x026d:
            r26 = r16
            r14 = r5
            goto L_0x0265
        L_0x0271:
            int r0 = (r0 > r27 ? 1 : (r0 == r27 ? 0 : -1))
            if (r0 >= 0) goto L_0x0279
            r20 = r19
            goto L_0x019e
        L_0x0279:
            r21 = r19
            goto L_0x019e
        L_0x027d:
            double r0 = (double) r0
            double r1 = java.lang.Math.cbrt(r0)
            float r0 = (float) r1
            r1 = 1122500608(0x42e80000, float:116.0)
            float r0 = r0 * r1
            r1 = 1098907648(0x41800000, float:16.0)
            float r0 = r0 - r1
            goto L_0x01f6
        L_0x028b:
            if (r14 == 0) goto L_0x029a
            int r13 = r14.A02(r12)
            goto L_0x0255
        L_0x0292:
            r0 = 1135869952(0x43b40000, float:360.0)
            float r6 = java.lang.Math.min(r0, r2)
            goto L_0x0181
        L_0x029a:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r27 > r0 ? 1 : (r27 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x02a3
            r13 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x0255
        L_0x02a3:
            r0 = 1120272384(0x42c60000, float:99.0)
            int r0 = (r27 > r0 ? 1 : (r27 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02ab
            r13 = -1
            goto L_0x0255
        L_0x02ab:
            r12 = 1098907648(0x41800000, float:16.0)
            float r6 = r27 + r12
            r5 = 1122500608(0x42e80000, float:116.0)
            float r6 = r6 / r5
            r4 = 1147261687(0x4461d2f7, float:903.2963)
            r3 = 1007753895(0x3c111aa7, float:0.008856452)
            r0 = 1090519040(0x41000000, float:8.0)
            r2 = 1
            int r0 = (r27 > r0 ? 1 : (r27 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02ec
            float r27 = r6 * r6
            float r27 = r27 * r6
        L_0x02c3:
            float r1 = r6 * r6
            float r1 = r1 * r6
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x02ce
            float r6 = r6 * r5
            float r6 = r6 - r12
            float r6 = r6 / r4
            r1 = r6
        L_0x02ce:
            float[] r6 = X.C05860Th.A00
            r0 = r6[r8]
            float r0 = r0 * r1
            double r4 = (double) r0
            r0 = r6[r2]
            float r27 = r27 * r0
            r0 = r27
            double r2 = (double) r0
            r0 = 2
            r0 = r6[r0]
            float r1 = r1 * r0
            double r0 = (double) r1
            r16 = r4
            r18 = r2
            r20 = r0
            int r13 = X.AnonymousClass090.A02(r16, r18, r20)
            goto L_0x0255
        L_0x02ec:
            float r27 = r27 / r4
            goto L_0x02c3
        L_0x02ef:
            if (r7 <= r0) goto L_0x0153
            r7 = 255(0xff, float:3.57E-43)
            goto L_0x0153
        L_0x02f5:
            int[] r2 = new int[r9]
            int[][] r1 = new int[r9][]
            r0 = 0
            java.lang.System.arraycopy(r10, r0, r2, r0, r9)
            java.lang.System.arraycopy(r11, r0, r1, r0, r9)
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
            r0.<init>(r1, r2)
            return r0
        L_0x0306:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r33.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = ": invalid color state list tag "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass08G.A00(android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, org.xmlpull.v1.XmlPullParser):android.content.res.ColorStateList");
    }

    public static ColorStateList A01(Resources.Theme theme, Resources resources, XmlPullParser xmlPullParser) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return A00(theme, resources, asAttributeSet, xmlPullParser);
            }
        } while (next != 1);
        throw new XmlPullParserException("No start tag found");
    }
}
