package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.1G1  reason: invalid class name */
public class AnonymousClass1G1 {
    public static volatile AnonymousClass1G1 A04;
    public Context A00;
    public C29201aD A01 = null;
    public ArrayList A02;
    public boolean A03 = false;

    public static AnonymousClass1G1 A00() {
        if (A04 == null) {
            synchronized (AnonymousClass1G1.class) {
                if (A04 == null) {
                    A04 = new AnonymousClass1G1();
                }
            }
        }
        return A04;
    }

    public C29211aE A01(String str) {
        synchronized (this) {
            if (this.A01 == null) {
                try {
                    A05();
                    C29201aD r3 = new C29201aD(this.A02.size());
                    Iterator it = this.A02.iterator();
                    while (it.hasNext()) {
                        C29211aE r1 = (C29211aE) it.next();
                        r3.A03(r1.A02, r1);
                    }
                    this.A01 = r3;
                } catch (IOException unused) {
                    throw new RuntimeException("empty metadata");
                }
            }
        }
        try {
            return (C29211aE) this.A01.A01(str);
        } catch (IllegalArgumentException unused2) {
            return null;
        }
    }

    public String A02(int i2, String str) {
        int i3;
        String[] strArr;
        A05();
        Iterator it = this.A02.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C29211aE r4 = (C29211aE) it.next();
            int i4 = r4.A00;
            if (i4 == i2) {
                if (i4 == 7 || i4 == 241 || i4 == 998) {
                    int length = str.length();
                    int i5 = 0;
                    while (i3 < length) {
                        String[] strArr2 = r4.A0A;
                        if (strArr2 == null) {
                            break;
                        } else if (r4.A00(length - i3) > 0) {
                            int length2 = strArr2.length;
                            int i6 = 0;
                            while (i6 < length2) {
                                if (strArr2[i6].charAt(0) == str.charAt(i3)) {
                                    i5 = i3 + 1;
                                } else {
                                    i6++;
                                }
                            }
                        }
                    }
                } else {
                    i3 = 0;
                    while (i3 < str.length() && (strArr = r4.A0A) != null) {
                        int i7 = 0;
                        boolean z2 = false;
                        while (true) {
                            if (i7 < strArr.length) {
                                if (z2) {
                                    break;
                                }
                                if (strArr[i7].charAt(0) == str.charAt(i3)) {
                                    z2 = true;
                                }
                                i7++;
                            } else if (!z2) {
                            }
                        }
                        i3++;
                    }
                }
                return str.substring(i3);
            }
        }
        return str;
    }

    public String A03(String str) {
        if (!TextUtils.isEmpty(str)) {
            A05();
            try {
                int parseInt = Integer.parseInt(str);
                Iterator it = this.A02.iterator();
                while (it.hasNext()) {
                    C29211aE r1 = (C29211aE) it.next();
                    if (r1.A00 == parseInt) {
                        return r1.A04;
                    }
                }
            } catch (NumberFormatException e2) {
                Log.i("countries/get-tos-region", e2);
                return "";
            }
        }
        return "";
    }

    public String A04(String str) {
        int i2;
        A05();
        int length = str.length();
        if (length != 2) {
            if (length == 3 && !str.equals("999")) {
                Iterator it = this.A02.iterator();
                while (it.hasNext()) {
                    C29211aE r4 = (C29211aE) it.next();
                    int[] iArr = r4.A06;
                    if (iArr != null) {
                        int i3 = 0;
                        while (i3 < iArr.length) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(iArr[i3]);
                            if (str.equals(sb.toString())) {
                                i2 = r4.A00;
                            } else {
                                i3++;
                            }
                        }
                        continue;
                    }
                }
            }
            return null;
        }
        C29211aE A012 = A01(str.toUpperCase(Locale.US));
        if (A012 != null) {
            i2 = A012.A00;
        }
        return null;
        return Integer.toString(i2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.close();
        r5.A03 = true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A05() {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.A03     // Catch:{ all -> 0x0085 }
            if (r0 != 0) goto L_0x0083
            r1 = 243(0xf3, float:3.4E-43)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0085 }
            r0.<init>(r1)     // Catch:{ all -> 0x0085 }
            r5.A02 = r0     // Catch:{ all -> 0x0085 }
            android.content.Context r0 = r5.A00     // Catch:{ all -> 0x0085 }
            android.content.res.Resources r1 = r0.getResources()     // Catch:{ all -> 0x0085 }
            r0 = 2131820545(0x7f110001, float:1.9273808E38)
            java.io.InputStream r2 = r1.openRawResource(r0)     // Catch:{ all -> 0x0085 }
            java.lang.String r1 = X.AnonymousClass01S.A08     // Catch:{ all -> 0x0085 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0085 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0085 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0085 }
            r3.<init>(r0)     // Catch:{ all -> 0x0085 }
        L_0x0027:
            java.lang.String r4 = r3.readLine()     // Catch:{ all -> 0x007e }
            if (r4 == 0) goto L_0x0077
            java.lang.String r0 = "\t"
            java.lang.String[] r2 = android.text.TextUtils.split(r4, r0)     // Catch:{ NumberFormatException -> 0x0061, IllegalArgumentException -> 0x004b }
            if (r2 == 0) goto L_0x0045
            int r1 = r2.length     // Catch:{ NumberFormatException -> 0x0061, IllegalArgumentException -> 0x004b }
            r0 = 12
            if (r1 < r0) goto L_0x0045
            java.util.ArrayList r1 = r5.A02     // Catch:{ NumberFormatException -> 0x0061, IllegalArgumentException -> 0x004b }
            X.1aE r0 = new X.1aE     // Catch:{ NumberFormatException -> 0x0061, IllegalArgumentException -> 0x004b }
            r0.<init>(r2)     // Catch:{ NumberFormatException -> 0x0061, IllegalArgumentException -> 0x004b }
            r1.add(r0)     // Catch:{ NumberFormatException -> 0x0061, IllegalArgumentException -> 0x004b }
            goto L_0x0027
        L_0x0045:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ NumberFormatException -> 0x0061, IllegalArgumentException -> 0x004b }
            r0.<init>()     // Catch:{ NumberFormatException -> 0x0061, IllegalArgumentException -> 0x004b }
            throw r0     // Catch:{ NumberFormatException -> 0x0061, IllegalArgumentException -> 0x004b }
        L_0x004b:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r1.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "countries/load/bad-line: "
            r1.append(r0)     // Catch:{ all -> 0x007e }
            r1.append(r4)     // Catch:{ all -> 0x007e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x007e }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x007e }
            goto L_0x0027
        L_0x0061:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r1.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "countries/load/bad-number: "
            r1.append(r0)     // Catch:{ all -> 0x007e }
            r1.append(r4)     // Catch:{ all -> 0x007e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x007e }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x007e }
            goto L_0x0027
        L_0x0077:
            r3.close()     // Catch:{ all -> 0x0085 }
            r0 = 1
            r5.A03 = r0     // Catch:{ all -> 0x0085 }
            goto L_0x0083
        L_0x007e:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0082 }
        L_0x0082:
            throw r0     // Catch:{ all -> 0x0085 }
        L_0x0083:
            monitor-exit(r5)
            return
        L_0x0085:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1G1.A05():void");
    }
}
