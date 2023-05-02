package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1Za  reason: invalid class name and case insensitive filesystem */
public class C28871Za extends DeviceJid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(62);

    public C28871Za(Parcel parcel) {
        super(parcel);
    }

    public C28871Za(UserJid userJid, int i2) {
        super(userJid, i2);
    }

    public String getServer() {
        return "s.whatsapp.net";
    }

    public int getType() {
        return 17;
    }
}
