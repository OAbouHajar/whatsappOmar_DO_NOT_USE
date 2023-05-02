package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0Bg  reason: invalid class name and case insensitive filesystem */
public class C02350Bg extends MenuInflater {
    public static final Class[] A04;
    public static final Class[] A05;
    public Context A00;
    public Object A01;
    public final Object[] A02;
    public final Object[] A03;

    static {
        Class[] clsArr = {Context.class};
        A05 = clsArr;
        A04 = clsArr;
    }

    public C02350Bg(Context context) {
        super(context);
        this.A00 = context;
        Object[] A1a = AnonymousClass000.A1a(context);
        this.A03 = A1a;
        this.A02 = A1a;
    }

    public static Constructor A00(Context context, String str, Class[] clsArr) {
        Constructor<?> constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(clsArr);
        constructor.setAccessible(true);
        return constructor;
    }

    public static void A01(Object obj, int i2) {
        if (i2 < 2) {
            return;
        }
        if (obj instanceof C07290av) {
            C07290av r1 = (C07290av) obj;
            r1.A02 = (r1.A02 & -5) | 4;
        } else if (obj instanceof C02550Cv) {
            ((C02550Cv) obj).A01();
        }
    }

    public final Object A02(Object obj) {
        return ((obj instanceof Activity) || !(obj instanceof ContextWrapper)) ? obj : A02(((ContextWrapper) obj).getBaseContext());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04f8, code lost:
        r0 = "Unexpected end of document";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a3, code lost:
        if (r1 != null) goto L_0x01ce;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x039b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.util.AttributeSet r46, android.view.Menu r47, org.xmlpull.v1.XmlPullParser r48) {
        /*
            r45 = this;
            r1 = 0
            r41 = 0
            r11 = 0
            r40 = 0
            r33 = 0
            r32 = 0
            r17 = 0
            r9 = 0
            r35 = 0
            r39 = 0
            r37 = 0
            r31 = 0
            r26 = 0
            r10 = 0
            r34 = 0
            r8 = 0
            r7 = 0
            r30 = 0
            r29 = 0
            r6 = 0
            r36 = 0
            r21 = 0
            r38 = r1
            r5 = r1
            r25 = 0
            r24 = 0
            r23 = 0
            r22 = 0
            r27 = 1
            r28 = 1
            r44 = r48
            int r2 = r44.getEventType()
        L_0x003a:
            r4 = 2
            java.lang.String r20 = "menu"
            r3 = 1
            if (r2 != r4) goto L_0x04f2
            java.lang.String r2 = r44.getName()
            r0 = r20
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x04e7
            int r12 = r44.next()
            r43 = r1
            r19 = 0
            r18 = 0
        L_0x0056:
            if (r12 == r3) goto L_0x04f8
            java.lang.String r14 = "item"
            java.lang.String r13 = "group"
            r2 = r45
            if (r12 == r4) goto L_0x024e
            r0 = 3
            if (r12 != r0) goto L_0x0075
            java.lang.String r12 = r44.getName()
            if (r18 == 0) goto L_0x007c
            r0 = r43
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x007c
            r43 = r21
            r18 = 0
        L_0x0075:
            int r12 = r44.next()
            if (r19 == 0) goto L_0x0056
            return
        L_0x007c:
            boolean r0 = r12.equals(r13)
            if (r0 == 0) goto L_0x008f
            r25 = 0
            r24 = 0
            r23 = 0
            r22 = 0
            r27 = 1
            r28 = 1
            goto L_0x0075
        L_0x008f:
            boolean r0 = r12.equals(r14)
            if (r0 == 0) goto L_0x0242
            if (r40 != 0) goto L_0x0075
            if (r1 == 0) goto L_0x0116
            r0 = r1
            X.0EM r0 = (X.AnonymousClass0EM) r0
            android.view.ActionProvider r0 = r0.A00
            boolean r0 = r0.hasSubMenu()
            if (r0 == 0) goto L_0x0116
            r40 = 1
            r0 = r47
            r15 = r25
            r14 = r26
            r13 = r17
            r12 = r30
            android.view.SubMenu r0 = r0.addSubMenu(r15, r14, r13, r12)
            android.view.MenuItem r12 = r0.getItem()
            r0 = r35
            android.view.MenuItem r13 = r12.setChecked(r0)
            r0 = r36
            android.view.MenuItem r13 = r13.setVisible(r0)
            r0 = r37
            android.view.MenuItem r13 = r13.setEnabled(r0)
            r14 = 0
            r0 = 0
            if (r9 < r3) goto L_0x00cf
            r0 = 1
        L_0x00cf:
            android.view.MenuItem r13 = r13.setCheckable(r0)
            r0 = r29
            android.view.MenuItem r13 = r13.setTitleCondensed(r0)
            r0 = r31
            r13.setIcon(r0)
            if (r7 < 0) goto L_0x00e3
            r12.setShowAsAction(r7)
        L_0x00e3:
            if (r10 == 0) goto L_0x00ff
            android.content.Context r0 = r2.A00
            boolean r13 = r0.isRestricted()
            if (r13 != 0) goto L_0x04ff
            java.lang.Object r13 = r2.A01
            if (r13 != 0) goto L_0x00f7
            java.lang.Object r13 = r2.A02(r0)
            r2.A01 = r13
        L_0x00f7:
            X.0YY r0 = new X.0YY
            r0.<init>(r13, r10)
            r12.setOnMenuItemClickListener(r0)
        L_0x00ff:
            A01(r12, r9)
            if (r41 == 0) goto L_0x01c7
            java.lang.Class[] r14 = A05
            java.lang.Object[] r13 = r2.A03
            android.content.Context r2 = r2.A00     // Catch:{ Exception -> 0x01ae }
            r0 = r41
            java.lang.reflect.Constructor r0 = A00(r2, r0, r14)     // Catch:{ Exception -> 0x01ae }
            java.lang.Object r0 = r0.newInstance(r13)     // Catch:{ Exception -> 0x01ae }
            goto L_0x01c1
        L_0x0116:
            r40 = 1
            r0 = r47
            r15 = r25
            r14 = r26
            r13 = r17
            r12 = r30
            android.view.MenuItem r12 = r0.add(r15, r14, r13, r12)
            r0 = r35
            android.view.MenuItem r13 = r12.setChecked(r0)
            r0 = r36
            android.view.MenuItem r13 = r13.setVisible(r0)
            r0 = r37
            android.view.MenuItem r13 = r13.setEnabled(r0)
            r14 = 0
            r0 = 0
            if (r9 < r3) goto L_0x013d
            r0 = 1
        L_0x013d:
            android.view.MenuItem r13 = r13.setCheckable(r0)
            r0 = r29
            android.view.MenuItem r13 = r13.setTitleCondensed(r0)
            r0 = r31
            r13.setIcon(r0)
            if (r7 < 0) goto L_0x0151
            r12.setShowAsAction(r7)
        L_0x0151:
            if (r10 == 0) goto L_0x016d
            android.content.Context r0 = r2.A00
            boolean r13 = r0.isRestricted()
            if (r13 != 0) goto L_0x04ff
            java.lang.Object r13 = r2.A01
            if (r13 != 0) goto L_0x0165
            java.lang.Object r13 = r2.A02(r0)
            r2.A01 = r13
        L_0x0165:
            X.0YY r0 = new X.0YY
            r0.<init>(r13, r10)
            r12.setOnMenuItemClickListener(r0)
        L_0x016d:
            A01(r12, r9)
            if (r41 == 0) goto L_0x019c
            java.lang.Class[] r14 = A05
            java.lang.Object[] r13 = r2.A03
            android.content.Context r2 = r2.A00     // Catch:{ Exception -> 0x0183 }
            r0 = r41
            java.lang.reflect.Constructor r0 = A00(r2, r0, r14)     // Catch:{ Exception -> 0x0183 }
            java.lang.Object r0 = r0.newInstance(r13)     // Catch:{ Exception -> 0x0183 }
            goto L_0x0196
        L_0x0183:
            r13 = move-exception
            java.lang.String r0 = "Cannot instantiate class: "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            r0 = r41
            java.lang.String r2 = X.AnonymousClass000.A0h(r0, r2)
            java.lang.String r0 = "SupportMenuInflater"
            android.util.Log.w(r0, r2, r13)
            r0 = 0
        L_0x0196:
            android.view.View r0 = (android.view.View) r0
            r12.setActionView(r0)
            r14 = 1
        L_0x019c:
            if (r11 <= 0) goto L_0x01a3
            if (r14 != 0) goto L_0x01a6
            r12.setActionView(r11)
        L_0x01a3:
            if (r1 == 0) goto L_0x01d8
            goto L_0x01ce
        L_0x01a6:
            java.lang.String r2 = "SupportMenuInflater"
            java.lang.String r0 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified."
            android.util.Log.w(r2, r0)
            goto L_0x01a3
        L_0x01ae:
            r13 = move-exception
            java.lang.String r0 = "Cannot instantiate class: "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            r0 = r41
            java.lang.String r2 = X.AnonymousClass000.A0h(r0, r2)
            java.lang.String r0 = "SupportMenuInflater"
            android.util.Log.w(r0, r2, r13)
            r0 = 0
        L_0x01c1:
            android.view.View r0 = (android.view.View) r0
            r12.setActionView(r0)
            r14 = 1
        L_0x01c7:
            if (r11 <= 0) goto L_0x01ce
            if (r14 != 0) goto L_0x023a
            r12.setActionView(r11)
        L_0x01ce:
            boolean r0 = r12 instanceof X.AnonymousClass09J
            if (r0 == 0) goto L_0x0232
            r0 = r12
            X.09J r0 = (X.AnonymousClass09J) r0
            r0.Aen(r1)
        L_0x01d8:
            boolean r0 = r12 instanceof X.AnonymousClass09J
            r15 = r0
            if (r0 == 0) goto L_0x0211
            r13 = r12
            X.09J r13 = (X.AnonymousClass09J) r13
            r0 = r39
            r13.Adi(r0)
            r13.Aes(r6)
            r2 = r32
            r0 = r33
            r13.setAlphabeticShortcut(r2, r0)
            r0 = r34
            r13.setNumericShortcut(r8, r0)
        L_0x01f4:
            if (r5 == 0) goto L_0x01fe
            if (r15 == 0) goto L_0x0207
            r0 = r12
            X.09J r0 = (X.AnonymousClass09J) r0
            r0.setIconTintMode(r5)
        L_0x01fe:
            if (r38 == 0) goto L_0x0075
            r0 = r38
            X.C016207s.A00(r0, r12)
            goto L_0x0075
        L_0x0207:
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 < r0) goto L_0x01fe
            X.C06620Wz.A01(r5, r12)
            goto L_0x01fe
        L_0x0211:
            int r14 = android.os.Build.VERSION.SDK_INT
            r13 = 26
            if (r14 < r13) goto L_0x021c
            r0 = r39
            X.C06620Wz.A04(r12, r0)
        L_0x021c:
            if (r14 < r13) goto L_0x0221
            X.C06620Wz.A05(r12, r6)
        L_0x0221:
            if (r14 < r13) goto L_0x022a
            r2 = r32
            r0 = r33
            X.C06620Wz.A02(r12, r2, r0)
        L_0x022a:
            if (r14 < r13) goto L_0x01f4
            r0 = r34
            X.C06620Wz.A03(r12, r8, r0)
            goto L_0x01f4
        L_0x0232:
            java.lang.String r2 = "MenuItemCompat"
            java.lang.String r0 = "setActionProvider: item does not implement SupportMenuItem; ignoring"
            android.util.Log.w(r2, r0)
            goto L_0x01d8
        L_0x023a:
            java.lang.String r2 = "SupportMenuInflater"
            java.lang.String r0 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified."
            android.util.Log.w(r2, r0)
            goto L_0x01ce
        L_0x0242:
            r0 = r20
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0075
            r19 = 1
            goto L_0x0075
        L_0x024e:
            if (r18 != 0) goto L_0x0075
            java.lang.String r12 = r44.getName()
            boolean r0 = r12.equals(r13)
            if (r0 == 0) goto L_0x0285
            android.content.Context r12 = r2.A00
            int[] r2 = X.AnonymousClass05L.A0E
            r0 = r46
            android.content.res.TypedArray r12 = r12.obtainStyledAttributes(r0, r2)
            r2 = 0
            int r25 = r12.getResourceId(r3, r2)
            r0 = 3
            int r24 = r12.getInt(r0, r2)
            r0 = 4
            int r23 = r12.getInt(r0, r2)
            r0 = 5
            int r22 = r12.getInt(r0, r2)
            boolean r27 = r12.getBoolean(r4, r3)
            boolean r28 = r12.getBoolean(r2, r3)
            r12.recycle()
            goto L_0x0075
        L_0x0285:
            boolean r0 = r12.equals(r14)
            if (r0 == 0) goto L_0x039e
            android.content.Context r1 = r2.A00
            int[] r6 = X.AnonymousClass05L.A0F
            r0 = r46
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r0, r6)
            X.07T r13 = new X.07T
            r13.<init>(r1, r0)
            r6 = 0
            android.content.res.TypedArray r12 = r13.A02
            int r26 = r12.getResourceId(r4, r6)
            r7 = 5
            r0 = r24
            int r17 = r12.getInt(r7, r0)
            r7 = 6
            r0 = r23
            int r7 = r12.getInt(r7, r0)
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r17 = r17 & r0
            r0 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r0
            r17 = r17 | r7
            r0 = 7
            java.lang.CharSequence r30 = r12.getText(r0)
            r0 = 8
            java.lang.CharSequence r29 = r12.getText(r0)
            int r31 = r12.getResourceId(r6, r6)
            r0 = 9
            java.lang.String r0 = r12.getString(r0)
            if (r0 != 0) goto L_0x033b
            r32 = 0
        L_0x02d2:
            r0 = 16
            r7 = 4096(0x1000, float:5.74E-42)
            int r33 = r12.getInt(r0, r7)
            r0 = 10
            java.lang.String r0 = r12.getString(r0)
            if (r0 != 0) goto L_0x0336
            r8 = 0
        L_0x02e3:
            r0 = 20
            int r34 = r12.getInt(r0, r7)
            r0 = 11
            boolean r0 = r12.hasValue(r0)
            if (r0 == 0) goto L_0x0333
            r0 = 11
            boolean r9 = r12.getBoolean(r0, r6)
        L_0x02f7:
            r0 = 3
            boolean r35 = r12.getBoolean(r0, r6)
            r7 = 4
            r0 = r27
            boolean r36 = r12.getBoolean(r7, r0)
            r0 = r28
            boolean r37 = r12.getBoolean(r3, r0)
            r7 = 21
            r0 = -1
            int r7 = r12.getInt(r7, r0)
            r0 = 12
            java.lang.String r10 = r12.getString(r0)
            r0 = 13
            int r11 = r12.getResourceId(r0, r6)
            r0 = 15
            java.lang.String r41 = r12.getString(r0)
            r0 = 14
            java.lang.String r6 = r12.getString(r0)
            if (r6 == 0) goto L_0x0350
            if (r11 != 0) goto L_0x0349
            if (r41 != 0) goto L_0x0349
            java.lang.Class[] r0 = A04
            java.lang.Object[] r2 = r2.A02
            goto L_0x0340
        L_0x0333:
            r9 = r22
            goto L_0x02f7
        L_0x0336:
            char r8 = r0.charAt(r6)
            goto L_0x02e3
        L_0x033b:
            char r32 = r0.charAt(r6)
            goto L_0x02d2
        L_0x0340:
            java.lang.reflect.Constructor r0 = A00(r1, r6, r0)     // Catch:{ Exception -> 0x0353 }
            java.lang.Object r1 = r0.newInstance(r2)     // Catch:{ Exception -> 0x0353 }
            goto L_0x0364
        L_0x0349:
            java.lang.String r1 = "SupportMenuInflater"
            java.lang.String r0 = "Ignoring attribute 'actionProviderClass'. Action view already specified."
            android.util.Log.w(r1, r0)
        L_0x0350:
            r1 = r21
            goto L_0x0366
        L_0x0353:
            r2 = move-exception
            java.lang.String r0 = "Cannot instantiate class: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r1 = X.AnonymousClass000.A0h(r6, r0)
            java.lang.String r0 = "SupportMenuInflater"
            android.util.Log.w(r0, r1, r2)
            r1 = 0
        L_0x0364:
            X.0Nv r1 = (X.C04760Nv) r1
        L_0x0366:
            r0 = 17
            java.lang.CharSequence r39 = r12.getText(r0)
            r0 = 22
            java.lang.CharSequence r6 = r12.getText(r0)
            r0 = 19
            boolean r0 = r12.hasValue(r0)
            if (r0 == 0) goto L_0x039b
            r2 = 19
            r0 = -1
            int r0 = r12.getInt(r2, r0)
            android.graphics.PorterDuff$Mode r5 = X.C015307j.A00(r5, r0)
        L_0x0385:
            r2 = 18
            boolean r0 = r12.hasValue(r2)
            if (r0 == 0) goto L_0x0398
            android.content.res.ColorStateList r38 = r13.A01(r2)
        L_0x0391:
            r13.A04()
            r40 = 0
            goto L_0x0075
        L_0x0398:
            r38 = r21
            goto L_0x0391
        L_0x039b:
            r5 = r21
            goto L_0x0385
        L_0x039e:
            r0 = r20
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x04e1
            r40 = 1
            r0 = r47
            r15 = r25
            r14 = r26
            r13 = r17
            r12 = r30
            android.view.SubMenu r16 = r0.addSubMenu(r15, r14, r13, r12)
            android.view.MenuItem r12 = r16.getItem()
            r0 = r35
            android.view.MenuItem r13 = r12.setChecked(r0)
            r0 = r36
            android.view.MenuItem r13 = r13.setVisible(r0)
            r0 = r37
            android.view.MenuItem r13 = r13.setEnabled(r0)
            r15 = 0
            r0 = 0
            if (r9 < r3) goto L_0x03d1
            r0 = 1
        L_0x03d1:
            android.view.MenuItem r13 = r13.setCheckable(r0)
            r0 = r29
            android.view.MenuItem r13 = r13.setTitleCondensed(r0)
            r0 = r31
            r13.setIcon(r0)
            if (r7 < 0) goto L_0x03e5
            r12.setShowAsAction(r7)
        L_0x03e5:
            if (r10 == 0) goto L_0x0401
            android.content.Context r14 = r2.A00
            boolean r0 = r14.isRestricted()
            if (r0 != 0) goto L_0x04ff
            java.lang.Object r13 = r2.A01
            if (r13 != 0) goto L_0x03f9
            java.lang.Object r13 = r2.A02(r14)
            r2.A01 = r13
        L_0x03f9:
            X.0YY r0 = new X.0YY
            r0.<init>(r13, r10)
            r12.setOnMenuItemClickListener(r0)
        L_0x0401:
            A01(r12, r9)
            if (r41 == 0) goto L_0x0434
            java.lang.Class[] r15 = A05
            java.lang.Object[] r0 = r2.A03
            r42 = r0
            android.content.Context r14 = r2.A00     // Catch:{ Exception -> 0x041b }
            r13 = r41
            java.lang.reflect.Constructor r13 = A00(r14, r13, r15)     // Catch:{ Exception -> 0x041b }
            r0 = r42
            java.lang.Object r0 = r13.newInstance(r0)     // Catch:{ Exception -> 0x041b }
            goto L_0x042e
        L_0x041b:
            r15 = move-exception
            java.lang.String r0 = "Cannot instantiate class: "
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0r(r0)
            r0 = r41
            java.lang.String r14 = X.AnonymousClass000.A0h(r0, r13)
            java.lang.String r13 = "SupportMenuInflater"
            android.util.Log.w(r13, r14, r15)
            r0 = 0
        L_0x042e:
            android.view.View r0 = (android.view.View) r0
            r12.setActionView(r0)
            r15 = 1
        L_0x0434:
            if (r11 <= 0) goto L_0x043b
            if (r15 != 0) goto L_0x04d8
            r12.setActionView(r11)
        L_0x043b:
            if (r1 == 0) goto L_0x0447
            boolean r0 = r12 instanceof X.AnonymousClass09J
            if (r0 == 0) goto L_0x04cf
            r0 = r12
            X.09J r0 = (X.AnonymousClass09J) r0
            r0.Aen(r1)
        L_0x0447:
            boolean r0 = r12 instanceof X.AnonymousClass09J
            if (r0 == 0) goto L_0x04c3
            r13 = r12
            X.09J r13 = (X.AnonymousClass09J) r13
            r0 = r39
            r13.Adi(r0)
        L_0x0453:
            boolean r0 = r12 instanceof X.AnonymousClass09J
            if (r0 == 0) goto L_0x04b9
            r0 = r12
            X.09J r0 = (X.AnonymousClass09J) r0
            r0.Aes(r6)
        L_0x045d:
            boolean r0 = r12 instanceof X.AnonymousClass09J
            if (r0 == 0) goto L_0x04ab
            r14 = r12
            X.09J r14 = (X.AnonymousClass09J) r14
            r13 = r32
            r0 = r33
            r14.setAlphabeticShortcut(r13, r0)
        L_0x046b:
            boolean r0 = r12 instanceof X.AnonymousClass09J
            if (r0 == 0) goto L_0x049f
            r13 = r12
            X.09J r13 = (X.AnonymousClass09J) r13
            r0 = r34
            r13.setNumericShortcut(r8, r0)
        L_0x0477:
            if (r5 == 0) goto L_0x0483
            boolean r0 = r12 instanceof X.AnonymousClass09J
            if (r0 == 0) goto L_0x0495
            r0 = r12
            X.09J r0 = (X.AnonymousClass09J) r0
            r0.setIconTintMode(r5)
        L_0x0483:
            if (r38 == 0) goto L_0x048a
            r0 = r38
            X.C016207s.A00(r0, r12)
        L_0x048a:
            r13 = r46
            r12 = r16
            r0 = r44
            r2.A03(r13, r12, r0)
            goto L_0x0075
        L_0x0495:
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r13 < r0) goto L_0x0483
            X.C06620Wz.A01(r5, r12)
            goto L_0x0483
        L_0x049f:
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r13 < r0) goto L_0x0477
            r0 = r34
            X.C06620Wz.A03(r12, r8, r0)
            goto L_0x0477
        L_0x04ab:
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r13 < r0) goto L_0x046b
            r13 = r32
            r0 = r33
            X.C06620Wz.A02(r12, r13, r0)
            goto L_0x046b
        L_0x04b9:
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r13 < r0) goto L_0x045d
            X.C06620Wz.A05(r12, r6)
            goto L_0x045d
        L_0x04c3:
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r13 < r0) goto L_0x0453
            r0 = r39
            X.C06620Wz.A04(r12, r0)
            goto L_0x0453
        L_0x04cf:
            java.lang.String r13 = "MenuItemCompat"
            java.lang.String r0 = "setActionProvider: item does not implement SupportMenuItem; ignoring"
            android.util.Log.w(r13, r0)
            goto L_0x0447
        L_0x04d8:
            java.lang.String r13 = "SupportMenuInflater"
            java.lang.String r0 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified."
            android.util.Log.w(r13, r0)
            goto L_0x043b
        L_0x04e1:
            r43 = r12
            r18 = 1
            goto L_0x0075
        L_0x04e7:
            java.lang.String r0 = "Expecting menu, got "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r0)
            goto L_0x04fa
        L_0x04f2:
            int r2 = r44.next()
            if (r2 != r3) goto L_0x003a
        L_0x04f8:
            java.lang.String r0 = "Unexpected end of document"
        L_0x04fa:
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)
            throw r0
        L_0x04ff:
            java.lang.String r0 = "The android:onClick attribute cannot be used within a restricted context"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02350Bg.A03(android.util.AttributeSet, android.view.Menu, org.xmlpull.v1.XmlPullParser):void");
    }

    public void inflate(int i2, Menu menu) {
        InflateException inflateException;
        if (!(menu instanceof C016707x)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser layout = this.A00.getResources().getLayout(i2);
            A03(Xml.asAttributeSet(layout), menu, layout);
            if (layout != null) {
                layout.close();
                return;
            }
            return;
        } catch (XmlPullParserException e2) {
            inflateException = new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            inflateException = new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
        throw inflateException;
    }
}
