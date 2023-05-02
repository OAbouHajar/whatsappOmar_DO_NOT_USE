package X;

import android.content.SharedPreferences;

/* renamed from: X.0sD  reason: invalid class name and case insensitive filesystem */
public class C15970sD {
    public SharedPreferences A00;
    public final C16440t3 A01;
    public final C17020u3 A02;

    public C15970sD(C16440t3 r1, C17020u3 r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public static String A00(String str, String str2) {
        StringBuilder sb = new StringBuilder("/package/");
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }

    public final synchronized SharedPreferences A01() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A02.A00("instrumentation");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
        r2 = r1.substring(9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A02() {
        /*
            r6 = this;
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            android.content.SharedPreferences r0 = r6.A01()
            java.util.Map r0 = r0.getAll()
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x001a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "/package/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x001a
            r0 = 9
            java.lang.String r2 = r1.substring(r0)
            java.lang.String r0 = "/"
            int r1 = r2.indexOf(r0)
            if (r1 < 0) goto L_0x001a
            r0 = 0
            java.lang.String r0 = r2.substring(r0, r1)
            if (r0 == 0) goto L_0x001a
            r4.add(r0)
            goto L_0x001a
        L_0x0047:
            java.util.Iterator r4 = r4.iterator()
        L_0x004b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x006c
            java.lang.Object r3 = r4.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r0 = "auth/token"
            java.lang.String r2 = A00(r3, r0)
            android.content.SharedPreferences r1 = r6.A01()
            r0 = 0
            java.lang.String r0 = r1.getString(r2, r0)
            if (r0 == 0) goto L_0x004b
            r5.add(r3)
            goto L_0x004b
        L_0x006c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15970sD.A02():java.util.Set");
    }

    public void A03(String str) {
        String A002 = A00(str, "auth/token");
        String A003 = A00(str, "auth/token_ts");
        String A004 = A00(str, "auth/encryption_key");
        String A005 = A00(str, "metadata/last_active_time");
        String A006 = A00(str, "metadata/delayed_notification_shown");
        String A007 = A00(str, "metadata/last_call_ranking_time");
        A01().edit().remove(A002).remove(A003).remove(A004).remove(A005).remove(A006).remove(A007).remove(A00(str, "metadata/last_message_ranking_time")).apply();
    }
}
