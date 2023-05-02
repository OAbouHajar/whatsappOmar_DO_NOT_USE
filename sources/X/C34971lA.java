package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.Jid;

/* renamed from: X.1lA  reason: invalid class name and case insensitive filesystem */
public class C34971lA extends Jid implements Parcelable {
    public static final C34971lA A00 = new C34971lA();
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(64);

    public C34971lA() {
        super("");
    }

    public C34971lA(Parcel parcel) {
        super(parcel);
    }

    public String getServer() {
        return "call";
    }

    public int getType() {
        return 20;
    }
}
