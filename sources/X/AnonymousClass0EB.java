package X;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: X.0EB  reason: invalid class name */
public class AnonymousClass0EB extends AnonymousClass0WK {
    public static final Class A00;
    public static final Constructor A01;
    public static final Method A02;
    public static final Method A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.reflect.Constructor<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.reflect.Constructor<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.reflect.Constructor<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.reflect.Constructor<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r9 = 0
            java.lang.String r0 = "android.graphics.FontFamily"
            java.lang.Class r6 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            r7 = 0
            java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.reflect.Constructor r8 = r6.getConstructor(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.String r4 = "addFontWeightStyle"
            r0 = 5
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            r3[r7] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            r5 = 1
            r3[r5] = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            r1 = 2
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r3[r1] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            r0 = 3
            r3[r0] = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            r1 = 4
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.reflect.Method r4 = X.AnonymousClass000.A0s(r6, r0, r4, r3, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r6, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.Class<android.graphics.Typeface> r3 = android.graphics.Typeface.class
            java.lang.String r2 = "createFromFamiliesWithDefault"
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.Class r0 = r0.getClass()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            java.lang.reflect.Method r0 = X.AnonymousClass000.A0s(r3, r0, r2, r1, r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003f }
            r9 = r8
            goto L_0x004c
        L_0x003f:
            r2 = move-exception
            java.lang.String r1 = X.AnonymousClass000.A0d(r2)
            java.lang.String r0 = "TypefaceCompatApi24Impl"
            android.util.Log.e(r0, r1, r2)
            r6 = r9
            r0 = r9
            r4 = r9
        L_0x004c:
            A01 = r9
            A00 = r6
            A02 = r4
            A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EB.<clinit>():void");
    }

    public static boolean A00() {
        if (A02 != null) {
            return true;
        }
        Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        return false;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0046 */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A03(android.content.Context r16, android.content.res.Resources r17, X.AnonymousClass0NO r18, int r19) {
        /*
            r15 = this;
            java.lang.reflect.Constructor r1 = A01     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000a }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000a }
            java.lang.Object r5 = r1.newInstance(r0)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000a }
            goto L_0x000b
        L_0x000a:
            r5 = 0
        L_0x000b:
            r4 = 0
            if (r5 == 0) goto L_0x009b
            r0 = r18
            X.0P0[] r6 = r0.A00
            int r3 = r6.length
            r2 = 0
        L_0x0014:
            if (r2 >= r3) goto L_0x0082
            r8 = r6[r2]
            int r0 = r8.A00
            java.io.File r7 = X.AnonymousClass0WV.A00(r16)
            if (r7 == 0) goto L_0x004f
            r1 = r17
            boolean r0 = X.AnonymousClass0WV.A02(r1, r7, r0)     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x0029
            goto L_0x004c
        L_0x0029:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0047 }
            r1.<init>(r7)     // Catch:{ IOException -> 0x0047 }
            java.nio.channels.FileChannel r9 = r1.getChannel()     // Catch:{ all -> 0x0042 }
            long r13 = r9.size()     // Catch:{ all -> 0x0042 }
            java.nio.channels.FileChannel$MapMode r10 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0042 }
            r11 = 0
            java.nio.MappedByteBuffer r12 = r9.map(r10, r11, r13)     // Catch:{ all -> 0x0042 }
            r1.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x0048
        L_0x0042:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r0     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            r12 = 0
        L_0x0048:
            r7.delete()
            goto L_0x0050
        L_0x004c:
            r7.delete()
        L_0x004f:
            r12 = r4
        L_0x0050:
            if (r12 == 0) goto L_0x009b
            int r11 = r8.A01
            int r10 = r8.A02
            boolean r9 = r8.A05
            r1 = 0
            java.lang.reflect.Method r8 = A02     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0077 }
            r0 = 5
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0077 }
            r7[r1] = r12     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0077 }
            r0 = 1
            X.AnonymousClass000.A1M(r7, r11, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0077 }
            r0 = 2
            r7[r0] = r4     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0077 }
            r0 = 3
            X.AnonymousClass000.A1M(r7, r10, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0077 }
            r1 = 4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0077 }
            r7[r1] = r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0077 }
            boolean r0 = X.AnonymousClass000.A1Z(r5, r8, r7)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0077 }
            goto L_0x0078
        L_0x0077:
            r0 = 0
        L_0x0078:
            if (r0 == 0) goto L_0x009b
            int r2 = r2 + 1
            goto L_0x0014
        L_0x007d:
            r0 = move-exception
            r7.delete()
            throw r0
        L_0x0082:
            java.lang.Class r1 = A00     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009a }
            r0 = 1
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r1, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009a }
            r2 = 0
            java.lang.reflect.Array.set(r3, r2, r5)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009a }
            java.lang.reflect.Method r1 = A03     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009a }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009a }
            r0[r2] = r3     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009a }
            java.lang.Object r0 = r1.invoke(r4, r0)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009a }
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x009a }
            return r0
        L_0x009a:
            return r4
        L_0x009b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EB.A03(android.content.Context, android.content.res.Resources, X.0NO, int):android.graphics.Typeface");
    }

    public Typeface A05(Context context, CancellationSignal cancellationSignal, C04940Op[] r17, int i2) {
        Object obj;
        Object obj2;
        Typeface typeface;
        boolean z2;
        try {
            obj2 = A01.newInstance(new Object[0]);
            obj = obj2;
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj2 = null;
            obj = null;
        }
        if (obj2 != null) {
            AnonymousClass00O r8 = new AnonymousClass00O();
            int length = r17.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    C04940Op r1 = r17[i3];
                    Uri uri = r1.A03;
                    ByteBuffer byteBuffer = (ByteBuffer) r8.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = AnonymousClass0WV.A01(context, uri);
                        r8.put(uri, byteBuffer);
                        if (byteBuffer == null) {
                            break;
                        }
                    }
                    int i4 = r1.A01;
                    int i5 = r1.A02;
                    boolean z3 = r1.A04;
                    try {
                        Method method = A02;
                        Object[] objArr = new Object[5];
                        objArr[0] = byteBuffer;
                        AnonymousClass000.A1M(objArr, i4, 1);
                        objArr[2] = null;
                        AnonymousClass000.A1M(objArr, i5, 3);
                        objArr[4] = Boolean.valueOf(z3);
                        z2 = AnonymousClass000.A1Z(obj, method, objArr);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z2 = false;
                    }
                    if (!z2) {
                        break;
                    }
                    i3++;
                } else {
                    try {
                        Object newInstance = Array.newInstance(A00, 1);
                        Array.set(newInstance, 0, obj);
                        typeface = (Typeface) A03.invoke((Object) null, new Object[]{newInstance});
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        typeface = null;
                    }
                    if (typeface != null) {
                        return Typeface.create(typeface, i2);
                    }
                }
            }
        }
        return null;
    }
}
