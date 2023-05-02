package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;

/* renamed from: X.1WP  reason: invalid class name */
public class AnonymousClass1WP extends GroupJid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(60);

    public AnonymousClass1WP(Parcel parcel) {
        super(parcel);
    }

    public AnonymousClass1WP(String str) {
        super(str);
        if (!str.contains("-")) {
            StringBuilder sb = new StringBuilder("Invalid group id: ");
            sb.append(str);
            throw new AnonymousClass1W4(sb.toString());
        }
    }

    public static AnonymousClass1WP A03(C16040sK r1, String str) {
        r1.A0B();
        AnonymousClass1ZT r0 = r1.A05;
        AnonymousClass00B.A06(r0);
        StringBuilder sb = new StringBuilder();
        String str2 = r0.user;
        AnonymousClass00B.A06(str2);
        sb.append(str2);
        sb.append("-");
        sb.append(str);
        sb.append("@");
        sb.append("temp");
        return A04(sb.toString());
    }

    public static AnonymousClass1WP A04(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Jid jid = Jid.get(str);
            if (jid instanceof AnonymousClass1WP) {
                return (AnonymousClass1WP) jid;
            }
            throw new AnonymousClass1W4(str);
        } catch (AnonymousClass1W4 unused) {
            return null;
        }
    }

    public String getObfuscatedString() {
        return getRawString().substring(getRawString().indexOf("-") + 1);
    }

    public String getServer() {
        return "temp";
    }

    public int getType() {
        return 2;
    }
}
