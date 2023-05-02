package com.whatsapp.jid;

import X.AnonymousClass1W4;
import X.C34901l3;
import X.C34921l5;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.Arrays;

public abstract class Jid implements Comparable, Parcelable {
    public static final C34921l5 JID_FACTORY = C34921l5.A00();
    public final String user;

    public Jid(Parcel parcel) {
        this.user = parcel.readString();
    }

    public Jid(String str) {
        this.user = str;
    }

    public static String buildRawString(String str, String str2) {
        if (str.isEmpty()) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        throw new X.AnonymousClass1W4(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        if (r7.equals("lid") == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0083, code lost:
        r4 = r5.lastIndexOf(46);
        r3 = r5.lastIndexOf(58);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008f, code lost:
        if (r3 != -1) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r4 != -1) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r0 = X.C34921l5.A01(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0099, code lost:
        r1 = r5.length();
        r0 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009f, code lost:
        if (r3 == r0) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a1, code lost:
        if (r4 == r0) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a3, code lost:
        if (r3 == -1) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a5, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a6, code lost:
        if (r4 == -1) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a8, code lost:
        if (r4 < r3) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00aa, code lost:
        if (r3 != -1) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ac, code lost:
        r2 = 0;
        r1 = r9.A02(r5.substring(0, r4), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b5, code lost:
        if (r3 == -1) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ba, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r2 = java.lang.Integer.parseInt(r5.substring(r3 + 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ca, code lost:
        if ("lid".equals(r7) == false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cc, code lost:
        r0 = new X.AnonymousClass1ZY((X.AnonymousClass1ZX) r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d4, code lost:
        r0 = new X.C28871Za(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0146, code lost:
        throw new X.AnonymousClass1W4(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014c, code lost:
        throw new X.AnonymousClass1W4(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.jid.Jid get(java.lang.String r10) {
        /*
            X.1l5 r9 = JID_FACTORY
            if (r10 == 0) goto L_0x016c
            X.03L r6 = r9.A00
            java.lang.Object r0 = r6.A02(r10)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            if (r0 != 0) goto L_0x016b
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0159
            r0 = 64
            int r1 = r10.lastIndexOf(r0)
            r8 = -1
            if (r1 == r8) goto L_0x00f6
            if (r1 == 0) goto L_0x014d
            int r0 = r10.length()
            if (r1 == r0) goto L_0x014d
            r0 = 0
            java.lang.String r5 = r10.substring(r0, r1)
            int r0 = r1 + 1
            java.lang.String r7 = r10.substring(r0)
            int r0 = r7.hashCode()
            switch(r0) {
                case -1673355044: goto L_0x003d;
                case -1618876223: goto L_0x0052;
                case 107143: goto L_0x007a;
                case 3045982: goto L_0x00da;
                case 3116421: goto L_0x00e8;
                case 3556308: goto L_0x012f;
                default: goto L_0x0037;
            }
        L_0x0037:
            X.1W4 r0 = new X.1W4
            r0.<init>((java.lang.String) r10)
            throw r0
        L_0x003d:
            java.lang.String r0 = "s.whatsapp.net"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "gdpr"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0083
            X.1l6 r0 = X.C34931l6.A00
            goto L_0x013d
        L_0x0052:
            java.lang.String r0 = "broadcast"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "location"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0066
            X.1l7 r0 = X.C34941l7.A00
            goto L_0x013d
        L_0x0066:
            java.lang.String r0 = "status"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0073
            X.1kq r0 = X.C34771kq.A00
            goto L_0x013d
        L_0x0073:
            X.1kx r0 = new X.1kx
            r0.<init>((java.lang.String) r5)
            goto L_0x013d
        L_0x007a:
            java.lang.String r0 = "lid"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0083
            goto L_0x0037
        L_0x0083:
            r0 = 46
            int r4 = r5.lastIndexOf(r0)
            r0 = 58
            int r3 = r5.lastIndexOf(r0)
            if (r3 != r8) goto L_0x0099
            if (r4 != r8) goto L_0x0099
            com.whatsapp.jid.UserJid r0 = X.C34921l5.A01(r5, r7)
            goto L_0x013d
        L_0x0099:
            int r1 = r5.length()
            int r0 = r1 + -1
            if (r3 == r0) goto L_0x0147
            if (r4 == r0) goto L_0x0147
            if (r3 == r8) goto L_0x00a6
            r1 = r3
        L_0x00a6:
            if (r4 == r8) goto L_0x00ba
            if (r4 < r3) goto L_0x00ac
            if (r3 != r8) goto L_0x00ba
        L_0x00ac:
            r2 = 0
            java.lang.String r0 = r5.substring(r2, r4)
            com.whatsapp.jid.UserJid r1 = r9.A02(r0, r7)
            if (r3 == r8) goto L_0x00c4
            int r0 = r3 + 1
            goto L_0x00bc
        L_0x00ba:
            r4 = r1
            goto L_0x00ac
        L_0x00bc:
            java.lang.String r0 = r5.substring(r0)     // Catch:{ NumberFormatException -> 0x0141 }
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0141 }
        L_0x00c4:
            java.lang.String r0 = "lid"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00d4
            X.1ZX r1 = (X.AnonymousClass1ZX) r1
            X.1ZY r0 = new X.1ZY
            r0.<init>(r1, r2)
            goto L_0x013d
        L_0x00d4:
            X.1Za r0 = new X.1Za
            r0.<init>(r1, r2)
            goto L_0x013d
        L_0x00da:
            java.lang.String r0 = "call"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.1l8 r0 = new X.1l8
            r0.<init>((java.lang.String) r5)
            goto L_0x013d
        L_0x00e8:
            java.lang.String r0 = "g.us"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.0sL r0 = new X.0sL
            r0.<init>((java.lang.String) r5)
            goto L_0x013d
        L_0x00f6:
            java.lang.String r0 = "s.whatsapp.net"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0102
            X.1ks r0 = X.C34791ks.A00
            goto L_0x013d
        L_0x0102:
            java.lang.String r0 = "g.us"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x010d
            X.1l9 r0 = X.C34961l9.A00
            goto L_0x013d
        L_0x010d:
            java.lang.String r0 = "call"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0118
            X.1lA r0 = X.C34971lA.A00
            goto L_0x013d
        L_0x0118:
            java.lang.String r0 = "status_me"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0124
            X.1jg r0 = X.C34091jg.A00
            goto L_0x013d
        L_0x0124:
            java.lang.String r0 = "lid_me"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0153
            X.1lB r0 = X.C34981lB.A00
            goto L_0x013d
        L_0x012f:
            java.lang.String r0 = "temp"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.1WP r0 = new X.1WP
            r0.<init>((java.lang.String) r5)
        L_0x013d:
            r6.A06(r10, r0)
            return r0
        L_0x0141:
            X.1W4 r0 = new X.1W4
            r0.<init>((java.lang.String) r5)
            throw r0
        L_0x0147:
            X.1W4 r0 = new X.1W4
            r0.<init>((java.lang.String) r5)
            throw r0
        L_0x014d:
            X.1W4 r0 = new X.1W4
            r0.<init>((java.lang.String) r10)
            throw r0
        L_0x0153:
            X.1W4 r0 = new X.1W4
            r0.<init>((java.lang.String) r10)
            throw r0
        L_0x0159:
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            java.lang.String r0 = "jid-factory/invalid-jid: <blank>"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r1 = "<empty>"
            X.1W4 r0 = new X.1W4
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x016b:
            return r0
        L_0x016c:
            java.lang.String r1 = "null"
            X.1W4 r0 = new X.1W4
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jid.Jid.get(java.lang.String):com.whatsapp.jid.Jid");
    }

    public static Jid getNullable(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return get(str);
        } catch (AnonymousClass1W4 unused) {
            return null;
        }
    }

    public int compareTo(Jid jid) {
        return getRawString().compareTo(jid.getRawString());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Jid)) {
            return false;
        }
        Jid jid = (Jid) obj;
        return C34901l3.A00(this.user, jid.user) && getServer().equals(jid.getServer()) && getType() == jid.getType();
    }

    @Deprecated
    public int getAgent() {
        return 0;
    }

    public int getDevice() {
        return 0;
    }

    public String getObfuscatedString() {
        return getRawString();
    }

    public String getRawString() {
        return buildRawString(this.user, getServer());
    }

    public abstract String getServer();

    public abstract int getType();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.user, getServer(), Integer.valueOf(getType())});
    }

    public boolean isProtocolCompliant() {
        int type = getType();
        return (type == 2 || type == 9 || type == 11 || type == 8) ? false : true;
    }

    public final String toString() {
        return getObfuscatedString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.user);
    }
}
