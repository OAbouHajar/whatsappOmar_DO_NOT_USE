package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.util.Arrays;

/* renamed from: X.1mC  reason: invalid class name and case insensitive filesystem */
public class C35601mC implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(18);
    public final Double A00;
    public final Double A01;
    public final Integer A02;
    public final String A03;

    public C35601mC(Parcel parcel) {
        Integer valueOf = Integer.valueOf(parcel.readInt());
        AnonymousClass00B.A06(valueOf);
        this.A02 = valueOf;
        Double valueOf2 = Double.valueOf(parcel.readDouble());
        AnonymousClass00B.A06(valueOf2);
        this.A00 = valueOf2;
        Double valueOf3 = Double.valueOf(parcel.readDouble());
        AnonymousClass00B.A06(valueOf3);
        this.A01 = valueOf3;
        String readString = parcel.readString();
        AnonymousClass00B.A06(readString);
        this.A03 = readString;
    }

    public C35601mC(Double d2, Double d3, Integer num, String str) {
        this.A02 = num;
        this.A00 = d2;
        this.A01 = d3;
        this.A03 = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C35601mC)) {
            return false;
        }
        C35601mC r4 = (C35601mC) obj;
        return this.A02.equals(r4.A02) && this.A00.equals(r4.A00) && this.A01.equals(r4.A01) && this.A03.equals(r4.A03);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A00, this.A01, this.A03});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BusinessServiceArea:{'radius'='");
        sb.append(this.A02);
        sb.append("', 'latitude'='");
        sb.append(this.A00);
        sb.append("', 'longitude'='");
        sb.append(this.A01);
        sb.append("', 'areaDescription'='");
        sb.append(this.A03);
        sb.append("'}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A02.intValue());
        parcel.writeDouble(this.A00.doubleValue());
        parcel.writeDouble(this.A01.doubleValue());
        parcel.writeString(this.A03);
    }
}
