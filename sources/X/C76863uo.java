package X;

import android.content.Context;

/* renamed from: X.3uo  reason: invalid class name and case insensitive filesystem */
public abstract class C76863uo extends C76883uq {
    public final Context A00;

    public C76863uo(Context context) {
        this.A00 = context;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Picture A02(android.content.Context r2, java.lang.String r3) {
        /*
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ 0ix | IOException -> 0x002e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ 0ix | IOException -> 0x002e }
            java.lang.String r0 = "graphics/"
            r1.append(r0)     // Catch:{ 0ix | IOException -> 0x002e }
            java.lang.String r1 = X.AnonymousClass000.A0h(r3, r1)     // Catch:{ 0ix | IOException -> 0x002e }
            X.0XP r0 = new X.0XP     // Catch:{ 0ix | IOException -> 0x002e }
            r0.<init>()     // Catch:{ 0ix | IOException -> 0x002e }
            java.io.InputStream r2 = r2.open(r1)     // Catch:{ 0ix | IOException -> 0x002e }
            X.0Rz r1 = r0.A0S(r2)     // Catch:{ all -> 0x0029 }
            r2.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            if (r1 == 0) goto L_0x003c
            r0 = 0
            android.graphics.Picture r0 = r1.A00(r0)     // Catch:{ 0ix | IOException -> 0x002e }
            return r0
        L_0x0029:
            r0 = move-exception
            r2.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            throw r0     // Catch:{ 0ix | IOException -> 0x002e }
        L_0x002e:
            r1 = move-exception
            java.lang.String r0 = "failed to load SVG from "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r0)
            com.whatsapp.util.Log.e(r0, r1)
        L_0x003c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76863uo.A02(android.content.Context, java.lang.String):android.graphics.Picture");
    }

    public boolean A0K() {
        return false;
    }
}
