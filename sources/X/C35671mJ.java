package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.math.BigDecimal;
import java.util.Arrays;

/* renamed from: X.1mJ  reason: invalid class name and case insensitive filesystem */
public class C35671mJ implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(8);
    public int A00;
    public C93564jP A01;
    public C39651sq A02;
    public BigDecimal A03;
    public final int A04;
    public final String A05;
    public final String A06;

    public C35671mJ(C93564jP r1, C39651sq r2, String str, String str2, BigDecimal bigDecimal, int i2, int i3) {
        this.A06 = str;
        this.A05 = str2;
        this.A03 = bigDecimal;
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i2;
        this.A04 = i3;
    }

    public C35671mJ(Parcel parcel) {
        String readString = parcel.readString();
        AnonymousClass00B.A06(readString);
        this.A06 = readString;
        String readString2 = parcel.readString();
        AnonymousClass00B.A06(readString2);
        this.A05 = readString2;
        this.A03 = (BigDecimal) parcel.readSerializable();
        String readString3 = parcel.readString();
        this.A02 = readString3 != null ? new C39651sq(readString3) : null;
        this.A01 = (C93564jP) parcel.readParcelable(C93564jP.class.getClassLoader());
        this.A00 = parcel.readInt();
        this.A04 = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C35671mJ r5 = (C35671mJ) obj;
            if (this.A00 != r5.A00 || this.A04 != r5.A04 || !this.A06.equals(r5.A06) || !this.A05.equals(r5.A05) || !C34901l3.A00(this.A03, r5.A03) || !C34901l3.A00(this.A02, r5.A02) || !C34901l3.A00(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A06, this.A05, this.A03, this.A02, this.A01, Integer.valueOf(this.A00), Integer.valueOf(this.A04)});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeSerializable(this.A03);
        C39651sq r0 = this.A02;
        parcel.writeString(r0 != null ? r0.A00 : null);
        parcel.writeParcelable(this.A01, i2);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04);
    }
}
