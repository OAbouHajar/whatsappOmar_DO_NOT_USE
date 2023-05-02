package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1m6  reason: invalid class name and case insensitive filesystem */
public class C35541m6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(26);
    public final int A00;
    public final List A01;
    public final List A02;
    public final boolean A03;

    public C35541m6(Parcel parcel) {
        this.A00 = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        Class<UserJid> cls = UserJid.class;
        parcel.readList(arrayList, cls.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.A02 = arrayList2;
        parcel.readList(arrayList2, cls.getClassLoader());
        this.A03 = parcel.readByte() != 0;
    }

    public C35541m6(List list, List list2, int i2, boolean z2) {
        this.A00 = i2;
        this.A01 = list == null ? Collections.emptyList() : list;
        this.A02 = list2 == null ? Collections.emptyList() : list2;
        this.A03 = z2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C35541m6 r5 = (C35541m6) obj;
            if (this.A00 != r5.A00 || this.A03 != r5.A03 || !this.A01.equals(r5.A01) || !this.A02.equals(r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A01, this.A02, Boolean.valueOf(this.A03)});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A00);
        parcel.writeList(this.A01);
        parcel.writeList(this.A02);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
    }
}
