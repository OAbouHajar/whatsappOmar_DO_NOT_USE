package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0E9  reason: invalid class name */
public class AnonymousClass0E9 extends AnonymousClass0WK {
    public static Class A00;
    public static Constructor A01;
    public static Method A02;
    public static Method A03;
    public static boolean A04;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.reflect.Constructor<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.reflect.Constructor<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.reflect.Constructor<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.reflect.Constructor<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.reflect.Method} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00() {
        /*
            boolean r0 = A04
            if (r0 != 0) goto L_0x0052
            r8 = 1
            A04 = r8
            r9 = 0
            java.lang.String r0 = "android.graphics.FontFamily"
            java.lang.Class r6 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            r7 = 0
            java.lang.Class[] r0 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            java.lang.reflect.Constructor r5 = r6.getConstructor(r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            java.lang.String r3 = "addFontWeightStyle"
            r0 = 3
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r2[r7] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            r2[r8] = r0     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            r1 = 2
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            java.lang.reflect.Method r4 = X.AnonymousClass000.A0s(r6, r0, r3, r2, r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r6, r8)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            java.lang.Class<android.graphics.Typeface> r3 = android.graphics.Typeface.class
            java.lang.String r2 = "createFromFamiliesWithDefault"
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            java.lang.Class r0 = r0.getClass()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            java.lang.reflect.Method r0 = X.AnonymousClass000.A0s(r3, r0, r2, r1, r7)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x003d }
            r9 = r5
            goto L_0x004a
        L_0x003d:
            r2 = move-exception
            java.lang.String r1 = X.AnonymousClass000.A0d(r2)
            java.lang.String r0 = "TypefaceCompatApi21Impl"
            android.util.Log.e(r0, r1, r2)
            r0 = r9
            r6 = r9
            r4 = r9
        L_0x004a:
            A01 = r9
            A00 = r6
            A02 = r4
            A03 = r0
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0E9.A00():void");
    }

    public Typeface A03(Context context, Resources resources, AnonymousClass0NO r15, int i2) {
        A00();
        try {
            Object newInstance = A01.newInstance(new Object[0]);
            AnonymousClass0P0[] r9 = r15.A00;
            int length = r9.length;
            int i3 = 0;
            while (i3 < length) {
                AnonymousClass0P0 r2 = r9[i3];
                File A002 = AnonymousClass0WV.A00(context);
                if (A002 == null) {
                    return null;
                }
                try {
                    if (AnonymousClass0WV.A02(resources, A002, r2.A00)) {
                        String path = A002.getPath();
                        int i4 = r2.A02;
                        boolean z2 = r2.A05;
                        A00();
                        Method method = A02;
                        Object[] objArr = new Object[3];
                        objArr[0] = path;
                        AnonymousClass000.A1M(objArr, i4, 1);
                        objArr[2] = Boolean.valueOf(z2);
                        if (AnonymousClass000.A1Z(newInstance, method, objArr)) {
                            A002.delete();
                            i3++;
                        }
                    }
                    A002.delete();
                    return null;
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                } catch (RuntimeException unused) {
                    A002.delete();
                    return null;
                } catch (Throwable th) {
                    A002.delete();
                    throw th;
                }
            }
            A00();
            try {
                Object newInstance2 = Array.newInstance(A00, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) A03.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e3) {
                throw new RuntimeException(e3);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0065 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006a */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042 A[SYNTHETIC, Splitter:B:13:0x0042] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x006a=Splitter:B:33:0x006a, B:22:0x005d=Splitter:B:22:0x005d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A05(android.content.Context r6, android.os.CancellationSignal r7, X.C04940Op[] r8, int r9) {
        /*
            r5 = this;
            r3 = 0
            int r1 = r8.length
            r4 = 0
            r0 = 1
            if (r1 < r0) goto L_0x006c
            X.0Op r0 = r5.A07(r8, r9)
            android.content.ContentResolver r2 = r6.getContentResolver()
            android.net.Uri r1 = r0.A03     // Catch:{ IOException -> 0x006b }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r3 = r2.openFileDescriptor(r1, r0, r3)     // Catch:{ IOException -> 0x006b }
            if (r3 == 0) goto L_0x006c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ ErrnoException -> 0x003f }
            java.lang.String r0 = "/proc/self/fd/"
            r1.append(r0)     // Catch:{ ErrnoException -> 0x003f }
            int r0 = r3.getFd()     // Catch:{ ErrnoException -> 0x003f }
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)     // Catch:{ ErrnoException -> 0x003f }
            java.lang.String r2 = android.system.Os.readlink(r0)     // Catch:{ ErrnoException -> 0x003f }
            android.system.StructStat r0 = android.system.Os.stat(r2)     // Catch:{ ErrnoException -> 0x003f }
            int r0 = r0.st_mode     // Catch:{ ErrnoException -> 0x003f }
            boolean r0 = android.system.OsConstants.S_ISREG(r0)     // Catch:{ ErrnoException -> 0x003f }
            if (r0 == 0) goto L_0x003f
            java.io.File r1 = new java.io.File     // Catch:{ ErrnoException -> 0x003f }
            r1.<init>(r2)     // Catch:{ ErrnoException -> 0x003f }
            goto L_0x0040
        L_0x003f:
            r1 = r4
        L_0x0040:
            if (r1 == 0) goto L_0x004d
            boolean r0 = r1.canRead()     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x004d
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromFile(r1)     // Catch:{ all -> 0x0066 }
            goto L_0x005d
        L_0x004d:
            java.io.FileDescriptor r0 = r3.getFileDescriptor()     // Catch:{ all -> 0x0066 }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0066 }
            r1.<init>(r0)     // Catch:{ all -> 0x0066 }
            android.graphics.Typeface r0 = super.A06(r6, r1)     // Catch:{ all -> 0x0061 }
            r1.close()     // Catch:{ all -> 0x0066 }
        L_0x005d:
            r3.close()     // Catch:{ IOException -> 0x006b }
            return r0
        L_0x0061:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0065 }
        L_0x0065:
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x006a }
        L_0x006a:
            throw r0     // Catch:{ IOException -> 0x006b }
        L_0x006b:
            return r4
        L_0x006c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0E9.A05(android.content.Context, android.os.CancellationSignal, X.0Op[], int):android.graphics.Typeface");
    }
}
