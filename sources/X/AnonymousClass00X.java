package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.00X  reason: invalid class name */
public final class AnonymousClass00X {
    public static final Object A00 = new Object();
    public static final ThreadLocal A01 = new ThreadLocal();
    public static final WeakHashMap A02 = new WeakHashMap(0);

    public static int A00(Resources.Theme theme, Resources resources, int i2) {
        return Build.VERSION.SDK_INT >= 23 ? AnonymousClass0SZ.A00(theme, resources, i2) : resources.getColor(i2);
    }

    public static ColorStateList A01(Resources.Theme theme, Resources resources, int i2) {
        WeakHashMap weakHashMap;
        ColorStateList colorStateList;
        AnonymousClass09R r5;
        Resources.Theme theme2;
        AnonymousClass08H r4 = new AnonymousClass08H(theme, resources);
        Object obj = A00;
        synchronized (obj) {
            weakHashMap = A02;
            SparseArray sparseArray = (SparseArray) weakHashMap.get(r4);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (r5 = (AnonymousClass09R) sparseArray.get(i2)) == null)) {
                if (!r5.A02.equals(r4.A01.getConfiguration()) || (!((theme2 = r4.A00) == null && r5.A00 == 0) && (theme2 == null || r5.A00 != theme2.hashCode()))) {
                    sparseArray.remove(i2);
                } else {
                    colorStateList = r5.A01;
                }
            }
            colorStateList = null;
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = A01;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z2 = true;
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            z2 = false;
        }
        ColorStateList colorStateList2 = null;
        if (!z2) {
            try {
                colorStateList2 = AnonymousClass08G.A01(theme, resources, resources.getXml(i2));
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList2 == null) {
            return Build.VERSION.SDK_INT >= 23 ? AnonymousClass0SZ.A01(theme, resources, i2) : resources.getColorStateList(i2);
        }
        synchronized (obj) {
            SparseArray sparseArray2 = (SparseArray) weakHashMap.get(r4);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                weakHashMap.put(r4, sparseArray2);
            }
            sparseArray2.append(i2, new AnonymousClass09R(colorStateList2, r4.A01.getConfiguration(), theme));
        }
        return colorStateList2;
    }

    public static Typeface A02(Context context) {
        return Typeface.createFromAsset(context.getAssets(), "fonts/TextAppearance.ttf");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0347, code lost:
        if (r6 != null) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01de, code lost:
        if (r31 == null) goto L_0x01e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x004d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0273 A[Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01e3 A[Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01e6 A[Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0201 A[Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface A03(android.content.Context r29, android.util.TypedValue r30, X.C017508g r31, int r32, int r33, boolean r34) {
        /*
            r21 = 0
            android.content.res.Resources r3 = r29.getResources()
            r7 = 1
            r8 = r30
            r10 = r32
            r3.getValue(r10, r8, r7)
            java.lang.String r20 = "ResourcesCompat"
            java.lang.CharSequence r0 = r8.string
            if (r0 == 0) goto L_0x0394
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r2.startsWith(r0)
            r5 = r31
            if (r0 == 0) goto L_0x038b
            int r0 = r8.assetCookie
            X.03L r19 = X.AnonymousClass08N.A00
            r4 = r33
            java.lang.String r1 = X.AnonymousClass08N.A01(r3, r2, r10, r0, r4)
            r0 = r19
            java.lang.Object r6 = r0.A02(r1)
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            if (r6 == 0) goto L_0x006c
            if (r31 == 0) goto L_0x0049
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            X.0g5 r0 = new X.0g5
            r0.<init>(r6, r5)
            r1.post(r0)
        L_0x0049:
            r21 = r6
        L_0x004b:
            if (r21 != 0) goto L_0x0393
            if (r31 != 0) goto L_0x0393
            java.lang.String r0 = "Font resource ID #0x"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r10)
            r1.append(r0)
            java.lang.String r0 = " could not be retrieved."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            r0.<init>(r1)
            throw r0
        L_0x006c:
            java.lang.String r1 = r2.toLowerCase()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            java.lang.String r0 = ".xml"
            boolean r0 = r1.endsWith(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r0 == 0) goto L_0x032d
            android.content.res.XmlResourceParser r18 = r3.getXml(r10)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
        L_0x007c:
            int r0 = r18.next()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r6 = 2
            if (r0 == r6) goto L_0x0087
            if (r0 != r7) goto L_0x007c
            goto L_0x02ec
        L_0x0087:
            r9 = 0
            java.lang.String r1 = "font-family"
            r0 = r18
            r0.require(r6, r9, r1)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            java.lang.String r0 = r18.getName()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r0 == 0) goto L_0x0194
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            int[] r0 = X.C017908k.A01     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            android.content.res.TypedArray r14 = r3.obtainAttributes(r1, r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r0 = 0
            java.lang.String r13 = r14.getString(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r0 = 4
            java.lang.String r12 = r14.getString(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r0 = 5
            java.lang.String r11 = r14.getString(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r1 = 0
            int r17 = r14.getResourceId(r7, r1)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            int r16 = r14.getInteger(r6, r7)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r9 = 3
            r0 = 500(0x1f4, float:7.0E-43)
            int r15 = r14.getInteger(r9, r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r0 = 6
            java.lang.String r0 = r14.getString(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r14.recycle()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r13 == 0) goto L_0x00ee
            if (r12 == 0) goto L_0x00ee
            if (r11 == 0) goto L_0x00ee
        L_0x00d0:
            int r1 = r18.next()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r1 == r9) goto L_0x00da
            A05(r18)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            goto L_0x00d0
        L_0x00da:
            r1 = r17
            java.util.List r1 = X.AnonymousClass0LS.A00(r3, r1)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            X.0Pn r6 = new X.0Pn     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r6.<init>(r13, r12, r11, r1)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            X.0Oc r9 = new X.0Oc     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r1 = r16
            r9.<init>(r6, r0, r1, r15)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            goto L_0x0199
        L_0x00ee:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r11.<init>()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
        L_0x00f3:
            int r9 = r18.next()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r0 = 3
            if (r9 == r0) goto L_0x017f
            int r0 = r18.getEventType()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r0 != r6) goto L_0x00f3
            java.lang.String r9 = r18.getName()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            java.lang.String r0 = "font"
            boolean r0 = r9.equals(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r0 == 0) goto L_0x017a
            android.util.AttributeSet r9 = android.util.Xml.asAttributeSet(r18)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            int[] r0 = X.C017908k.A02     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            android.content.res.TypedArray r0 = r3.obtainAttributes(r9, r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r12 = 8
            boolean r9 = r0.hasValue(r12)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r9 != 0) goto L_0x011f
            r12 = 1
        L_0x011f:
            r9 = 400(0x190, float:5.6E-43)
            int r25 = r0.getInt(r12, r9)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r12 = 6
            boolean r9 = r0.hasValue(r12)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r9 != 0) goto L_0x012d
            r12 = 2
        L_0x012d:
            int r9 = r0.getInt(r12, r1)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r28 = 0
            if (r7 != r9) goto L_0x0137
            r28 = 1
        L_0x0137:
            r9 = 9
            boolean r12 = r0.hasValue(r9)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r12 != 0) goto L_0x0140
            r9 = 3
        L_0x0140:
            r12 = 7
            boolean r13 = r0.hasValue(r12)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r13 != 0) goto L_0x0148
            r12 = 4
        L_0x0148:
            java.lang.String r24 = r0.getString(r12)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            int r26 = r0.getInt(r9, r1)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r9 = 5
            boolean r12 = r0.hasValue(r9)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r12 != 0) goto L_0x0158
            r9 = 0
        L_0x0158:
            int r27 = r0.getResourceId(r9, r1)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            java.lang.String r23 = r0.getString(r9)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r0.recycle()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
        L_0x0163:
            int r9 = r18.next()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r0 = 3
            if (r9 == r0) goto L_0x016e
            A05(r18)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            goto L_0x0163
        L_0x016e:
            X.0P0 r0 = new X.0P0     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r22 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r11.add(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            goto L_0x00f3
        L_0x017a:
            A05(r18)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            goto L_0x00f3
        L_0x017f:
            boolean r0 = r11.isEmpty()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r0 == 0) goto L_0x0186
            goto L_0x0198
        L_0x0186:
            X.0P0[] r0 = new X.AnonymousClass0P0[r1]     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            java.lang.Object[] r0 = r11.toArray(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            X.0P0[] r0 = (X.AnonymousClass0P0[]) r0     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            X.0NO r9 = new X.0NO     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r9.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            goto L_0x0199
        L_0x0194:
            A05(r18)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            goto L_0x0199
        L_0x0198:
            r9 = 0
        L_0x0199:
            if (r9 != 0) goto L_0x01aa
            java.lang.String r1 = "Failed to find font-family tag"
            r0 = r20
            android.util.Log.e(r0, r1)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r31 == 0) goto L_0x004b
            r0 = -3
            r5.A00(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            goto L_0x004b
        L_0x01aa:
            int r7 = r8.assetCookie     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            boolean r0 = r9 instanceof X.C04830Oc     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r0 == 0) goto L_0x02fd
            X.0Oc r9 = (X.C04830Oc) r9     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            java.lang.String r1 = r9.A03     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r6 = 0
            if (r1 == 0) goto L_0x01d1
            boolean r0 = r1.isEmpty()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r0 != 0) goto L_0x01d1
            r8 = 0
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r8)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r8)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r1 == 0) goto L_0x01d1
            boolean r0 = r1.equals(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r0 != 0) goto L_0x01d1
            r6 = r1
        L_0x01d1:
            if (r6 == 0) goto L_0x01d7
            if (r31 == 0) goto L_0x0049
            goto L_0x0349
        L_0x01d7:
            if (r34 == 0) goto L_0x01de
            int r0 = r9.A00     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r0 != 0) goto L_0x01e4
            goto L_0x01e0
        L_0x01de:
            if (r31 != 0) goto L_0x01e4
        L_0x01e0:
            r6 = 1
        L_0x01e1:
            if (r34 == 0) goto L_0x01e6
            goto L_0x01e8
        L_0x01e4:
            r6 = 0
            goto L_0x01e1
        L_0x01e6:
            r11 = -1
            goto L_0x01ea
        L_0x01e8:
            int r11 = r9.A01     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
        L_0x01ea:
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            android.os.Handler r1 = new android.os.Handler     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            X.0NP r0 = new X.0NP     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r0.<init>(r5)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            X.0Pn r8 = r9.A02     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            X.0PP r12 = new X.0PP     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r12.<init>(r1, r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r6 == 0) goto L_0x0273
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            java.lang.String r0 = r8.A00     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            java.lang.String r0 = "-"
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r1.append(r4)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            java.lang.String r9 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            X.03L r0 = X.AnonymousClass0Vv.A00     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            java.lang.Object r6 = r0.A02(r9)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r6 != 0) goto L_0x02f4
            r0 = -1
            if (r11 != r0) goto L_0x0231
            r0 = r29
            X.0Ts r0 = X.AnonymousClass0Vv.A00(r0, r8, r9, r4)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r12.A00(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            android.graphics.Typeface r6 = r0.A01     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            goto L_0x030e
        L_0x0231:
            r18 = 0
            com.facebook.redex.IDxCallableShape1S1201000_I0 r1 = new com.facebook.redex.IDxCallableShape1S1201000_I0     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r13 = r1
            r14 = r29
            r15 = r8
            r16 = r9
            r17 = r4
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            java.util.concurrent.ExecutorService r0 = X.AnonymousClass0Vv.A03     // Catch:{ InterruptedException -> 0x0267 }
            java.util.concurrent.Future r8 = r0.submit(r1)     // Catch:{ InterruptedException -> 0x0267 }
            long r0 = (long) r11     // Catch:{ InterruptedException -> 0x0267 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x0260, InterruptedException -> 0x0256, TimeoutException -> 0x0258 }
            java.lang.Object r0 = r8.get(r0, r6)     // Catch:{ ExecutionException -> 0x0260, InterruptedException -> 0x0256, TimeoutException -> 0x0258 }
            X.0Ts r0 = (X.C05970Ts) r0     // Catch:{ InterruptedException -> 0x0267 }
            r12.A00(r0)     // Catch:{ InterruptedException -> 0x0267 }
            android.graphics.Typeface r6 = r0.A01     // Catch:{ InterruptedException -> 0x0267 }
            goto L_0x030e
        L_0x0256:
            r1 = move-exception
            goto L_0x025f
        L_0x0258:
            java.lang.String r0 = "timeout"
            java.lang.InterruptedException r1 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x0267 }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x0267 }
        L_0x025f:
            throw r1     // Catch:{ InterruptedException -> 0x0267 }
        L_0x0260:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x0267 }
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x0267 }
            throw r0     // Catch:{ InterruptedException -> 0x0267 }
        L_0x0267:
            r1 = -3
            X.0Ts r0 = new X.0Ts     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r0.<init>((int) r1)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r12.A00(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r6 = 0
            goto L_0x030e
        L_0x0273:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            java.lang.String r0 = r8.A00     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            java.lang.String r0 = "-"
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r1.append(r4)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            X.03L r0 = X.AnonymousClass0Vv.A00     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            java.lang.Object r6 = r0.A02(r11)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r6 != 0) goto L_0x02f4
            X.0az r9 = new X.0az     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r9.<init>(r12)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            java.lang.Object r6 = X.AnonymousClass0Vv.A02     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            monitor-enter(r6)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            X.00O r1 = X.AnonymousClass0Vv.A01     // Catch:{ all -> 0x02e9 }
            java.lang.Object r0 = r1.get(r11)     // Catch:{ all -> 0x02e9 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x02e9 }
            if (r0 == 0) goto L_0x02aa
            r0.add(r9)     // Catch:{ all -> 0x02e9 }
            monitor-exit(r6)     // Catch:{ all -> 0x02e9 }
            goto L_0x030c
        L_0x02aa:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x02e9 }
            r0.<init>()     // Catch:{ all -> 0x02e9 }
            r0.add(r9)     // Catch:{ all -> 0x02e9 }
            r1.put(r11, r0)     // Catch:{ all -> 0x02e9 }
            monitor-exit(r6)     // Catch:{ all -> 0x02e9 }
            r17 = 1
            com.facebook.redex.IDxCallableShape1S1201000_I0 r9 = new com.facebook.redex.IDxCallableShape1S1201000_I0     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r12 = r9
            r13 = r29
            r14 = r8
            r15 = r11
            r16 = r4
            r12.<init>(r13, r14, r15, r16, r17)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            java.util.concurrent.ExecutorService r8 = X.AnonymousClass0Vv.A03     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            X.0b0 r6 = new X.0b0     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r6.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r0 != 0) goto L_0x02e3
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            android.os.Handler r1 = new android.os.Handler     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
        L_0x02da:
            X.0go r0 = new X.0go     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r0.<init>(r1, r6, r9)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r8.execute(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            goto L_0x030c
        L_0x02e3:
            android.os.Handler r1 = new android.os.Handler     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            goto L_0x02da
        L_0x02e9:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x02e9 }
            goto L_0x02f3
        L_0x02ec:
            java.lang.String r0 = "No start tag found"
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
        L_0x02f3:
            throw r1     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
        L_0x02f4:
            X.0Ts r0 = new X.0Ts     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r0.<init>((android.graphics.Typeface) r6)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r12.A00(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            goto L_0x030e
        L_0x02fd:
            X.0WK r1 = X.AnonymousClass08N.A01     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            X.0NO r9 = (X.AnonymousClass0NO) r9     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r0 = r29
            android.graphics.Typeface r6 = r1.A03(r0, r3, r9, r4)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r31 == 0) goto L_0x030e
            if (r6 == 0) goto L_0x035c
            goto L_0x0311
        L_0x030c:
            r6 = r21
        L_0x030e:
            if (r6 == 0) goto L_0x0049
            goto L_0x0322
        L_0x0311:
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            android.os.Handler r1 = new android.os.Handler     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            X.0g5 r0 = new X.0g5     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r0.<init>(r6, r5)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r1.post(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
        L_0x0322:
            java.lang.String r1 = X.AnonymousClass08N.A01(r3, r2, r10, r7, r4)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r0 = r19
            r0.A06(r1, r6)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            goto L_0x0049
        L_0x032d:
            int r0 = r8.assetCookie     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            X.0WK r6 = X.AnonymousClass08N.A01     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r7 = r29
            r8 = r3
            r9 = r2
            r11 = r4
            android.graphics.Typeface r6 = r6.A04(r7, r8, r9, r10, r11)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            if (r6 == 0) goto L_0x0345
            java.lang.String r1 = X.AnonymousClass08N.A01(r3, r2, r10, r0, r4)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r0 = r19
            r0.A06(r1, r6)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
        L_0x0345:
            if (r31 == 0) goto L_0x0049
            if (r6 == 0) goto L_0x035c
        L_0x0349:
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            android.os.Handler r1 = new android.os.Handler     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r1.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            X.0g5 r0 = new X.0g5     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r0.<init>(r6, r5)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            r1.post(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            goto L_0x0049
        L_0x035c:
            r0 = -3
            r5.A00(r0)     // Catch:{ XmlPullParserException -> 0x0362, IOException -> 0x0377 }
            goto L_0x0049
        L_0x0362:
            r3 = move-exception
            java.lang.String r1 = "Failed to parse xml resource "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            r0 = r20
            android.util.Log.e(r0, r1, r3)
            goto L_0x038b
        L_0x0377:
            r3 = move-exception
            java.lang.String r1 = "Failed to read xml resource "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            r0 = r20
            android.util.Log.e(r0, r1, r3)
        L_0x038b:
            if (r31 == 0) goto L_0x004b
            r0 = -3
            r5.A00(r0)
            goto L_0x004b
        L_0x0393:
            return r21
        L_0x0394:
            java.lang.String r0 = "Resource \""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r3.getResourceName(r10)
            r1.append(r0)
            java.lang.String r0 = "\" ("
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r10)
            r1.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00X.A03(android.content.Context, android.util.TypedValue, X.08g, int, int, boolean):android.graphics.Typeface");
    }

    public static Drawable A04(Resources.Theme theme, Resources resources, int i2) {
        return Build.VERSION.SDK_INT >= 21 ? AnonymousClass0LT.A00(theme, resources, i2) : resources.getDrawable(i2);
    }

    public static void A05(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            } else {
                continue;
            }
            if (i2 <= 0) {
                return;
            }
        }
    }
}
