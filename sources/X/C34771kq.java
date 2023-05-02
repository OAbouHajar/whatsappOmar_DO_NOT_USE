package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1kq  reason: invalid class name and case insensitive filesystem */
public class C34771kq extends C34781kr {
    public static final C34771kq A00 = new C34771kq();
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(68);

    public C34771kq() {
        super("status");
    }

    public C34771kq(Parcel parcel) {
        super(parcel);
    }

    public String getServer() {
        return "broadcast";
    }

    public int getType() {
        return 5;
    }
}
