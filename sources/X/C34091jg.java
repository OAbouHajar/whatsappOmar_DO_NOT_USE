package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1jg  reason: invalid class name and case insensitive filesystem */
public class C34091jg extends UserJid {
    public static final C34091jg A00;
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(59);

    static {
        try {
            A00 = new C34091jg();
        } catch (AnonymousClass1W4 e2) {
            throw new IllegalStateException(e2);
        }
    }

    public C34091jg() {
        super("");
    }

    public C34091jg(Parcel parcel) {
        super(parcel);
    }

    public String getObfuscatedString() {
        return getRawString();
    }

    public DeviceJid getPrimaryDevice() {
        throw new UnsupportedOperationException("getPrimaryDevice() must not be called for MeJid");
    }

    public String getServer() {
        return "status_me";
    }

    public int getType() {
        return 11;
    }
}
