package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3oL  reason: invalid class name and case insensitive filesystem */
public final class C73553oL extends C31241dn {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(43);
    public Integer A00;
    public final String A01;

    public C73553oL(Parcel parcel) {
        super(parcel);
        String readString = parcel.readString();
        C18450wi.A0F(readString);
        C18450wi.A0B(readString);
        this.A01 = readString;
        this.A00 = Integer.valueOf(parcel.readInt());
    }

    public C73553oL(Integer num, String str, String str2, String str3) {
        super(str, str2);
        this.A01 = str3;
        this.A00 = num;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        C18450wi.A0H(parcel, 0);
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.A01);
        Integer num = this.A00;
        parcel.writeInt(num == null ? 0 : num.intValue());
    }
}
