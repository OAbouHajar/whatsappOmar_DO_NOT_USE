package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import com.facebook.redex.IDxSExtractorShape396S0100000_I1;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0WK  reason: invalid class name */
public class AnonymousClass0WK {
    public ConcurrentHashMap A00 = new ConcurrentHashMap();

    public static long A01(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException | NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        }
    }

    public static Object A02(C13000lJ r10, Object[] objArr, int i2) {
        int i3 = 700;
        if ((i2 & 1) == 0) {
            i3 = 400;
        }
        boolean A1O = AnonymousClass000.A1O(i2 & 2);
        C04940Op r9 = null;
        int i4 = Integer.MAX_VALUE;
        for (AnonymousClass0P0 r8 : objArr) {
            int i5 = ((IDxSExtractorShape396S0100000_I1) r10).A01;
            int A09 = AnonymousClass000.A09(i5 != 0 ? r8.A02 : r8.A02, i3) << 1;
            int i6 = 1;
            if ((i5 != 0 ? r8.A05 : r8.A04) == A1O) {
                i6 = 0;
            }
            int i7 = A09 + i6;
            if (r9 == null || i4 > i7) {
                r9 = r8;
                i4 = i7;
            }
        }
        return r9;
    }

    public Typeface A03(Context context, Resources resources, AnonymousClass0NO r13, int i2) {
        int i3 = i2;
        AnonymousClass0P0 r0 = (AnonymousClass0P0) A02(new IDxSExtractorShape396S0100000_I1(this, 1), r13.A00, i2);
        if (r0 == null) {
            return null;
        }
        int i4 = r0.A00;
        String str = r0.A03;
        Typeface A04 = AnonymousClass08N.A01.A04(context, resources, str, i4, i3);
        if (A04 != null) {
            AnonymousClass08N.A00.A06(AnonymousClass08N.A01(resources, str, i4, 0, i2), A04);
        }
        long A01 = A01(A04);
        if (A01 == 0) {
            return A04;
        }
        this.A00.put(Long.valueOf(A01), r13);
        return A04;
    }

    public Typeface A04(Context context, Resources resources, String str, int i2, int i3) {
        File A002 = AnonymousClass0WV.A00(context);
        if (A002 == null) {
            return null;
        }
        try {
            if (!AnonymousClass0WV.A02(resources, A002, i2)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(A002.getPath());
            A002.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            A002.delete();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0024 A[SYNTHETIC, Splitter:B:17:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x002b A[SYNTHETIC, Splitter:B:25:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A05(android.content.Context r4, android.os.CancellationSignal r5, X.C04940Op[] r6, int r7) {
        /*
            r3 = this;
            int r1 = r6.length
            r2 = 0
            r0 = 1
            if (r1 >= r0) goto L_0x0006
            return r2
        L_0x0006:
            X.0Op r0 = r3.A07(r6, r7)
            android.content.ContentResolver r1 = r4.getContentResolver()     // Catch:{ IOException -> 0x0028, all -> 0x001e }
            android.net.Uri r0 = r0.A03     // Catch:{ IOException -> 0x0028, all -> 0x001e }
            java.io.InputStream r1 = r1.openInputStream(r0)     // Catch:{ IOException -> 0x0028, all -> 0x001e }
            android.graphics.Typeface r0 = r3.A06(r4, r1)     // Catch:{ IOException -> 0x0029, all -> 0x0020 }
            if (r1 == 0) goto L_0x001d
            r1.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            return r0
        L_0x001e:
            r0 = move-exception
            goto L_0x0022
        L_0x0020:
            r0 = move-exception
            r2 = r1
        L_0x0022:
            if (r2 == 0) goto L_0x0027
            r2.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            throw r0
        L_0x0028:
            r1 = r2
        L_0x0029:
            if (r1 == 0) goto L_0x002e
            r1.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WK.A05(android.content.Context, android.os.CancellationSignal, X.0Op[], int):android.graphics.Typeface");
    }

    public Typeface A06(Context context, InputStream inputStream) {
        File A002 = AnonymousClass0WV.A00(context);
        if (A002 == null) {
            return null;
        }
        try {
            if (!AnonymousClass0WV.A03(A002, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(A002.getPath());
            A002.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            A002.delete();
        }
    }

    public C04940Op A07(C04940Op[] r3, int i2) {
        return (C04940Op) A02(new IDxSExtractorShape396S0100000_I1(this, 0), r3, i2);
    }
}
