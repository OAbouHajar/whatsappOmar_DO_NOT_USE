package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.Jid;

/* renamed from: X.1l9  reason: invalid class name and case insensitive filesystem */
public class C34961l9 extends Jid implements Parcelable {
    public static final C34961l9 A00 = new C34961l9();
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(65);

    public C34961l9() {
        super("");
    }

    public C34961l9(Parcel parcel) {
        super(parcel);
    }

    public String getServer() {
        return "g.us";
    }

    public int getType() {
        return 16;
    }
}
