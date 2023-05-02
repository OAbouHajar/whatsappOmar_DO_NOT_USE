package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.io.File;

/* renamed from: X.1lm  reason: invalid class name and case insensitive filesystem */
public class C35351lm implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(46);
    public final byte A00;
    public final int A01;
    public final File A02;
    public final boolean A03;

    public C35351lm(C54972iZ r2) {
        this.A00 = r2.ADb();
        this.A02 = r2.ACD();
        this.A03 = r2.AIr();
        this.A01 = r2.AFc();
    }

    public C35351lm(Parcel parcel) {
        this.A00 = parcel.readByte();
        String readString = parcel.readString();
        AnonymousClass00B.A06(readString);
        this.A02 = new File(readString);
        this.A03 = parcel.readByte() != 1 ? false : true;
        this.A01 = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.A00);
        parcel.writeString(this.A02.getAbsolutePath());
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeInt(this.A01);
    }
}
