package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1ZY  reason: invalid class name */
public class AnonymousClass1ZY extends DeviceJid implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(55);

    public AnonymousClass1ZY(AnonymousClass1ZX r1, int i2) {
        super(r1, i2);
    }

    public AnonymousClass1ZY(Parcel parcel) {
        super(parcel);
    }

    @Deprecated
    public int getAgent() {
        return 1;
    }

    public String getServer() {
        return "lid";
    }

    public int getType() {
        return 19;
    }

    public /* bridge */ /* synthetic */ UserJid getUserJid() {
        return this.userJid;
    }
}
