package X;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1lF  reason: invalid class name and case insensitive filesystem */
public class C35021lF implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(103);
    public int A00;
    public int A01;
    public Integer A02;
    public Integer A03;
    public boolean A04;
    public final int A05;
    public final int A06;
    public final Intent A07;

    @Deprecated
    public C35021lF(int i2, int i3, Intent intent) {
        this.A07 = intent;
        this.A06 = i2;
        this.A05 = i3;
    }

    public C35021lF(Parcel parcel) {
        Parcelable readParcelable = parcel.readParcelable(Intent.class.getClassLoader());
        AnonymousClass00B.A06(readParcelable);
        this.A07 = (Intent) readParcelable;
        this.A06 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A04 = parcel.readByte() != 0;
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        int readInt = parcel.readInt();
        Integer num = null;
        this.A02 = readInt != -1 ? Integer.valueOf(readInt) : null;
        int readInt2 = parcel.readInt();
        this.A03 = readInt2 != -1 ? Integer.valueOf(readInt2) : num;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.A07, i2);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        Integer num = this.A02;
        int i3 = -1;
        parcel.writeInt(num != null ? num.intValue() : -1);
        Integer num2 = this.A03;
        if (num2 != null) {
            i3 = num2.intValue();
        }
        parcel.writeInt(i3);
    }
}
