package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.Jid;

/* renamed from: X.1ks  reason: invalid class name and case insensitive filesystem */
public class C34791ks extends Jid implements Parcelable {
    public static final C34791ks A00 = new C34791ks();
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(66);

    public C34791ks() {
        super("");
    }

    public C34791ks(Parcel parcel) {
        super(parcel);
    }

    public String getServer() {
        return "s.whatsapp.net";
    }

    public int getType() {
        return 13;
    }
}
