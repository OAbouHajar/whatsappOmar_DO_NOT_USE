package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.util.Arrays;

/* renamed from: X.2RC  reason: invalid class name */
public class AnonymousClass2RC extends C35641mG implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(11);
    public String A00;
    public String A01;

    public AnonymousClass2RC(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public AnonymousClass2RC(String str, String str2, long j2) {
        super(j2);
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass2RC r4 = (AnonymousClass2RC) obj;
            if (this.A01.equals(r4.A01)) {
                return this.A00.equals(r4.A00);
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
