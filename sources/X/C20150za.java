package X;

import java.util.Set;

/* renamed from: X.0za  reason: invalid class name and case insensitive filesystem */
public abstract class C20150za {
    public final Set A00;

    public C20150za(Set set) {
        this.A00 = set;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0037 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass2WZ r7, X.AnonymousClass5SD r8, java.lang.String r9, boolean r10) {
        /*
            r6 = this;
            if (r10 == 0) goto L_0x0053
            X.4RJ r4 = new X.4RJ
            r4.<init>(r7, r8, r6)
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IOException -> 0x004a, OutOfMemoryError -> 0x0038 }
            r0.<init>(r9)     // Catch:{ IOException -> 0x004a, OutOfMemoryError -> 0x0038 }
            android.util.JsonReader r5 = new android.util.JsonReader     // Catch:{ IOException -> 0x004a, OutOfMemoryError -> 0x0038 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x004a, OutOfMemoryError -> 0x0038 }
            X.4ti r0 = new X.4ti     // Catch:{ all -> 0x0033 }
            r0.<init>(r5)     // Catch:{ all -> 0x0033 }
            r0.ALo()     // Catch:{ all -> 0x0033 }
            X.4CO r3 = X.AnonymousClass383.A00(r0)     // Catch:{ all -> 0x0033 }
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0033 }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ all -> 0x0033 }
            r2.<init>(r0)     // Catch:{ all -> 0x0033 }
            r1 = 4
            com.facebook.redex.RunnableRunnableShape13S0200000_I1_1 r0 = new com.facebook.redex.RunnableRunnableShape13S0200000_I1_1     // Catch:{ all -> 0x0033 }
            r0.<init>(r3, r1, r4)     // Catch:{ all -> 0x0033 }
            r2.post(r0)     // Catch:{ all -> 0x0033 }
            r5.close()     // Catch:{ IOException -> 0x004a, OutOfMemoryError -> 0x0038 }
            return
        L_0x0033:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r0     // Catch:{ IOException -> 0x004a, OutOfMemoryError -> 0x0038 }
        L_0x0038:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = r1.getMessage()
        L_0x0043:
            r4.A00(r0)
            return
        L_0x0047:
            java.lang.String r0 = "OutOfMemoryError"
            goto L_0x0043
        L_0x004a:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r4.A00(r0)
            return
        L_0x0053:
            X.4w5 r0 = new X.4w5
            r0.<init>(r7, r8, r6)
            X.C808445u.A00(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20150za.A00(X.2WZ, X.5SD, java.lang.String, boolean):void");
    }

    public void A01(C35001lD r10, AnonymousClass5SD r11, Boolean bool, String str, String str2, String str3) {
        A03(r10, r11, bool, str, str2, str3, this.A00.contains(str));
    }

    public abstract void A02(AnonymousClass2WZ r1, AnonymousClass5SD r2, String str);

    public abstract void A03(C35001lD r1, AnonymousClass5SD r2, Boolean bool, String str, String str2, String str3, boolean z2);
}
