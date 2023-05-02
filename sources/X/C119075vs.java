package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.5vs  reason: invalid class name and case insensitive filesystem */
public class C119075vs {
    public static boolean A00(C14710pd r6, C16490t9 r7, C19500yX r8, String str) {
        boolean z2;
        String A05 = r6.A05(1854);
        String str2 = "";
        String trim = A05 != null ? A05.trim() : str2;
        String A052 = r6.A05(1855);
        if (A052 != null) {
            str2 = A052.trim();
        }
        HashSet A0o = C13680ns.A0o();
        if (!TextUtils.isEmpty(trim)) {
            A0o.addAll(Arrays.asList(trim.split(",")));
        }
        HashSet A0o2 = C13680ns.A0o();
        if (!TextUtils.isEmpty(str2)) {
            A0o2.addAll(Arrays.asList(str2.split(",")));
        }
        if (A0o.isEmpty() && A0o2.isEmpty()) {
            return false;
        }
        HashSet hashSet = new HashSet(A0o);
        hashSet.addAll(A0o2);
        r8.ALE(185477621);
        r8.AKi(185477621, "categories", hashSet.toString());
        r8.AKi(185477621, "checkLocation", str);
        HashMap A0x = AnonymousClass000.A0x();
        if (!A0o.isEmpty()) {
            Iterator it = A0o.iterator();
            z2 = true;
            while (it.hasNext()) {
                String A0m = AnonymousClass000.A0m(it);
                try {
                    A0x.put(A0m, Boolean.valueOf(A01(A0m)));
                } catch (Exception e2) {
                    Log.e((Throwable) e2);
                    z2 = false;
                }
            }
            C111915hd r1 = new C111915hd();
            r1.A02 = str;
            r1.A01 = (Boolean) A0x.get("su_exists");
            r1.A00 = (Boolean) A0x.get("rw_paths");
            r7.A06(r1);
        } else {
            z2 = true;
        }
        Iterator it2 = A0o2.iterator();
        boolean z3 = false;
        while (it2.hasNext()) {
            String A0m2 = AnonymousClass000.A0m(it2);
            if (!A0x.containsKey(A0m2) || !Boolean.TRUE.equals(A0x.get(A0m2))) {
                try {
                    if (A01(A0m2)) {
                    }
                } catch (Exception e3) {
                    Log.e((Throwable) e3);
                    z2 = false;
                }
            }
            z3 = true;
        }
        short s2 = 576;
        if (z2) {
            s2 = 575;
        }
        r8.AKz(185477621, s2);
        return z3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0050 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:25:0x004b=Splitter:B:25:0x004b, B:16:0x003d=Splitter:B:16:0x003d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(java.lang.String r4) {
        /*
            java.lang.String r0 = "rw_paths"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x006c
            java.lang.String r0 = "su_exists"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x005d
            r3 = 0
            r4 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x0056 }
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "which"
            r1[r3] = r0     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "su"
            r3 = 1
            r1[r3] = r0     // Catch:{ all -> 0x0056 }
            java.lang.Process r4 = r2.exec(r1)     // Catch:{ all -> 0x0056 }
            if (r4 == 0) goto L_0x005b
            java.io.InputStream r0 = r4.getInputStream()     // Catch:{ Exception -> 0x0051 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0051 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0051 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x004c }
            r1.<init>(r2)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x003d
            r3 = 0
        L_0x003d:
            r1.close()     // Catch:{ all -> 0x004c }
            r2.close()     // Catch:{ Exception -> 0x0051 }
            r4.destroy()
            return r3
        L_0x0047:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x004b }
        L_0x004b:
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0050 }
        L_0x0050:
            throw r0     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            r4.destroy()
            r3 = 0
            return r3
        L_0x0056:
            if (r4 == 0) goto L_0x005b
            r4.destroy()
        L_0x005b:
            r3 = 0
            return r3
        L_0x005d:
            java.lang.String r0 = "Unknown check category: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r4, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x006c:
            boolean r3 = X.AnonymousClass5w1.A00()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119075vs.A01(java.lang.String):boolean");
    }
}
