package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.0sL  reason: invalid class name and case insensitive filesystem */
public class C16050sL extends GroupJid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(61);

    public C16050sL(Parcel parcel) {
        super(parcel);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r5 = r7.substring(r2 + 1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16050sL(java.lang.String r7) {
        /*
            r6 = this;
            r6.<init>((java.lang.String) r7)
            boolean r0 = A06(r7)
            if (r0 != 0) goto L_0x0052
            r0 = 45
            int r2 = r7.indexOf(r0)
            r1 = 0
            if (r2 <= 0) goto L_0x004c
            int r0 = r7.length()
            if (r2 == r0) goto L_0x004c
            java.lang.String r0 = r7.substring(r1, r2)
            boolean r0 = X.AnonymousClass1ZT.A04(r0)
            if (r0 == 0) goto L_0x004c
            int r0 = r2 + 1
            java.lang.String r5 = r7.substring(r0)
            int r4 = r5.length()
            r0 = 10
            if (r4 != r0) goto L_0x004c
            char r1 = r5.charAt(r1)
            r0 = 49
            if (r1 < r0) goto L_0x004c
            r3 = 57
            if (r1 > r3) goto L_0x004c
            r2 = 1
        L_0x003d:
            char r1 = r5.charAt(r2)
            r0 = 48
            if (r1 < r0) goto L_0x004c
            if (r1 > r3) goto L_0x004c
            int r2 = r2 + 1
            if (r2 >= r4) goto L_0x0052
            goto L_0x003d
        L_0x004c:
            X.1W4 r0 = new X.1W4
            r0.<init>((java.lang.String) r7)
            throw r0
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16050sL.<init>(java.lang.String):void");
    }

    public static C16050sL A03(Jid jid) {
        if (jid instanceof C16050sL) {
            return (C16050sL) jid;
        }
        return null;
    }

    public static C16050sL A04(String str) {
        Jid jid = Jid.get(str);
        if (jid instanceof C16050sL) {
            return (C16050sL) jid;
        }
        throw new AnonymousClass1W4(str);
    }

    public static C16050sL A05(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return A04(str);
        } catch (AnonymousClass1W4 unused) {
            return null;
        }
    }

    public static boolean A06(String str) {
        int length;
        char charAt;
        if (!str.contains("-") && (length = str.length()) >= 1 && length <= 20 && (charAt = str.charAt(0)) >= '1' && charAt <= '9') {
            int i2 = 1;
            while (i2 < length) {
                char charAt2 = str.charAt(i2);
                if (charAt2 >= '0' && charAt2 <= '9') {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    public String getObfuscatedString() {
        String str = this.user;
        StringBuilder sb = new StringBuilder("@");
        sb.append("g.us");
        String obj = sb.toString();
        if (A06(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AnonymousClass1ZW.A03(15, this.user));
            sb2.append(obj);
            return sb2.toString();
        }
        int indexOf = str.indexOf(45);
        if (indexOf == -1) {
            return obj;
        }
        int max = Math.max(0, indexOf - 4);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str.substring(max));
        sb3.append(obj);
        return sb3.toString();
    }

    public String getServer() {
        return "g.us";
    }

    public int getType() {
        return 1;
    }
}
