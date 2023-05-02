package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0E8  reason: invalid class name */
public class AnonymousClass0E8 extends AnonymousClass0E9 {
    public final Class A00;
    public final Constructor A01;
    public final Method A02;
    public final Method A03;
    public final Method A04;
    public final Method A05;
    public final Method A06;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.reflect.Constructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.reflect.Constructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.reflect.Constructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.reflect.Constructor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Class} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0E8() {
        /*
            r8 = this;
            r8.<init>()
            r3 = 0
            java.lang.String r0 = "android.graphics.FontFamily"
            java.lang.Class r7 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            java.lang.reflect.Constructor r6 = r7.getConstructor(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            r0 = 8
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            r1 = 0
            java.lang.Class<android.content.res.AssetManager> r0 = android.content.res.AssetManager.class
            r5[r1] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            r1 = 1
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r5[r1] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            r0 = 2
            r5[r0] = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            r0 = 3
            r5[r0] = r1     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            r0 = 4
            r5[r0] = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            r0 = 5
            r5[r0] = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            r0 = 6
            r5[r0] = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            r0 = 7
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r4 = android.graphics.fonts.FontVariationAxis[].class
            r5[r0] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            java.lang.String r0 = "addFontFromAssetManager"
            java.lang.reflect.Method r5 = r7.getMethod(r0, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            r0 = 5
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            r1 = 0
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            r2[r1] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            r0 = 1
            r2[r0] = r1     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            r0 = 2
            r2[r0] = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            r0 = 3
            r2[r0] = r1     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            r0 = 4
            r2[r0] = r1     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            java.lang.String r0 = "addFontFromBuffer"
            java.lang.reflect.Method r4 = r7.getMethod(r0, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            java.lang.String r0 = "freeze"
            java.lang.reflect.Method r2 = r7.getMethod(r0, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            java.lang.String r0 = "abortCreation"
            java.lang.reflect.Method r1 = r7.getMethod(r0, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            java.lang.reflect.Method r0 = r8.A09(r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0071 }
            r3 = r7
            goto L_0x008b
        L_0x0071:
            r2 = move-exception
            java.lang.String r0 = "Unable to collect necessary methods for class "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0d(r2)
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            java.lang.String r0 = "TypefaceCompatApi26Impl"
            android.util.Log.e(r0, r1, r2)
            r0 = r3
            r6 = r3
            r5 = r3
            r4 = r3
            r2 = r3
            r1 = r3
        L_0x008b:
            r8.A00 = r3
            r8.A01 = r6
            r8.A03 = r5
            r8.A04 = r4
            r8.A06 = r2
            r8.A02 = r1
            r8.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0E8.<init>():void");
    }

    public Typeface A03(Context context, Resources resources, AnonymousClass0NO r17, int i2) {
        Object obj;
        boolean z2;
        boolean z3;
        Method method = this.A03;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        AnonymousClass0NO r3 = r17;
        if (!AnonymousClass000.A1V(method)) {
            return super.A03(context, resources, r3, i2);
        }
        try {
            obj = this.A01.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            AnonymousClass0P0[] r6 = r3.A00;
            int length = r6.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    AnonymousClass0P0 r0 = r6[i3];
                    Object obj2 = r0.A03;
                    int i4 = r0.A01;
                    int i5 = r0.A02;
                    boolean z4 = r0.A05;
                    Object fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(r0.A04);
                    try {
                        Object[] objArr = new Object[8];
                        objArr[0] = context.getAssets();
                        objArr[1] = obj2;
                        AnonymousClass000.A1M(objArr, 0, 2);
                        objArr[3] = Boolean.FALSE;
                        AnonymousClass000.A1M(objArr, i4, 4);
                        AnonymousClass000.A1M(objArr, i5, 5);
                        AnonymousClass000.A1M(objArr, z4 ? 1 : 0, 6);
                        objArr[7] = fromFontVariationSettings;
                        z3 = AnonymousClass000.A1Z(obj, method, objArr);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z3 = false;
                    }
                    if (!z3) {
                        try {
                            this.A02.invoke(obj, new Object[0]);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused3) {
                        }
                    } else {
                        i3++;
                    }
                } else {
                    try {
                        z2 = AnonymousClass000.A1Z(obj, this.A06, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException unused4) {
                        z2 = false;
                    }
                    if (z2) {
                        return A08(obj);
                    }
                }
            }
        }
        return null;
    }

    public Typeface A04(Context context, Resources resources, String str, int i2, int i3) {
        Object obj;
        boolean z2;
        boolean z3;
        Method method = this.A03;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (!AnonymousClass000.A1V(method)) {
            return super.A04(context, resources, str, i2, i3);
        }
        try {
            obj = this.A01.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            try {
                Object[] objArr = new Object[8];
                objArr[0] = context.getAssets();
                objArr[1] = str;
                AnonymousClass000.A1M(objArr, 0, 2);
                objArr[3] = Boolean.FALSE;
                AnonymousClass000.A1M(objArr, 0, 4);
                AnonymousClass000.A1M(objArr, -1, 5);
                AnonymousClass000.A1M(objArr, -1, 6);
                objArr[7] = null;
                z2 = AnonymousClass000.A1Z(obj, method, objArr);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                z2 = false;
            }
            if (!z2) {
                try {
                    this.A02.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                }
            } else {
                try {
                    z3 = AnonymousClass000.A1Z(obj, this.A06, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused4) {
                    z3 = false;
                }
                if (z3) {
                    return A08(obj);
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r7.A02.invoke(r4, new java.lang.Object[0]);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0053 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A05(android.content.Context r18, android.os.CancellationSignal r19, X.C04940Op[] r20, int r21) {
        /*
            r17 = this;
            r4 = 0
            r11 = r20
            int r10 = r11.length
            r9 = 1
            r16 = 0
            if (r10 < r9) goto L_0x00da
            r7 = r17
            java.lang.reflect.Method r2 = r7.A03
            if (r2 != 0) goto L_0x0016
            java.lang.String r1 = "TypefaceCompatApi26Impl"
            java.lang.String r0 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r1, r0)
        L_0x0016:
            boolean r0 = X.AnonymousClass000.A1V(r2)
            r5 = r18
            r6 = r21
            if (r0 != 0) goto L_0x0054
            X.0Op r3 = r7.A07(r11, r6)
            android.content.ContentResolver r2 = r5.getContentResolver()
            android.net.Uri r1 = r3.A03     // Catch:{  }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r2 = r2.openFileDescriptor(r1, r0, r4)     // Catch:{  }
            if (r2 == 0) goto L_0x00da
            java.io.FileDescriptor r0 = r2.getFileDescriptor()     // Catch:{ all -> 0x004f }
            android.graphics.Typeface$Builder r1 = new android.graphics.Typeface$Builder     // Catch:{ all -> 0x004f }
            r1.<init>(r0)     // Catch:{ all -> 0x004f }
            int r0 = r3.A02     // Catch:{ all -> 0x004f }
            android.graphics.Typeface$Builder r1 = r1.setWeight(r0)     // Catch:{ all -> 0x004f }
            boolean r0 = r3.A04     // Catch:{ all -> 0x004f }
            android.graphics.Typeface$Builder r0 = r1.setItalic(r0)     // Catch:{ all -> 0x004f }
            android.graphics.Typeface r0 = r0.build()     // Catch:{ all -> 0x004f }
            r2.close()     // Catch:{  }
            return r0
        L_0x004f:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0053 }
        L_0x0053:
            throw r0     // Catch:{  }
        L_0x0054:
            java.util.HashMap r3 = X.AnonymousClass000.A0x()
            r2 = 0
        L_0x0059:
            if (r2 >= r10) goto L_0x0073
            r1 = r20[r2]
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0070
            android.net.Uri r1 = r1.A03
            boolean r0 = r3.containsKey(r1)
            if (r0 != 0) goto L_0x0070
            java.nio.ByteBuffer r0 = X.AnonymousClass0WV.A01(r5, r1)
            r3.put(r1, r0)
        L_0x0070:
            int r2 = r2 + 1
            goto L_0x0059
        L_0x0073:
            java.util.Map r8 = java.util.Collections.unmodifiableMap(r3)
            java.lang.reflect.Constructor r1 = r7.A01     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0080 }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0080 }
            java.lang.Object r4 = r1.newInstance(r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0080 }
        L_0x0080:
            if (r4 == 0) goto L_0x00da
            r2 = 0
            r5 = 0
        L_0x0084:
            if (r5 >= r10) goto L_0x00b8
            r1 = r20[r5]
            android.net.Uri r0 = r1.A03
            java.lang.Object r15 = r8.get(r0)
            if (r15 == 0) goto L_0x00b5
            int r14 = r1.A01
            int r13 = r1.A02
            boolean r12 = r1.A04
            r3 = 0
            java.lang.reflect.Method r2 = r7.A04     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b1 }
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b1 }
            r1[r3] = r15     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b1 }
            X.AnonymousClass000.A1M(r1, r14, r9)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b1 }
            r0 = 2
            r1[r0] = r16     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b1 }
            r0 = 3
            X.AnonymousClass000.A1M(r1, r13, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b1 }
            r0 = 4
            X.AnonymousClass000.A1M(r1, r12, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b1 }
            boolean r0 = X.AnonymousClass000.A1Z(r4, r2, r1)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00b1 }
            goto L_0x00b2
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            if (r0 == 0) goto L_0x00d2
            r2 = 1
        L_0x00b5:
            int r5 = r5 + 1
            goto L_0x0084
        L_0x00b8:
            if (r2 == 0) goto L_0x00d2
            r0 = 0
            java.lang.reflect.Method r1 = r7.A06     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c4 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c4 }
            boolean r0 = X.AnonymousClass000.A1Z(r4, r1, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00c4 }
            goto L_0x00c5
        L_0x00c4:
            r0 = 0
        L_0x00c5:
            if (r0 == 0) goto L_0x00da
            android.graphics.Typeface r0 = r7.A08(r4)
            if (r0 == 0) goto L_0x00da
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r6)
            return r0
        L_0x00d2:
            java.lang.reflect.Method r1 = r7.A02     // Catch:{ IOException -> 0x00da }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IOException -> 0x00da }
            r1.invoke(r4, r0)     // Catch:{ IOException -> 0x00da }
        L_0x00da:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0E8.A05(android.content.Context, android.os.CancellationSignal, X.0Op[], int):android.graphics.Typeface");
    }

    public Typeface A08(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.A00, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.A05.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method A09(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
