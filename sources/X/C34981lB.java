package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1lB  reason: invalid class name and case insensitive filesystem */
public final class C34981lB extends UserJid {
    public static final C34981lB A00 = new C34981lB();
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(56);

    public C34981lB() {
        super("");
    }

    public C34981lB(Parcel parcel) {
        super(parcel);
    }

    public String getObfuscatedString() {
        String rawString = getRawString();
        C18450wi.A0B(rawString);
        return rawString;
    }

    public DeviceJid getPrimaryDevice() {
        throw new UnsupportedOperationException("getPrimaryDevice() must not be called for LidMeJid");
    }

    public String getServer() {
        return "lid_me";
    }

    public int getType() {
        return 11;
    }
}
