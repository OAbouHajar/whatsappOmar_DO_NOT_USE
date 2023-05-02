package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1mF  reason: invalid class name and case insensitive filesystem */
public class C35631mF extends C35641mG implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(13);
    public String A00;

    public C35631mF(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
    }

    public C35631mF(String str, long j2) {
        super(j2);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C35631mF) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.A00);
    }
}
