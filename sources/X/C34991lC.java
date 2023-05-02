package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1lC  reason: invalid class name and case insensitive filesystem */
public class C34991lC extends UserJid implements Parcelable {
    public static final C34991lC A00;
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(54);

    static {
        try {
            A00 = new C34991lC();
        } catch (AnonymousClass1W4 e2) {
            throw new IllegalStateException(e2);
        }
    }

    public C34991lC() {
        super("Server");
    }

    public C34991lC(Parcel parcel) {
        super(parcel);
    }

    public String getObfuscatedString() {
        return getRawString();
    }

    public String getServer() {
        return "s.whatsapp.net";
    }

    public int getType() {
        return 8;
    }
}
