package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxObjectShape26S0000000_2_I1;

/* renamed from: X.3PD  reason: invalid class name */
public class AnonymousClass3PD extends C018308o {
    public static final Parcelable.Creator CREATOR = new IDxObjectShape26S0000000_2_I1(0);
    public float A00;
    public int A01;
    public boolean A02;

    public AnonymousClass3PD(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readFloat();
        this.A02 = AnonymousClass000.A1O(parcel.readByte());
    }

    public AnonymousClass3PD(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
    }
}
