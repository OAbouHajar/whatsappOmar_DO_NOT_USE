package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.0Cp  reason: invalid class name */
public class AnonymousClass0Cp extends AnonymousClass0Cq implements AnonymousClass07X {
    public int A00 = -1;
    public int A01 = -1;
    public C02540Co A02;
    public AnonymousClass0Rj A03;
    public boolean A04;

    public AnonymousClass0Cp(Resources resources, C02540Co r3) {
        super((AnonymousClass0Cm) null);
        A04(new C02540Co(resources, r3, this));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0231, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(X.AnonymousClass000.A0h(": <transition> tag requires 'fromId' & 'toId' attributes", r1));
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0Cp A00(android.content.Context r23, android.content.res.Resources.Theme r24, android.content.res.Resources r25, android.util.AttributeSet r26, org.xmlpull.v1.XmlPullParser r27) {
        /*
            r10 = r27
            java.lang.String r2 = r10.getName()
            java.lang.String r0 = "animated-selector"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024f
            r0 = 0
            X.0Cp r9 = new X.0Cp
            r9.<init>(r0, r0)
            int[] r0 = X.AnonymousClass0NG.A00
            r13 = r24
            r12 = r25
            r11 = r26
            android.content.res.TypedArray r2 = X.C014907d.A01(r13, r12, r11, r0)
            r0 = 1
            r8 = 1
            boolean r0 = r2.getBoolean(r0, r0)
            r9.setVisible(r0, r8)
            X.0Co r3 = r9.A02
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x003a
            int r1 = r3.A00
            int r0 = r2.getChangingConfigurations()
            r1 = r1 | r0
            r3.A00 = r1
        L_0x003a:
            r1 = 2
            boolean r0 = r3.A0W
            boolean r0 = r2.getBoolean(r1, r0)
            r3.A0W = r0
            r1 = 3
            boolean r0 = r3.A0P
            boolean r0 = r2.getBoolean(r1, r0)
            r3.A0P = r0
            r1 = 4
            int r0 = r3.A07
            int r0 = r2.getInt(r1, r0)
            r3.A07 = r0
            r1 = 5
            int r0 = r3.A08
            int r0 = r2.getInt(r1, r0)
            r3.A08 = r0
            r1 = 0
            boolean r0 = r3.A0Q
            boolean r0 = r2.getBoolean(r1, r0)
            r9.setDither(r0)
            X.0AX r0 = r9.A08
            r0.A06(r12)
            r2.recycle()
            int r0 = r10.getDepth()
            int r21 = r0 + 1
        L_0x0076:
            int r2 = r10.next()
            if (r2 == r8) goto L_0x0247
            int r1 = r10.getDepth()
            r0 = r21
            if (r1 >= r0) goto L_0x0087
            r0 = 3
            if (r2 == r0) goto L_0x0247
        L_0x0087:
            r7 = 2
            if (r2 != r7) goto L_0x0076
            r0 = r21
            if (r1 > r0) goto L_0x0076
            java.lang.String r1 = r10.getName()
            java.lang.String r0 = "item"
            boolean r0 = r1.equals(r0)
            r5 = r23
            if (r0 == 0) goto L_0x0142
            int[] r0 = X.AnonymousClass0NG.A01
            android.content.res.TypedArray r1 = X.C014907d.A01(r13, r12, r11, r0)
            r0 = 0
            int r16 = r1.getResourceId(r0, r0)
            r0 = -1
            int r0 = r1.getResourceId(r8, r0)
            if (r0 <= 0) goto L_0x013f
            android.graphics.drawable.Drawable r5 = X.AnonymousClass06L.A01(r5, r0)
        L_0x00b2:
            r1.recycle()
            int r15 = r11.getAttributeCount()
            int[] r14 = new int[r15]
            r6 = 0
            r4 = 0
            r3 = 0
        L_0x00be:
            if (r4 >= r15) goto L_0x00df
            int r2 = r11.getAttributeNameResource(r4)
            if (r2 == 0) goto L_0x00dc
            r0 = 16842960(0x10100d0, float:2.369414E-38)
            if (r2 == r0) goto L_0x00dc
            r0 = 16843161(0x1010199, float:2.3694704E-38)
            if (r2 == r0) goto L_0x00dc
            int r1 = r3 + 1
            boolean r0 = r11.getAttributeBooleanValue(r4, r6)
            if (r0 != 0) goto L_0x00d9
            int r2 = -r2
        L_0x00d9:
            r14[r3] = r2
            r3 = r1
        L_0x00dc:
            int r4 = r4 + 1
            goto L_0x00be
        L_0x00df:
            int[] r3 = android.util.StateSet.trimStateSet(r14, r3)
            java.lang.String r2 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r5 != 0) goto L_0x0104
        L_0x00e7:
            int r1 = r10.next()
            r0 = 4
            if (r1 == r0) goto L_0x00e7
            if (r1 != r7) goto L_0x0206
            java.lang.String r1 = r10.getName()
            java.lang.String r0 = "vector"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0119
            X.07V r5 = new X.07V
            r5.<init>()
            r5.inflate(r12, r10, r11, r13)
        L_0x0104:
            X.0Co r1 = r9.A02
            int r2 = r1.A00(r5)
            int[][] r0 = r1.A00
            r0[r2] = r3
            X.07U r1 = r1.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            r1.A03(r2, r0)
            goto L_0x0076
        L_0x0119:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x013a
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromXmlInner(r12, r10, r11, r13)
        L_0x0123:
            if (r5 != 0) goto L_0x0104
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = r10.getPositionDescription()
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x013a:
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromXmlInner(r12, r10, r11)
            goto L_0x0123
        L_0x013f:
            r5 = 0
            goto L_0x00b2
        L_0x0142:
            java.lang.String r1 = r10.getName()
            java.lang.String r0 = "transition"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0076
            int[] r0 = X.AnonymousClass0NG.A02
            android.content.res.TypedArray r2 = X.C014907d.A01(r13, r12, r11, r0)
            r4 = -1
            int r3 = r2.getResourceId(r7, r4)
            int r6 = r2.getResourceId(r8, r4)
            r14 = 0
            int r0 = r2.getResourceId(r14, r4)
            if (r0 <= 0) goto L_0x0203
            android.graphics.drawable.Drawable r1 = X.AnonymousClass06L.A01(r5, r0)
        L_0x0168:
            r0 = 3
            boolean r20 = r2.getBoolean(r0, r14)
            r2.recycle()
            java.lang.String r2 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r1 != 0) goto L_0x0191
        L_0x0174:
            int r1 = r10.next()
            r0 = 4
            if (r1 == r0) goto L_0x0174
            if (r1 != r7) goto L_0x0232
            java.lang.String r1 = r10.getName()
            java.lang.String r0 = "animated-vector"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01dd
            X.07z r1 = new X.07z
            r1.<init>(r5)
            r1.inflate(r12, r10, r11, r13)
        L_0x0191:
            if (r3 == r4) goto L_0x021b
            if (r6 == r4) goto L_0x021b
            X.0Co r0 = r9.A02
            r22 = r0
            int r1 = r0.A00(r1)
            long r4 = (long) r3
            r0 = 32
            long r2 = r4 << r0
            long r6 = (long) r6
            long r18 = r6 | r2
            if (r20 == 0) goto L_0x01da
            r16 = 8589934592(0x200000000, double:4.243991582E-314)
        L_0x01ac:
            r0 = r22
            X.03G r0 = r0.A00
            r14 = r0
            long r2 = (long) r1
            long r0 = r2 | r16
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r15 = r14
            r14 = r0
            r0 = r18
            r15.A08(r0, r14)
            if (r20 == 0) goto L_0x0076
            r0 = 32
            long r6 = r6 << r0
            long r4 = r4 | r6
            r0 = r22
            X.03G r6 = r0.A00
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 | r2
            long r0 = r0 | r16
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A08(r4, r0)
            goto L_0x0076
        L_0x01da:
            r16 = 0
            goto L_0x01ac
        L_0x01dd:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x01fe
            android.graphics.drawable.Drawable r1 = android.graphics.drawable.Drawable.createFromXmlInner(r12, r10, r11, r13)
        L_0x01e7:
            if (r1 != 0) goto L_0x0191
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = r10.getPositionDescription()
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x01fe:
            android.graphics.drawable.Drawable r1 = android.graphics.drawable.Drawable.createFromXmlInner(r12, r10, r11)
            goto L_0x01e7
        L_0x0203:
            r1 = 0
            goto L_0x0168
        L_0x0206:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = r10.getPositionDescription()
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x021b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = r10.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0232:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = r10.getPositionDescription()
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0247:
            int[] r0 = r9.getState()
            r9.onStateChange(r0)
            return r9
        L_0x024f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = r10.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = ": invalid animated-selector tag "
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Cp.A00(android.content.Context, android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, org.xmlpull.v1.XmlPullParser):X.0Cp");
    }

    public /* bridge */ /* synthetic */ AnonymousClass0AX A03() {
        return new C02540Co((Resources) null, this.A02, this);
    }

    public void A04(AnonymousClass0AX r2) {
        super.A04(r2);
        if (r2 instanceof C02540Co) {
            this.A02 = (C02540Co) r2;
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass0Cm A05() {
        return new C02540Co((Resources) null, this.A02, this);
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AnonymousClass0Rj r0 = this.A03;
        if (r0 != null) {
            r0.A02();
            this.A03 = null;
            A02(this.A01);
            this.A01 = -1;
            this.A00 = -1;
        }
    }

    public Drawable mutate() {
        if (!this.A04) {
            super.mutate();
            if (this == this) {
                this.A02.A04();
                this.A04 = true;
            }
        }
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0105, code lost:
        if (A02(r6) != false) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStateChange(int[] r15) {
        /*
            r14 = this;
            X.0Co r0 = r14.A02
            int r6 = r0.A09(r15)
            int r5 = r14.A01
            if (r6 == r5) goto L_0x0109
            X.0Rj r1 = r14.A03
            if (r1 == 0) goto L_0x0033
            int r5 = r14.A01
            if (r6 == r5) goto L_0x0025
            int r0 = r14.A00
            if (r6 != r0) goto L_0x0030
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x0030
            r1.A00()
            int r0 = r14.A00
            r14.A01 = r0
            r14.A00 = r6
        L_0x0025:
            r1 = 1
        L_0x0026:
            android.graphics.drawable.Drawable r0 = r14.A05
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.setState(r15)
            r1 = r1 | r0
        L_0x002f:
            return r1
        L_0x0030:
            r1.A02()
        L_0x0033:
            r0 = 0
            r14.A03 = r0
            r0 = -1
            r14.A00 = r0
            r14.A01 = r0
            X.0Co r4 = r14.A02
            r7 = 0
            if (r5 < 0) goto L_0x005d
            X.07U r3 = r4.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            int[] r1 = r3.A01
            int r0 = r3.A00
            int r1 = X.AnonymousClass00R.A00(r1, r0, r5)
            if (r1 < 0) goto L_0x0059
            java.lang.Object[] r0 = r3.A02
            r1 = r0[r1]
            java.lang.Object r0 = X.AnonymousClass07U.A03
            if (r1 == r0) goto L_0x0059
            r2 = r1
        L_0x0059:
            int r7 = X.AnonymousClass000.A0D(r2)
        L_0x005d:
            r0 = 0
            if (r6 < 0) goto L_0x0101
            X.07U r3 = r4.A01
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int[] r1 = r3.A01
            int r0 = r3.A00
            int r1 = X.AnonymousClass00R.A00(r1, r0, r6)
            if (r1 < 0) goto L_0x0079
            java.lang.Object[] r0 = r3.A02
            r1 = r0[r1]
            java.lang.Object r0 = X.AnonymousClass07U.A03
            if (r1 == r0) goto L_0x0079
            r2 = r1
        L_0x0079:
            int r3 = X.AnonymousClass000.A0D(r2)
            if (r3 == 0) goto L_0x0101
            if (r7 == 0) goto L_0x0101
            long r0 = (long) r7
            r2 = 32
            long r0 = r0 << r2
            long r2 = (long) r3
            long r2 = r2 | r0
            X.03G r7 = r4.A00
            r0 = -1
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r7.A04(r2, r9)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            int r7 = (int) r0
            if (r7 < 0) goto L_0x0101
            X.03G r0 = r4.A00
            java.lang.Object r0 = r0.A04(r2, r9)
            java.lang.Number r0 = (java.lang.Number) r0
            long r12 = r0.longValue()
            r0 = 8589934592(0x200000000, double:4.243991582E-314)
            long r12 = r12 & r0
            r10 = 0
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            boolean r8 = X.AnonymousClass000.A1O(r0)
            r14.A02(r7)
            android.graphics.drawable.Drawable r7 = r14.A05
            boolean r0 = r7 instanceof android.graphics.drawable.AnimationDrawable
            if (r0 == 0) goto L_0x00e9
            X.03G r0 = r4.A00
            java.lang.Object r0 = r0.A04(r2, r9)
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            long r2 = r2 & r0
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r0)
            android.graphics.drawable.AnimationDrawable r7 = (android.graphics.drawable.AnimationDrawable) r7
            X.0Cl r0 = new X.0Cl
            r0.<init>(r7, r1, r8)
        L_0x00de:
            r0.A01()
            r14.A03 = r0
            r14.A00 = r5
            r14.A01 = r6
            goto L_0x0025
        L_0x00e9:
            boolean r0 = r7 instanceof X.C016907z
            if (r0 == 0) goto L_0x00f5
            X.07z r7 = (X.C016907z) r7
            X.0Ck r0 = new X.0Ck
            r0.<init>(r7)
            goto L_0x00de
        L_0x00f5:
            boolean r0 = r7 instanceof android.graphics.drawable.Animatable
            if (r0 == 0) goto L_0x0101
            android.graphics.drawable.Animatable r7 = (android.graphics.drawable.Animatable) r7
            X.0Cj r0 = new X.0Cj
            r0.<init>(r7)
            goto L_0x00de
        L_0x0101:
            boolean r0 = r14.A02(r6)
            if (r0 == 0) goto L_0x0109
            goto L_0x0025
        L_0x0109:
            r1 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Cp.onStateChange(int[]):boolean");
    }

    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        AnonymousClass0Rj r0 = this.A03;
        if (r0 != null && (visible || z3)) {
            if (z2) {
                r0.A01();
            } else {
                jumpToCurrentState();
                return visible;
            }
        }
        return visible;
    }
}
