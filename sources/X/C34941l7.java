package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1l7  reason: invalid class name and case insensitive filesystem */
public class C34941l7 extends C34781kr {
    public static final C34941l7 A00 = new C34941l7();
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(58);

    public C34941l7() {
        super("location");
    }

    public C34941l7(Parcel parcel) {
        super(parcel);
    }

    public String getServer() {
        return "broadcast";
    }

    public int getType() {
        return 6;
    }
}
