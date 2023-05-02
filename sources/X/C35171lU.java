package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1lU  reason: invalid class name and case insensitive filesystem */
public class C35171lU implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(84);
    public final UserJid A00;
    public final C35151lS A01;
    public final List A02;

    public C35171lU(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.A02 = arrayList;
        parcel.readList(arrayList, C35141lR.class.getClassLoader());
        Parcelable readParcelable = parcel.readParcelable(UserJid.class.getClassLoader());
        AnonymousClass00B.A06(readParcelable);
        this.A00 = (UserJid) readParcelable;
        Parcelable readParcelable2 = parcel.readParcelable(C35151lS.class.getClassLoader());
        AnonymousClass00B.A06(readParcelable2);
        this.A01 = (C35151lS) readParcelable2;
    }

    public C35171lU(UserJid userJid, C35151lS r2, List list) {
        this.A02 = list;
        this.A01 = r2;
        this.A00 = userJid;
    }

    public int A00() {
        int i2 = 0;
        for (C35141lR r0 : this.A02) {
            i2 += r0.A01.size();
        }
        return i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.A02);
        parcel.writeParcelable(this.A00, i2);
        parcel.writeParcelable(this.A01, 0);
    }
}
