package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1l6  reason: invalid class name and case insensitive filesystem */
public class C34931l6 extends C15830rv {
    public static final C34931l6 A00 = new C34931l6();
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(52);

    public C34931l6() {
        super("gdpr");
    }

    public C34931l6(Parcel parcel) {
        super(parcel);
    }

    public String getServer() {
        return "s.whatsapp.net";
    }

    public int getType() {
        return 9;
    }
}
