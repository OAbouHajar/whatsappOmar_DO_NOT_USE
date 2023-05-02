package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.Jid;

/* renamed from: X.1kx  reason: invalid class name and case insensitive filesystem */
public class C34841kx extends C34781kr implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(51);

    public C34841kx(Parcel parcel) {
        super(parcel);
    }

    public C34841kx(String str) {
        super(str);
        char charAt;
        int length = str.length();
        if (length >= 1 && length <= 20 && (charAt = str.charAt(0)) >= '1' && charAt <= '9') {
            int i2 = 1;
            while (i2 < length) {
                char charAt2 = str.charAt(i2);
                i2 = (charAt2 >= '0' && charAt2 <= '9') ? i2 + 1 : i2;
            }
            return;
        }
        throw new AnonymousClass1W4(str);
    }

    public static C34841kx A03(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Jid jid = Jid.get(str);
            if (jid instanceof C34841kx) {
                return (C34841kx) jid;
            }
            throw new AnonymousClass1W4(str);
        } catch (AnonymousClass1W4 unused) {
            return null;
        }
    }

    public String getObfuscatedString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass1ZW.A03(4, this.user));
        sb.append('@');
        sb.append("broadcast");
        return sb.toString();
    }

    public String getServer() {
        return "broadcast";
    }

    public int getType() {
        return 3;
    }
}
