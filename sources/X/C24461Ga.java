package X;

/* renamed from: X.1Ga  reason: invalid class name and case insensitive filesystem */
public class C24461Ga {
    public final AnonymousClass027 A00 = new AnonymousClass027();
    public final C18260wP A01;
    public final AnonymousClass1GY A02;
    public final AnonymousClass1GZ A03;
    public final AnonymousClass1WA A04;

    public C24461Ga(C18260wP r3, AnonymousClass1GY r4, AnonymousClass1GZ r5, C16320sq r6) {
        this.A04 = new AnonymousClass1WA(r6, false);
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A00(android.content.Context r3, java.io.File r4) {
        /*
            android.graphics.Point r1 = X.C16210se.A00(r3)
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException | OutOfMemoryError -> 0x001f }
            r3.<init>(r4)     // Catch:{ IOException | OutOfMemoryError -> 0x001f }
            r0 = 1
            X.25c r2 = X.C16210se.A01(r1, r0)     // Catch:{ all -> 0x001a }
            r1 = 0
            r0 = 0
            X.25d r0 = X.C37741pe.A04(r1, r2, r3, r0)     // Catch:{ all -> 0x001a }
            android.graphics.Bitmap r0 = r0.A02     // Catch:{ all -> 0x001a }
            r3.close()     // Catch:{ IOException | OutOfMemoryError -> 0x001f }
            return r0
        L_0x001a:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x001e }
        L_0x001e:
            throw r0     // Catch:{ IOException | OutOfMemoryError -> 0x001f }
        L_0x001f:
            r1 = move-exception
            java.lang.String r0 = "DownloadableWallpaperManager/error when loading wallpaper resource"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24461Ga.A00(android.content.Context, java.io.File):android.graphics.Bitmap");
    }
}
